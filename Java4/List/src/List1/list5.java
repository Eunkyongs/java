package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*���빮�� ����ڰ� ���� �ݾ��� �Է��մϴ�.
		 �ش� ���� �ݾ� �Է� Ƚ���� �� 8���Դϴ�.
		 0~n���� �Է°����ϸ� 
		 �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ��½�Ű�ÿ�.
	
		����)
		�Ա��� �ݾ��� ��������?
		500 600 500 400 200 100 50 50
		���) ���Աݾ��� 2400�� �Դϴ�.
		 */

		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> sum = new LinkedList<>(); //��迭
		
		int w=0;//�ε�����ȣ��
		int total=0;//�����հ��
		do{
			System.out.println("�Ա��� �ݾ��� ��������?");
			String cost = scan.next();
			try {
				int money = Integer.parseInt(cost);
				sum.add(money);
				total+= sum.get(w);
			}catch(Exception e) {
				System.out.println("�ݾ��� ���ڷθ� �Է��ϼ���.");
			}
			w++;
		}while(w<8);
		System.out.printf("�� �Աݾ��� %d �� �Դϴ�.",total);
	}
}
