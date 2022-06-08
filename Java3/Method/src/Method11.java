//다른패키지 로드

import App.App1; //다른 package를 로드시 import하여 사용함. (사용:import 패키지명.자바파일명;)
//외부 package에서 App1.java 파일을 로드 및 기본 파일을 로드하여 사용합니다.

public class Method11 {

	public static void main(String[] args) {
		
		App1 b = new App1(); // main 메소드를 로드 하게 됩니다.
//		b.main(args);
		b.abox(); //main 메소드 안에서 abox라는 void메소드를 로드하는 부분
	}

}
