import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	
		Scanner a =  new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		
		int a1 = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
		
		int b1 =  b.nextInt();
		
		if (a1*b1 >= 100) {
			System.out.println("�ش� ���� 100�̻� ����� �Դϴ�.");
		}
		else if(a1*b1 <= 100){
			System.out.println("�ش� ���� 100������ ����� �Դϴ�.");
		}

	}

}
