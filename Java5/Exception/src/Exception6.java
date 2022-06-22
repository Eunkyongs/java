//내코드
public class Exception6 {

	public static void main(String[] args) {
		/*
		 응용문제1: 사용자가 45*3+16+5+22*8 의 연산을 함. 
		 해당 연산값의 최종값을 외부 클래스로 전송합니다.
		 해당 외부클래스에서는 해당 값이 짝수일경우 예외오류를 발생하며, 
		 홀수일경우 "홀수값 입니다."로 다시 회신되도록 합니다.
		 짝수일경우 "예외처리 발생으로 재 확인이 필요합니다." 출력
		 */
		//문제1
		int user= 45*3+16+5+22*8; // 332? 
		
		calc ca = new calc();
		ca.dd(user);
		try {
			String result=ca.re();
			System.out.println(result);
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
}
//문제1용 클래스
class calc{
	String msg ="";
	public void dd(int sum) {
		if(sum %2 ==0) {
			this.msg="예외처리 발생으로 재확인이 필요합니다";
		}else {
			this.msg="홀수값 입니다.";
		}
	}
	public String re() throws Exception {
		return this.msg;
	}
}	