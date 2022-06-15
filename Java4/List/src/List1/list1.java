package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(추가), get(데이터로드), remove(삭제), size(index갯수) : ArrayList 라는 util 메소드 에서 사용하는 부분
		//Arrays.asList : 로드할 배열 변수를 적음
		//중요:add는 일반적으로 무조건 맨 뒤에 데이터가 추가됨. 단, index 번호를 적용 후 값을 실행하면 해당 index 부분에 데이터가 추가됨
		String member [] = {"이순신","홍길동","유관순","강감찬"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
//		System.out.println(mb);
		int ea = mb.size();
//		System.out.println(ea);
		mb.add("김유신"); // 배열의 제일 끝에 데이터 추가
//		System.out.println(mb);
		mb.remove(1); // 배열에 데이터 삭제
//		System.out.println(mb);
		mb.add(3,"세종대왕"); // 인덱스번호,데이터 하면 그 인덱스번호자리로 데이터 들어감.
//		System.out.println(mb);
		String checks = mb.get(2);
		System.out.println(checks);
		/*응용문제 
		 본데이터 15,22,37,8,11,19,41 입니다.
		 해당 본 데이터를 커스텀하여 다음결과처럼 출력하시오.
		 [7,15,22,8,11,39,41]
		 */
		Integer numbers [] = {15,22,37,8,11,19,41};
		
		/*ArrayList에는 int를 사용하지 않음 (Integer)사용함*/
		ArrayList<Integer> nb = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(nb);
		nb.remove(2);
		nb.remove(4);
		nb.add(4,39);
		nb.add(0,7);
		System.out.println(nb);
		
	
	}

}
