
public class Dowhile_plus {

	public static void main(String[] args) {
		/* do~while: 30~35까지 합계를 출력하시오. */

		int a = 30;
		int t = 0;
		do {
			t += a;
			a++;
		} while (a < 36);
		System.out.println("합계:"+t);

		/* 응용문제 합계 숫자 189가 있습니다. 단 1~10까지 합계치와 현재 189를 뺀 총 합계를 구하시오. 결과값 134 */

		int aa = 1;
		int total = 189;
		do {
			total -= aa; // 189에서 1~10까지 더한 값을 더하는거니 처음 189에서 1~10을 빼는식으로 진행
			aa++; // 조건 1씩 증가
		} while (aa < 11);
		System.out.println("결과값:"+total);

	}

}
