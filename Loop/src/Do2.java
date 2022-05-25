
public class Do2 {

	public static void main(String[] args) {

		// 9*1~9*9 까지 출력되는 코드 작성

		int a = 1; // 반복문기초값
		int b = 9; // 산술고정값

		do {
			//여기다 산술계산값 받는 변수 선언해도 되나, 메모리사용량이 높아질수있음.
			System.out.print(a * b + " ");
			a++;
		} while (a < 10);

		/*응용문제
		 다음 결과값을 보고 do~while문으로 코드를 작성하시오.
		 35 45 55 65 75 ->10씩 증가 
		 
		 5*7  5*9 5*11 5*13 5*15 -> 2씩 증가 5는고정
				 */
		/*		
		int c=5;
		int d=2;
		int e;
		
		do {
			e=(c+d)*5;
			System.out.print(e+" ");
			c++;
		}while(c<=15);
		*/
		
		//선생님코드
		int k = 3;
		int j;
		do {
		j= (k *10)+5;
	System.out.printf("%d ",j);
	
	k++;
	}while(k<8);
	
	}
}
