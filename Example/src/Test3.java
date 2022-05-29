import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/* 응용문제:  3개의 상품 "바코드로 상품을 입력시켜 주세요?" 
		 금액을 입력하고 나서 "할인 %를 입력 해 주세요:"라는 문구와 함께 해당 할인 숫자를 입력하면 최종금액이 변경되어 출력되도록 합니다. 

		int money = 10000;
		int coupon =20;

		double a = coupon * 0.01;
		System.out.println(a);

		double b=money*a;
		System.out.println(b);

		double c= money - b;
		System.out.println(c);
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int f; // 반복문용
	    int coupon = 20 ;
	    int money = 10000;
	    int a,b,c;
	    	    	
		
		for(f=1; f<=3; f++) {
			System.out.println("바코드로 상품 금액을 입력시켜 주세요?");
			a = scan.nextInt();
			System.out.println("할인 % 를 입력해주세요.");
			b = scan.nextInt();		
						
		}
		
		
		
	}

}
