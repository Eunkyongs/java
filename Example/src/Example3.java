import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * ���빮��3: ����ڰ� �ش簪�� �Է��մϴ�. ��, ����ڰ� �ΰ��� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���ڹ��� �ȿ� �ִ� ��� ���ڸ�
		 * ���ؼ� ������� �������� �����Ͻÿ�. ��, �ش��ڵ�� do~while������ �ۼ��մϴ�.
		 * 
		 * ����) ù��° ���� ���ڴ�? 5 �ι�° ���� ���ڴ�? 10 ���� ���� ��� �հ�� :45 �Դϴ�.
		 */

	/*	Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int user1; // ����� �Է°� ���� ����
		int user2;
		int total = 0; // ����� �Է°��� �� ���� ����
		

		System.out.println("ù��° ���� ���ڴ�?");
		user1 = scan1.nextInt();
		System.out.println("�ι�° ���� ���ڴ�?");
		user2 = scan1.nextInt();

		do {
			total += user1 ;
			user1++;
		} while (user1<= user2);

		System.out.println("�Է��� ���� ������ ��� �հ��: " + total + "�Դϴ�.");

		scan1.close();
		scan2.close();*/
		
//		Ǯ�� 
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� ���ڴ�?");
		int a = sc.nextInt(); // ���� 2���� ��ĳ�ʿ��� 1�� ��밡��
		System.out.println("�ι�° ���� ���ڴ�?");
		int b = sc.nextInt();
		int total = 0;
		do {
			total += a;
			a++;
		}while(a<=b);
		System.out.printf("�Է��� ���� ������ ��� �հ��: %d" , total );
		sc.close();
	}

}
