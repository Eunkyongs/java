
public class Over {

	public static void main(String[] args) {
//		pt p = new pt();
//		p.display();
		cd c = new cd();
		c.display("메인 내용 값 출력"); // 오버로딩
		c.display(); // 오버라이드
	}
		

}
/*
 오버로딩(Overloading) : 새로운 메소드를 정의하는 것을 말합니다.
 오버라이드(Override) : 부모 클래스에서 상속 받은 기존 메소드를 사용하는 것을 말합니다. 
 */
class pt {
	public void display() {
		System.out.println("외부 내용 값");
	}
}

class cd extends pt{
	//aaaa() 메소드는 에노테이션을 사용하지 못함. 부모class에서 선언하지 않았음.
	
	/*
	@Override
	public void aaaa() {
		System.out.println("자식에 만들어진 메소드");
	}
	*/
	@Override // 에노테이션(표시) 문제 발생시 확인용 (오버라이드에만 사용). 부모 클래스에 없는 메소드에 사용하면 에러 
	public void display() { // 오버라이드
		System.out.println("자식 클래스 값으로 변경??");
		super.display(); // 부모에있는 고유 속성 메소드값을 가져올때 사용합니다.
	}
	public void display(String msg) { // 오버로딩
		System.out.println(msg);
	}
	
}