import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/* ���빮��:  3���� ��ǰ "���ڵ�� ��ǰ�� �Է½��� �ּ���?" 
		 �ݾ��� �Է��ϰ� ���� "���� %�� �Է� �� �ּ���:"��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ� �����ݾ��� ����Ǿ� ��µǵ��� �մϴ�. 

		int money = 10000;
		int coupon =20;

		double a = coupon * 0.01;
		System.out.println(a);

		double b=money*a;
		System.out.println(b);

		double c= money - b;
		System.out.println(c);
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int f; // �ݺ�����
	    int coupon = 20 ;
	    int money = 10000;
	    int a,b,c;
	    	    	
		
		for(f=1; f<=3; f++) {
			System.out.println("���ڵ�� ��ǰ �ݾ��� �Է½��� �ּ���?");
			a = scan.nextInt();
			System.out.println("���� % �� �Է����ּ���.");
			b = scan.nextInt();		
						
		}
		
		
		
	}

}
