import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
				
		/*{3.4, 1.6, 4.2, 5.3, 4.7} ó�� �迭 ���� �����Ͱ� �Ҽ��ΰ�� �迭 double������ ����*/
		
//		{5,10,15,20,25,30,35}
		
//		int data[] ={5,10,15,20,25,30,35};
/*		for~each ���� ����Ҷ��� �ε��� ��ȣ�� �ʿ���� ����� ��� (ex. �ܼ��ѹ迭. )
 		for~do~while�� ����Ҷ��� �ε��� ��ȣ�� �ʿ��� �� ���
		[0],[1],[2] : �ε��� ��ȣ

*/	
/*		for(int f : data) { //int f �� ���������� data�迭���� �޾Ƽ� �����ŵ�ϴ�.
			if(f%2==0) {
//				System.out.println(f);
			}
		}
		
		String pay [] = {"�������Ա�","�ſ�ī��","�޴�������","��ǰ��","����"};
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϰ��� �ϴ� ���¸� ������ �ּ���.");
		
		String pm = sc.next();
		
		for(String z : pay) { // �迭�����Ͱ� �����̹Ƿ� �޴� ���� ���� ���� �������� ����ؾ� �մϴ�.
			if(pm.equals(z)) {
				if(z.equals("�޴���")) { // switch������ ��ȯ ����
					System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
				}else {
					
					System.out.println(pm+"�� ���� ���� �˴ϴ�.");
				}
				
			}

		}
//		sc.close();
	*/	
		/*���빮�� : {"�ܹ���","����","ġŲ","Ŀ��"}
		 "�ֹ��ϰ��� �ϴ� ������ ������ �ּ���."
		 �ش� ������ �� 4���� ����� �˴ϴ�. 
		 ��, "�ֹ�����"��� ����ڰ� �Է½� �� ��� �ֹ��� ����Ǹ�, �ֹ������� ����Ͻø� �˴ϴ�.
		  */
		//�������� �ٸ� �ݺ������� ��������
//		��ĳ�ʰ� �ݺ��� �ȿ� ���� 1������ �ݺ����ư��� �������
//foreach �� 2���迭���� ���Ұ�
		
		
		//������ �ڵ�
		
		String menus[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		Scanner sc = new Scanner(System.in);
		String user;
		String user_menu [] = new String[4];
		int ct = 0;
		for(String f: menus) {
			/* Scanner �� �ݺ��� �ȿ� ����� loop�� ������ �ݺ������� ����
			  ����ڰ� �Է��� ������ �ݺ��� ������ŭ ����ϴ� ������
			 */
			System.out.println("�޴��� ������ �ּ���?:");
			user = sc.next();
			if(user.equals("�ֹ�����")) {
				break;
			}else {
				for(String ff : menus) {
					if(user.equals(ff)) {
						user_menu [ct] = ff;
						ct++;
					}
				}
			}
		}
		sc.close();
		System.out.println("�ֹ��Ͻ� �޴��� ������ �����ϴ�."+Arrays.toString(user_menu));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String food[]={"�ܹ���","����","ġŲ","Ŀ��"} ;
		
		Scanner scan= new Scanner(System.in);

		String user;
		String order_total; // �ֹ����� ����
		
		for(String u : food){
			System.out.println("�ֹ��ϰ��� �ϴ� ������ ������ �ּ���.");
					user=scan.next();	
			if(scan.equals(user)) {
				order_total = scan+u;
			
				if(scan.equals("�ֹ�����")) {
				
					System.out.println(order_total);
					break;
				}
			}
		}

		scan.close();
		*/
		
		
	}

}