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
			//����� �Է�
			this.scan = new Scanner(System.in);
			System.out.println("������ IP��ȣ�� �Է��� �ּ��� :");
			this.ip=scan.nextLine();
			System.out.println("������ PORT��ȣ�� �Է��� �ּ���:");
			this.port=scan.nextInt();
			
			this.sk = new Socket(this.ip, this.port);
			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();
			String s_msg ="*****GUEST�� ���� �Ͽ����ϴ�. *****";
			this.os.write(s_msg.getBytes());
			this.os.flush();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
