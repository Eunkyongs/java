import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * 응용문제3: 사용자가 해당값을 입력합니다. 단, 사용자가 두개의 숫자를 입력하되 첫번째 숫자와 두번째 숫자범위 안에 있는 모든 숫자를
		 * 더해서 결과값이 나오도록 제작하시오. 단, 해당코드는 do~while문으로 작성합니다.
		 * 
		 * 예시) 첫번째 범위 숫자는? 5 두번째 범위 숫자는? 10 범위 숫자 모든 합계는 :45 입니다.
		 */

	/*	Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int user1; // 사용자 입력값 받을 변수
		int user2;
		int total = 0; // 사용자 입력값의 합 받을 변수
		

		System.out.println("첫번째 범위 숫자는?");
		user1 = scan1.nextInt();
		System.out.println("두번째 범위 숫자는?");
		user2 = scan1.nextInt();

		do {
			total += user1 ;
			user1++;
		} while (user1<= user2);

		System.out.println("입력한 범위 숫자의 모든 합계는: " + total + "입니다.");

		scan1.close();
		scan2.close();*/
		
//		풀이 
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 범위 숫자는?");
		int a = sc.nextInt(); // 변수 2개로 스캐너엔진 1개 사용가능
		System.out.println("두번째 범위 숫자는?");
		int b = sc.nextInt();
		int total = 0;
		do {
			total += a;
			a++;
		}while(a<=b);
		System.out.printf("입력한 범위 숫자의 모든 합계는: %d" , total );
		sc.close();
	}

}
