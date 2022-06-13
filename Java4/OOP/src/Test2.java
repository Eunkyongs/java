
public class Test2 {

	public static void main(String[] args) {
		String array[][]= {
				{"이순신","홍길동","유관순"},
				{"90","40","100"},
				{"88","60","70"},
				{"70","100","55"}
		};
		//결과값 
		/*
		 이순신 90 40 100
		 홍길동 88 60 70
		 유관순 70 100 55 
		 */
		
		int ea1 = array.length; // 4 ff
		int ea2 = array[0].length; //3 f
		
		int f,ff;
		for(f=0; f<3; f++) {  // 3바퀴
			System.out.println(array[0][f]);
			for(ff=0; ff<3; ff++) { //3바퀴
				System.out.println(array[f+1][ff]); //큰반복문에 0번그룹 출력했으므로 1번그룹부터 출력하도록 f+1
			}
		}
		
		
	}

}
