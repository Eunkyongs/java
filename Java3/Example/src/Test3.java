
public class Test3 {

	public static void main(String[] args) {
		
		//1+1~5+9 반복문 2개?
		
		int f,ff;
		int tt=0;
		for(f=1; f<=5; f++) {
			for(ff=1; ff<=9; ff++) {
				tt +=(f+ff);
			}
		}
		System.out.println(tt);
		
		int w =1;
		int total=0;
		while(w<=5) {
			int w1 = 1;
			while(w1<=9) {
				total += (w+w1);
				w1++;
			}
			w++;
		}
		System.out.printf("결과값: %d",total);
		
		int dw=1;
		int ttt=0;
		do {
			int dww=1;
			do {
				ttt+=(dw+dww);
				dww++;
			}while(dww<=9);
			dw++;
		}while(dw<=5);
		System.out.println("결과값:"+ttt);
		
		
		
		
	}

}
