/*응용문제 클라이언트가 exit라는 단어를 입력할 경우 서버에서 000님이 퇴장하셨습니다.라고 뜨고 채팅은 종료하게 됩니다. 
 단, 클라이언트에서도 채팅이 종료해야하며 서버쪽에서도 채팅이 종료되어야 합니다.*/ 


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//server
public class chat_server {
	
	public static void main(String[] args) {
		chat ch = new chat();
		ch.chat_server();
	}

}

class chat{
	private int port = 8009;
	ServerSocket sk =null;
	Socket so = null; //
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null;
	String msg = null; 
	String cmsg = null;
	String check = null;
	public void chat_server() {
		try {
			this.sk = new ServerSocket(this.port);
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성하세요 : ");
			this.mid = sc.next();
			System.out.println("채팅방 개설 되었습니다.");
			
			while(true) {
				this.so = sk.accept();
				this.is = so.getInputStream();
				this.os = so.getOutputStream();
				
				byte data [] = new byte [1024];
				int n = this.is.read(data);
				this.msg = new String(data, 0, n);
				System.out.println(this.msg);
				
				//서버에 소켓을 끊지않으면 서버는 살아있음. client만 소켓 종료할지 서버도 같이 종료할지는 개발자 판단
				if(this.msg.indexOf("퇴장") != -1) { 
					sk.close();
					break;
				}
				
				
				this.sc = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요 : ");
				this.check = this.sc.nextLine().intern();
				if(this.check=="exit") {
					sk.close();
					so.close();
					break;
				}
				this.cmsg = "["+this.mid + "]:"+this.check;
				this.os.write(this.cmsg.getBytes());
				this.os.flush();

			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}