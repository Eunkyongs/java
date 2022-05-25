import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		// Scanner와 함께 do~while 문으로 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램을 제작하시오.

		Scanner scan = new Scanner(System.in); //입력엔진호출
		System.out.println("원하시는 구구단 숫자를 입력하세요."); //사용자가 입력해야하는정보
		int num = scan.nextInt(); //사용자입력값

		scan.close(); // 입력엔진 종료

		int d = 1; //do~while문 초기값변수
		int res; //연산결과값
		do {
			res = d * num; //연산
			System.out.printf("%d ", res); //결과출력
			d++; // 증가
		} while (d < 10); //반복조건

	}

}
