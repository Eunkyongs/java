
public class Switch1 {

	public static void main(String[] args) {
		/*
		 switch~case : ���ù�
		 �Էµ� �� �������� case�� �ߵ��Ͽ� ��°��� �����ϰ� �˴ϴ�.
		 defalut�� case�� ���� �� ���� ������ �������� ���� ��� �۵��Ǵ� �����Դϴ�.
		 switch(���ڰ�)
		 switch�� 10���̻� ����ϰԵǸ� �ӵ��� �ް��ϰ� ���ϵ�.
		 ������� ������ �ְ� ����� ������ ���� ���� ��쿡 �ַ� ���(ex.�귿, ��޺з�, �����ý���) 
		 */
		int n = 3;
		switch(n) { //n=���ڰ�.
		case 1:
			System.out.println("�ɼ� 1�� �����ϼ̽��ϴ�.");
		break;	
		case 2:
			System.out.println("�ɼ� 2�� �����ϼ̽��ϴ�.");
		break;
		case 3:
			System.out.println("�ɼ� 3�� �����ϼ̽��ϴ�.");
		break;
		default : // ���̽��� ���� ����
			System.out.println("������ ���� �����ϴ�.");
		break;
		}
		
		String user="�̼���"; // ���ڷ� switch���� ���ڰ� ����
		switch (user) { // ���� case���� �Դϴ�.
		case "�̼���":
		case "�� ����":
		case "����": 
		case "leesunsin":
			System.out.println("A�� �Դϴ�.");
		break;
		case "ȫ�浿":
			System.out.println("B�� �Դϴ�.");
		break;
		case "������":
			System.out.println("C�� �Դϴ�.");
		break;
		default : //�ֵ���ǥ �Ⱦ�. if~else���� else() �̷��� ���ϴ°Ͱ� ����
			System.out.println("�������� D�� �Դϴ�.");
		break;	
		}
		
		
	}

}
