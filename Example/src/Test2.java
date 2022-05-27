import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 응용문제. 조건문 코드를 작성 하시오. 고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다. 고객의 기본 자산금액 :
		 * 100,000 "1번 입력시 입금, 2번 입력시 출금 입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다. 1번을 입력시
		 * "해당 금액을 입력하세요" 사용자가 입력한 금액 + 기본 자산금액을 합한 총 자산 금액을 출력하시면 됩니다. 2번을 입력시
		 * "출금할 금액을 입력하세요" 사용자가 입력한 금액 - 기본 자산금액을 계산하여 총 자산 금액을 출력하시면 됩니다.
		 */

		/*
		 * Scanner scan= new Scanner(System.in);
		 * System.out.println("1번 입력시 입금, 2번 입력시 출금 입니다.");
		 * 
		 * int input=scan.nextInt();
		 * 
		 * 
		 * int asset = 100000; int result; if(input == 1) { Scanner one= new
		 * Scanner(System.in); System.out.println("해당 금액을 입력하세요"); int
		 * money1=one.nextInt(); one.close(); result= money1+asset;
		 * System.out.println(result); }else { Scanner two= new Scanner(System.in);
		 * System.out.println("해당 금액을 입력하세요"); int money2=two.nextInt(); two.close();
		 * result= asset-money2; System.out.println(result); } scan.close(); // 스캐너 여러개
		 * 사용 시 스캐너를 닫을때 제일 아래에 닫아줘야 다음 입력에 에러가 안남.
		 */

		// 풀이
		int money = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금 입니다.");
		int work = sc.nextInt();
		int total;
		Scanner cal = new Scanner(System.in); // 스캐너를 2번사용하지 않기위해 스캐너를 조건문 밖에 선언
		if (work == 1) {
			System.out.println("입금 금액을 입력하세요: ");
			total = cal.nextInt();
			money = money + total;
		} else if (work == 2) {
			System.out.println("출금 금액을 입력하세요:");
			total = cal.nextInt();
			money = money - total;
		} else {
			System.out.println("정상적인 코드가 아닙니다.");
			sc.close();
		}

		System.out.println("처리된 내용은 다음과 같습니다." + money + "원");
		cal.close();
	}

}