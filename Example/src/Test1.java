import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * [���빮��] 
		 * ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
		 * 
		 * ù��° ���ڰ��� �Է��ϼ���
		 * �ι�° ���ڰ��� �Է��ϼ���

		 * ù��° ���ڰ� * �ι�° ���ڰ� �� ���� ����� ����Ͻʽÿ�
		 * ��, �ش� ������� 100���� �� ��� ��¸޼��� "100������ ������Դϴ�." ��� �����Ͻð�
		 * 100�̻��� ���, "�ش� ���� 100 �̻� ����� �Դϴ�." ��� ����մϴ�.
		 */
		
		Scanner a =  new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		
		int a1 = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
		
		int b1 =  b.nextInt();
		int mul = a1*b1; 
		System.out.println("�����:"+mul);
		
		if (mul >= 100) {
			System.out.println("�ش� ���� 100�̻� ����� �Դϴ�.");
		}
		else if(mul <= 100){
			System.out.println("�ش� ���� 100������ ����� �Դϴ�.");
		}
		a.close();
		b.close();
		
	}

}
