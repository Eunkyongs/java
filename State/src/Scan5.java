import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		byte a = 10;
		if (a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요");
		} else if (a >= 10 || a <= 22) { // 조건문에 범위를 설정하여 적용함
			System.out.println("당첨 입니다.");
		} else {
			System.out.println("범위 밖의 숫자 입니다.");
		}
		
		/*
		 * 응용문제 Q.1~45까지 숫자 하나를 입력하세요?
		 * error문구 
		 * 0을 입력: 숫자입력이 잘못 되었습니다. 
		 * 45보다 큰 숫자 입력: 숫자는 1~45까지만 입력가능합니다.
		 * 
		 * 1~45 숫자를 입력 하였을 경우
		 * 7,12,14 세가지 숫자 입력시 당첨입니다 라고 출력
		 * 그 외의 숫자 입력 시	다음기회에 참여하세요 라고 출력
		 */

		
		//내코드
		
		Scanner num = new Scanner(System.in);
		System.out.println("Q.1~45까지 숫자 하나를 입력하세요?");

		byte in = num.nextByte();

		
		if (in <= 0) {
			System.out.println("숫자입력이 잘못 되었습니다.");
		} else if (in > 45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		} else {
			System.out.printf("%d을(를) 입력하셨습니다.", in);
		}
		
		
		if (in <= 0) {
			System.out.println("숫자입력이 잘못 되었습니다.");
		} else if (in > 45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}		
		else {
			if(in==7 || in ==12 || in ==14){
				System.out.println("당첨입니다.");		}
			else {
			System.out.println("다음기회에 참여하세요.");	
			}
			}
		
		
		/*응용문제 선생님 코드
		
		Scanner qa = new Scanner(System.in);
		int n = qa.nextInt();
		System.out.println("Q. 1~45까지 숫자 하나를 입력하세요?");
		if(n==0) {
			System.out.println("숫자입력이 잘못 되었습니다.");
		}
		else if (n>45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}
		else {
			if(n==7 || n==12 ||n==14) {
				System.out.println("당첨 입니다.");
			}
			else if (n== 41) {
				System.out.println("50%쿠폰 당첨 입니다.");
			}
			else {
				System.out.println("다음 기회에...");
			}
			
		}*/
		
		
		num.close();
		
		}
}


