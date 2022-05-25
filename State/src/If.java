
public class If {

	public static void main(String[] args) {

		byte a = 100;
		byte b = 100;

		// 조건문(if~else) 하나의 조건문에서 if, else문은 1번밖에 사용하지 못함. else if문은 제한없음.

		if (a > b) { // if문
			System.out.println("a값이 더 큽니다.");
		} else if (a < b) {// else if문
			System.out.println("b값이 더 큽니다.");
		} else {// else문
			System.out.println("두 값이 같습니다.");
		}

		/* else문이 없는 경우 */
		if (a > b) {
			System.out.println("a값이 더 큽니다.");
		} else if (a < b) {
			System.out.println("b값이 더 큽니다.");
		} else if (a == b) {
			System.out.println("두 값이 같습니다.");
		}

		/* 부등호기호 : < , > , <= , >= , == */

		/*안좋은 예시 -> 실행은 됨
		if (a > b) {
			System.out.println("a값이 더 큽니다.");
		}if (a < b) {
			System.out.println("b값이 더 큽니다.");
		}if (a == b) {
			System.out.println("두 값이 같습니다.");
		}
		*/
		 
	}

}
