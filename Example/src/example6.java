import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class example6 {

	public static void main(String[] args) {
		/*
		 2차 배열이며, 2차배열 데이터는 다음과 같습니다.
		 user_list :홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군 
		 user_point: 3000 1000 25000 19800 5750 3630 0 
		 
		 프로그램 시작과 동시에 "포인트를 검색할 고객명을 입력하세요?"
		 입력한 값은 별도의 class를 제작하여 해당 메소드값으로 매개변수를 이용하여 전달 후 해당 결과값을 출력하시면 됩니다.		 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("포인트를 검색할 고객명을 입력하세요?");
		String name=scan.next();
		point p = null;
		p = new point();
		p.point1(name);
		
	}

}
class point{
	public void point1(String user) {
//		System.out.println("test");
		String data[][] = {
				{"홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"},
				{"3000", "1000", "25000","19800", "5750", "3630", "0"}
		};
		
		int ea1=data.length; // 배열갯수2
		int ea2=data[0].length; // 배열안데이터갯수 7

			int ww=0;
			while(ww<ea2){
				if(user.equals(data[0][ww])) {
				 System.out.printf("%s 님의 포인트는 %s 입니다.", data[0][ww],data[1][ww]);
					
				}
				ww++;
			}
		
		
		
	}
}
