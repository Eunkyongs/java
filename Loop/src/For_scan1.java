import java.util.Scanner;

public class For_scan1 {

	public static void main(String[] args) {
		
		/*int a =5;
		System.out.println(a++); //제시된 변수를 일단 찍고 증가시킴. 출력은 5로 되고, 그 후에 변수값이 증가되어 a값은 6이 됨
		System.out.println(++a); //변수를 먼저 증가시키고 찍음. 윗줄에서 a값이 6이 됨. 증가시키고 출력하니 7이 출력됨
			
		int b = 10;
		int c = 10;
		int d = b + c++;
		System.out.println(d);*/
		
		//for+Scanner이용 점수합계 구하기
		Scanner sc = new Scanner(System.in); // 입력엔진
		int jumsu;//사용자입력변수
		int f;//반복문
		int total = 0; //사용자가 입력한 값에 대한 합계
		for(f=1; f<4; f++) { // 반복조건
			System.out.println("점수를 입력해 주세요."); 
			jumsu = sc.nextInt(); // 사용자가 입력한 값
			sc.close(); // 입력엔진종료
			total += jumsu; // 사용자가 입력한 값을 합계 변수로 이관 total=total+jumsu;로 써도됨
		}
		System.out.println("총 점수의 합은:"+total); //합계
		
	}

}
