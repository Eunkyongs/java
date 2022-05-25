
public class App {

	public static void main(String[] args) {

		int a = 25 + 31 * 4 + 12;
		int b = 15 * 3 + 9 + 14;
		System.out.println(a);
		System.out.println(b);

		if (a > b) {
			System.out.println("공식 2번 값이 작습니다.");
		} else if (a < b) {
			System.out.println("공식 1번 값이 작습니다.");
		} else {
			System.out.println("두 값이 같습니다.");
		}

		/* 해당값을 2진수로 짝수, 홀수로 확인하기 */
		int c = b % 2; // % 기호로 사용시 0또는 1로 나머지값이 출력이 됩니다.
		if (c==0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	}

}
