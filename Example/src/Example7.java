import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/* ���빮��7: ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ����� �����մϴ�.
		 * "ù��° �Է°� ��, 1~10���� �Դϴ�.:" "�ι�° �Է°� ��, 1~10���� �Դϴ�.:" "����° �Է°� ��, 1~10���� �Դϴ�.:"
		 * "������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�.:" +,-,*,/
		 * �ش� ��� ��ȣ�� �°� ������� �����Ͽ� �������� ��½�Ű�ÿ�. */
		
/*		Scanner scan = new Scanner(System.in); // �Է¿���ȣ��
		String msg = "��° �Է°� ��, 1~10���� �Դϴ�.: "; // ������¿� ����� ���ڿ�

		int user, user2, user3;
		String user4; // �Է°� ���� ����
		double total = 0;

		// �������
		System.out.println("1" + msg);
		user = scan.nextInt();
		System.out.println("2" + msg);
		user2 = scan.nextInt();
		System.out.println("3" + msg);
		user3 = scan.nextInt();
		System.out.println("������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�.: (+,-,*,/)");
		user4 = scan.next();

		//�Է��� �����ȣ�� ���� ����
		if (user4.equals("+")) {
			total = user + user2 + user3;
		} else if (user4.equals("-")) {
			total = user - user2 - user3;
		} else if (user4.equals("*")) {
			total = user * user2 * user3;  
		} else if (user4.equals("/")) {
			total = user / user2 / user3;
		} else {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. + , - , * , / �߿� �ϳ��� �Է��ϼ���.");
		}
		
		//����� ���
		System.out.printf("���: %d",total);
		
		scan.close(); //�Է¿��� ����
*/		
		
		//������ �ڵ�
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �Է°� ��(1~10����)�Դϴ�.");
		int no1 = sc.nextInt();
		System.out.println("�ι�° �Է°� ��(1~10����)�Դϴ�.");
		int no2 = sc.nextInt();
		System.out.println("����° �Է°� ��(1~10����)�Դϴ�.");
		int no3 = sc.nextInt();
		System.out.println("�ش� ������ ���� ���� �����ȣ�� �����ÿ�: ");
		String ms = sc.next();
		
		if(ms.equals("+")) {
			System.out.println(no1+no2+no3);
		}else if(ms.equals("-")) {
			System.out.println(no1-no2-no3);
		}else if(ms.equals("*")) {
			System.out.println(no1*no2*no3);			
		}else {
			System.out.println(no1/no2/no3);
		}
	sc.close();
	}

}
