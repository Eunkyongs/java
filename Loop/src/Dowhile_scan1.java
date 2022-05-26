import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/* 응용문제:사용자가 총 3번의 숫자를 입력합니다. 3개의 숫자를 모두 곱하여 총 합계수를 출력하시오. */

		Scanner sc = new Scanner(System.in); // 입력엔진호출
		int user; // 사용자 입력변수
		int d = 1; // 반복문에 사용
		long total = 1; // 입력한 숫자의 합 저장. long을 입력시 최종 결과에서 -음수 발생함
		do {
			System.out.println(d + "번째 숫자를 입력하세요.");
			user = sc.nextInt(); // 사용자 입력
			total *= user; // 사용자가 입력한 숫자를 모두 곱하는 연산 수행
			d++;
		} while (d < 4); // 3번 반복
		System.out.println("합계:" + total); // 사용자가 입력한 숫자를 모두 곱한 합계 출력
		sc.close();// 입력엔진 종료

	}

}
