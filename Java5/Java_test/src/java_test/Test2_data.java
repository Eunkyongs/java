/*2번 문제
{ "사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8" }
각각의 개당 가격이 있습니다.
해당 장바구니는 갯수만큼 전체 값을 계산하여 총 결제할 금액을 출력하는 프로그램을 작성하시오
[각각 1개당 가격]
사과 = 250
양파 = 200
마늘 = 700
파 = 2300
참치캔 = 1100
라면 = 850
[결과출력]
구매하시고자 하는 총 결제 금액은 :  XXXXX 원 입니다.
※ 각각 1개당 가격 관련 사항 배열은 직접 제작하시길 바라며, 해당 배열 기본가격 절대 값이 변하지 않아야 합니다.
각각 1개당 가격 관련 사항은 별도의 java 파일에서 로드 하여 가져오시길 바랍니다.
test2.java test2_data.java를 함께 이용합니다.*/
package java_test;

public class Test2_data {
/*	
private	String product[] = {"사과","양파","마늘","파","참치캔","라면"};
private	int count [] = {2,1,1,1,6,8};
private	int cost[] = {250, 200, 700, 2300, 1100, 850};
	
	public int data(){
		
	int ea = this.product.length;
	int w = 0;
	int total = 0;
		while(w<ea) {
			total += (count[w]*cost[w]);
		w++;
		}
		return total;

	}
*/
	
	private	String count [] = { "사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8" };
	private String cost[] ={ "사과=250","양파=200","마늘=700","파=2300","참치캔=1100","라면=850" }; 
	int total = 0;
	
	public void data() {
		int w = 0;
		String [] cart_count= new String [count.length];
		String [] cart_cost = new String [cost.length];
		while(w<this.count.length) {
			cart_count = this.count[w].split("=");
			cart_cost = this.cost[w].split("=");
			
//			System.out.println(cart_count[1]); //split잘되었는지 확인
//			System.out.println(cart_cost[1]);
			//spilt으로 나눈 숫자부분 숫자형으로 변환
			int  Qty = Integer.parseInt(cart_count[1]); 
			int money = Integer.parseInt(cart_cost[1]);
			this.total += (Qty*money);
			w++;
		}
	}
	
	public int total() {
		return this.total;
	}
}

	
}
