import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*[TEST1]

컴퓨터가 1~9까지 숫자를 총 5번 반복 합니다.
5번 반복하는 동안 배열에 해당 값이 저장 되어야 합니다. 단, 중복된 값은 절대 배열에 입력 되지 않도록 합니다.
※ 힌트
배열은 ArrayList를 사용하며, 배열에 중복값 여부는 별도의 return 메소드를 활용하여 체크 되도록 합니다.

정답 예시 [2,3,7,9,4]*/
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
