import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * ���빮��9: A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�. "������ �Է��ϼ���?"��� ������ �� 5���� ������
		 * �Ǹ�, ��� ������ �ջ��� �� 5���� ������ ���� ��հ��� ����մϴ�. for������ �ۼ� ��� �޽����� "�ش� ������������: " ��� ��,
		 * ���� ������ 40�� ������ ��� "������Դϴ�." ��� �޽����� ��� �� ���μ����� �����մϴ�. 40�� �̻��� ��� "�հ�" �̶��
		 * �޽����� ����Ͻʽÿ�.
		 * 
		 * [�߰���ȹ] "�Է��Ͻ� ������� �����ּ���:" ��� ���� ���� ��� �� �ش� �������ŭ �ݺ����� ������ �Ǹ�, �������ŭ ��հ���
		 * ����Ǿ�� �մϴ�.
		 */
		/*
		 * Scanner scan = new Scanner(System.in); String msg = "������ �Է��ϼ���?";
		 * 
		 * int f; // �ݺ������ int user;// ������Է°� 
		 * int total = 0; // �������հ�� 
		 * int aver; //��հ��
		 * 
		 * System.out.println("�Է��Ͻ� ������� �����ּ���:"); 
		 * int user2 = scan.nextInt();
		 * 
		 * for (f = 1; f <= user2; f++) { System.out.println(msg); // ���� ��� 
		 * user = scan.nextInt();// �Է� 
		 * total += user; }
		 * 
		 * System.out.println("����: "+total);
		 * 
		 * aver=total/user2;
		 * 
		 * System.out.println("�ش� ������ ������: "+aver);
		 * 
		 * if(aver<=40) { System.out.println("������Դϴ�."); }else {
		 * System.out.println("�հ�"); }
		 * 
		 * scan.close();
		 */
		// ������ �ڵ�

		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���:");
		int subject= sc.nextInt();
		int w = 1;
		int user;
		int total = 0;

		while (w <= subject) {
			System.out.println("������ �Է��� �ּ���: ");
			user = sc.nextInt();
			total += user;
			w++;
		}
//		System.out.println("���� �հ� ������ "+total);
		double avg = ((double)(total)) / subject;//double�� �Ҽ��� �Ʒ��ڸ� ���� ��������((double)(total))
		String msg;
		if(avg<40) {
			msg="����� �Դϴ�.";
		}else {
			msg="�հ� �Դϴ�.";
		}

		System.out.println("���� �հ� ������ "+total+"�� / ��� ������ " + avg+"�� �̸�, "+msg);
		sc.close();
	}

}