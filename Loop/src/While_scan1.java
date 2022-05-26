import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/*응용문제 : 총 2번의 질문을 하게 됩니다. 사용자가 숫자를 입력하여 두 수의 합을 구하는 scanner를 제작하시오. */

		Scanner sc = new Scanner(System.in); // 입력엔진

		int userin; // 사용자입력변수
		int f=1; // 반복문에사용
		int total = 0; // 사용자입력값 합 저장
		while (f<3) { // 반복조건 2번
//			System.out.println("더할 숫자를 입력하세요.");
			System.out.println(f+"번째 숫자를 입력하세요.");
			userin = sc.nextInt(); // 사용자 입력

			total += userin; // 사용자입력값 합계연산
			f++;
		}
		System.out.println("합계:" + total); // 사용자가 입력한 값 합계 출력
		sc.close(); // 입력엔진 종료

		
		
	}

}
