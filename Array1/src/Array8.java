import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*정적배열
		int a [] = new int[2];
		a[0]=22;
		a[1]=32;
		*/
		/* 동적배열
		int b [] = {1,2,3,4};
		int [] c = {1,2,3,4};
		int [] d = new int[]{1,2,3,4};
		*/
		
		/* 2차배열 [][] */
		
		/*2차 정적배열
		String member2[][] = new String [3][3];
		*/
		
		//2차 동적배열
		String member [][] = {
				{"홍길동","김유신","유관순"}, //{0,1,2}
				{"25","31","22"}		  //{0,1,2}	
				
		};
		int ea = member.length; // 배열의 갯수가 몇개인지확인. 배열이 2개이니 2가 나옴
		int data_ea = member[0].length; // 해당 배열에서 데이터 객체가 몇개있는지 확인 

//		System.out.println(data_ea);
		
//		System.out.println(member[1][2]);
		int f, ff; // 반복문에 사용
		
		for(f=0; f<ea; f++) { // 큰 반복문은 배열 갯수만큼 loop . 배열이 2개니 2번 반복
//			System.out.println(Arrays.toString(member[f]));//2차배열 출력시엔 인덱스번호 꼭!!넣어주기
			for(ff=0; ff<data_ea; ff++) { // 작은 반복문은 배열에 있는 데이터 갯수 만큼 loop . 배열안의 데이터 3개니 3번 반복
//				System.out.println(member[f][ff]);
				
			}
		}
		
		
	/**/
		int [][] datas = {
				{1,3,5},
				{2,4,6}				
		};
		int fea = datas.length; // 배열갯수 확인
		int dea = datas[1].length; // 배열안의 데이터 갯수확인
		int total=0;
		int w,ww;
		
		for(w=0; w<fea; w++) {
//			System.out.println(Arrays.toString(datas[w]));
			for(ww=0; ww<dea; ww++) {
//				System.out.println(datas[w][ww]);
				total += datas[w][ww];
			}
			
		}
//		System.out.println("총 합계는 : "+total);
		
		/*응용문제:해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하시오.
		 1번 데이터 : 11,42,22,16
		 2번 데이터 : 7,33,10,29
		 결과값:90		 
		 */
		
		int num [][] = {
				
				{11,42,22,16},
				{7,33,10,29}
		};
		
		int num_ea = num.length;
		int eaa=num[0].length;
//		System.out.println(num_ea);
//		System.out.println(eaa);
		
		int a,aa;
		int tt=0;
		int wh=0;

		//for문
/*		for(a=0; a<num_ea; a++) {
//			System.out.println(Arrays.toString(num[a]));
			for(aa=0; aa<eaa; aa++) {
				
				if(num[a][aa] % 2 ==0) {
					tt+= num[a][aa];
				}
			}
			
		}
		System.out.println("결과값: "+tt);
*/		
		//while문
		while(wh<num_ea) {
//			System.out.println(Arrays.toString(num[wh]));
			int whh=0;
			while(whh<eaa) {
//				System.out.println(num[wh][whh]);
				if(num[wh][whh]%2 == 0) {
					tt += num[wh][whh];
				}
				whh++;
			}
			wh++;
		}
		System.out.println("결과값:"+ tt );
		
/*		//선생님 풀이
		int numbers[][]= {
				{11,42,22,16},
				{7,33,10,29}
		};
		int ws=0;
		int totals=0;
		while(ws<numbers.length) { //손에 익지않았을때는 변수로 따로 선언해서 사용하도록 할 것
			int wz =0;
			while(wz<numbers[ws].length) {
				if(numbers[ws][wz] %2 == 0) {
					totals+=numbers[ws][wz];
				}
				wz++;
			}
			
			ws++;
		}
		System.out.println(totals);
		*/
	}

}
