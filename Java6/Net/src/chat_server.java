/*���빮�� Ŭ���̾�Ʈ�� exit��� �ܾ �Է��� ��� �������� 000���� �����ϼ̽��ϴ�.��� �߰� ä���� �����ϰ� �˴ϴ�. 
 ��, Ŭ���̾�Ʈ������ ä���� �����ؾ��ϸ� �����ʿ����� ä���� ����Ǿ�� �մϴ�.*/ 


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//server
public class chat_server {
	
	public static void main(String[] args) {
		chat ch = new chat();
		ch.chat_server();
	}

}

class chat{
	private int port = 8009;
	ServerSocket sk =null;
	Socket so = null; //
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null;
	String msg = null; 
	String cmsg = null;
	String check = null;
	public void chat_server() {
		try {
			this.sk = new ServerSocket(this.port);
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �����ϼ��� : ");
			this.mid = sc.next();
			System.out.println("ä�ù� ���� �Ǿ����ϴ�.");
			
			while(true) {
				this.so = sk.accept();
				this.is = so.getInputStream();
				this.os = so.getOutputStream();
				
				byte data [] = new byte [1024];
				int n = this.is.read(data);
				this.msg = new String(data, 0, n);
				System.out.println(this.msg);
				
				//������ ������ ���������� ������ �������. client�� ���� �������� ������ ���� ���������� ������ �Ǵ�
				if(this.msg.indexOf("����") != -1) { 
					sk.close();
					break;
				}
				
				
				this.sc = new Scanner(System.in);
				System.out.println("������ �Է��� �ּ��� : ");
				this.check = this.sc.nextLine().intern();
				if(this.check=="exit") {
					sk.close();
					so.close();
					break;
				}
				this.cmsg = "["+this.mid + "]:"+this.check;
				this.os.write(this.cmsg.getBytes());
				this.os.flush();

			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}