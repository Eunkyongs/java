import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 응용문제2 사용자가 입력한 숫자에 맞춰서 구구단이 작동되며, 구구단 결과를 계산하여 짝수인지 홀수인지를 출력하시오.
		 * 
		 * "구구단에 대한 숫자를 입력하세요?" 라고 메세지 출력되면 숫자입력. 입력된 해당 숫자에 맞춰서 모든 결과를 더하며, 더한 값에 따라
		 * 짝수인지 홀수인지를 출력하시면 됩니다. 단, 해당 반복문은 for~do while문까지 한가지를 선택해서 작성하시오.
		 * 
		 * 조건문이 반복문 밖에 있어야함.
		 */

		/*Scanner sc = new Scanner(System.in); // 입력엔진 호출

		System.out.println("구구단에 대한 숫자를 입력하세요?");

		int user;// 사용자 입력값 받을 변수.
		user = sc.nextInt(); // 사용자 입력값.
	
		int aa; // 반복문에 사용하는 변수

		int total = 0; // 연산에 사용할 변수
		for (aa = 1; aa <= 9; aa++) { // 반복조건
			total += (user * aa); //사용자가 입력한값에 대한 구구단 연산 진행
		}
		System.out.println(user+"단의 총합: " +total); // 반복문 종료 후 total에 저장된 연산의 최종 합계값 출력

		if (total % 2 == 0) { //최종 합계값의 총 합이 짝수인 경우
			System.out.println("결과값은 짝수 입니다.");

		} else { //최종 합계값의 총 합이 홀수인 경우
			System.out.println("결과값은 홀수 입니다.");
		}
		sc.close();*/
		
//		풀이. do~while문
		Scanner sc = new Scanner(System.in);
		String msg2; // 메세지 구분
		String msg = "구구단에 대한 숫자를 입력하세요?";
		System.out.println(msg);
		int user = sc.nextInt();
		int f=1;
		int total = 0;
		do {
			total=total+(user*f); 
			//total+=user*f;
			f++;
		}while(f<10);
		//System.out.println(total);
		if(total%2==0) {
			msg2="짝수";
		}
		else {
			msg2="홀수";
		}
		System.out.println("결과값은 "+msg2+" 입니다.");
		sc.close();
	}

}
