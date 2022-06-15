package Ab2;
import Ab.method_1; // package Ab에서 main class를 로드함


public class ab2_method  extends Ab.method_1{

	public static void main(String[] args) {
//		@Override =>main static void 오버라이드 해왔을 경우에는 주석으로 표시해놈
		Ab.method_1 at = new Ab.method_1(); // 패키지가 다른 상태에서 클래스 or 메소드 로드하고싶을때 public 사용해야 로드가능함
		
		at.main(args); // main 메소드 실행
		at.recall(); // public 메소드 실행
		at.name(); // protected메소드 실행
		
	}

}
