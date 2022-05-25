import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		// Scanner와 함께 while 문으로 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램을 제작하시오.

		Scanner in = new Scanner(System.in);
		System.out.println("원하시는 구구단 숫자를 입력하세요.");
		int num = in.nextInt();

		int a = 1;
		int b;
		while (a < 10) {
			b = num * a;
			System.out.print(b + " ");
			a++;
		}

		in.close();
	}

}
