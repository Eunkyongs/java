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
	String check =null; //exit �ܾ����
	
	public void chat() {
		//�ذ��� Stream�� close ���� �ʽ��ϴ�. �ֳ��ϸ�, ��� Stream�� ���ϰ� ������ �Ǿ� �����Ƿ� close�� ���ϵ� �Բ� ���ᰡ �˴ϴ�. 
		
		//Socket �� �����Ͱ� �� �����Ͱ� ������ �̷������ ������ �������� ������ �߻��� �� �ֽ��ϴ�.
		try {
			this.sc = new Scanner(System.in);
			System.out.println("���̵� ������ �ּ��� : ");
			this.mid = this.sc.next();
			
			int c = 0;
			while(true) {
				this.sk = new Socket(this.ip,this.port); // ����Ȯ��
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				
				if(c==0) {
					this.msg = "["+this.mid+"] : �� �����Ͽ����ϴ�.";
				}
				else {
					this.sc = new Scanner(System.in);
					System.out.println("������ �Է��� �ּ��� : ");
					this.check = this.sc.nextLine().intern();
					this.msg = "[" + this.mid +"]:"+this.check;
				}
				if(this.check == "exit") {
					this.msg = "[" + this.mid +"]���� �����ϼ̽��ϴ�.";
					this.os.write(this.msg.getBytes());  
					this.os.flush();
					this.sk.close();
				}else { // exit��� �ܾ� ���X
				this.os.write(this.msg.getBytes()); // �̺κ��� ���������޾ƿ��� �κк��� �Ʒ��� ������ ���������޴°Ÿ� ��ٸ��⸸��. ������ �����������ؼ� ���� 
				this.os.flush();
				}
				
				//�������� �޾ƿ���
				byte []data = new byte[1024];
				int n = this.is.read(data);
				this.smsg = new String(data, 0, n);
				System.out.println(this.smsg);
				c++;
				
				
				
				
			}
			
		}catch(Exception e) {
			if(e.getMessage() != null) {
//				String error = e.getMessage();
//				if(error.indexOf("StringIndexOutOfBoundsException") != -1){
					System.out.println("����������ְ� �߻��Ͽ� ���� ���� �˴ϴ�.");
					
//				}
//				System.out.println(e);
			}
		}
	}
}