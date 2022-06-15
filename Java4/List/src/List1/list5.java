package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*응용문제 사용자가 숫자 금액을 입력합니다.
		 해당 숫자 금액 입력 횟수는 총 8번입니다.
		 0~n까지 입력가능하며 
		 해당 입력이 모두 끝나면 최종 합계 금액을 출력시키시오.
	
		예시)
		입금할 금액을 적으세요?
		500 600 500 400 200 100 50 50
		결과) 총입금액은 2400원 입니다.
		 */

		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> sum = new LinkedList<>(); //빈배열
		
		int w=0;//인덱스번호용
		int total=0;//최종합계용
		do{
			System.out.println("입금할 금액을 적으세요?");
			String cost = scan.next();
			try {
				int money = Integer.parseInt(cost);
				sum.add(money);
				total+= sum.get(w);
			}catch(Exception e) {
				System.out.println("금액은 숫자로만 입력하세요.");
			}
			w++;
		}while(w<8);
		System.out.printf("총 입금액은 %d 원 입니다.",total);
	}
}
