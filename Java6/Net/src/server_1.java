/*
 [1:1 ä�� ���α׷� ���μ���]

��Ʈ : 9090

[Server]
"�������� ����Ͻ� ���̵� �Է��� �ּ��� : " (���ϸ��� ����)
������

�����....


ȫ�浿:�ݰ����ϴ�.(Ŭ���̾�Ʈ�� �Է��ѳ���)
"������ �Է��� �ּ���:" �������~

"ȫ�浿�� ���� �ϼ̽��ϴ�."

"������ �Է��� �ּ���."

[Client]

"ä�ÿ� ����Ͻ� ���̵� �Է��� �ּ���: "
����...

���̵� ȫ�浿 �Է��ϸ� 
"������ �Է����ּ���: " �ݰ����ϴ�~~ �Է��ϸ� ������ ���(ȫ�浿:�ݰ����ϴ�)

������:�������~ (�������� �Է��ѳ��� ���)

"������ �Է��� �ּ���:" exit (exit���� �ݺ��� ������������=break�̿�)

"ä���� ���� �Ǿ����ϴ�."
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server_1 {

	public static void main(String[] args) {
		int port = 9090;
		ServerSocket ss = null;
		Socket sc = null;
		Scanner scan = null;
		try {
			System.out.println("�������� ����� ���̵� �Է��� �ּ���:");
			scan = new Scanner(System.in);
			String id = scan.next();
			
			ss = new ServerSocket(port);
			System.out.println("���� �����...");
			for(;;) {
			sc = ss.accept();
			InputStream is = sc.getInputStream();
			OutputStream os = sc.getOutputStream();
			
			byte []data = new byte[1024];
			int n = is.read(data);
			String msg = new String(data, 0, n);
			System.out.println(msg);
			
			System.out.println("�Է��� ������ �����ּ���: ");
			String chat = id+": "+scan.nextLine();
			os.write(chat.getBytes());
			
			os.flush();
			is.close();
			os.close();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
