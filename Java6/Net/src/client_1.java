import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client_1 {

	public static void main(String[] args) {
		
		String ip = "192.168.100.76"; //��pc ip
		int port = 9090;//8009;
		//����ó���� finally������ ����Ҽ��ְ� �ϱ����� stream socket scanner���� �ʵ忡 ����
		Scanner sn =null;
		OutputStream os = null;
		InputStream is =null;
		Socket sc = null;
		try {
			sc = new Socket(ip,port);
			System.out.println("���� ���� �Ǿ����ϴ�.");
			os = sc.getOutputStream();
			is = sc.getInputStream();
			sn = new Scanner(System.in);
			
			System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է��� �ּ���:");
			String id = sn.next();
			for(;;){ // ���������� ���Ͽ� ��� ���ӵǵ��� �ϴ� ����
			//�Է��� ������ ������ ����
			System.out.println("�Է��Ͻ� ������ �����ּ���");
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
			sn.close();	//���� ����� üũ //exception�̳� final�� �ַ� ����
			System.out.println("���� ������ְ� �߻��Ͽ����ϴ�.");
			}
		}finally {//Ŭ���̾�Ʈ�� ���� ����� �ش� ���Ϲ� ���� ��Ʈ��,��ĳ�� ��� ����
			try { 
				os.close();
				is.close();
				sn.close();
				System.out.println("����");
			}catch(Exception aa) {
				
			}
		}
		
	}

}
