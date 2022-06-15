package Ab2;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		members mb = new members();
//		mb.opp();
//		mb.oop();
		
		//(부모)=(자식)=>인터페이스 기준으로 적용된 오버라이드만 호출함(형변환)
//		members mb = new members(); // 자식class전용
//		app_data2 ap = mb;//인터페이스 전용(클래스->인터페이스 기준)
		
		app_data2 ap = new members();
		members mb2 = (members)ap; // 자식class로 인터페이스를 재변환(인터페이스->클래스 변환)		
		
//		ap.opp();
//		ap.opp2();
//		mb.oop(); // 얘는 부모에서 가져온게 아니고 따로 만든메소드라 여기다 호출하면 사용x 직접 호출해야 사용가능함.
	}

}
/*
 class members implements app_data1{
	 //app_data1에 강제로 자료형 선언하는 방식
	 @Override
	public void user_join() {
		 System.out.println("test");
	}
 }
*/
 
 class members implements app_data2 {
	@Override
	public void opp() {
		System.out.println("Test");
	}
	@Override
	public void opp2() {
		System.out.println("test2");
	}
	
	public void oop() { // 직접 호출해야 사용가능
		System.out.println("test3");
	}
	
}