package swing1;

public class swing1 {

	public static void main(String[] args) {
		// wrapper class (BOX상태)
		//float, char, byte, long, short (기본타입)
		//wrapper class : Byte, Integer, Long, Double
		
		Integer a = new Integer(20); //new Integer(박싱) 
		int b = new Integer(20); //int 선언하면 박싱상태가 언박싱으로 바뀜
		
		if(a==b) { //비교하는 두 변수가 모두 박싱상태면 연산자가아닌 equals 사용해서 값을 비교해야함. 
			System.out.println(a+b);
		}
		
		Integer no1 = 10; // 언박싱
		Integer no = new Integer(99); // 박싱
		//int aa = no; // 언박싱(자동) 이런식 언박싱을 자주 사용함
		Integer bb= no.intValue();//언박싱. 이렇게는 잘 사용하지 않음
		System.out.println(bb);
		
		/*※박싱과 박싱을 비교할때는 equals를 사용해야만 비교가 이루어짐*/
		
	}

}
