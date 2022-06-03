import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		/* 
		 배열 + 기본(클래스)메소드 문제
		 product : 수박,참외,사과,배,딸기,키위,바나나,망고 중 
		 참외, 배, 키위 를 삭제하였습니다. 
		 해당 삭제 후 배열을 다시 재 리스트 하는 코드를 작성하시오.	
		 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며 반복문은 Free입니다.
		 결과:[수박,사과,딸기,바나나,망고]
		 */
		
		String product[] = {"수박","참외","사과","배","딸기","키위","바나나","망고"}; // 인덱스 1,3,5 삭제
		
		example2 e = null;
		e = new example2();
		e.fruit(product);
		basket(product);
	}
	public void fruit(String []data) {
//		System.out.println(Arrays.toString(data)); // 배열 넘어오는것 확인
		String [] list = new String[5]; // 삭제된 데이터 제거하고 다시 정렬할 배열
		int list_ea = list.length;
		int data_ea = data.length; // 배열길이확인
		//		System.out.println(data_ea); 배열길이 출력해서 갯수확인
		int c = 0; //새로운배열에 인덱스번호 부여해줄 카운터
		int w = 0; // 반복문사용 
		while(w<data_ea) {
//			System.out.println(data[w]);
			if(w%2==0 && w<data_ea || data[w].equals("망고")) {
				list[c]=data[w];
			c++;
			}
			w++;
		}
		System.out.println(Arrays.toString(list));
	}
	
	//선생님 풀이
	public static void basket(String pd[]) {
		int ea = pd.length;
		int no = 5;
		int idx = 0;
		String newproduct [] = new String [no];
		for(String p : pd) {
			if(!p.equals("참외") && !p.equals("배") && !p.equals("키위")) {
				newproduct[idx] = p;
				idx++;
			}
		}
		System.out.println(Arrays.toString(newproduct));
	}
}
