import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��� �ּ���.:");
		String address = scan.nextLine();
		
		System.out.println("��ȭ��ȣ�� �Է��� �ּ���.:");
		String phone = scan.nextLine();
		
		System.out.println("�ش� ������ Ȯ���� �ּ���.");
		System.out.printf("�ּ�: %s / ��ȭ��ȣ: %s",address,phone);
	
	scan.close();
	}

}
