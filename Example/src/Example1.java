import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*���빮��: while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�.
		����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
	    ������ "7000 �����Ͻðڽ��ϱ�?" ��� ��µǸ�, ���� 1�̶�� �Է��ϸ� ���������ݾ׿� �߰� �Ǿ� ���ϴ�. 
		��, 2��� �Է½� ���������ݾ׿� �߰��Ǿ����� �ȵ˴ϴ�.
		
		�� ���� Ƚ���� 4�� �Դϴ�.
		�������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.
		
		���������ݾ� 14000
		*/
		
		Scanner sc = new Scanner(System.in);//�Է¿��� ȣ��
		final int cost=7000; //������ �����ݾ�	
		int total=0;//�����ݾ��� ���� ��
		int w=1;//�ݺ����� ���
		int user; //����� �Է°�
	
		while(w<=4) {//4�� �ݺ��ҰŴ�
			System.out.println("7000 �����Ͻðڽ��ϱ�?");
			user=sc.nextInt();
			if(user==1) {
				total+=cost;
			}			
				w++;
				}
		System.out.println("�����ݾ��� "+total+"�� �Դϴ�.");
		
		
		
	sc.close();	
	}

}
