import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
//Thread�� ����������.. client�� ��������� ���۸�
public class m_server {

	public static void main(String[] args) {
		chatroom cr = new chatroom();
		
	}
}
class chatroom { //�⺻���� => �� �����ڸ��� thread�� ����
	ServerSocket server = null;
	static final int port=9009; // thread���� �������� ����ϱ� ����
	Socket sk = null;
	public chatroom(){
		try {
			this.server = new ServerSocket(this.port);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("*****��Ƽ ä�� ����!!*****");
		
		while(true) {
			try {
				sk = this.server.accept();//Ŭ���̾�Ʈ ���� �㰡 �κ�
				chat_thread ct = new chat_thread(this.sk); //accept ������ �����ϴ�.
				Thread t = new Thread(ct);
				t.start();
			}catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}

class chat_thread implements Runnable{
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	//�迭�� �޸𸮿� ����Ŵ- ����: �������Ѿ���. ������ �߻� �� thread�� ���Ӱ� �����ǹǷ� static�� �ø��� ������ ���� ���� ��� �ʱ�ȭ�Ǿ����
	static ArrayList<Socket> user = new ArrayList<>(); //������ . ����� ���Դ��� ī����
	
	public chat_thread(Socket s) { // ������ �������� ���±⶧���� �������� �޾ƾ���.
		this.sk = s;
		this.user.add(s);
		try {
			System.out.println("ä�ÿ� �����ϼ̽��ϴ�.");
			System.out.println(this.sk); // ������ ����
			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();
		}catch(Exception e) {
			System.out.println("Ŭ���̾�Ʈ ���������� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	@Override
	public void run() {
		try {
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.message = new String (data,0,n);
				System.out.println(this.message);
				
				while(true) {
					System.out.println(this.user.size());
				this.sc = new Scanner(System.in);
				System.out.println("���� �޼����� �Է��ϼ��� : ");
				this.result = sc.nextLine();
				/*�迭�� �ִ� vport�� ���� ������ ���� ����ŭ �ݺ��� �մϴ�.*/
				for(int j=0; j<this.user.size(); j++) {// for<while<do~while<foreach foreach�� �������
					//�迭�� �ִ� ����� vport�� ������ �ϰ� �˴ϴ�.
					OutputStream all = this.user.get(j).getOutputStream();
					all.write(this.result.getBytes());//(����)
					all.flush();//�ش� ���� �޼����� ���(�޸�)
				}
				/*test��
				this.os.write(this.message.getBytes());//ä��â���� ȸ��
				this.os.flush();
				Thread.sleep(10000);
				String m ="������ �޼��� ���!!";
				this.os.write(m.getBytes());
				this.os.flush();
				*/
			}
		}catch(Exception e) {
			System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ����ϴ�.");
		}
		finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
				
			}catch(Exception e) {}	
		}
	}
}