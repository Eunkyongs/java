public class Datatype {

	public static void main(String[] args) {
		//String : 문자 " " 무조건 사용.
		String a = "1234"; // "" 안에 입력된것은 무조건 문자로 인식. 1234는 숫자지만 쌍따옴표안에 들어가서 문자로 인식
		System.out.println(a);
		
		/* 정수형*/
		//자료형태를 크게잡으면 메모리를 많이사용하게됨. 적절한 자료형 사용 필요
		byte b = 100; // byte : -128 ~ 127
		System.out.println(b);

		short c = 32767; // short : -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 2147483647; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 9000000000000000000L; // long 사용시 끝에 L 사용해야함.
		// long : 9,000,.... 0이 18개 기본 메모리 할당에서 추가 적용시 가능범위가 늘어남.
		System.out.println(f);
		/*정수형 끝*/
		
		/*실수형*/
		float z = 3.5f; // 3.40248000000+38 (숫자끝에 f를 무조건 사용 해야함.)
		System.out.println(z);

		double k = 44.142465; // 1.784+308 (숫자끝의 d 유/무 모두됨)
		// 원래 double 자료형 사용시 끝에 d를 붙여야하나, 지금은 빼도 소수로 인식 잘됨.
		System.out.println(k);
		/*실수형 끝*/
	}

}
