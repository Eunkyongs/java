package Ex;

public class Example6 {

	public static void main(String[] args) {
		
		int data[] = {10,20,30,40,50}; // 원시배열 . 
		
		order or =  new order(); 
		or.order_check(data); // setter로 값을 보냄
		int result = or.order_recall(); // getter에서 최종 결과값 가져옴
		System.out.println(result); //최종결과값
	}
}
abstract class abstr{ // 추상클래스
	//필드 자료형 변수
	//추상 메소드 선언시, abstract 단어를 public 앞, 뒤 아무데나 둬도 됨
	abstract public void order_check(int adata[]); //setter 
	public abstract int order_recall(); //getter
}

class order extends abstr{ //추상클래스 상속 시 선언해둔 추상메소드 모두 오버라이드로 받아와서 사용해야함.
	//필드선언:1개이상의 메소드에 값을 사용해야 할 경우
	private int total = 0; 
	@Override
	public void order_check(int[] adata) {//배열을 반복 + 짝수값만 출력 최종값
		int ea = adata.length;
		int w = 0;
		while(w<ea) {
			if(adata[w] % 2 == 0) {
				this.total += adata[w];
			}
			w++;
		}
//		this.order_recall() // 해당사항은 절대 사용하지 않음.
	}
	
	@Override
	public int order_recall() { // 최종값을 리턴

		return this.total;
	}
	
}