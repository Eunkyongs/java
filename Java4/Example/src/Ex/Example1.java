package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {
	public static void main(String[] args) {
		// 외부 class를 사용하여 다음 프로세서를 작성하시오.
		/*
		 다음 2개의 배열 데이터가 있습니다. 단, 2개의 배열을 하나의 배열로 합치도록 합니다. 그대신 중복된 값은 하나로 처리를 하셔야 합니다.
		 1번 DB : 11,22,33,44,55 
		 2번 DB : 8,10,11,19,44
		 결과출력 : [8,10,11,19,22,33,44,55] 
		 힌트 Collections 이용(단, ArrayList, LinkedList를 사용시)
		 */
		/*
		 1. 1번DB, 2번DB 중복값 비교 및 2번 DB 삭제
		 2. 2번 DB를 1번 DB에 추가
		 3. 1번 DB sort로 정렬
		 */
		
//		array ar = new array();
//		ar.arr();
		System.gc();
		outclass ot = new outclass();
		ot.fliter();
	}
}
//선생님풀이
class outclass{
	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;
	public void fliter() {
		Integer []a = { 11, 22, 33, 44, 55 };
		Integer []b = { 8, 10, 11, 19, 44 };
		this.a1 = new ArrayList<Integer>(Arrays.asList(a));
		this.b1 = new ArrayList<Integer>(Arrays.asList(b));
		
		
		//반복문을 사용해서 a1,b1의 값을 각각 비교
		int w = 0;
		do {
			int ww = 0;
			int z = this.b1.size();
			while(ww<z) {
				if(this.a1.get(w) == this.b1.get(ww)) {
					this.b1.remove(ww); // 중복된 값을 먼저 삭제하고
					this.b1.add(ww,0); // 중복된 값 삭제된 자리에 0을 입력
//					break;
				}
				ww++;
			}
			w++;
		}while(w<this.a1.size());

		//b1의 값이 0이 아니면 a1에 b1의 값 추가
		int t = 0;
		while(t<this.b1.size()) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}
			t++;
		}
		Collections.sort(a1);
		System.out.println(this.a1);
	}
}

/*

//내코드
class array {

	public void arr() {
		Integer db1[] = { 11, 22, 33, 44, 55 };
		Integer db2[] = { 8, 10, 11, 19, 44 };
		ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(db1));
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(db2));
		ArrayList<Integer> ar3 = new ArrayList<>(Arrays.asList());
		
		
		
		
		int w = 0;
		int ea1 = ar1.size();

		while (w < ea1) {
					ar1.add(ar2.get(w));
					w++;
			}
		Collections.sort(ar1);

		System.out.println(ar1);
		
	}
}
*/