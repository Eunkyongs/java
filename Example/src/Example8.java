import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/* ���빮�� 8: ����� �н������ a1234�Դϴ�. ����ڰ� �н����带 �Է��մϴ�. �� 3ȸ�̻� ���н� ������ ���� ��µǵ��� �մϴ�.
		 "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�." ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� ��µǾ�� �մϴ�. */
			
/*		//Ǯ��
		final String pw = "a1234";
		int c=3;
		Scanner sc = new Scanner(System.in);
		int w =0;
		String msg = "�н����带 �Է��� �ּ���:";
		while (w<3) {
			System.out.println(msg);
			String userpw = sc.next();
			if(pw.equals(userpw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}else {
				msg="�ùٸ� �н����带 �־��ּ���.";
				c--;
				if(c==0) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				}
			}
			w++;
		}
*/		
		
		
		
		
		
		
		
		
		
		
		String pw = "a1234"; //pw��		
		Scanner scan = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���. : ");
		
		//do~while�� ���
		int dw=1;
		do {
			String user = scan.next();//����� �Է�
			if(user.equals(pw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
				if(dw==0){
				
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				}
			}
			dw++;
			
			
			
		}while(dw<=3);

		
		
		
		
		
		
		
		
		//for�� ���
		/*		int f; // �ݺ�����뺯��
		for (f = 1; f <= 3; f++) { //3������ �Է�
			
			String user = scan.next();//����� �Է�
			
			if (user.equals(pw)) {//���ǹ�. 
				System.out.println("�α��� �Ǿ����ϴ�."); //�н����尪�� ������� ��µ� ����
				break; //�ݺ��� ���������Ҷ� ����մϴ�.
			}	
			else {
				System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
				
			}
			 // 3���̻� Ʋ������
			System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
		}
*/		

		


		//while�� ���
/*		while(dw<=3) {
			String user = scan.next();//����� �Է�
			
			if(user.equals(pw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
			}else { 
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�."); // 3���̻� Ʋ������
			}
			
			dw++;

		}
*/	
scan.close();

	}
}

