/*
 [1:1 채팅 프로그램 프로세서]

포트 : 9090

[Server]
"서버에서 사용하실 아이디를 입력해 주세요 : " (제일먼저 실행)
유관순

대기중....


홍길동:반갑습니다.(클라이언트가 입력한내용)
"내용을 입력해 주세요:" 어서오세요~

"홍길동님 퇴장 하셨습니다."

"내용을 입력해 주세요."

[Client]

"채팅에 사용하실 아이디를 입력해 주세요: "
접속...

아이디에 홍길동 입력하면 
"내용을 입력해주세요: " 반갑습니다~~ 입력하면 서버로 출력(홍길동:반갑습니다)

유관순:어서오세요~ (서버에서 입력한내용 출력)

"내용을 입력해 주세요:" exit (exit사용시 반복문 빠져나가야함=break이용)

"채팅이 종료 되었습니다."
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server_1 {

	public static void main(String[] args) {
		int port = 9090;
		ServerSocket ss = null;
		Socket sc = null;
		Scanner scan = null;
		try {
			System.out.println("서버에서 사용할 아이디를 입력해 주세요:");
			scan = new Scanner(System.in);
			String id = scan.next();
			
			ss = new ServerSocket(port);
			System.out.println("연결 대기중...");
			for(;;) {
			sc = ss.accept();
			InputStream is = sc.getInputStream();
			OutputStream os = sc.getOutputStream();
			
			byte []data = new byte[1024];
			int n = is.read(data);
			String msg = new String(data, 0, n);
			System.out.println(msg);
			
			System.out.println("입력할 내용을 적어주세요: ");
			String chat = id+": "+scan.nextLine();
			os.write(chat.getBytes());
			
			os.flush();
			is.close();
			os.close();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
