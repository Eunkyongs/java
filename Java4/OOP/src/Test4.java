public class Test4 {

	public static void main(String[] args) {
//		loadbox b = new loadbox();
//		b.name();
//		b.name2();
		
		/*응용문제 외부 class를 이용하여 해당 메소드 값을 출력합니다.
		 외부 class명 books이며, 안에 메소드는 총 3개의 메소드가 존재 합니다.
		 메소드명은 각각 book1, book2, book3으로 이루어져 있습니다.
		 book1 호출시 "book1메소드"라고 출력
		 book2 호출시 "book2메소드"라고 출력
		 book3 호출시 "book3메소드"라고 출력
		 */
		
		books bk =new books();
		bk.book1(35);
		bk.book2("바둑이");
		bk.book3("홍길동",40);
//		System.out.println(bk.book4());
		/*return메소드에 숫자 9와 20을 인수값으로 전달합니다.
		 해당 두개의 값을 곱하여 결과값을 출력하시오.*/
		
		int result = bk.book4(9,20); //books클래스의 book4메소드로 9,20이라는 인수값 보낸 후 리턴 받음 
		System.out.println(result);
		/*book5번에 숫자를 하나 인수값으로 전달합니다.
		 하나의 인수값을 받은 book5에서는 무조건 100,200을 더한 값과 인수값을 곱하여 결과값을 출력하시오
		 인수값:4
		 (100+200)*4
		 결과:1200
		 */
		int re = bk.book5(4);
		System.out.println(re);
	}

}
class books{
	String zz ="정답";
	public int a1,a2;

	public void book1(int z) {
//		System.out.println(z+this.zz);
	}
	public void book2(String y) {
//		System.out.println(y+this.zz);
	}
	public void book3(String x, int x1 ) {
//		System.out.println(x+","+x1+this.zz);
	}
	public int book4(int k, int j) {
//		String ka="홍길동"; // int 메소드 안에는 string 아예 사용을 못함.반대경우도 동일. 선언해도 반환을 못해 에러남
		int dd = k*j; // 인수값받은것 계산된 값을 변수에 태워서 return보내야함
		return dd ; // 값을 반환만 가능! sysout 출력 불가
	}

	public int book5(int a1) {
		int gg = (100+200)*a1;
		return gg;
	}
	
}




class loadbox{//class는 무조건 method가 있어야 합니다.
	
	public void name() {
		System.out.println("test");
		
	}
	
	public void name2() {
		int a =123;
		System.out.println(a);
	}
	
}
