import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/*
 [Server - port2]

1.Server���� ��Ʈ�� 2�� ���� -> 8001, 8002
2. Client 1�� 8001�� ����, Client 2�� 8002�� ����

[Server - port1]

1. Server���� ��Ʈ 8003 ����
2. Client 1,2 ��� 8003���� ����

�� ��� ��� ������ ����, �������� ������ ��θ� �� üũ �ϸ��.*/

//Server�� �������� ��Ʈ�� ���� 8001,8002
//Exception : bind Exception (PORT �浹) -> ��Ʈ ��������� Ȯ���ؾ���.
public class chat_server {
	public static void main(String[] args) {
		/* ��Ʈ������
		int port[] = {8001,8002};
		int ea = port.length;
		int w = 0;
		openchat oc = null;
		while(w<ea) {
			oc = new openchat(port[w]);
			oc.start();
			w++;
		}
		*/
		//��Ʈ1��
		int port = 8003;
		openchat oc = null;
		oc = new openchat(port);
		oc.start();
	}
}

class openchat extends Thread{
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	
	public openchat(int p) {
		this.pt = p;
	}
	
	@Override
	public void run() {
		try {
			this.sk= new ServerSocket(this.pt);
			
			while(true) {
			Socket s = this.sk.accept(); //�ش� port ��� ����
			
			this.is =  s.getInputStream();
			this.os = s.getOutputStream();
			
			/*client���� �޴� �޼���*/
			byte data[] = new byte[1024];
			int n  = is.read(data);
			String message = new String(data,0,n);
			System.out.println(message);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	
}