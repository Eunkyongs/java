
public class Double_loop4 {

	public static void main(String[] args) {
		/*응용문제: 복합반복문 for, do~while */
		
		int f;
		for(f=2; f<=3; f++) {
			int w = 1;
			do {
//				System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		}
		
		/*응용문제: 구구단 7~9단까지 단, 각 구구단 곱셈값은 5까지만 나오도록 합니다. 7*1=7~7*5=35,8*1=8...9*5=45
		  제약(do~while, while)*/
		
		int dw = 7;//큰반복문 초기값
		do { //큰반복문
			int w= 1; //작은반복문 초기값
			while(w<=5) { //작은반복문 1~5까지 반복
//				System.out.println(dw+"*"+w+"="+(dw*w)); //구구단 출력
				w++; // 증가
			}
			dw++;//증가
		}while(dw<=9); //큰반복문 7~9까지 반복
		
		/*응용문제 : 다음 결과값을 확인하여 코드를 작성합니다. 단, for ~ while문으로 제작되도록 합니다.
		 1*1=1
		 2*2=4
		 3*3=9
		 4*4=16
		 5*5=25
		 6*6=36
		 7*7=49
		 8*8=64
		 9*9=81
		  */

		int f1,to;
		for(f1=1; f1<=9; f1++) {
			int w=f1;
			while(w<=f1) {
				to = f1*w;
//				System.out.println(f1+"*"+w+"="+to);
				
				w++;
			}
		}
		
//		선생님 풀이
		
		int g;
		int total2;
		for(g=1; g<=9; g++) {
			int y=g; // 큰 반복문과 같이 증가하게 초기값을 큰반복문의 반복값으로대입
			while(y<=g) {
				total2 = y * g;
//				System.out.printf("%d*%d=%d ",y,g,total2);
				y++;
			}
		}
		
		/*응용문제 다음 해당 결과값처럼 출력이 되도록 더블반복문을 이용하시오(while~ do~while)
		 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8	  
		 */
		
		int w1=1;
		int tot;
		while(w1<5) {
			int	dw1=w1;
			do {
				tot=w1+dw1;
				System.out.println(w1+"+"+dw1+"="+tot);
				dw1++;
			}while(dw<=4);
			w1++;
		}
				
	}

}
