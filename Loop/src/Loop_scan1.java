import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		// for문+Scanner 이용한 구구단출력

		Scanner aa = new Scanner(System.in);//입력엔진로드
		System.out.println("원하시는 구구단숫자를 입력하세요."); //입력해야할 내용 가이드
		int bb = aa.nextInt(); // 사용자 입력
		aa.close();//스캐너 종료
		int f; // 반복문 사용 변수
		int zz; // 반복문 산술연산 결과값
		for (f = 1; f <= 9; f++) {//반복조건
			zz = bb * f;//산술연산
			System.out.printf("%d ", zz); // 출력

		}

		


	}

}
