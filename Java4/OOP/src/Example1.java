import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) { // 외부 클래스 호출만 합니다.
		//abstract 응용문제
		/*
		 1차배열값이 있습니다. 해당 배열값을 모두 더한 값을 출력합니다.
		 단, abstract 기본 void 이름은 sender 가지고 있습니다.
		 최종 값 출력은 sender에서 출력 되도록 합니다.   
		 배열은 abstract에서 사용합니다.  
		 배열 데이터 : 6,13,22,9,12,64,32,47,39
		 */
		
		plus1 ps = new plus1();
		ps.sender();
	}

}

abstract class plus{
	public int a[]= new int[] {6,13,22,9,12,64,32,47,39}; 
	public int ea= this.a.length;
	
	abstract void sender();
}

class plus1 extends plus{
	@Override
	public void sender() {
		int w = 0;
		int total=0;
		while(w<this.ea) {
			total+=a[w];
			w++;
		}
	System.out.println(total);
	
	}
}