import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
	//UnknownHostException : HOST ������ Ȯ�ε��� ���� ��� , HOST: ������
	public static void main(String[] args) throws UnknownHostException { //Ȯ�κҰ� ȣ��Ʈ ����ó��
		//InetAddress : IPnetworkAddress 
		//getByName : ������ ������ �ּҸ��� ���մϴ�.
		InetAddress ia = InetAddress.getByName("www.naver.com");
//		System.out.println(ia); // ia.toString() = ia �������� ��µ�.
//		System.out.println(ia.toString());
//		System.out.println(ia.getHostName()); //getHostName : �����θ�
//		System.out.println(ia.getHostAddress());// DNS�� ����� IP
	
//		ctrl+alt+shift+t = �͹̳� ����Ű
		

		//getAllByName : �����ο� IP������ Ȯ��. �迭�� �����ؾ���.
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length); // �ش� DNS�� IP����
		int w = 0;
		// �ݺ������� �ش� dns�� ���� ip ������
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
		
	}
}
