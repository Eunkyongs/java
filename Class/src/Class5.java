import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2.lists2();//�޸𸮿��� �ε�
		
		Member2 mb2 = new Member2(); // static�� ���� �Լ��̹Ƿ� ��ü �� �ν��Ͻ��� ����
		mb2.lists(); //�ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε��ϰ� �� 
		
		Member2.list3("������",123456);//list3�� static ������ �ٷ� �ε尡��
		//Member2Ŭ�����ȿ� list3�̶�� ������ "������"�� ����
		
		/*���빮��: for_in�̶�� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�. 
		 ���α׷� ����� ������ ���� ������ �մϴ�.
		 "����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���."
		 [���]-�ش� �޼ҵ忡�� ����� ����ؾ���
		 ���� ����ڰ� 3���� �Է½� 3*1=3...3*9=27�� ��µǾ���.
		 (for�� ��� ����)
		 */
//		��ĳ�ʻ���ؼ� �Է¹޴� �κ��� �����Լ��ʿ� ����.
		Scanner scan = new Scanner(System.in);
		System.out.println("����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���.");
		int num = scan.nextInt();
		Member2.for_in(num);
		scan.close();
		}
		
	}


class Member2{
	//Ŭ���� �ȿ� �ݺ��� ����.
	public static void for_in(int gu) {
		int f;
		for(f=1;f<=9;f++) {
			System.out.println(gu+"*"+f+"="+f*gu);
			
		}
		
	}
	
	
	
	
	
	
 	public void lists() { //�޸𸮿� ������ �Ҵ���� �޼ҵ� �Լ��� ���� 
		String a = "ȫ�浿";
		System.out.println(a);
	}
	public static void lists2() {
		String a = "�̼���";
		System.out.println(a);
	}
	//Member2�� �Ϲ��Լ�(�޸�) list3. �޼ҵ� �ȿ� 3���� �ʵ带 �����մϴ�. ����user_name, ���� user_tel, ���� user_point
	public static void list3(String nm, int pw) {
		//nm�� �޼ҵ忡�� ���� �޴� ���� �ٷ� ����� ���(nm.equals("������"))
		String user_name=nm; 
		int user_pw=pw; //�޼ҵ忡 ��ü���� ÷���Ͽ� �ε� �� �޼ҵ�ȿ� ������ �ʵ���� �̿��Ͽ� ���� �޴� ����
		if(nm.equals("������")&& user_pw ==123456) {
			System.out.println("ȸ�� Ȯ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("��ȸ�� �Դϴ�.");
		}
		
	}
}