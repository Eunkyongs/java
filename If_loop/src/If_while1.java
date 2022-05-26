
public class If_while1 {

	public static void main(String[] args) {
		/*응용문제 : while문으로 10~30숫자중에서 홀수값만 출력하시오
		 20이상의 홀수값만 
		 */
		
		int a=10; // 반복문 시작값
		while(a<=30) { // 10~30까지 반복할거다 조건제시
			if(a%2==1) { // a값이 홀수인경우
				if (a>20){
//					System.out.print(a+" "); // 출력
				}
			}
			a++; // a값 증가
		}		
//		카운터 값으로 갯수 파악하기
		
//		1~10까지 숫자중에 짝수값이 몇개 있는지 갯수를 출력하세요
		
		int ww=1;
		int count=0; //카운터 변수값 0
		while(ww<=10) {
			if(ww%2==0) {//짝수일 경우
				count++; // 해당 조건이 맞을 경우 +1씩 증가함
			}
			ww++;
		}
		//반복문 종료시 최종 카운터 값을 출력하게 됩니다.
		System.out.println("1~10 까지 숫자 중 짝수 갯수는: "+count);
		
		
		
		
	}

}
