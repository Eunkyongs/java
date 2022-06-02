import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		//클래스 + 메소드 + 배열
		String users[] = {"홍길동", "이순신","김유신"};
		
		/*응용문제: 사용자가 자신의 이름을 입력합니다.
		 사용자 이름을 해당 class로 보내서 등록된 사용자 인지 미 가입자 사용자 인지를 확인하는 코드를 작성하시오.
		 등록된 사용자 일 경우 "가입이 되어 있습니다." 라고 출력하고, 확인이 되지 않을 경우 "미가입자 입니다."라고 출력합니다.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자 이름을 입력하세요.");
		String name = scan.next();
		arrays.lists(users, name);
		scan.close();
	}

}

class arrays {
	public static void lists(String a[], String n) { 
				int w=0;
				int ea = a.length;
				String msg=""; // 메소드로 해당 값을 전달할때는 비어있는 값을 명확하게 적용하셔야 합니다.
				// String "" or null int 0 ->비어있는 값 표현.
				boolean ck = false;
				while (w<ea) {
					if(n.equals(a[w])) {
						msg="가입이 되어있습니다.";
						ck=true;
					}
					w++;
				}
				if(ck==false) {
					msg="미가입자 입니다.";
				}
//				arrays.message(msg); // 같은 클래스여도 메모리에 올라와있지않기때문에 없는거나 마찬가지
				
				arrays ar = null; 
				ar= new arrays();
				ar.message(msg);
	}
	
	public void message(String m) {
		System.out.println(m);
	}
	


}