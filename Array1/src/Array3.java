import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
				
		/*{3.4, 1.6, 4.2, 5.3, 4.7} 처럼 배열 안의 데이터가 소수인경우 배열 double형으로 선언*/
		
//		{5,10,15,20,25,30,35}
		
//		int data[] ={5,10,15,20,25,30,35};
/*		for~each 문을 사용할때는 인덱스 번호가 필요없이 사용할 경우 (ex. 단순한배열. )
 		for~do~while문 사용할때는 인덱스 번호가 필요할 때 사용
		[0],[1],[2] : 인덱스 번호

*/	
/*		for(int f : data) { //int f 가 순차적으로 data배열값을 받아서 저장시킵니다.
			if(f%2==0) {
//				System.out.println(f);
			}
		}
		
		String pay [] = {"무통장입금","신용카드","휴대폰결제","상품권","쿠폰"};
		Scanner sc = new Scanner(System.in);
		System.out.println("결제 하고자 하는 형태를 선택해 주세요.");
		
		String pm = sc.next();
		
		for(String z : pay) { // 배열데이터가 문자이므로 받는 변수 형태 또한 문자형을 사용해야 합니다.
			if(pm.equals(z)) {
				if(z.equals("휴대폰")) { // switch문으로 변환 가능
					System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
				}else {
					
					System.out.println(pm+"로 결제 진행 됩니다.");
				}
				
			}

		}
//		sc.close();
	*/	
		/*응용문제 : {"햄버거","피자","치킨","커피"}
		 "주문하고자 하는 음식을 선택해 주세요."
		 해당 질문은 총 4번을 물어보게 됩니다. 
		 단, "주문종료"라고 사용자가 입력시 그 즉시 주문은 종료되며, 주문내역을 출력하시면 됩니다.
		  */
		
		String food[]={"햄버거","피자","치킨","커피"} ;
		
		Scanner scan= new Scanner(System.in);

		String user;
		String order_total; // 주문내역 저장
		
		for(String u : food){
			System.out.println("주문하고자 하는 음식을 선택해 주세요.");
					user=scan.next();	
			if(scan.equals(user)) {
				order_total = scan+u;
			
				if(scan.equals("주문종료")) {
				
					System.out.println(order_total);
					break;
			
				}
				
			}


		}

		scan.close();
		
	}

}
