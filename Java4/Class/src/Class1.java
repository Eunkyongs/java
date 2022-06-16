/*부모클래스 및 자식(내부)클래스 연동*/
public class Class1 {

	public static void main(String[] args) {

		/*부모가 인스턴스에 적용이 되지 않으면 자식 class는 절대 호출하지 못함*/
		// class안에 class호출시에는 부모클래스 먼저 호출 해두고, 자식클래스 호출 해야함
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); 
		// 부모class.자식class 이름생성 = 부모클래스명.new 자식클래스명(); => (인스턴스에 적용)   
		pc.c_box();
		
	}
}

class parents{ //부모 class
	String a = "홍길동"; //부모클래스 필드에 있는 전역변수.(this)
	String b;
	class  child{ //자식class
		int a = 20; //자식클래스 필드. 
		
		public void c_box() { //자식 method
			double c = 10.5; //c_box안에서만 사용가능한 지역변수
			System.out.println(c); //자식메소드전용 지역변수 출력
			System.out.println(this.a); // 자식클래스 전용 전역변수
			System.out.println(parents.this.a); //부모클래스 전용 전역변수 
			System.out.println(parents.this.b); //부모클래스 전용 전역변수 
			// 부모클래스 필드의 객체인 a 사용시 부모클래스명.this 사용해야함. 그냥 this사용시 자식클래스 필드에 있는 a가 사용됨.
		}
		
	}
	
	public void p_box() { //부모 method
			
//		class p_aaa{ // 메소드안에도 클래스 들어갈 수 있음. 자주 사용하진 않음.
//		}
		String a ="이순신"; // p_box 메소드 안 에서만 사용 가능한 지역변수 선언
//		System.out.println(a); // this는 전역변수를 지칭. this.a하게되면 부모클래스 필드의 홍길동 출력됨. 이순신을 출력하고싶으면 그냥 a 입력.
		this.b = a; // 부모클래스 전역변수인 b 에 지역변수 a 대입
	}
}