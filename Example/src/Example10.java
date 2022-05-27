import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 * 응용문제10: 다음 이용약관에 대한 동의 프로그램을 제작하게 됩니다. 동의 항목은 전체 3가지이며, 모두 true가 적용되어야만
		 * 다음프로세서로 진행이 됩니다. 사용자에게 질문 되는 사항은 다음과 같습니다. "동의항목에 동의하시겠습니까?" 라는 메세지 출력
		 * 동의함(1), 동의안함(2)
		 * 
		 * 동의항목중 한가지라도 동의하지 않을 경우 "모두 동의 하셔야만 진행됩니다."라고 출력 합니다. 모두 동의 하였을 경우 "회원가입이
		 * 완료되었습니다. 라고 출력합니다.
		 */

		Scanner scan = new Scanner(System.in);

		int user;
		int f = 1;
		boolean ag=false;
		
		while (f < 4) {
			System.out.println("동의항목에 동의하시겠습니까? 동의함(1), 동의안함(2)");
			user = scan.nextInt();
			if (user == 1 ) {
				ag=true;
			} else {
			ag=false;
			break;
			}
			f++;
		}
		
		if(ag==false) {
			System.out.println("모두 동의하셔야만 진행됩니다.");
		}else {
			System.out.println("회원 가입이 완료 되었습니다.");
		}
		scan.close();
		
		
//		선생님 코드
	/*
		Scanner sc= new Scanner(System.in); //입력엔진
		int w=1; // 반복문사용
		int agree; // 사용자 입력값
		boolean all_agree = false;//동의여부 확인
		do { 
			System.out.println("동의항목에 동의하시겠습니까? 동의함(1), 동의안함(2)");
			agree = sc.nextInt();
			
			if(agree==1) { //동의값 1 입력시
				all_agree = true;
				
			}else { //동의값 2 입력시
				all_agree = false;
				break; // 동의안하면 반복문 강제종료
			}
			
			w++;
		}while(w<=3);

		if(all_agree==false) {
			System.out.println("모두 동의하셔야만 진행됩니다.");
			}else {
				System.out.println("회원 가입이 완료 되었습니다.");
			}
			sc.close();
			*/
	}

}
