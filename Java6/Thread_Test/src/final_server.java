/*[���� ���빮��](PORT��ȣ�� ������ ���ڸ� �Է¹޵��� �մϴ�.)
-���� ���α׷��� ���� �մϴ�.
���� �� ���� ���� �ش� ������ �ϰ� �˴ϴ�.
"����Ͻ� PORT ��ȣ�� �Է��ϼ��� : "
��Ʈ��ȣ �Է��ϸ� *****ä�ü��� ���� [  ]***** �̷������� ���.
-Ŭ���̾�Ʈ ���α׷��� �����մϴ�.
���� �� 
"������ IP��ȣ�� �Է��� �ּ��� :"
"������ PORT��ȣ�� �Է��� �ּ���:"
Ŭ���̾�Ʈ�� �����ϸ�
�Ʒ��Ͱ��� ���� ���� �޼��� ���.
"*****GUEST�� ���� �Ͽ����ϴ�. *****"*/
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
		System.out.println("����Ͻ� Port ��ȣ�� �Է��ϼ���:");
		this.port= scan.nextInt();
		
		try {
			this.ss = new ServerSocket(this.port);
			this.sk = this.ss.accept();
			System.out.printf("*****ä�ü��� ����[%d]*****",this.port);
			
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