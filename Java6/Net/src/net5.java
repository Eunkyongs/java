import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket��� : Server, Client : �޼���, ���� ���� �ۼ������(�����)
//HTTP��� : Image, ������, ���� ����ڶ� ������ �ۼ������(�ܹ���)
public class net5 {
	//Server
	public static void main(String[] args){
		System.out.println("Server Connect");
		int port = 8080; // ������ ��Ʈ ��ȣ�� ������(��, ���� �ߺ��� ��Ʈ�� ����ϸ� �ȵ�)
		String msg = "Success Connect!!";
		
		try {
		ServerSocket ss = new ServerSocket(port); //ServerSocket: ���½�ų ��Ʈ�� ����. �������� ��� , ������ �ݺ��� �ȿ� �θ� �ݺ��� ���ư������� �ʱ�ȭ�Ǿ� �������.
		//������ ���� ���� �ϱ� ���ؼ��� ServerSocket�� ���� ��ε带 �ؼ��� �ȵ˴ϴ�!!!
		while(true) {
		System.out.println("���� �����...");
		Socket sc = ss.accept(); //accept() : Ŭ���̾�Ʈ�� ������ ���� ����ϴ� ������ �ϰԵ�
		System.out.println("ȣ��Ʈ : ��� ���� ����");
		/*Server���� Client�� �޴� ���*/
		InputStream is = sc.getInputStream();//Client���� ������ ���� �о����
		/*Client�� ������ ���*/
		OutputStream os = sc.getOutputStream(); //Client�� ���� ����
		
		byte data[] = new byte [1024]; // Client���� �޴� ���� byte�� ����.
		int n = is.read(data); //�ش� ���� �о����
		String msgclient = new String (data,0,n); // �ش� ���� �迭�� Ȯ���Ͽ� ������ �̰�
		System.out.println(msgclient); // �̰��� ���� ��½�Ű�� ��
		
		String aws = "�ݰ����ϴ�."; // �������� ������ �޼���
		os.write(aws.getBytes()); // Ŭ���̾�Ʈ�� ���������� �޸� ����
		os.flush();
		
		is.close();
		os.close();
//		sc.close();
		}
		}catch(Exception e){
			System.out.println("���� ���� ��Ʈ�� �ߺ��Ǿ� ������ ���� �����մϴ�.");
		}
		
		
	}

}