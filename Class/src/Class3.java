
public class Class3 {
	//package를 사용하지 못함(default라서)
	public static void main(String[] args) {
		//자료형(데이터형) 변환
		
		//double->int 로 변환
		double a = 137.5;
		int b = (int)a;
		
		//int -> double로 변환
		int c = 35;
		double d = (double)c;
		System.out.println(d);
		// 숫자자료형간의 변환은 가능. 문자자료형에서 숫자 자료형으로 자료형을 아예 바꾸는건 다른방법이 필요. 
		//String -> int
		String x ="35";
		String x2 = "156";
		int z = Integer.parseInt(x); //parseInt(int형에 사용하는 산술연산 언어임) 단순히 문자형 숫자를 숫자형 숫자로 바꿀때 사용. 
//		int z= Integer.valueOf(x); // 함수를 거쳐서 변환. valueof 클래스안의 메소드(메소드함수)안에 parseInt가 포함되어있음.
		int total =  Integer.parseInt(x)+Integer.parseInt(x2); // 문자형을 숫자로 변환하여 산술계산을 처리함.
		System.out.println(total);
		
		//Long사용시 Long.parseLong 사용함
		String j= "923456789";
		String j2="9234567892";
//		int total2 = Integer.parseInt(j)+ Integer.parseInt(j2);
		Long total2 = Long.parseLong(j) + Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total2);
		System.out.println(total3);
		
		//문자(char)->문자(String) : 기본 지식만 제공
		char p = 'M'; // char: 1단어만 들어감, 따옴표도 '' 사용.
		String f = String.valueOf(p); // 문자->문자 
		System.out.println(f);
		
		
	}

}
