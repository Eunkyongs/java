import java.util.Arrays;

public class example1 {

	public static void main(String[] args) {
		/* 배열+기본(클래스)메소드 문제 
		   1차배열에 다음과 같이 값이 있습니다.
		   배열리스트 22,33,44,55,66,77,88,99 이며
		   해당 전체값을 모두 더한 총 합계값을 별도의 메소드로 처리되도록 합니다.
		   단, 반복문은 무조건 do~while문으로 작성합니다.		  
		 */
		
		
		int num[]= {22,33,44,55,66,77,88,99};
		
//		a(num); // 배열num을 a메소드로 보냄. static 사용시.
		example1 ex = null;  // void일때 사용
		ex = new example1();
		ex.a(num);
	}
	
	//void = 객체생성 + 인스턴스(메모리)등록
	public void a(int[] n){
//	System.out.println(Arrays.toString(n));//main메소드의 배열값 넘어오나 확인	
		int n_ea=n.length; //배열길이확인
		int w=0; // 반복문사용
		int t=0;//합계값저장용
		do {
			t+=n[w];
			w++;
		}while(w<n_ea);
		System.out.printf("합계 : %d",t);
		
	}

}
