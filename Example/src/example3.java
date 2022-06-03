import java.util.Arrays;

public class example3 {

	public static void main(String[] args) {
		/*
		 배열+기본(클래스)메소드 문제
		 product : 수박,참외,사과,배,딸기,키위,바나나,망고
		 moneys: 35000,8000,4000,5500,3800,4400,11000,18900
		 장바구니에 해당 상품을 모두 담았습니다.
		 단, 그 중 사과와 바나나는 제외하고 총 결제금액을 출력하시오.
		 결과값:75600
		 */
		
		String p [] = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
		int m [] = {35000,8000,4000,5500,3800,4400,11000,18900};
		
		example3 e= null;
		e = new example3();
		e.cart(p,m);
		
	}
	public void cart(String []item, int []cost) {
		int i_ea=item.length;//배열길이
		int w =0; // 반복문용
		int total=0; // 합계값저장용
		do {
			if(!item[w].equals("사과") && !item[w].equals("바나나")) { // item배열의 데이터가 사과랑 바나나가 아닌경우
//				System.out.println(item[w]);조건에 만족하는 값 나오는지 출력해서 확인
				total += cost[w]; // 조건을 만족하면 total에 값 저장
			}
			w++;
		}while(w<i_ea); // 배열길이만큼 반복
		System.out.printf("총 결제 금액은 %d원 입니다.",total); // 사과,바나나 제외한 합계 출력
	}
}