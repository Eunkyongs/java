import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*[응용문제8]

{"사과=2000","딸기=1500","키위=2500"}

[출력순서]
"해당 상품을 선택해 주세요? [1.사과, 2.딸기, 3.키위]" 2
"해당 상품 갯수를 입력해 주세요? " 5
"구매한 하신 총 가격은 7500원 입니다."

* abstract 를 무조건 사용합니다.
*/

public class test8_1 {

	public static void main(String[] args) {
		cart ct = new cart();
		ct.data();
		int result = ct.checkout();
		System.out.printf("구매 하시고자 하는 총 결제금액은 : %d", result);
	}
}
abstract class datalist {
	public String cost[] = { "사과=2000", "딸기=1500", "키위=2500" };
	public abstract void data();
	public abstract int checkout();
}

class cart extends datalist {
	int total = 0;
	Scanner scan = new Scanner(System.in);

	@Override
	public void data() {
		
		System.out.println("해당 상품을 선택해 주세요? [1.사과, 2.딸기, 3.키위]");
		int select = this.scan.nextInt();
		System.out.println("해당 상품 갯수를 입력해 주세요?");
		int count = this.scan.nextInt();

		String[] cart_cost = new String[this.cost.length];
		ArrayList<Integer> cart= new ArrayList<>();
		int w = 0;
		int money[] =null;
		while (w < this.cost.length) {
			cart_cost=this.cost[w].split("=");
			cart.add(Integer.parseInt(cart_cost[1]));
			w++;
		}

		if(select==1) {
			this.total=(cart.get(0))*count;
		}else if(select == 2) {
			this.total=(cart.get(1))*count;
		}else if(select == 3) {
			this.total=(cart.get(2))*count;
		}
		scan.close();
	}

	@Override
	public int checkout() {
		return this.total;
	}
}
