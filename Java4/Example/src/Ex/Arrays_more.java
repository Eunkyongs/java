package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList 2차배열 형태, 다차원배열 포함
public class Arrays_more {

	public static void main(String[] args) {
		String member_data[][] = new String[][] {
			{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"}
		};
		//String[] : 2차배열 이상 Integer[] : 2차배열이상
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
		
		System.out.println(list.get(0)[2]);
		
		int w=0;
		while(w<list.size()) {
			System.out.println(list.get(w)[2]); // 반복문에서 .get사용시 .get(반복문숫자)[인덱스숫자]  
			w++;
		}
		
		
	}

}
