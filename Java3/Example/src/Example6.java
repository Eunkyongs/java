import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 ���빮��: ��ǰ ������ 42000�Դϴ�.
		 ����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�. 
		 �ش� ��ǰ ���ݿ� �´� ���� ��ŭ ���Ͽ� ���� ���� �ݾ��� ��½�Ű�� extends�� �����Ͻø� �˴ϴ�.
		 ��,42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
		 ����ڰ� �ִ� ���� �� �� �ִ� ������ 5�� ���� �Դϴ�.
		 ���� ������� main method���� ����մϴ�.
		 	
		*/
	
		cart2 ct2 = new cart2();
		Scanner scan = new Scanner(System.in);
		System.out.println("���Ÿ� ���ϴ� ��ǰ ������ �Է��� �ּ���.");
		int user_in=scan.nextInt();
		ct2.setter(user_in);
		int result1 = ct2.getter();
		if(user_in > 5) {
		System.out.println("�ִ� 5������ ���� �����մϴ�.");
		}else {
			System.out.println("�հ�ݾ�: "+result1);
		}
	}
}

class cart1{
	protected int c;
	private final int cost=42000;
	
	protected int total;
	protected String msg;
	
	public void setter (int count){
		this.c=count;
		this.total = this.cost * this.c; // �Է��� ���� * ����
	}
}
class cart2 extends cart1{
	public int getter() {
		return this.total;
	}
}