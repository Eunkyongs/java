import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/* 응용문제7: 사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 도출하는 프로세서를 제작합니다.
		 * "첫번째 입력값 단, 1~10까지 입니다.:" "두번째 입력값 단, 1~10까지 입니다.:" "세번째 입력값 단, 1~10까지 입니다.:"
		 * "마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오.:" +,-,*,/
		 * 해당 산술 기호에 맞게 산술식을 적용하여 최종값을 출력시키시오. */
		
/*		Scanner scan = new Scanner(System.in); // 입력엔진호출
		String msg = "번째 입력값 단, 1~10까지 입니다.: "; // 질문출력에 사용할 문자열

		int user, user2, user3;
		String user4; // 입력값 받을 변수
		double total = 0;

		// 질문출력
		System.out.println("1" + msg);
		user = scan.nextInt();
		System.out.println("2" + msg);
		user2 = scan.nextInt();
		System.out.println("3" + msg);
		user3 = scan.nextInt();
		System.out.println("마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오.: (+,-,*,/)");
		user4 = scan.next();

		//입력한 산술기호에 따른 연산
		if (user4.equals("+")) {
			total = user + user2 + user3;
		} else if (user4.equals("-")) {
			total = user - user2 - user3;
		} else if (user4.equals("*")) {
			total = user * user2 * user3;  
		} else if (user4.equals("/")) {
			total = user / user2 / user3;
		} else {
			System.out.println("잘못된 값을 입력하셨습니다. + , - , * , / 중에 하나를 입력하세요.");
		}
		
		//결과값 출력
		System.out.printf("결과: %d",total);
		
		scan.close(); //입력엔진 종료
*/		
		
		//선생님 코드
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 입력값 단(1~10까지)입니다.");
		int no1 = sc.nextInt();
		System.out.println("두번째 입력값 단(1~10까지)입니다.");
		int no2 = sc.nextInt();
		System.out.println("세번째 입력값 단(1~10까지)입니다.");
		int no3 = sc.nextInt();
		System.out.println("해당 세가지 값에 대한 산술기호를 적으시오: ");
		String ms = sc.next();
		
		if(ms.equals("+")) {
			System.out.println(no1+no2+no3);
		}else if(ms.equals("-")) {
			System.out.println(no1-no2-no3);
		}else if(ms.equals("*")) {
			System.out.println(no1*no2*no3);			
		}else {
			System.out.println(no1/no2/no3);
		}
	sc.close();
	}

}
