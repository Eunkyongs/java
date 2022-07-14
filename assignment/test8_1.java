import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*[���빮��8]

{"���=2000","����=1500","Ű��=2500"}

[��¼���]
"�ش� ��ǰ�� ������ �ּ���? [1.���, 2.����, 3.Ű��]" 2
"�ش� ��ǰ ������ �Է��� �ּ���? " 5
"������ �Ͻ� �� ������ 7500�� �Դϴ�."

* abstract �� ������ ����մϴ�.
*/

public class test8_1 {

	public static void main(String[] args) {
		cart ct = new cart();
		ct.data();
		int result = ct.checkout();
		System.out.printf("���� �Ͻð��� �ϴ� �� �����ݾ��� : %d", result);
	}
}
abstract class datalist {
	public String cost[] = { "���=2000", "����=1500", "Ű��=2500" };
	public abstract void data();
	public abstract int checkout();
}

class cart extends datalist {
	int total = 0;
	Scanner scan = new Scanner(System.in);

	@Override
	public void data() {
		
		System.out.println("�ش� ��ǰ�� ������ �ּ���? [1.���, 2.����, 3.Ű��]");
		int select = this.scan.nextInt();
		System.out.println("�ش� ��ǰ ������ �Է��� �ּ���?");
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
