import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 * ���빮��10: ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�. ���� �׸��� ��ü 3�����̸�, ��� true�� ����Ǿ�߸�
		 * �������μ����� ������ �˴ϴ�. ����ڿ��� ���� �Ǵ� ������ ������ �����ϴ�. "�����׸� �����Ͻðڽ��ϱ�?" ��� �޼��� ���
		 * ������(1), ���Ǿ���(2)
		 * 
		 * �����׸��� �Ѱ����� �������� ���� ��� "��� ���� �ϼž߸� ����˴ϴ�."��� ��� �մϴ�. ��� ���� �Ͽ��� ��� "ȸ��������
		 * �Ϸ�Ǿ����ϴ�. ��� ����մϴ�.
		 */

		Scanner scan = new Scanner(System.in);

		int user;
		int f = 1;
		boolean ag=false;
		
		while (f < 4) {
			System.out.println("�����׸� �����Ͻðڽ��ϱ�? ������(1), ���Ǿ���(2)");
			user = scan.nextInt();
			if (user == 1 ) {
				ag=true;
			} else {
			ag=false;
			break;
			}
			f++;
		}
		
		if(ag==false) {
			System.out.println("��� �����ϼž߸� ����˴ϴ�.");
		}else {
			System.out.println("ȸ�� ������ �Ϸ� �Ǿ����ϴ�.");
		}
		scan.close();
		
		
//		������ �ڵ�
	/*
		Scanner sc= new Scanner(System.in); //�Է¿���
		int w=1; // �ݺ������
		int agree; // ����� �Է°�
		boolean all_agree = false;//���ǿ��� Ȯ��
		do { 
			System.out.println("�����׸� �����Ͻðڽ��ϱ�? ������(1), ���Ǿ���(2)");
			agree = sc.nextInt();
			
			if(agree==1) { //���ǰ� 1 �Է½�
				all_agree = true;
				
			}else { //���ǰ� 2 �Է½�
				all_agree = false;
				break; // ���Ǿ��ϸ� �ݺ��� ��������
			}
			
			w++;
		}while(w<=3);

		if(all_agree==false) {
			System.out.println("��� �����ϼž߸� ����˴ϴ�.");
			}else {
				System.out.println("ȸ�� ������ �Ϸ� �Ǿ����ϴ�.");
			}
			sc.close();
			*/
	}

}
