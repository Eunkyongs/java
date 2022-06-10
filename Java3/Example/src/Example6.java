import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 응용문제: 상품 가격은 42000입니다.
		 사용자가 해당 상품 갯수를 입력하게 됩니다. 
		 해당 상품 가격에 맞는 갯수 만큼 곱하여 최종 결제 금액을 출력시키는 extends를 제작하시면 됩니다.
		 단,42000은 절대 숫자가 바뀌면 안됩니다.
		 사용자가 최대 구매 할 수 있는 갯수는 5개 까지 입니다.
		 최종 결과값은 main method에서 출력합니다.
		 	
		*/
	
		cart2 ct2 = new cart2();
		Scanner scan = new Scanner(System.in);
		System.out.println("구매를 원하는 상품 갯수를 입력해 주세요.");
		int user_in=scan.nextInt();
		ct2.setter(user_in);
		int result1 = ct2.getter();
		if(user_in > 5) {
		System.out.println("최대 5개까지 구매 가능합니다.");
		}else {
			System.out.println("합계금액: "+result1);
		}
	}
}

class cart1{
	protected int c;
	private final int cost=42000;
	
	protected int total;
	protected String msg;
	
	public void setter (int count){
		this.c=count;
		this.total = this.cost * this.c; // 입력한 갯수 * 가격
	}
}
class cart2 extends cart1{
	public int getter() {
		return this.total;
	}
}