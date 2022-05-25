
public class If3 {

	public static void main(String[] args) {

		// boolean 자료형은 true or false 로 구분하게 됩니다. 쌍따옴표 사용x
		boolean ck = true;
		if (ck == true) {
			System.out.println("회원가입이 진행 됩니다.");
		} else {
			System.out.println("이용약관에 동의하셔야만 진행 됩니다.");
		}

		String id, pw;

		id = "park";
		pw = "a1234";

		// && : 한가지 조건 이상 모두 맞을 경우 and, 그리고
		// || : 한가지 조건 이상에서 한개라도 맞을 경우 or
		if (id == "park" && pw == "a1234") { // &&기호 앞 뒤의 조건이 모두 참이어야 if문 동작함
			System.out.println("로그인 하셨습니다.");
		} else {
			System.out.println("아이디 및 패스워드를 확인하세요.");
		}
		if (id == "park" || id == "kim") {
			//if (id == "park" || pw == "a1234") {
		   // 두 조건중에 한가지라도 맞을 경우 작동. 버그
			System.out.println("회원이 확인 되었습니다.");
		} else {
			System.out.println("확인된 아이디가 없습니다.");
		}
	}

}
