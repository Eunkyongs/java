import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		/*
		 extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ��Ͻÿ�.
		 ���� �ΰ��� �Է��մϴ�.
		 �ΰ��� ���ڸ� Ȯ���Ͽ� ������ ���� üũ�մϴ�.
		 1.ù��° ���ڰ� �ι�° ���ں��� Ŭ ���
		 2.ù��° ���ں��� �ι�° ���ڰ� Ŭ ���
		 3.ù��° ���ڰ� �ι�° ���ڶ� ���� ���
		 
		 2.ù��° ���ڰ� ���� ��� : �ش� �ΰ��� ���� ��ģ ����� ��� 
		 1.�ι�° ���ڰ� ���� ��� : �ش� ���� ��ŭ ���ڸ� ��� ���� ������� ���
		 3.ù��°�� �ι�° ���ڰ� ���� ��� : "�ش� ���� �����ϴ�." ��� �޼��� ���
		   
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���");
		int num2 = scan.nextInt();

		n_ck2 n2 = new n_ck2();
		n2.aa(num1,num2);
		n2.bb();
		
		//������Ǯ�̿�
//		int a = 10;
//		int b = 6;
//		exam2 ex= new exam2();
//		ex.exam1_method(a,b);
//		int result = ex.exam2_method();
//		System.out.println("���� �����"+result);
		
		scan.close();
		System.exit(0);
		
	}
}

class n_ck1{
	private int n1;
	private int n2;
	
	protected int r;
	
	protected int ck;
	protected String m2 = "�ش簪�� �����ϴ�.";
	public void aa(int nn1, int nn2) {
		this.n1 = nn1;
		this.n2 = nn2;

		if(this.n1 < this.n2) { //ù��° ���ڰ� �������
			this.r=this.n1+this.n2;
			this.ck = 1;
		}else if(this.n1 > this.n2) { // �ι�° ���ڰ� �������
			int f;
			for(f=this.n2; f<=this.n1; f++) {
				this.r+=f;
			}
			this.ck = 2;
		}else if (this.n1 == this.n2) { // �� ���� �������
			this.ck =3;
		}
	}
}
class n_ck2 extends n_ck1{
	public void bb() {
		switch (this.ck) {
		
		case 1:
			System.out.println(this.r);
			break;
		
		case 2:	
			System.out.println(this.r);
			break;
		
		case 3:
			System.out.println(this.m2);
			break;
		}
	}
}

//������ Ǯ��

class exam1{
	private int no1;
	private int no2;
	protected int ex_sum;
	public void exam1_method(int ex1_no, int ex2_no) {
		this.no1 = ex1_no;
		this.no2 = ex2_no;
		
		if(ex1_no>ex2_no) {
			this.ex_sum = ex1_no + ex2_no;
		}else if(ex1_no < ex2_no) {
			exam2_loop();
		}else {
			System.out.println("�ش� ���� �����ϴ�."); // ���
		}
	}
	public void exam2_loop() {
		int w = this.no1;
		while(w<=this.no2) {
			this.ex_sum += w;
			w++;
		}
	}
	
}
class exam2 extends exam1{
	public int exam2_method() {
		return this.ex_sum;
	}
	
}

