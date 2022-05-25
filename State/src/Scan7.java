import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/*
		 * [인증번호 발송에 대한 번호 비교 코드] 
		 * Q.인증받은 번호를 입력하세요? 
		 * 숫자 220524 
		 * 사용자가 숫자 220524 외에 입력 시 "인증번호가 틀립니다." 라고 출력하시고 
		 * 동일한 인증번호 숫자를 입력 시 "인증 확인 되셨습니다."라고 출력합니다. 
		 * 단, 220524는 java실행시 가장 먼저 실행되는 변수로 처리하세요.
		 */

		int sc = 220524; //발송된 인증번호

		Scanner in = new Scanner(System.in); //새롭게 스캐너를 구동해 시스템에서 입력값을 받아 in에 대입
		System.out.println("Q.인증받은 번호를 입력하세요?");
		int num = in.nextInt(); //사용자 인증번호 입력값

		//사용자 통해 입력된 인증번호 확인 단계
		if (num == sc) { //입력된 인증번호가 맞는경우
			System.out.println("인증 확인 되셨습니다.");
		} else { //입력된 인증번호가 틀린경우
			System.out.println("인증번호가 틀립니다.");
		}
		
		
		Scanner a = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요.");
		
		int a1 = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("두번째 숫자값을 입력하세요.");
		
		int b1 = b.nextInt();
		
		if(a1*b1<=100) {
			System.out.println("100이하의 결과값입니다.");
				}
		else if(a1*b1>=100) {
			System.out.println("100이상의 결과값 입니다.");
		}
		
		in.close(); // 스캐너 종료
		a.close();
		b.close();
	}

}
