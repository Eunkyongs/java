
public class Test5 {

	public static void main(String[] args) {
		
		int f;
		int t=0;
		for(f=1; f<=100; f++) {
			t += f;
			if(t>=4000) {
				break;
			}
		}
		System.out.println(t);

		
		int w =1;
		int t1=0;
		while(w<=100){
			t1+=w;
			if(t1>=4000) {
				break;
			}
			w++;
		}
		System.out.println(t1);
		
		
	
		int dw =1;
		int t2 =0;
		do {
			t2+=dw;
			if(t2>=4000) {
				break;
			}
			dw++;
		}while(dw<=100);
		System.out.println(t2);
	
	
	
	}

}
