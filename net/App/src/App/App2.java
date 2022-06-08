package App;

import java.util.Arrays;

public class App2 {

	private String ffe;
	private String zze;
	private String ho="no";
	
	public static void main(String[] args) {
	
		
	}

	public void a(String name, String score) {

		// (국어.수학.과학.역사)

		this.ffe = name; // 이름
		this.zze = score; // 과목

		String sub[][] = { 
				{ "박은경", "이경훈", "장운", "조기현", "김진수" }, // [0][0~4] 이름[0] 국어[1] 수학[2]. 과학[3] 국사[4]
				{ "80", "78", "92", "67", "40" }, 
				{ "40", "80", "80", "92", "100" }, 
				{ "95", "30", "55", "90", "65" },
				{ "20", "80", "100", "95", "30" } 
		};

		int a; // 큰 for
	

		int sub0_ea = sub.length; // 5


		for (a = 0; a < sub0_ea; a++) {
		  if(this.zze==null) {
			 if(this.ffe.equals(sub[0][a])) {
				 this.ho="ok";
			 }
		  }else {
			  
			  
			  
		  }
		}
		
		
		// System.out.println(sub1_ea);
		
//		for (a = 0; a < sub0_ea; a++) {
//			
//			if (sub[0][a].equals(ffe)) {
//				// System.out.println(sub[0][a]);
//				if (zze.equals("국어")) {
//					ho = sub[1][a];
//				}else if (zze.equals("수학")){
//					ho = sub[2][a];
//				} else if (zze.equals("과학")){
//					ho = sub[3][a];
//				}else if (zze.equals("역사")) {
//					ho = sub[4][a];  }
//				else if (sub[0][a].equals("전체")) {
//					int f;
//					for(f=0; f>a; f++);{
//				     	ho = sub[f][a];}
//			              }
//
//                   }
//			}
	}

	public String get() {
		return this.ho;
	}

}
