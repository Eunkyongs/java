package Ab;
/*abstract와 interface의 차이점 및 공통점*/
public class method_2 {
	//method_2inter and method_2inter2 interface 연결됨
	public static void main(String[] args) {
		loadinter ld = new loadinter();
		ld.setbox("홍길동");
	}
}
//중요 : abstract 와 interface 모두 static은 사용할 수 있음

abstract class test{ //abstract에는 default를 사용하지 않음
	public abstract void box();	
	public void box2(String n) { // abstract는 못씀
		System.out.println("test");
	}
	
}

class loadinter implements method_2re, method_2inter2{ //다중 상속
	
	@Override
	public String names() {
		return null;
	}
	
}
