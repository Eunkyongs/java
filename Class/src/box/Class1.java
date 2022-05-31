package box; // package는 메인 java를 실행시키면 함께 실행되는 java 파일 로드 형태입니다.

public class Class1 {

	public static void main(String[] args) { 
		// main은 package 중에서 실행되는 최초의 java 파일에만 적용합니다.
		Class2 c2 = new Class2(); //class2 로드
		System.out.println(c2.names);
		
		Adata a = new Adata(); // Class2.java에 별도의 Adata클래스 객체를 로드함.
		System.out.println(a.names);
		
	}

}
