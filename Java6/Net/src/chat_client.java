import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//client
public class chat_client {
	public static void main(String[] args) {
		try {
		client_chat cc = new client_chat();
		cc.chat();
		}catch(Exception a) {
			if(a.getMessage() !=null) {
				System.out.println(a);
			}
		}

	}

}
class client_chat{
	private final String ip = "127.0.0.1";
	final int port = 8009;
	Scanner sc = null;
	InputStream is =null;
	OutputStream os = null;
	OutputStream os2 = null;
	private String mid = null;
	Socket sk =null;
	String msg = null; // ����� �Է���Ʈ
	String msg2 = null; // ����޼���
	String smsg = null; //�������� �����ϴ� �޼���
	
	public void chat() {
		//�ذ��� Stream�� close ���� �ʽ��ϴ�. �ֳ��ϸ�, ��� Stream�� ���ϰ� ������ �Ǿ� �����Ƿ� close�� ���ϵ� �Բ� ���ᰡ �˴ϴ�. 
		try {
			this.sc = new Scanner(System.in);
			System.out.println("���̵� ������ �ּ��� : ");
			this.mid = this.sc.next();
			
			while(true) {
				
				this.sk = new Socket(this.ip,this.port); // ����Ȯ��
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				this.os2 = this.sk.getOutputStream();
				
//				this.msg2 = "["+this.mid+"] : �� �����Ͽ����ϴ�.";
//				this.os2.write(this.msg2.getBytes());
//				this.os2.flush();
				
				//�������� �޾ƿ���
				byte []data = new byte[1024];
				int n = this.is.read(data);
				this.smsg = new String(data, 0, n);
				System.out.println(this.smsg);
				
				this.sc = new Scanner(System.in);
				System.out.println("������ �Է��� �ּ��� : ");
				this.msg = "[" + this.mid +"]:"+this.sc.nextLine().intern();
				this.os.write(this.msg.getBytes());
				this.os.flush();
				

				
			}
			
		}catch(Exception e) {
			if(e.getMessage() != null) {
				System.out.println(e);
			}
		}
		
		
	}
}