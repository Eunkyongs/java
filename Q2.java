import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*응용문제. 조건문 코드를 작성 하시오.
고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다. 
고객의 기본 자산금액 : 100,000
"1번 입력시 입금, 2번 입력시 출금 입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다.
1번을 입력시 "해당 금액을 입력하세요"
사용자가 입력한 금액 + 기본 자산금액을 합한 총 자산 금액을 출력하시면 됩니다.
2번을 입력시 "출금할 금액을 입력하세요"
사용자가 입력한 금액 - 기본 자산금액을 계산하여 총 자산 금액을 출력하시면 됩니다.*/
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금 입니다.");
		
		int input=scan.nextInt();
		scan.close();
		
		int asset = 100000;
		int result;
		if(input == 1) {
			Scanner one= new Scanner(System.in);
			System.out.println("해당 금액을 입력하세요");
			int money1=one.nextInt();
			one.close();
			result= money1+asset;
			System.out.println(result);
		}else {
			Scanner two= new Scanner(System.in);
			System.out.println("해당 금액을 입력하세요");
			int money2=two.nextInt();
			two.close();		
			result= asset-money2;
			System.out.println(result);
		}
		
		
		
		
	}

}
