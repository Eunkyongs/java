import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("아이디를 입력하세요?");
		String mid = a.next();
		// System.out.println(mid);
		if (mid.equals("kim")) {
			// if(mid=="kim") { 입력받은 문자열을 ==기호로는 맞는지 판별 불가. equals사용해서 판별
			// 문자열 형태는 scanner 이용시 equals라는 함수를 사용합니다.
			System.out.println("회원이 확인 되었습니다.");
		} else {
			System.out.println("확인되지 않습니다.");
		}
a.close();
	}

}
