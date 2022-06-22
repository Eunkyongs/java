//선생님 풀이
public class Exception6_1 {

	public static void main(String[] args) {
		/*
		 응용문제. 사용자가 45*3+16+5+22*8 의 연산을 함. 
		 해당 연산값의 최종값을 외부 클래스로 전송합니다.
		 해당 외부클래스에서는 해당 값이 짝수일경우 예외오류를 발생하며, 
		 홀수일경우 "홀수값 입니다."로 다시 회신되도록 합니다.
		 짝수일경우 "예외처리 발생으로 재 확인이 필요합니다." 출력
		 */
		
		try {
			int sum = 45*3+16+5+22*8;
			cul cl = new cul();
			String result = cl.cul_method(sum); // getter형태 메소드를 변수로 받을때는 해당 메소드의 자료형으로 받아야 함
			System.out.println(result);
		}catch(Exception a) {
			if(a.getMessage() != null) {
			System.out.println(a.getMessage());
			}
		}
	}

}
class cul {
	//자료형 메소드에서 return값 숫자,문자,Object에 따라서 자료형이 선언되어 생성
	public String cul_method(int s) throws Exception { // 인수값 받는것은 String 메소드에서도 int는 받을수있음. 
		if(s%2 ==0) {
			Exception ec = new Exception();
			throw ec;
//			throw new Exception("예외처리 발생으로 재확인이 필요합니다."); // 위에 두줄을 이렇게 한줄로도 사용할 수 있음.
		}
		else {
			String msg= "홀수값 입니다.";
			return msg;
		}
	}
	
}