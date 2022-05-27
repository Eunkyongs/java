
public class Example6 {

	public static void main(String[] args) {
		/*
		 * 응용문제6: 1~10까지 순차적으로 적용하는 반복문이 있습니다. 단, 1~5까지는 모든값을 곱하고, 6~10까지는 모든값을 더합니다. 해당
		 * 두개의 값을 비교하여 더한 값이 큰지, 곱한값이 큰지를 결과로 출력하시오
		 */
		int a = 1; // 반복문에 사용
		int t1 = 1; // 1~5 곱한값
		int t2 = 0; // 6~10 더한값
		int a1;

		// print출력시 사용
		String m1 = "1~5까지 모든값을 곱한 값";
		String m2 = "6~10까지 모든값을 더한 값";
		String m3 = "이 더 큽니다.";

		//while문
		while (a < 11) {
			if (a <= 5) { // a가 5보다 같거나 작을때
				t1 *= a; // 모든값 곱하기
			} else if (a > 5) { // a가 5보다 클때
				t2 += a;
			}
			a++;
		}
		
		//do~while문
		do {
			if (a <= 5) {
				t1 *= a;
			} else {
				t2 += a;
			}
			a++;
		} while (a < 11);

		//for문
		for (a1 = 1; a1 < 11; a1++) {
			if (a1 <= 5) {
				t1 *= a1;
			} else if (a < 11) {
				t2 += a1;
			}
		}

		System.out.println(m1 + " " + t1);
		System.out.println(m2 + " " + t2);

		// 결과값 비교
		if (t1 > t2) {
			System.out.println(m1 + m3);
		} else {
			System.out.println(m2 + m3);
		}
		
//		선생님 풀이
		
		int w=1;
		int total = 0 ;
		int total2 = 2 ;
		while(w<=10) {
			if(w<=5) {
				total2= total2*w;
			}else {
				total=total+w;
				}
			w++;
		}
		if(total2<total) {
			System.out.println("더한값이 큽니다.");
			
		}else if(total2>total) {
			System.out.println("곱한값이 큽니다.");
		}
		else {
			System.out.println("두 비교값이 같습니다.");
		}
		
	}

}
