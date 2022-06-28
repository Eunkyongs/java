import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client_1 {

	public static void main(String[] args) {
		
		String ip = "192.168.100.76"; //내pc ip
		int port = 9090;//8009;
		//예외처리를 finally에서도 사용할수있게 하기위해 stream socket scanner등을 필드에 선언
		Scanner sn =null;
		OutputStream os = null;
		InputStream is =null;
		Socket sc = null;
		try {
			sc = new Socket(ip,port);
			System.out.println("서버 접속 되었습니다.");
			os = sc.getOutputStream();
			is = sc.getInputStream();
			sn = new Scanner(System.in);
			
			System.out.println("채팅에 사용하실 아이디를 입력해 주세요:");
			String id = sn.next();
			for(;;){ // 지속적으로 소켓에 계속 접속되도록 하는 형태
			//입력한 내용을 서버로 전송
			System.out.println("입력하실 내용을 적어주세요");
			String msg = id + sn.nextLine();
			
			os.write(msg.getBytes());
			os.flush();
			
			byte [] data = new byte[1024];
			int n = is.read(data);
			String cmsg = new String(data, 0, n);
			System.out.println(cmsg);
//			sn.close();
			}
			
			
		}catch(Exception c) {
			System.out.println(c.getMessage());
			if(c.getMessage() != null) {
			sn.close();	//접속 종료시 체크 //exception이나 final에 주로 선언
			System.out.println("현재 접속장애가 발생하였습니다.");
			}
		}finally {//클라이언트가 접속 종료시 해당 소켓및 각종 스트림,스캐너 모두 종료
			try { 
				os.close();
				is.close();
				sn.close();
				System.out.println("종료");
			}catch(Exception aa) {
				
			}
		}
		
	}

}
