import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
//		1~100까지 모두 더하는 반복문을 for문으로 작성하시오.
		
/*		int a;//반복문사용
		int t=0;//합계값 저장
		for(a=1; a<=100; a++) { // 조건
			t+=a; //1~100까지 더하기
		}
		System.out.println(t);//1~100까지 모두 더한 합계값 출력*/
		
//		1~100까지 모두 곱한 결과값
		
		int f; //반복문에 사용할 변수
//		BigInteger : java에서 모든 무한의 값을 저장 할 수 있는 유일한 자료형.가장 큰값 = 무한대 의미
		BigInteger aa= new BigInteger("1"); // 합계에 사용할 자료형 변수 1 을 최초값으로 설정. 단, ""를 무조건 적용해야 합니다. 
		for(f=1; f<=100; f++) {
			aa = aa.multiply(BigInteger.valueOf(f));
			/*
			 multiply : 사칙연산 중 곱하기를 담당함
			 add: 사칙연산 중 더하기를 담당함
			 subtract: 사칙연산 중 빼기를 담당함
			 divide: 사칙연산 중 나누기를 담당함
			 */ 
		}
		System.out.println(aa);
	
	}

}
