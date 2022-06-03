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
//		d.score(a1,a2,name); // a1,a2배열값과 사용자가 입력한 이름을 class dd의 score 메소드로 보냄 . ()에 들어있는것:매개변수
		//d.score(1,2,3) =>인수값(인자값)
		d.ck(a1, a2, name);
		
	}

}

class dd{
	//메소드에 ()안에 값
/*	public void score(String n[], String s[], String ns){
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
*/	
	//선생님 풀이
	public void ck(String data1[], String data2[], String user) {
		
		int w=0;
		
		int eaa=data1.length;
		
		boolean ck = false;
		do {
			if(user.equals(data1[w])) { // 배열에 동일한 값이 있을 경우.
				ck = true;
				String js = data2[w];
				System.out.printf("%s님은 %s점 입니다.",user,js);
			}
			w++;
		}while(w<eaa);
		
		if(ck==false) { // 메인클래스에서 사용자검색하였을 경우 배열값에 없는 상황
			System.out.println("검색하고자하는 사용자는 확인이 안됩니다.");
		}
	}
}