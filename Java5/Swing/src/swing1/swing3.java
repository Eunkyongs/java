package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing3 {
	//반복문을 이용하여 키 생성 및 배열값을 split으로 분리 작업
	public static void main(String[] args) {
		String data[] = {"홍길동","강감찬","이순신","유관순"};
		
		Map<String, String> m = new HashMap<>();
		
		//반복문 사용해서 중복되지 않는 키값생성과 배열값을 map에 집어넣기
		int w = 0;
		do {
			//중복되지 않는 키값 생성 + 해당 배열에 있는 index번호
//			m.put("name"+w, data[w]); //중복되지 않는 키값 생성 + 해당 배열에 있는 index번호
			m.put(String.valueOf(w), data[w]); // index번호를 0,1,2,3 이런식으로 매길때 이런방식으로 사용도 가능함  
			w++;
		}while(w<data.length);
		System.out.println(m);
		
		Map<String, String> m2 = new HashMap<>();
		for(String names : data) {
			m2.put(names, names); //foreach로 키, 값이 동일하게 적용
			
		}
		System.out.println(m2);
		
		//키가 있는 배열 const // 키를 기준으로 배열안에 배열 생성?!
		String alldata [] = {"names=홍길동","age=25","email=hong@naver.com"};
		Map<String, String> m3 = new HashMap<>();
		for(int f=0; f<alldata.length; f++) {
			String key[]= alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		                 
		System.out.println(m3);
		
		
		
	}

}
