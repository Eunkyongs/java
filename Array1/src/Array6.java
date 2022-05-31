import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*응용문제 :  다음중 장바구니에 여러개의 상품이 담겨져 있습니다.
		  그 중 택배비가 별도로 측정되는 금액만 추출하시오.
		  택배비는 30,000원 이상(포함) 
		  15000 48000 67000 8000 118200 49800 6000 18700
	      결과값:[48000, 67000, 118200, 49800]	
		  */
		
		//[] :인덱스 기호
		int fs[] = new int[4]; // 결과값이 4개의 데이터를 가지므로 4개의 공간을 가진 배열 선언
		//[null,null,null,null]이런상태
		
		int cart[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700};
		
		int fs_ea= fs.length;//fs배열의 공간갯수확인
		
		int c_ea=cart.length; // cart배열의 공간갯수확인
		
		int dw = 0; //반복문에 사용
		int f; //반복문에 사용
		int ct = 0; // 조건문에 사용할 카운터. fs배열에 인덱스값을 0부터 순차적으로 부여하기 위한 변수
		
		//do~while문 사용
		do {
			if(cart[dw] >= 30000 && ct<fs_ea) { // cart배열의 객체값이 30000이상일때와 ct값이 fs배열의 총 갯수 이하일때
				fs[ct] = cart[dw];//if의 조건이 맞으면 fs배열에 cart배열의 객체를 대입시킴
				ct++;				//조건이 맞아서 대입이 진행되었으면 ct값 +1증가시킴
			}			
			dw++;
		}while(dw<c_ea);
		System.out.println(Arrays.toString(fs));

/*			
		//for문 사용
		for(f=0; f<c_ea; f++ ) {
			if(cart[f]>=30000 && ct<fs_ea) {
				fs[ct] = cart[f];
				ct++;
			}
			System.out.println(Arrays.toString(fs));
*/			
/*
		//while문 사용	
		while(dw<c_ea) {
			if(cart[dw]>=30000 && ct<fs_ea) {
				fs[ct] = cart[dw];
				ct++;
			}
			dw++;
		}
		System.out.println(Arrays.toString(fs));
*/
		
		
		
		


		}
	}
