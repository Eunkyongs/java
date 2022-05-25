
public class While1 {

	public static void main(String[] args) {
		int a = 1; //while문 시작값
		while(a<11) { // While(조건의범위){ // 범위값, 종료값
			
//			System.out.print(a+",");
			
			a++;//증가 or 감소
		}
		int b = 10;
		while(b >=5) {
//			System.out.print(b+",");
			b--;
		}
		/* 응용문제 : 다음 사항을 while문으로 작성하시오.
		 22~16까지 숫자를 출력하시오 
		 */		
		int c=22;
		while(c>=16) {
//			System.out.print(c+",");			
//			System.out.printf("%d ",c);
			c--;
		}
		//실무에서는 while문사용시 이런식으로 사용
		int aa=1; // 초기값
		int bb=10;// 종료값
		while(aa<=bb) { //반복문의 범위
//			System.out.printf("%d ",aa);
			aa++;//증가
		}
		
		/*
		 응용문제: 변수2개를 이용하여 범위에 맞게 값을 출력하시오.
		 99~47까지 출력
		 */
		int d=99; // 초기값
		int e=47; // 종료값
		while(d>=e) { //조건범위
			System.out.printf("%d ",d);
			d--; // 감소
		}
		
	}

}
