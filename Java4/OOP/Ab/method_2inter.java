package Ab;
//interface : 원래 기능은 메소드만 선언, 추가로 연산을 처리하는 형태의 default가 추가됨(java ver.14이후)  
public interface method_2inter {
	//interface는 메소드 이므로 필드에 자료형을 선언 할 수 없음
	public String names(); // String names() return메소드 선언.
	
	default void setbox(String name) { //setter
		System.out.println(name); //산술연산, 단순출력등에 사용. this 사용 힘듬
	}
	default String box3(String n) { // getter 
		//interface에는 default 선언하면 연산 메소드를 사용함
		return null;
	}
}

interface method_2re extends method_2inter{
	//interface에 extends로 부모interface를 로드할 수 있습니다.
}