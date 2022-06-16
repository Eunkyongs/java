import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 배열 데이터: 홍길동, 이순신, 유관순 세개의 데이터가 있습니다.
		 메인 클래스에서 문자를 하나 전송합니다.
		 단, 문자가 null로 보낼 수 있으며, 배열데이터와 관게없는 "강감찬"이라고 보낼수도 있습니다.
		 외부 클래스명 : data_list 이며
		 추상 클래스명 : v_constuct 입니다.
		 외부 클래스 안에 내부 클래스 명 : check 입니다.
		 
		 [결과형태]
		 메인 class에서 강감찬을 적용할 경우
		 내부 클래스에서 "해당 사용자는 가입자가 아닙니다." 라고 출력
		 메인 class에서 이순신을 적용할 경우
		 내부 클래스에서 "해당 사용자가 있습니다." 라고 출력
		 단, ArrayList로 배열을 로드 하십시오.*/
			
		data_list v =new data_list();
		v.userinput("홍길동");
	}

}

abstract class v_constuct{
	String username;
	String data_list[];
	public abstract void userinput(String nm);
}
class data_list extends v_constuct{
	@Override
	public void userinput(String nm) {
		if(nm==null) {
			System.out.println("사용자 이름을 입력하셔야 합니다.");
		}else {
			this.username=nm;
//			System.out.println(this.username); //메인에서 이름 잘 넘어오는지 확인
			check ck = new check(); // 자식클래스를 메인에 호출하지않고 여기서 호출해도 출력가능
			ck.db();
		}
	};
	
	class check{
		String username=data_list.this.username; // 메인메소드에서 적용한 값 받음
		String data_list[]; // field에 배열을 받는 객체 생성 
		ArrayList<String> ar = null; // ArrayList util 을 field에 객체만 생성해놓기
		public void db() {
			//해당 필드에 있는 ArrayList를 인스턴스로 적용
			this.data_list = new String[] {"홍길동","이순신","유관순"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); // this로 처리
			this.compare(); // 최종 db와 사용자 정보를 비교하는 메소드
		}
		public void compare() {
			int ea = this.ar.size();
			int w = 0;
			boolean bl = false;
			do {
				if(this.username.equals(this.ar.get(w))) {
					bl = true;
				}
				w++;
			}while(w<ea);
			
			if(bl == true) {
				System.out.println("해당 사용자가 있습니다.");
			}
			else {
				System.out.println("해당 사용자는 가입자가 아닙니다.");
			}
		}
		
		/* 내코드->안풀림 ㅠ
		String msg; 
		public void message() {
			int w =0;
			int ea1 = data_list.size();
			boolean tf = false;
//			System.out.println(this.data_list);
			while(w<ea1) {
				if(this.username.equals(this.data_list.get(w)) {
					tf=true;
				}
			w++;	
			}
			
			if(tf==true) {
				msg ="해당 사용자가 있습니다.";
			}else {
				
				msg="해당 사용자는 가입자가 아닙니다.";
			}
			System.out.println(username+", "+msg);
			
		}	
		*/	
	}
}