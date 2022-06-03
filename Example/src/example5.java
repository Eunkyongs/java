import java.util.Arrays;

public class example5 {

	public static void main(String[] args) {
		/* 2차배열 + 기본(클래스)메소드 문제
		 등록된 고객중 vip고객만 리스트를 출력하시오.
		 
		 user_list : 홍길동, 이순신, 강감찬, 유관순, 세종대왕, 김유신, 계백장군
		 user_level : gold, vip, guest, gold, vip, vip, guest
		 
		 결과 출력: 이순신, 세종대왕, 김유신,		 
		 
		 [그룹인덱스][데이터인덱스]
		 */
		String data[][] = {
				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"gold","vip","guest","gold","vip","vip","guest"}			
		};
		example5 e = null;
		e= new example5();
		e.aa(data);
	}
	public void aa(String user[][]) {
		int ea1=user.length; // 총 배열의 갯수 = 2
		int ea2=user[0].length; //배열의 원소 갯수 = 7
		int f;
		/*
		for(f=0; f<ea2; f++) {
			if(user[1][f].equals("vip")) { //2차배열중 두번째 배열의 원소가 vip와 같으면
				System.out.print(user[0][f]+", "); // 2차배열중 첫번째 배열의 이름 출력
			}
			
		}
		*/
		int w = 0;
		while(w<ea1) {
			int ww=0;
			while(ww<ea2) {
				if(user[w][ww].equals("vip")) {
				System.out.println(user[0][ww]);
					
				}
				
				
				ww++;
			}
			w++;
		}
		
		
		
	
		
	}

}

