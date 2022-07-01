/*[최종 응용문제](PORT번호는 무조건 숫자만 입력받도록 합니다.)
-서버 프로그램을 실행 합니다.
실행 시 가장 먼저 해당 질문을 하게 됩니다.
"사용하실 PORT 번호를 입력하세요 : "
포트번호 입력하면 *****채팅서버 오픈 [  ]***** 이런식으로 출력.
-클라이언트 프로그램을 실행합니다.
실행 시 
"접속할 IP번호를 입력해 주세요 :"
"접속할 PORT번호를 입력해 주세요:"
클라이언트가 접속하면
아래와같은 서버 최종 메세지 출력.
"*****GUEST가 참여 하였습니다. *****"*/
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class final_server {

	public static void main(String[] args) {
		
		fserver se= new fserver();
		se.server();
	}

}

class fserver{
	int port = 0;
	ServerSocket ss = null;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	public void server() {
		Scanner scan = new Scanner(System.in);
		System.out.println("사용하실 Port 번호를 입력하세요:");
		this.port= scan.nextInt();
		
		try {
			this.ss = new ServerSocket(this.port);
			this.sk = this.ss.accept();
			System.out.printf("*****채팅서버 오픈[%d]*****",this.port);
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			byte data [] = new byte[1024];
			int n = this.is.read(data);
			String c_msg = new String(data,0,n);
			System.out.println(c_msg);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}