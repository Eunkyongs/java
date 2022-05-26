
public class If_dowhile1 {

	public static void main(String[] args) {
		
		/*
		 응용문제 :  구구단 6단 중에서 35이상 결과 숫자만 출력하시오.
		 */
		
		final int six = 6; //6단 연산실행용
		int d=1; //초기값
		int e;
		do {	
			e=six*d;
			if(e>=35) {
//				System.out.print(e+" ");
			}
			d++;
		}while(d<10);
	
		
		/*응용문제 : 14~27까지 숫자 중 짝수값만 모두 더하여 최종 결과값을 출력하시오 결과값:140*/
		
		int num=14; //반복문 시작값
		int tot=0; // 연산결과값 저장
		do {
			if(num%2==0) {//반복문 진행시 값이 짝수일 경우
				tot+=num; //짝수인값 더해라
			}			
			num++; // 1씩 증가
		}while(num<28); //27까지 반복하겠다.
		System.out.print("결과값:"+tot); // 반복문 종료 후 tot에 저장된 짝수값의 합계 출력
		
		
	}

}
