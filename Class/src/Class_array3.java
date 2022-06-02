import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*응용문제: 다음 문자 배열 데이터 값이 있습니다.
		 a1 : 홍길동, 이순신, 강감찬, 유관순, 김유신
		 a2 : 100, 80, 39, 60, 55
		 "검색하고자 하는 이름을 적어주세요."출력하게 됩니다.
		 검색어에 이순신 이라고 검색을 하게 되면 "이순신님은 80점 입니다." 라고 출력이 되어야 합니다.   
		 */
		
		String a1[] = {"홍길동", "이순신", "강감찬", "유관순", "김유신"};
		String a2[] = {"100","80","39","60","55"};		

		Scanner scan = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요.");
		String name = scan.next();
		
		dd d = null;
		d = new dd();		
		d.score(a1,a2,name); // a1,a2배열값과 사용자가 입력한 이름을 class dd의 score 메소드로 보냄
	}

}

class dd{
	public void score(String n[], String s[], String ns){
//		System.out.println(Arrays.toString(n));// main메소드에서 받아온 배열의 출력이 잘 되나 확인
//		System.out.println(ns); // main메소드에서 입력된 사용자입력값이 잘 출력되나 확인
		int ea = s.length; // main메소드에서 받아온 배열의 길이 확인
		int f;		//반복문에 사용
		for(f=0;f<ea;f++) { // 배열길이만큼 반복
			if(ns.equals(n[f])) { // 사용자가 검색한 이름이 배열의 원소값과 같으면
				System.out.printf("%s님은 %s점 입니다.",ns,s[f]); // 내용 출력
			}
		}
	}
}