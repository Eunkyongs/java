import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		
		Date today = new Date();
//		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yy년MM월dd일"); // mm=분 MM=month 월 YYYY=year 년도 DD=day 일 (년,일은 소문자도 가능. 월은 소문자하면 분으로나와서 안댐)
		SimpleDateFormat time = new SimpleDateFormat("h:m:s"); // h=hour,시 m=minute,분 s=second, 초 
		
//		System.out.println(date.format(today));
//		System.out.println(time.format(today));

		//format : 규격화된 형태로 값을 표현할때 사용하게 됩니다.
		// ctrl+shift+o : import 삭제하는 단축키. 불러온 유틸 더이상 사용하지 않을때 사용함
		
		
		/* 응용문제:  3개의 상품 "바코드로 상품을 입력시켜 주세요?" 
		 금액을 입력하고 나서 "할인 %를 입력 해 주세요:"라는 문구와 함께 해당 할인 숫자를 입력하면 최종금액이 변경되어 출력되도록 합니다. */
/*		
   		int money = 10000;

		int coupon =20;

		double a = coupon * 0.01;
		System.out.println(a);		
		double b=money*a;
		System.out.println(b);
		double c= money - b;
		System.out.println(c);
*/
		
		//for문 더블
		int f,ff; // 반복문 사용
		int total;
		for(f=1; f<=3; f++){ // 큰반복문 3바퀴
//			System.out.println(f);
			for(ff=1; ff<=4; ff++) { // 큰 반복문에 사용한 변수 사용x , 작은반복문 4바퀴 
				total=f+ff;
				System.out.println(f+"+"+ff);
			}
		}
			
		
		
	}

}


