public class app {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		// ��Ģ�����ȣ: + , - , * , /

		// c = a + b;
		// c = a - b;
		// c = a * b;
		c = a / b;
		System.out.println(c);

		String a1 = "ȫ�浿";
		String b1 = "ȯ���մϴ�.";
		String c1;
		c1 = a1 + b1; // ���������϶� +�� ����+���ڿ��� ǥ�� �� �� �ֽ��ϴ�.
		System.out.println(c1);

		/*
		 * ���빮�� ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�. ȫ�浿�� �������� 50000 �Դϴ�. ��, ȫ�浿�� 50000�� ���� ���������� ��ȭ��
		 * �� �ֽ��ϴ�.
		 */

		String z = "ȫ�浿";
		int x = 50000;
		String msg = z + "�� ��������" + x + "�Դϴ�.";

		System.out.println(msg);

		/*
		  ���빮�� �Ƹ��� ����Ʈ���� ��ǰ�� �����߽��ϴ�. 
		  ��ٱ��Ͽ� ���� ��ǰ������ ��� ���ؼ� �� ���� �ݾ��� ��µǵ��� �Ͻÿ�. 
		  ��, $ȯ���� ��µǾ�� �մϴ�.
		  8.25
		  4.02
		  3.71
		  ��� ���� ������ ���� ����ϼ���
		  �� �����ݾ� $ �Դϴ�.
		 */

		double cost1 = 8.25;
		double cost2 = 4.02;
		double cost3 = 3.71;
		
		double cost= cost1+cost2+cost3;
				
		String msg1 = "�� �����ݾ� $"+cost+"�Դϴ�.";
				System.out.println(msg1);
				
		double p1,p2,p3,p4;
		p1=8.25;
		p2=4.02;
		p3=3.71;
		p4=p1+p2+p3;
		System.out.println("�� �����ݾ� $"+p4+"�Դϴ�.");
		
		int k = 3;
		int j = 9;
		double aw = (double)k/j; //���� ������ �ڷ��� ���� �ִ� �ڵ� (test����)
		// aw �������� double �ڷ��� ����. 
		//k,j�� int�ڷ������� ����� ����. double �ڷ������� ����Ϸ��� �տ� ��ȣ�� double �������ָ� double������ ����.
		System.out.println(aw);
	}

}
