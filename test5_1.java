import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*[TEST1]

��ǻ�Ͱ� 1~9���� ���ڸ� �� 5�� �ݺ� �մϴ�.
5�� �ݺ��ϴ� ���� �迭�� �ش� ���� ���� �Ǿ�� �մϴ�. ��, �ߺ��� ���� ���� �迭�� �Է� ���� �ʵ��� �մϴ�.
�� ��Ʈ
�迭�� ArrayList�� ����ϸ�, �迭�� �ߺ��� ���δ� ������ return �޼ҵ带 Ȱ���Ͽ� üũ �ǵ��� �մϴ�.

���� ���� [2,3,7,9,4]*/
public class test5_1 {
	public static void main(String[] args) {
		repeatnum rn= new repeatnum();
		ArrayList result = rn.getter();
		System.out.println(result);
	}
}
class repeatnum {
	Random r = new Random();
	ArrayList<Integer> rnum=null;
	Integer repnum = 0;

	public ArrayList getter() {
		Set<Integer> set =new HashSet<>();
		while(set.size()<5) {
			this.repnum = r.nextInt(9)+1;
			set.add(repnum);
		}
		this.rnum = new ArrayList<>(set);
		return this.rnum;
	}
}