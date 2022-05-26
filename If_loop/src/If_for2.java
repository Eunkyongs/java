
public class If_for2 {

	public static void main(String[] args) {
//		1~100까지 숫자 중 80 이상의 숫자만 출력
		
		int f;
		for(f=1; f<101; f++) {
			if(f>=80) { // 반복문안에 조건문if 사용- 반복문 중에 내가 원하는 부분만 가져오고 싶을때 사용함.
//				System.out.print(f+" ");
			}
			
		}
		
		
//		200~300까지 숫자중 240이하의 숫자만 출력
		
		int ff; // 반복문에 사용
		for(ff=200; ff<301; ff++) { // 200~300까지 반복
			if(ff < 240) { // ff가 240보다 작을 경우 출력
//				System.out.print(ff+" ");
			}
		}
		
//		
		final int a = 5;
		int w;
		for(w=1; w<11; w++) {
			if(w%a==0) {
//				System.out.printf("%d ",w);
			}
		}
		
//		응용문제 : 구구단 중 2단 을 반복합니다. 단 2단 결과값 중 10 이상 숫자만 출력 합니다.
		
		final int gu=2;
		int ww;
		int total;
		for(ww=1;ww<=9;ww++) {
			total =ww *gu; // 2단 반복 실행
			if(total>10) { 
//				System.out.print(total+" ");
				}					
		}

//		응용문제 : 다음 결과값을 보고 해당값이 출력 되도록 코드를 제작 하시오. 
//		결과값:18 36 54 72 
//			(9*2 9*4 9*6 9*8)
		
		
		final int nine=9; //9단 곱해지는 고정값
		int gudan; //반복문 사용
		int total2; // 9단 진행결과 저장
		for(gudan=1; gudan<10; gudan++) { // 반복횟수9번
			total2= gudan*nine; //9단 연산 진행
			if(total2%2==0) { // 결과값이 9*2,4,6,8 짝수만 곱한 값이라 total2의 나머지값이 짝수를 만족하는값 찾기 
//				System.out.print(total2+" "); // 결과 출력
			}
		}	
		
		/*응용문제
		 다음 결과값을 보고 해당값이 출력되도록 코드를 제작하시오.
		 1~20사이의 숫자 입니다.
		 결과값: 6 14 17 19*/
		
		 int c; // 반복문사용
		 for(c=1;c<=20;c++) { //1~20사이
			 if(c==6||c==14||c==17||c==19) { // 결과값에 규칙성이 없으므로 파이프로
				 System.out.print(c+" ");
			 }
			 
		 } 
		
		
		
		
		
		
		
	}

}
