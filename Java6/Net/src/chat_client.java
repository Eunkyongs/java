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
		System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է��� �ּ���: ");
		myid = sc.next();
//		sc.close(); //������!! ���⼭ ��ĳ�� �����ϸ� �Ʒ��� �ڵ� �۵��̾ȵ�
		
		//���Ӵܰ�

		Socket sk = new Socket(ip, port);
//		os.close(); // OutputStream , InputStream  close�� �ִ��� finally�� ����մϴ�.
		 
		while(true) {
			OutputStream os = sk.getOutputStream();
			InputStream is = sk.getInputStream();
			
			String message ="["+ myid +"]: ���� �����ϼ̽��ϴ�.";
			os.write(message.getBytes());
			os.flush();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("������ �Է��� �ּ���: ");
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
