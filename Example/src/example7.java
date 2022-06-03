
public class example7 {

	public static void main(String[] args) {
		/*
		 다차원 배열로 생성 + 외부 class및 메소드 사용
		 [data]
		 {"홍길동","합격"}
		 {"이순신","합격"}
		 {"강감찬","불합격"}
		 {"김유신","합격"}
		 {"유관순","불합격"}
		 {"장보고","불합격"}
		 		  
		 다차원 배열형태이며, 해당 값중 합격자만 출력되도록 합니다.
		 단, 배열값을 외부 클래스안에 메소드에서 처리가 되도록 합니다.
		 	  
		 결과: 홍길동 이순신 김유신 
		 */
		aaa.bb(); // 클래스와 메소드만 호출
	}

}
class aaa{
	
	public static void bb(){

		//다차원배열
		String data[][]= {
				 {"홍길동","합격"},
				 {"이순신","합격"},
				 {"강감찬","불합격"},
				 {"김유신","합격"},
				 {"유관순","불합격"},
				 {"장보고","불합격"},
		};
		
		int ea1 = data.length; //6
		int ea2 = data[0].length;//2
		int w = 0;
		while(w<ea1) {
			if(data[w][1].equals("합격")) {
				System.out.println(data[w][0]);
			}
			w++;
		}
	
		}
}