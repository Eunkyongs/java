
public class While2 {

	public static void main(String[] args) {
		
		int a = 1; //초기값
		int b = 4;
		int c; //연산결과값
		while(a <= 9) { //조건범위
			c= a*b; //산술식
			System.out.printf("%d ",c);
//			System.out.print(c+" ");
			a++; // 증가값. while문에선 증감값 위치에 따라 연산결과가 아예 달라질수있으니 위치에 유의할것 산술식 보다 아래에 위치하도록할것
		}
		/*응용문제
		 56,49,42,35,28,21, 순서로 출력하게 코드 작성
		 7단 내림차순 (56=7*8, 21=7*3)
		 반복문에 결과값을 넣으면 안됨
		 */
		int aa = 8; // 초기값
		int bb = 7; // 연산에 사용할 값
		int cc; //연산결과 값
		while(aa>=3) { //21까지만 출력. 7*3
			cc=(aa*bb); // 연산
			System.out.print(cc+",");
			aa--; // 감소
		}
		/*
		 응용문제2.
		 다음 결과값을 확인하신후 해당 결과값에 맞는 코드를 작성하시오
		 4,7,10,13,16,19,22		 
		 3씩 더해짐 
		 */
		int h=1;
//		int k=3;
		int res;
		while(h<=7) {
		res=h;
				System.out.printf("%d ",res);
			h++;
		}
		}
		
	}


