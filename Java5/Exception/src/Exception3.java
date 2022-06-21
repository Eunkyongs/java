import java.util.ArrayList;

public class Exception3 {
	public static void main(String[] args) {
		//응용문제
		// data = {"hong45","lee90","kang100","park70","kim72"};
		/*
		 해당 배열 데이터 값을 main2라는 메소드로 값을 던집니다.
		 해당 값을 던질 때 예외처리를 무조건 발생 시켜야 하며,
		 최조 값을 던질때는 가공 없이 던지게 됩니다.
		 main2에서는 해당 배열 값을 받은 후 해당 점수를 모두 합산한 결과가 나와야 됩니다.
		 단, 숫자 변환시 문제가 발생할 경우 finally로 체크 후 해당 main2 메소드로 다시 호출하여 정상적으로 데이터가 나오도록 하십시오. */

		//선생님 코드
		String data[] = {"hong45","lee90","kang100","park70","kim72"};
		try {
			total_method(data);
		}catch(Exception z) {
			System.out.println(z);
		}
		finally {
			ArrayList<String> rdata = new ArrayList<String>();
			int j =0;
			String modify;
			while(j<data.length) {
				modify=data[j].replaceAll("[a-zA-Z]", "");
				rdata.add(modify);
				j++;
			}
			String cdata[] = new String[rdata.size()];
			
			int q=0;
			do {
				cdata[q]=rdata.get(q);
				q++;
			}while(q<rdata.size());
			
			try {
				total_method(cdata);
			}catch(Exception h){
//				System.out.println(h.toString());
				//printStackTrace() :사용금지!!! 에러발생 근원지 라인 출력인데, 실무에서 안쓰고 메모리가 계속 누적되어 먹통되니까 사용하지말것
//				System.out.println(h.getMessage()); // null값 나오면 종료
				if(h.getMessage()==null) {
					System.exit(0);
				}else {
					System.out.println(h);
				}
				
			}
		}
	}
	static public void total_method(String db[]) throws Exception {
		
		int w =0;
		int ea = db.length;
		int values;
		int jumsu=0;
		while(w<ea){
			values = Integer.valueOf(db[w]);
			jumsu += values; 
			w++;
		}
		System.out.println(jumsu);
		
		Exception e = new Exception();
		throw e;
	}
	

	/*	//내코드
		String data[] = {"hong45","lee90","kang100","park70","kim72"};
		Exception3 ex = new Exception3();
		try {
			ex.main2(data);
		}catch(Exception z) {
			System.out.println(z);
		}finally {
			int dw=0;
			int c=0;
			String re;
			String aa[]=null;
			do {
			re = data[dw].replace("[a-zA-Z]", "");
			aa[c] += re;
			c++;
			dw++;
			}while(dw<data.length);
		}
	}
	public void main2 (String []a) throws Exception {
		int total=0;
		int score;
		for(int f =0 ; f<a.length; f++) {
			score = Integer.valueOf(a[f]);
			total += score; 
		}
		System.out.println(total);
		Exception e = new Exception();
		throw e;
	}*/
}
