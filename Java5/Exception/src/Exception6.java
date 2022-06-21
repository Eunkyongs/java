
public class Exception6 {

	public static void main(String[] args) {
		/*
		 응용문제. 사용자가 45*3+16+5+22*8 의 연산을 함. 
		 해당 연산값의 최종값을 외부 클래스로 전송합니다.
		 해당 외부클래스에서는 해당 값이 짝수일경우 예외오류를 발생하며, 
		 홀수일경우 "홀수값 입니다."로 다시 회신되도록 합니다.
		 짝수일경우 "예외처리 발생으로 재 확인이 필요합니다." 출력
		 */
		
		/*
		 응용문제: 데이터파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88}
		 해당 데이터 값중 문자값만 출력되도록 재배열 하시길 바랍니다.
		 단, 메인에서는 해당 배열을 외부클래스 (setter)로 전송합니다.
		 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성 합니다.
		 getter에서 해당 배열을 return으로 보내도록 합니다.
		 단, 외부클래스에서 숫자만 있는 배열은 모두 예외처리되도록 합니다.
		 */
		
		int user= 45*3+16+5+22*8; // 332? 
		String a = 
		calc ca = new calc();
		try {
			String result=ca.re();
			System.out.println(result);
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
class calc{
	
	public String re() throws Exception {
		
		
		
		
		
		
		
		return null;
	}
}