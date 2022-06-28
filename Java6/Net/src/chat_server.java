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
		System.out.println("�������� ����� ���̵� �Է����ּ���: ");
		mid=sc.next(); // ���� ����� ���̵�
//			sc.close();//������!! ���⼭ ��ĳ�� �����ϸ� �Ʒ��� �ڵ� �۵��̾ȵ�

		try {
			ServerSocket server_sock =new ServerSocket(port);	//���������� �ʵ忡 �ø��� �νĸ��ϴ� �ʵ忡 �ø����ʵ��� ����!!
			System.out.println("�����...");
			Socket sk = server_sock.accept();
			
			while(true) {
			
			InputStream is = sk.getInputStream();
			OutputStream os=sk.getOutputStream();
			
			byte []data = new byte[9999];//1024 �Է½� kb�뷮�� �۾Ƽ� �����߻��Ҽ�����
			int arr = is.read(data);
			String message = new String (data,0,arr);
			System.out.println(message);
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("������ �Է��� �ּ���: ");
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
