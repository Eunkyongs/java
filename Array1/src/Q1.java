
public class Q1 {

	public static void main(String[] args) {

		/*
		 * 응용문제 배열(Array) 사용자가 장바구니에 내용을 결제 하게 됩니다. 
		 * 단, 해당 금액 리스트를 출력하지 말고, 최종 전체 결제 금액만 출력 되도록 합니다. 
		 * 1500 22000 13000 14500 113800 45000
		 */

		int cart[]= {1500, 22000, 13000, 14500, 113800, 45000};
		
		int total=0; // 최종금액 더한값 담을 변수
		int f; // 반복문 사용
		int data = cart.length; //배열의 데이터 갯수파악 
		
		for(f=0; f<data; f++ ) {
			total+=cart[f];
		}
		System.out.printf("최종 결제 금액은 %d 원 입니다.",total);
		
		
	}

}
