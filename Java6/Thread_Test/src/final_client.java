import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class final_client {
	public static void main(String[] args) {
		fclient cl = new fclient();
		cl.client();
	}
}
class fclient{
	String ip = "";
	int port = 0;
	
	InputStream is = null;
	OutputStream os = null;
	
	Socket sk = null;
	Scanner scan = null;

	public void client() {
		try {
			//사용자 입력
			this.scan = new Scanner(System.in);
			System.out.println("접속할 IP번호를 입력해 주세요 :");
			this.ip=scan.nextLine();
			System.out.println("접속할 PORT번호를 입력해 주세요:");
			this.port=scan.nextInt();
			
			this.sk = new Socket(this.ip, this.port);
			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();
			String s_msg ="*****GUEST가 참여 하였습니다. *****";
			this.os.write(s_msg.getBytes());
			this.os.flush();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
