
public class Array2 {

	public static void main(String[] args) {
		/*hong
		  kim
		  park
		  lee
		  jang
		  jung*/
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
//		System.out.println(id[4]);
//		int word = id[0].length(); // 문자형 배열안의 단어 갯수파악에도 사용 ()->문자의 글자 갯수파악시에만 사용
//		System.out.println(word);
		
		
		/*응용문제: 해당 사용자 리스트 배열이 있습니다. 해당 배열값 중 사용자 아이디 3단어 이상만 출력시키시오.*/
	/*
		int w=0;
		while(w<=6) {
			int word = id[w].length();
			if(word>=4) {
				System.out.println(id[w]);
			}				
		w++;
		}
		
		//선생님 풀이
		int member = id.length; // 전체 회원수를 파악하기 위함
		int w1=0;
		int word1; // 각각의 배열 데이터의 문자 갯수 파악
		while(w1<member) {
			word1 = id[w1].length(); // 문자 갯수 파악
			if(word1>3) {//세단어 이상(불포함)의 데이터만 출력
				System.out.println(id[w1]);
			}
			w1++;
		}
	*/
		/*응용문제: 배열데이터는 다음과 같음
		  15 60 11 14 27 
		  다음 데이터값을 모두 더해서 최종 결과값을 출력하시오.*/
		
		int num[]= {15,60,11,14,27}; //배열선언
		int f; // 반복문에 사용
		int d = num.length; //배열의 데이터 갯수 파악. 배열데이터갯수만큼 반복문 돌리기위함.
		int t=0; // 최종결과값에 사용
		for(f=0; f<d; f++) { // 범위 설정할때 부등호 >=, <= 사용하면 배열 범위 밖에 숫자가 튀어나와 에러 발생할수있음
			t += num[f]; //배열안의 데이터값 더함 
		}
		System.out.println(t);// 최종결과값 출력
		
// 선생님 풀이
		int data[] = {15,60,11,14,27};
		int total=0;
		int dw=0;
		int data_ea=data.length;
		do {
			total+=data[dw];
		dw++;	
		}while(dw<=data_ea-1);// <= 사용하고싶으면 배열에 맞추기위해 -1해서 숫자 맞춰줌
		System.out.println("총 합계: "+total);
		
		
		
		
	}

}
