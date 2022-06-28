import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//client
public class chat_client {
	public static void main(String[] args) {
		String ip = "192.168.100.76";
		int port = 9090;
		String myid =null;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("채팅에 사용하실 아이디를 입력해 주세요: ");
		myid = sc.next();
//		sc.close(); //※주의!! 여기서 스캐너 종료하면 아래쪽 코드 작동이안됨
		
		//접속단계

		Socket sk = new Socket(ip, port);
//		os.close(); // OutputStream , InputStream  close는 최대한 finally에 사용합니다.
		 
		while(true) {
			OutputStream os = sk.getOutputStream();
			InputStream is = sk.getInputStream();
			
			String message ="["+ myid +"]: 님이 입장하셨습니다.";
			os.write(message.getBytes());
			os.flush();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("내용을 입력해 주세요: ");
			String word = sc2.nextLine().intern();
			
			if(word=="exit") {
				sc2.close();
				os.close();
				is.close();
				break;
//				System.exit(0);
			}
			
			String messageString ="["+ myid +"]:"+ word;
			
			os.write(messageString.getBytes());
			os.flush();
			
			byte data[] = new byte[9999];
			int no = is.read(data);
			String msg = new String(data,0,no); 
			System.out.println(msg);
				
		}
		
		}catch(Exception z) {
			
		}

	}

}
