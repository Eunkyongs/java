package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		// ArrayList, LinkedList (배열값) - add, remove, get, size
		// Map (배열키, 배열값) - put(add 대신사용) , remove, get, size
		// Map은 배열키 기반이기 때문에 키를 통해서 데이터를 확인합니다.(속도 최상급)
		// 같은 키값을 사용시 마지막에 적용된 값으로 갱신됩니다.
		// ※키값을 절대 중복시키지 않음
		Map<String, String> m = new HashMap<>();
		//hong -> Hash function(HashMap) -> 0x21949CB (중복값이 발생하지 않음)
		m.put("hong", "홍길동");  
		m.put("kang", "강감찬");
		
		System.out.println(m.get("kang")); // 일반 인덱스 번호를 넣으면 null값 출력, 배열 키값을 넣어야 불러와짐
		m.put("", "박혁거세");//비어있는 키를 사용은 할 수 있으나, Map에 원리에는 올바르지 않음 
		// 비어있는값도 키값으로 인식함. 실제로 이렇게 사용하지는 않음
		m.put("park", ""); //키는 있으나 값이 비어있을 경우는 사용됨
		
		if (m.get("park").equals("")) {
			m.put("park", "박");
		}
		m.remove("hong");
		System.out.println(m);
		
		//Map : 여러개의 자료형을 사용할 수 있음 <String,Object>->여러가지 자료형 혼용할때
		//Map에는 Object 선언해서 값을 받게 하지 않아도 됨(키값으로 호출하기때문에). 숫자 사용시 int는 에러발생 Integer로 해야 에러안남
		
		Map<String, Integer> m2 = new HashMap<>();
		m2.put("age", 32);
		m2.put("level", 5);
//		System.out.println(m2.get("level"));
		System.out.println(m2.keySet()); // 키만 출력
		System.out.println(m2.values()); //값만 출력
		System.out.println(m2.containsKey("age")); //containsKey: 해당 키가 있는지 확인 (false:없음, true:있음)
	}

}
