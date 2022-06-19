package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3_1 {

	public static void main(String[] args) {
		/*
		 응용문제 (숙제) 
		 가입된 회원정보 중 현재 데이터에서 포인트가 적은 순서대로 사용자이름을 정렬하여 출력합니다.
		 
		  결과
		  [정재성,한울,서한솔,김은형,김도형,서한결,홍길동,김실,이선영,차은우,정재혁]

		 -프로세서 코드 제작은 무조건 free-
			String data[][]={
				{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
				{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
				{"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
				{"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
				{"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
				{"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
				{"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
				{"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
				{"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
				{"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
				{"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
		};
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(data));
		System.out.println(list.get(1)[0]);
			 */

//		pointdata pd = new pointdata();
//		pd.setter();
		
		String data[][]={
				{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
				{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
				{"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
				{"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
				{"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
				{"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
				{"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
				{"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
				{"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
				{"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
				{"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
		};
		
		
		int f,ff;
		int ea1=data[0].length;//7
		int ea2=data.length;//11
		int a[] =new int[ea2];
		int cc=0;
		ArrayList<String> list = new ArrayList<>(Arrays.asList());
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList());
		
			for(ff=0; ff<ea2; ff++) {
				list.add(data[ff][6]);
				list2.add(cc+data[ff][0]);
				cc++;
			}
		System.out.println(list);
		System.out.println(list2);
		Collections.sort(list);
		
		
		int c=0;
		for(f=0; f<list2.size(); f++) {
			
//			a[c] = Integer.parseInt(list.get(f));
			c++;
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int w=0;
		while(w<a.length) {
		if(list2.get(w).equals(a[w]) ) {
			System.out.println(a[w]);

		}else {
			
		}
		w++;
		}
		
	}

}
/*
abstract class ab{
	ArrayList<String[]> list = null;
	ArrayList<String> point = null;
	ArrayList<Integer> pp = null;
	ArrayList<String> user = null;
	ArrayList<String> fpoint = null;
	public abstract void setter();
	public abstract void db();
	public abstract String getter();
}
class pointdata extends ab{
	int p = 0;
	String [] u =null; 
	
	@Override
	public void setter() {
		this.db();
		int ea =this.list.size(); // 11
		
		this.point = new ArrayList<>();
		this.pp = new ArrayList<>();
		this.user = new ArrayList<>();
		
		//포인트만 따로 리스트 만듬
		for(int f =0; f<ea; f++) {
			this.point.add(this.list.get(f)[6]);
		}
		
		//포인트값 숫자로 변환해서 정렬후 다시 문자형으로 변환
		for(int ff = 0; ff<this.point.size(); ff++) {
			this.p = Integer.parseInt(this.point.get(ff));
			this.pp.add(p);
		}
		Collections.sort(pp); // 정렬
		this.fpoint = new ArrayList<>();
		int w = 0;
		while(w<ea) {
			String z =String.valueOf(this.pp.get(w));
			this.fpoint.add(z); // 숫자>문자변환해서 다시배열구성
			w++;
	}
//		System.out.println(fpoint);
		
		//포인트값 정렬한 순서대로 이름 재정렬
		this.user = new ArrayList<>();
		int dw = 0;
		do {
			int dw1 =0;
			do {
//				if(this.fpoint.get(dw).equals(this.list.get(dw)[6])) {
			System.out.println(this.list.get(dw)[0]);
//				}
			dw1++;
			}while(dw1<ea);
		dw++;
		}while(dw<ea);		
		
		
	}
	@Override
	public void db() {
		String data[][]={
				{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
				{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
				{"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
				{"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
				{"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
				{"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
				{"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
				{"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
				{"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
				{"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
				{"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
		};
		this.list=new ArrayList<String[]>(Arrays.asList(data));
	}
	@Override
	public String getter() {

		return null;
	}
}
*/