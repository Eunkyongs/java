import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		int num =  3;
		datalist da = new datalist(); //Ŭ������ static�̾��� �޸𸮿� �ȿö��ִ»����̹Ƿ� ��ü�� �����������
		da.array_data(num);
//		datalist da = "";//�޸� �Ҵ�Ǿ��� ������ �ʱ�ȭ��ų�� ���
		
//		String pay = "�ſ�ī��";
		String pay = "������ü";
		if(pay.equals("�ſ�ī��")) {
			da.pay1(); // �ش� ���ǿ� �´� �޼ҵ带 ȣ��
		}else {
			da.pay2(pay); //�޼ҵ忡 ��ü���� �¿���(ž�½���)����(��ü���� ���Ѵ�) 
		}
		
		/*���빮��: �ش� �ε��� Ŭ���� ���� agrees��� �̸��� ������ �ֽ��ϴ�.
		 main �޼ҵ忡�� ����ڰ� "������","���Ǿ���"�� �Է��ϰ� �˴ϴ�.
		 ���������� �Է� �Ǿ��� ��� "ȸ�������� ���� �˴ϴ�."��� �޼����� ����ϰ�, 
		 ���Ǿ����� �Է½� "���Ǹ� �ϼž� ���� �˴ϴ�."��� ��µǵ��� �Ͻÿ�.
		 ��, agrees Ŭ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带 �����Ͻÿ�.
		 */
		
		agrees ags = new agrees();
		Scanner sc = new Scanner(System.in);
		System.out.println("���ǿ��θ� �Է��� �ּ���.");
			String agree = sc.next();
		sc.close();	
//		ags.ag(agree);
		
		if(agree.equals("������")) {
			ags.ag1(); // Ŭ���� agrees���� �ش� ���ǿ� �´� �޼ҵ� ȣ��
		}else {
			ags.ag2(); 
		}
	}
}
class agrees{
	public void ag1(){
		System.out.println("ȸ�������� ���� �˴ϴ�.");
	}
	public void ag2(){
		System.out.println("���Ǹ� �ϼž� ���� �˴ϴ�.");
	}
	
	public void ag(String k) {
//		System.out.println(k);
		String msg;
		if(!k.equals("������")) {
			msg="���Ǹ� �ϼž� ���� �˴ϴ�.";
		}else {
			msg="ȸ�������� ���� �˴ϴ�.";
		}
		System.out.println(msg);
	}
}

class datalist{
	/*static �޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带 ���� ����ؾ� �ϴ� �κп����� static�� �̿��Ͽ� ����մϴ�.
	 
	 static(�����޼ҵ�) : �������̵��� ����� �� ����.
	 void�� ��� �� ���(�����޼ҵ�) : �������̵��� ����� �� ����.
	 �������̵� ����
	 class a{
	 void �޼ҵ�
	 }
	 class b extend a {
	 void �޼ҵ�
	 } 
	 */
	
	public void array_data(int a) { // static ���� �޼ҵ�.
		
		int w=1;
		while(w<=9) {
			System.out.println(a*w);
			w++;
		}
	}

	public void pay1() {
		System.out.println("�ſ�ī��� ���� ���� �մϴ�.");
	}
	public void pay2(String pm) {
		System.out.println(pm+"���� ���� ���� �մϴ�.");
	}
}
	