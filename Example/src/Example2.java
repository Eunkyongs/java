import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * ���빮��2 ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�, ������ ����� ����Ͽ� ¦������ Ȧ�������� ����Ͻÿ�.
		 * 
		 * "�����ܿ� ���� ���ڸ� �Է��ϼ���?" ��� �޼��� ��µǸ� �����Է�. �Էµ� �ش� ���ڿ� ���缭 ��� ����� ���ϸ�, ���� ���� ����
		 * ¦������ Ȧ�������� ����Ͻø� �˴ϴ�. ��, �ش� �ݺ����� for~do while������ �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
		 * 
		 * ���ǹ��� �ݺ��� �ۿ� �־����.
		 */

		/*Scanner sc = new Scanner(System.in); // �Է¿��� ȣ��

		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���?");

		int user;// ����� �Է°� ���� ����.
		user = sc.nextInt(); // ����� �Է°�.
	
		int aa; // �ݺ����� ����ϴ� ����

		int total = 0; // ���꿡 ����� ����
		for (aa = 1; aa <= 9; aa++) { // �ݺ�����
			total += (user * aa); //����ڰ� �Է��Ѱ��� ���� ������ ���� ����
		}
		System.out.println(user+"���� ����: " +total); // �ݺ��� ���� �� total�� ����� ������ ���� �հ谪 ���

		if (total % 2 == 0) { //���� �հ谪�� �� ���� ¦���� ���
			System.out.println("������� ¦�� �Դϴ�.");

		} else { //���� �հ谪�� �� ���� Ȧ���� ���
			System.out.println("������� Ȧ�� �Դϴ�.");
		}
		sc.close();*/
		
//		Ǯ��. do~while��
		Scanner sc = new Scanner(System.in);
		String msg2; // �޼��� ����
		String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���?";
		System.out.println(msg);
		int user = sc.nextInt();
		int f=1;
		int total = 0;
		do {
			total=total+(user*f); 
			//total+=user*f;
			f++;
		}while(f<10);
		//System.out.println(total);
		if(total%2==0) {
			msg2="¦��";
		}
		else {
			msg2="Ȧ��";
		}
		System.out.println("������� "+msg2+" �Դϴ�.");
		sc.close();
	}

}
