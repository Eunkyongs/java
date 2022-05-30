import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*응용문제: 사용자가 다음과 같은 질문을 받습니다.
		 Q."1~5"번까지 숫자를 하나 입력해 주시길 바랍니다.
		 결과 내용 1: 5% 할인쿠폰 2: 10% 할인쿠폰 3~4: 택배비 무료 5:다음기회에
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("1~5번까지 숫자를 하나 입력해 주시길 바랍니다.");
		int user = scan.nextInt();
		String msg;
/*
// java버전 14이하에 사용하는 case
		switch (user) {
		case 1:
//			msg="5% 할인쿠폰"; // 실무에서 사용하는방법
			System.out.println("5% 할인쿠폰");
			break;
		case 2:
//			msg = "10% 할인쿠폰";
			System.out.println("10% 할인쿠폰");
			break;
		case 3:
		case 4:
//			msg ="택배비 무료";
			System.out.println("택배비 무료");
			break;
		case 5:
//			msg="다음기회에";
			System.out.println("다음기회에");
			break;
		default:
			System.out.println("잘못된 입력 입니다.");
			break;
		}
		*/
		
		/*switch version 형태->break없이 사용. java 14이상*/
		switch(user) {
		case 1 ->{
			msg="5% 할인쿠폰";
		}
		case 2 ->{
			msg = "10% 할인쿠폰";
						}
		case 3 ,4 ->{
			msg = "택배비 무료";
		}
		default ->{
			msg="다음기회에";
		}
		}
		
		System.out.println(msg);
		
		scan.close();
	}

}
