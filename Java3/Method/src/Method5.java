
public class Method5 {

	public static void main(String[] args) {
		cdb c=new cdb();
		/*
		c.d1="ȫ�浿";
		c.data2();
		c.d3="�̼���";
		c.data1();
		c.d1="������";
		System.out.println(c.data3());
		*/
		
//		c.d2="������"; /*private���� ������ ��ü �̹Ƿ� main class���� �ε� ����*/
		c.data2("������");
		String result = c.data3();
		System.out.println(result);
		c.d1="������";
		cdb.data1();
	}

}
class cdb{
	String d1=null; //void, �ڷ��� �޼ҵ� �ε尡��
	private String d2=null; // private�� ����Ŭ�������� �ε� ���� �Ұ�!
	public static String d3; //��� �޼ҵ� ��밡��
	public static void data1() { // �ʵ忡 �ִ� �����ʹ� static �ڷ��� �ܿ��� �ε尡 �Ұ�����. 
//		System.out.println(d3);
//		System.out.println(this.d2); //��static �޼ҵ忡���� this ��� ���ԡ�
		String d1="ȫ�浿"; //�ڷ����� �����ؾ� �����ȳ�
		System.out.println(d1);
	}
	public void data2(String user) {
		this.d2 = user;
//		System.out.println(d2);

	}
	public String data3() {
//		String a="";
		String a=this.d2;
		return a;
	}
	 
	
}