
public class test6_1 {

	public static void main(String[] args) {
	
		String []n= {"홍길동","이순신"};
		
		loginn lg = new loginn();
		lg.lo(n);
	}

}
abstract class login{
	String msg1 = "님 환영합니다.";
	String msg2 = "님 주문하신 내역이 없습니다.";
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