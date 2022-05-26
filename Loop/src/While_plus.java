
public class While_plus {

	public static void main(String[] args) {
		/*5~10까지 더한 합계수를 출력*/
		int w= 5; // 초기값
		int total =0; //합계치를 누적시키기 위한 변수값
		while(w<11) { //반복조건
			total += w; //5~10까지 더한 합계수 계산 total=total+w; 
			w++; // 증가
		}
		System.out.println("합계:"+total);
	
		/*응용문제 : 3~8까지 곱한 총 합계수를 출력하시오  
		 3 4 5 6 7 8
		 결과값:20160
		 */ 
		
		int num=3;
		int tot=1; // 곱하기 합계를 설정시 1로 기본값을 설정
		while(num<9) {
			
			tot=tot*num; //tot*=num; +할때는 합계수 저장하는 변수초기값0을하는게 맞음. 곱하기는 변수초기값1 
			num++;
		}
		System.out.println("합계:"+tot);
	}

}
