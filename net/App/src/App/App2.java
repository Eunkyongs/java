package App;

import java.util.Arrays;

public class App2 {

	private String ffe;
	private String zze;
	private String ho="no";
	
	public static void main(String[] args) {
	
		
	}

	public void a(String name, String score) {

		// (����.����.����.����)

		this.ffe = name; // �̸�
		this.zze = score; // ����

		String sub[][] = { 
				{ "������", "�̰���", "���", "������", "������" }, // [0][0~4] �̸�[0] ����[1] ����[2]. ����[3] ����[4]
				{ "80", "78", "92", "67", "40" }, 
				{ "40", "80", "80", "92", "100" }, 
				{ "95", "30", "55", "90", "65" },
				{ "20", "80", "100", "95", "30" } 
		};

		int a; // ū for
	

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
//				if (zze.equals("����")) {
//					ho = sub[1][a];
//				}else if (zze.equals("����")){
//					ho = sub[2][a];
//				} else if (zze.equals("����")){
//					ho = sub[3][a];
//				}else if (zze.equals("����")) {
//					ho = sub[4][a];  }
//				else if (sub[0][a].equals("��ü")) {
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
