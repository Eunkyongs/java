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
				
				this.sc = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요 : ");
				this.cmsg = "["+this.mid + "]:"+this.sc.nextLine().intern();
				this.os.write(this.cmsg.getBytes());
				this.os.flush();
				

				
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}