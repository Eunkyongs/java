package Ab;

import java.util.Arrays;

//method_1a.java
public class method_1 extends ide_mth1 { // package Ab2���� import�Ҽ� �ֵ��� �ϸ�, �ܺ� Ŭ������ �����ϰ� ��� �������� ��.
	
	public void recall() { // ��Ű���� �ٸ� ���¿��� Ŭ���� or�޼ҵ� �ε��ϰ������ public����ؾ��� // Ab2��Ű���� �������� �޼ҵ�
		System.out.println("Test");
	}

	protected static void name() { // protected static�� �����ؾ߸� Ab2��Ű���� ��������
		System.out.println("testtt");
	}
	
	public static void main(String[] args) {
		/*Arrays.sort:�迭 �������� ����(����,�ѱ�,���� ��� ���İ���)
		  ��, �����ϰ�� �빮�ڰ� ���� ���� ������������ ���ĵ˴ϴ�.
		  ����, �����빮��, �����ҹ���, �ѱ� ������ ���ĵ�
		 */
		
//		int number_data[]= {5,7,1,4,9,2};
//		Arrays.sort(number_data); //sort : �迭 �������� ����, Collection.reverse(); -�迭�������� ���? ���߿� ���
//		System.out.println(Arrays.toString(number_data));
		
//		String user_data[]= {"ȫ�浿","�̼���","�庸��","������"};
//		Arrays.sort(user_data);
//		System.out.println(Arrays.toString(user_data));

		/*
		 ������ 2�� ���� �ϳ��� ����, �ϳ��� ����
		 ���� ���Ե� ������� ���̵� Ȯ�� �� �ش� ����Ʈ�� �����ǵ��� �մϴ�.
		 ��, ��������Ʈ+����������Ʈ �� ���� ����� ����ϼž� �մϴ�.
		 ����� ���� class���� �����

//		 �迭������:
		 String member_ship[][]={
		 {"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
		 {"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		 };
		 */
		String a = "park";
		int b = 2000;
		String c = "����";
		
		
		ide_mth1 im = new ide_mth1();
		im.setter(a,b);
		System.out.println(im.getter());
	}
}

class ide_mth1 extends mth1{
	
	private String member_ship[][];
	private String data1;
	private int data2;
	private String data3;
	private int ea;
	private int total=0;
	private String msg;
	
	public ide_mth1() {
		this.member_ship = new String[][] {
			{"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		};
		this.ea = this.member_ship[0].length;
	}
	 
	 @Override
	public void setter(String data1, int data2) { //�ش� �޼ҵ� ����
		 this.data1 = data1;
		 this.data2 = data2;
		
		 this.loops(this.data1, this.data2, this.ea);
	};
	//static : this�����ϰ� ������ ���ư��� ���
	public void loops(String a, int b, int c) {
		int w = 0;
			while(w<c) {
			if(this.member_ship[0][w].equals(a)) {
				this.total =Integer.parseInt(this.member_ship[1][w])+data2;
			}
			w++;
		}
			this.msg = "����";
	}

	@Override
	public void setter(int data3[]) { };
	
	@Override
	public String getter() {
		String print = this.data1 +"�� ����Ʈ��"+" "+this.total+" "+this.msg+"�Ǿ����ϴ�.";
		return print;
	};
}