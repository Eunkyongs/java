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
	String check =null; //exit 단어검토
	
	public void chat() {
		//※각종 Stream을 close 하지 않습니다. 왜냐하면, 모든 Stream이 소켓과 연결이 되어 있으므로 close시 소켓도 함께 종료가 됩니다. 
		
		//Socket 은 데이터가 본 데이터가 변경이 이루어지면 접속이 끊어지는 현상이 발생할 수 있습니다.
		try {
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성해 주세요 : ");
			this.mid = this.sc.next();
			
			int c = 0;
			while(true) {
				this.sk = new Socket(this.ip,this.port); // 접속확인
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				
				if(c==0) {
					this.msg = "["+this.mid+"] : 님 입장하였습니다.";
				}
				else {
					this.sc = new Scanner(System.in);
					System.out.println("내용을 입력해 주세요 : ");
					this.check = this.sc.nextLine().intern();
					this.msg = "[" + this.mid +"]:"+this.check;
				}
				if(this.check == "exit") {
					this.msg = "[" + this.mid +"]님이 퇴장하셨습니다.";
					this.os.write(this.msg.getBytes());  
					this.os.flush();
					this.sk.close();
				}else { // exit라는 단어 사용X
				this.os.write(this.msg.getBytes()); // 이부분이 서버에서받아오는 부분보다 아래에 있으면 서버에서받는거를 기다리기만함. 서버로 보내지를못해서 멈춤 
				this.os.flush();
				}
				
				//서버에서 받아오는
				byte []data = new byte[1024];
				int n = this.is.read(data);
				this.smsg = new String(data, 0, n);
				System.out.println(this.smsg);
				c++;
				
				
				
				
			}
			
		}catch(Exception e) {
			if(e.getMessage() != null) {
//				String error = e.getMessage();
//				if(error.indexOf("StringIndexOutOfBoundsException") != -1){
					System.out.println("서버접속장애가 발생하여 강제 종료 됩니다.");
					
//				}
//				System.out.println(e);
			}
		}
	}
}