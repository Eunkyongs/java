
public class test6_1 {

	public static void main(String[] args) {
	
		String []n= {"ȫ�浿","�̼���"};
		
		loginn lg = new loginn();
		lg.lo(n);
	}

}
abstract class login{
	String msg1 = "�� ȯ���մϴ�.";
	String msg2 = "�� �ֹ��Ͻ� ������ �����ϴ�.";
	public abstract void lo(String[] a);
}

class loginn extends login{
	String name[];
	@Override
	public void lo(String[] a) {
		this.name =a;
		System.out.println(this.name[0]+this.msg1);
		System.out.println(this.name[1]+this.msg2);
	}
	
}