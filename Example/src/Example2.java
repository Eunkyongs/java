import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
/*
 ���빮��2
 ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�, ������ ����� ����Ͽ� ¦������ Ȧ�������� ����Ͻÿ�.
 
  "�����ܿ� ���� ���ڸ� �Է��ϼ���?" ��� �޼��� ��µǸ� �����Է�. 
  �Էµ� �ش� ���ڿ� ���缭 ��� ����� ���ϸ�, ���� ���� ���� ¦������ Ȧ�������� ����Ͻø� �˴ϴ�.
  ��, �ش� �ݺ����� for~do while������ �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
  
  ���ǹ��� �ݺ��� �ۿ� �־����.
*/

		Scanner sc = new Scanner(System.in); // �Է¿��� ȣ��
		
		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���?");
		
		int user;//����� �Է°�.
		
		user=sc.nextInt();
		
		int a,aa; //�ݺ����� ����ϴ� ����
		int total=0; // ���꿡 ����� ����
		for(a=2; a<=9; a++) { // ū�ݺ��� 2~9
			user=sc.nextInt();
			for(aa=1; aa<=9; aa++) { //�����ݺ��� 1~9
				
				total=user*aa; //ū�ݺ���,�����ݺ��� ȸ���Ǿ� ���� ���� ����
			}
		
		}
	System.out.println(total);
		
	if(total%2==0) {
		System.out.println("������� ¦�� �Դϴ�.");
				
	}else {
		System.out.println("������� Ȧ�� �Դϴ�.");
	}
	
		
		
	}

}
