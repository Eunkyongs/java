import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	/*
	[UP&DOWN ����]
	A��Ʈ : PC ����, Scanner �̿� 5��
	B��Ʈ : PC���� �������� �� ����ڰ� ���� ���ڸ� �� �� ��� ó�� 
	
	
	1.PC�� ���ڸ� �ϳ� ����?? (��Ʈ: random���) 1~10���� ���  
	2.�� ��ȸ�� 5�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
	3.���࿡ PC�� ����7�� ������ ���ؿ��� ����� ���ڿ� ��
	-pc:7, �����:2 => ��� : UP
	4.�� ��ȸ�� 4�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
	5. pc:7 �����:4 => ��� : UP
	6.�� ��ȸ�� 3�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�?
	7. pc:7 �����: 7 => �����Դϴ�. ��� ���μ����� ����(system.exit(0);)
	
	 
	 */	
		Example2 ex2 = new Example2();
		
		int pc_num =(int) (Math.random()*10+1); // Pc�� 1~10������ ������ �ϳ� �������� . *10�ϸ� 0~9���� ��µǴ� *10+1
		Scanner scan = new Scanner(System.in);
		int user_num =0; 
		int w = 5;
		while(w>0) { //��ĳ�� 5��
			System.out.printf("�� ��ȸ�� %d�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է����ּ���?",w);
			user_num= scan.nextInt();
			ex2.number(pc_num,user_num); //������ȣ�� ����ڰ� �Է��� ��ȣ ������
			String bb = ex2.result(); // �񱳰�� ���� ����
			if(bb.equals("����")) {  //�񱳰�� �����̸�
				System.out.println(bb); // �񱳰�� ���ϰ� ���
				System.exit(0); // �����Ŵ
			}else {
				System.out.println(bb); //�񱳰�� ���ϰ� ���
			}			
			w--;
		}		
		scan.close();
	}

}
