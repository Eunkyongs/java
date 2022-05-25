import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	
		Scanner a =  new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요.");
		
		int a1 = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("두번째 숫자값을 입력하세요.");
		
		int b1 =  b.nextInt();
		
		if (a1*b1 >= 100) {
			System.out.println("해당 값은 100이상 결과값 입니다.");
		}
		else if(a1*b1 <= 100){
			System.out.println("해당 값은 100이하의 결과값 입니다.");
		}

	}

}
