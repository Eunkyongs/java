

public class For1 {

	public static void main(String[] args) {
		// 반복문 : 데이터를 일괄적으로 입력, 출력을 할 수 있도록 하는 문법.

		int z = 1;
		// z++; //+1 증가 : 출력 후 +1 증가
		// z--; //-1 감소 : 출력 후 -1 감소
		// ++z; //+1 증가 : +1 증가 후 출력
		// --z; //-1 감소 : -1 감소 후 출력
		 System.out.println(z);

		// for(초기값; 범위값(종료값); 증가또는 감소)
		for (int a = 0; a < 10; a++) { // a라는 숫자를 0부터 9까지 1씩 증가하게 반복출력 int a = 0; :초기값 a++ : a값 1증가
//			System.out.println(a);
		}

		int b;
		for (b = 5; b <= 10; b++) {
//			System.out.println(b);
		}

		int c;
		for(c = 10; c>3; c--) { // -- 사용시, 범위설정 잘못하면 음수까지 무한대로 반복되는 경우 발생. 
			//주의사항 범위를 c<3으로 잘못 지정하면 0~음수까지 전부 찍혀버리는 상황이 발생함
//			System.out.println(c);
		}
		
//		응용문제 : 20부터 27까지 출력
		
		int d;
		for(d=20; d<=27; d++) {
//			System.out.print(d); //for문 사용시 반복으로인해 줄이 길어지니 print로 사용
		}
		
//		응용문제: 39~21까지 출력
		
		int e;
		for(e=39; e>20; e--) {
//			System.out.print(e+" ");
		}
//		1~10까지 숫자출력. 변수2개이용
		int aa; //초기값
		int bb = 10; //종료(범위)값
		
		for(aa = 1; aa<=bb; aa++) {
//			System.out.print(aa+" ");
				}
		
/*	응용문제 변수 2개를 이용하여 다음 데이터를 출력하시오
	55~4까지 출력합니다.*/ 
		int kk;
		int ll = 4;
		for(kk=55; kk>=ll; kk--) {
//			System.out.print(kk+" ");
		}
		
		
		
		
		
	}

}
