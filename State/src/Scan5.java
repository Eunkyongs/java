import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		byte a = 10;
		if (a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���");
		} else if (a >= 10 || a <= 22) { // ���ǹ��� ������ �����Ͽ� ������
			System.out.println("��÷ �Դϴ�.");
		} else {
			System.out.println("���� ���� ���� �Դϴ�.");
		}
		
		/*
		 * ���빮�� Q.1~45���� ���� �ϳ��� �Է��ϼ���?
		 * error���� 
		 * 0�� �Է�: �����Է��� �߸� �Ǿ����ϴ�. 
		 * 45���� ū ���� �Է�: ���ڴ� 1~45������ �Է°����մϴ�.
		 * 
		 * 1~45 ���ڸ� �Է� �Ͽ��� ���
		 * 7,12,14 ������ ���� �Է½� ��÷�Դϴ� ��� ���
		 * �� ���� ���� �Է� ��	������ȸ�� �����ϼ��� ��� ���
		 */

		
		//���ڵ�
		
		Scanner num = new Scanner(System.in);
		System.out.println("Q.1~45���� ���� �ϳ��� �Է��ϼ���?");

		byte in = num.nextByte();

		
		if (in <= 0) {
			System.out.println("�����Է��� �߸� �Ǿ����ϴ�.");
		} else if (in > 45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		} else {
			System.out.printf("%d��(��) �Է��ϼ̽��ϴ�.", in);
		}
		
		
		if (in <= 0) {
			System.out.println("�����Է��� �߸� �Ǿ����ϴ�.");
		} else if (in > 45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		}		
		else {
			if(in==7 || in ==12 || in ==14){
				System.out.println("��÷�Դϴ�.");		}
			else {
			System.out.println("������ȸ�� �����ϼ���.");	
			}
			}
		
		
		/*���빮�� ������ �ڵ�
		
		Scanner qa = new Scanner(System.in);
		int n = qa.nextInt();
		System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���?");
		if(n==0) {
			System.out.println("�����Է��� �߸� �Ǿ����ϴ�.");
		}
		else if (n>45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		}
		else {
			if(n==7 || n==12 ||n==14) {
				System.out.println("��÷ �Դϴ�.");
			}
			else if (n== 41) {
				System.out.println("50%���� ��÷ �Դϴ�.");
			}
			else {
				System.out.println("���� ��ȸ��...");
			}
			
		}*/
		
		
		num.close();
		
		}
}


