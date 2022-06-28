import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//server
public class chat_server {
	
	public static void main(String[] args) {
		int port = 9090;
		String mid = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("서버에서 사용할 아이디를 입력해주세요: ");
		mid=sc.next(); // 서버 담당자 아이디
//			sc.close();//※주의!! 여기서 스캐너 종료하면 아래쪽 코드 작동이안됨

		try {
			ServerSocket server_sock =new ServerSocket(port);	//서버소켓은 필드에 올리면 인식못하니 필드에 올리지않도록 조심!!
			System.out.println("대기중...");
			Socket sk = server_sock.accept();
			
			while(true) {
			
			InputStream is = sk.getInputStream();
			OutputStream os=sk.getOutputStream();
			
			byte []data = new byte[9999];//1024 입력시 kb용량이 작아서 에러발생할수있음
			int arr = is.read(data);
			String message = new String (data,0,arr);
			System.out.println(message);
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("내용을 입력해 주세요: ");
			String msg = "["+ mid +"]:"+sc2.nextLine();
			
			os.write(msg.getBytes());
			os.flush();
			
			is.close();
			os.close();
			sc.close();
			
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
