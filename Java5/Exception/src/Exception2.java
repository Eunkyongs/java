
public class Exception2 {

	public static void main(String[] args) {
		try {
//			test(); // 메소드 호출 자체 error. Exception과는 관계없음.
			Exception2 ex = new Exception2();
			String a ="홍길동2";
			ex.test(a);
		}
		catch(Exception z) {
			System.out.println(z);
		}
		
	}
	public void test(String b) throws Exception, NumberFormatException {
		//throws는 main 메소드에서 예외처리 없이 해당 메소드를 호출 할 경우를 막기위해 사용.
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c; //예외처리 결과에 대한 값을 main메소드로 다시 return시킴.
		// return과 동일하게 코드의 제일 아래줄에 작성해야함. return과 비슷한 성격을 가지고 있습니다.
	}
}
