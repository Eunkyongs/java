
public class Method5 {

	public static void main(String[] args) {
		cdb c=new cdb();
		/*
		c.d1="홍길동";
		c.data2();
		c.d3="이순신";
		c.data1();
		c.d1="유관순";
		System.out.println(c.data3());
		*/
		
//		c.d2="강감찬"; /*private으로 선언한 객체 이므로 main class에서 로드 못함*/
		c.data2("강감찬");
		String result = c.data3();
		System.out.println(result);
		c.d1="유관순";
		cdb.data1();
	}

}
class cdb{
	String d1=null; //void, 자료형 메소드 로드가능
	private String d2=null; // private은 메인클래스에서 로드 절대 불가!
	public static String d3; //모든 메소드 사용가능
	public static void data1() { // 필드에 있는 데이터는 static 자료형 외에는 로드가 불가능함. 
//		System.out.println(d3);
//		System.out.println(this.d2); //※static 메소드에서는 this 사용 못함※
		String d1="홍길동"; //자료형을 선언해야 에러안남
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