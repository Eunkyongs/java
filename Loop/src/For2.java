
public class For2 {

	public static void main(String[] args) {

//		연산for문
		int a; // for문 초기값
		int b = 2; // 연산에 사용할 변수
		int c; // 연산 결과값 사용
		for (a = 1; a < 10; a++) {
			c = b * a; // a값이 1~9까지 증가하는동안 연산 반복 //산술연산 작업
		System.out.print(c+",");	//연산된 결과값 출력
		}
		/*
		 * 응용문제: 다음 결과값을 보고 코드를 작성하시오 45,40,35,30,25,20,
		 * (먼저 결과값의 패턴을파악>그 후에 조건 작성) 
		 */
		int aa; // for문에 사용할 초기값
		int bb = 5; // 연산에 사용할 변수
		int cc; // 연산 결과값 받을 변수
		for (aa = 9; aa >= 4; aa--) {
			cc = aa * bb;
			System.out.print(cc + ",");
		}

		/*응용문제 : 다음 결과값을 확인 후 코드를 제작하여 출력하시오. 
		 	11,22,33,44,55,66,77,88,99,	*/
//		int j; //for문에 사용할 초기값
//		int k=11; //연산에 사용
//		int l; // 연산 결과값
		
//		for(j=1; j<10; j++) {
//			l=j*k;
//			System.out.print(l+",");
			
			//선생님 코드
		int z; //for
		int x; //결과
		for(z=1;z<10;z++) {
			x=(10*z)+z;
			System.out.print(x+",");
		}
		}		
	}

