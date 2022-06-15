package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*응용문제 : 해당 데이터 값 중 휴면고객 데이터는 모두 삭제 해야 합니다.
		  고객 데이터 
		  김수빈, 김정현, 김창순, 박도현, 이경훈, 정재욱, 하윤성
		  
		  결과
		  정재욱, 하윤성
		  */
		
//		String []user_data = {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"};
//		
//		ArrayList<String> ar= new ArrayList<>(Arrays.asList(user_data));
//		int ea = ar.size(); 
//		
//		int w = 0;
//		do {
//			int ea2 = ar.size(); // node의 갯수를 다시 파악함
//			int ww=0;
//			while(ww<ea2) {
//			if(!ar.get(ww).equals("정재욱") && !ar.get(ww).equals("하윤성")) {
//			ar.remove(0);	
////			System.out.println(ar);
//			}		
//			}
//			w++;
//		}while(w<ea);
		
		/*
		 응용문제 짝수인 숫자를 모두 삭제합니다.
		 10,7,6,1,11,37,41,22
		 
		 결과
		 7,1,11,37,41  
		 */
		
		Integer numb [] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numb));

		//선생님코드
//		int no = num.size();
//		int z =0;
//		do {
//			int no2 = num.size();
//			int zz=0;
//			do {
//				if(num.get(zz)%2==0) {
//					num.remove(zz);
//					break;
//				}
//				zz++;
//			}while(zz<no2);
//			z++;
//		}while(z<no);
//		System.out.println(num);
		
		
		
		int nea = num.size();
		int f,ff;
		for(f=0; f<nea; f++) {
			int nea1 = num.size();
			for(ff=0; ff<nea1; f++) {
				if(num.get(ff)%2 == 0) {
					num.remove(ff);
					break;
				}
			}
		}
		System.out.println(num);
		
		
		
	}
}
