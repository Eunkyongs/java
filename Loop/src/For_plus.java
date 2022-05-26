
public class For_plus {

	public static void main(String[] args) {
		/* 1~10까지 모든 숫자를 합한 결과값을 출력하시오 */

		int f;
		int total = 0;
		for (f = 1; f < 11; f++) { // total 변수값에 반복값을 지속적으로 증가시킴
			total=total+f; // 0+1로 시작. 반복문 조건에 맞춰 동작하면서 f값은 1씩 증가.
//			total += f; // += 기호이용해 total=total+f; 짧게입력
		}
//		System.out.println("총 합계:" + total);
//		+=(더하기 할당) -=(빼기 할당) *=(곱하기 할당) /=(나누기 할당)
		// b =b-f; -> b-=f

		/*
		 * 응용문제 전체값은 500이 있습니다. 총 8회 동안 반복되면서 한번 반복할 때 마다 12씩 감소하도록 하여 최종값을 출력하시오
		 * 결과값:404
		 */

		int ff;
		int tot = 500;
		for (ff = 1; ff < 9; ff++) {

			tot = tot - 12;

		}
		System.out.println("최종값:" + tot);

		/* 선생님 코드
		int alls = 500;
		int m = 12;
		int w;
		for (w = 1; w < 9; w++) {
			alls -= m;
		}
		System.out.println(alls);*/

		/*응용문제
		 구구단 2단 2*1~2*9까지 의 총 합계를 출력하시오 
		 정답 합계:90
		 */
		
	}

}
