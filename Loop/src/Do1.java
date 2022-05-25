
public class Do1 {

	public static void main(String[] args) {

		int a = 1; // 초기값
		do {
//			System.out.print(a+" ");
			a++; // 증가,감소
		} while (a < 11); // 범위값,종료값

		/*
		 * 응용문제 5~0까지 출력되는 do~while문을 작성 하시오
		 */

		int b = 5;
		do {
		
//			System.out.printf("%d ", b);
			b--;
		} while (b>=0);
		
		
		//변수 2개의 값 받아서 진행하는 do~while 반복문
		int c = 50;//기초값
		int d = 60;//종료값
		do {
			System.out.print(c+" ");
			c++;
		}while(c<=d);
	
	}
}

