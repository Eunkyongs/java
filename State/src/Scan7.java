import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/*
		 * [������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�] 
		 * Q.�������� ��ȣ�� �Է��ϼ���? 
		 * ���� 220524 
		 * ����ڰ� ���� 220524 �ܿ� �Է� �� "������ȣ�� Ʋ���ϴ�." ��� ����Ͻð� 
		 * ������ ������ȣ ���ڸ� �Է� �� "���� Ȯ�� �Ǽ̽��ϴ�."��� ����մϴ�. 
		 * ��, 220524�� java����� ���� ���� ����Ǵ� ������ ó���ϼ���.
		 */

		int sc = 220524; //�߼۵� ������ȣ

		Scanner in = new Scanner(System.in); //���Ӱ� ��ĳ�ʸ� ������ �ý��ۿ��� �Է°��� �޾� in�� ����
		System.out.println("Q.�������� ��ȣ�� �Է��ϼ���?");
		int num = in.nextInt(); //����� ������ȣ �Է°�

		//����� ���� �Էµ� ������ȣ Ȯ�� �ܰ�
		if (num == sc) { //�Էµ� ������ȣ�� �´°��
			System.out.println("���� Ȯ�� �Ǽ̽��ϴ�.");
		} else { //�Էµ� ������ȣ�� Ʋ�����
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		
		
		Scanner a = new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		
		int a1 = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
		
		int b1 = b.nextInt();
		
		if(a1*b1<=100) {
			System.out.println("100������ ������Դϴ�.");
				}
		else if(a1*b1>=100) {
			System.out.println("100�̻��� ����� �Դϴ�.");
		}
		
		in.close(); // ��ĳ�� ����
		a.close();
		b.close();
	}

}
