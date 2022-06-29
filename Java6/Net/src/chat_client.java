import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//client
public class chat_client {
	public static void main(String[] args) {
		try {
		client_chat cc = new client_chat();
		cc.chat();
		}catch(Exception a) {
			if(a.getMessage() !=null) {
				System.out.println(a);
			}
		}

	}

}
class client_chat{
	private final String ip = "127.0.0.1";
	final int port = 8009;
	Scanner sc = null;
	InputStream is =null;
	OutputStream os = null;
	OutputStream os2 = null;
	private String mid = null;
	Socket sk =null;
	String msg = null; // 사용자 입력파트
	String msg2 = null; // 입장메세지
	String smsg = null; //서버에서 전송하는 메세지
	
	public void chat() {
		//※각종 Stream을 close 하지 않습니다. 왜냐하면, 모든 Stream이 소켓과 연결이 되어 있으므로 close시 소켓도 함께 종료가 됩니다. 
		try {
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성해 주세요 : ");
			this.mid = this.sc.next();
			
			while(true) {
				
				this.sk = new Socket(this.ip,this.port); // 접속확인
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				this.os2 = this.sk.getOutputStream();
				
//				this.msg2 = "["+this.mid+"] : 님 입장하였습니다.";
//				this.os2.write(this.msg2.getBytes());
//				this.os2.flush();
				
				//서버에서 받아오는
				byte []data = new byte[1024];
				int n = this.is.read(data);
				this.smsg = new String(data, 0, n);
				System.out.println(this.smsg);
				
				this.sc = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요 : ");
				this.msg = "[" + this.mid +"]:"+this.sc.nextLine().intern();
				this.os.write(this.msg.getBytes());
				this.os.flush();
				

				
			}
			
		}catch(Exception e) {
			if(e.getMessage() != null) {
				System.out.println(e);
			}
		}
		
		
	}
}