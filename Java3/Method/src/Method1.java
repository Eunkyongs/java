
public class Method1 {

	public static void main(String[] args) {
		
		tests t = new tests();
		t.a1++;
		t.a2++;
		t.name1();
		
		
		tests tt = new tests();
		tt.a1++;
		tt.a2++;
		tt.name1();
		
		t.b1 += "유관순";
		t.b2 += "유관순";
		t.name2();
		tt.b1 += "강감찬";
		tt.b2 += "강감찬";
		tt.name2();
		
	}

}

class tests{
	int a1 =1; //새로운 객체 생성 및 Class를 호출시 1이라는 숫자를 다시 가지게 됩니다.(동적변수)
	public static int a2=1; // 변수값을 메모리에 저장해놓음. 강제초기화 하지않는이상 증가된 값 유지.
	//새로운 객체 생성 및 Class를 호출 하더라도 1이라는 숫자가 아닌 메모리에 등록된 최종값을 지속적으로 가지게 됩니다.(정적변수)
	
	String b1 = "이순신";
	public static String b2="홍길동"; // 변수값을 활용할 경우 static 사용해서 메모리에 저장
	
	public void name1() {
//		System.out.println(a1);
//		System.out.println(a2);
		
	}
	
	public void name2() {
		System.out.println(b1);
		System.out.println(b2);

	}
}