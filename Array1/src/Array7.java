import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*응용문제: 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공 됩니다.
		  그 중 레벨데이터 값에 3미만(3미포함)의 값만 확인하여 배열 데이터를 재가공 합니다.
		  사용자정보:"홍길동","이순신","강감찬","세종대왕","유관순","김유신"
		  레벨데이터: 4,3,1,1,2,2
		  결과값 : ["강감찬","세종대왕",유관순","김유신"] 
		  */
		
		String member[] = { "홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int lv[] = {4,3,1,1,2,2};
		
		//내코드
		int lv_ea=lv.length; // 배열의 객체 갯수 파악
		int a [] = new int[4]; // 데이터 저장할 새로운 배열
		String [] b =new String[4];
		int count=0; // 빈배열에 인덱스번호 부여용
		int dw = 0; //반복문사용
		
		do {
		if(lv[dw]<3) {
			a[count]=lv[dw];
			b[count]=member[dw];
			count++;
		}
			dw++;
		}while(dw<lv_ea);
		System.out.println(Arrays.toString(b));

		//선생님 풀이
		String new_member [] = new String[8];
		int ea = member.length;
		int f;
		int ct=0;
		for(f=0; f<ea; f++) {
			if(lv[f]<3) {
				new_member[ct]=member[f];
				ct++;
			}
		}
		System.out.println(Arrays.toString(new_member)); 
		// Arrays(유틸값).toString(속성) :숫자,문자,소수 [] 현재 배열 변수값을 출력하는 함수입니다.
		
	}
}
