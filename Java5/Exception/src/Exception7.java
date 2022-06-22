import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*
		응용문제2: 데이터파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88}
		해당 데이터 값중 문자값만 출력되도록 재배열 하시길 바랍니다.
		단, 메인에서는 해당 배열을 외부클래스 (setter)로 전송합니다.
		해당 setter에서 배열값을 확인하여 이름만 재배열로 생성 합니다.
		getter에서 해당 배열을 return으로 보내도록 합니다.
		단, 외부클래스에서 숫자만 있는 배열은 모두 예외처리되도록 합니다.
		*/
		
		try {
			redata r= new redata();
			Object data []={"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
			r.setter(data);
			LinkedList result = r.getter(); //return받는 값이 배열class이므로 해당 class명으로 선언 후 받아야 됩니다. 
			// getter의 자료형이 LinkedList이므로 받을때도 LinkedList로 받음. LinkedList<String>으로 써도 맞음.
			System.out.println(result);
		}
		catch(Exception a){
			if(a.getMessage()!=null) {
			System.out.println(a.getMessage());
			}
		}
	}
}

class redata{
	
	LinkedList<String> redata = new LinkedList<>(); //이름데이터만 저장할 빈배열 생성. 당장 LinkedList에 넣을값이 없으므로 null;로 선언해도 무방함. 
	
	public void setter(Object[] call) throws Exception{
		int ea = call.length; // 9개
		int w =0;
		
		// Object일땐 (int)call[1] 이런식으로 확인할 인수값앞에 자료형 붙여줌.  
		//Object배열의 숫자 데이터 확인
//		int check = Integer.valueOf((int)call[1]);
//		int check =(int)call[1];
		// Object배열의 문자데이터 확인
//		String check =(String)call[0]; 
//		String check = new String((String)call[0]);
		do {
			try {
				//해당 배열을 로드시 (자료형)변환을 하는 이유는 Object 배열이므로 선언하였음.
				String check = String.valueOf((String)call[w]);
				this.redata.add(check);
			}catch(Exception ex){ // 자신 class에서 문제 발생시 출력되는 catch문. 단 throw 사용하면 다시 main으로 전달됩니다. 중요한 사항은 throw로 전달시 해당 반복문은 종료하게 됩니다.
//				System.out.println(ex); // 캐치box안에서 자체적으로 예외 해결. throw를 사용하면 main 메소드로 예외사항 넘어감
			}
			w++;
		}while(w<ea);
	}
	public LinkedList<String> getter() { //배열 class이름으로 getter를 만들 수 있습니다.
		return this.redata;
	}
	
}
