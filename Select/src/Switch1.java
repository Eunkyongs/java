
public class Switch1 {

	public static void main(String[] args) {
		/*
		 switch~case : 선택문
		 입력된 값 기준으로 case가 발동하여 출력값을 선택하게 됩니다.
		 defalut는 case의 내용 중 같은 내용이 존재하지 않을 경우 작동되는 문법입니다.
		 switch(인자값)
		 switch문 10개이상 사용하게되면 속도가 급격하게 저하됨.
		 결과값이 정해져 있고 결과의 갯수가 많지 않은 경우에 주로 사용(ex.룰렛, 등급분류, 결제시스템) 
		 */
		int n = 3;
		switch(n) { //n=인자값.
		case 1:
			System.out.println("옵션 1을 선택하셨습니다.");
		break;	
		case 2:
			System.out.println("옵션 2을 선택하셨습니다.");
		break;
		case 3:
			System.out.println("옵션 3을 선택하셨습니다.");
		break;
		default : // 케이스에 없는 내용
			System.out.println("선택한 값이 없습니다.");
		break;
		}
		
		String user="이순신"; // 문자로 switch문에 인자값 전달
		switch (user) { // 복합 case형태 입니다.
		case "이순신":
		case "이 순신":
		case "순신": 
		case "leesunsin":
			System.out.println("A조 입니다.");
		break;
		case "홍길동":
			System.out.println("B조 입니다.");
		break;
		case "유관순":
			System.out.println("C조 입니다.");
		break;
		default : //쌍따옴표 안씀. if~else에서 else() 이렇게 안하는것과 동일
			System.out.println("나머지는 D조 입니다.");
		break;	
		}
		
		
	}

}
