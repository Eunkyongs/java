
public class Method10 {
	//문자열 정규식 코드
	public static void main(String[] args) {
		//setter:사용자가 입력한 값 또는 수식값등 전달하는 메소드
		//getter:연산을 거친 후 return으로 값을 보내는 메소드
		
		met m = new met();
		m.setUser_name("홍길동");
		m.setUser_pass("a123456");
		m.setUser_email("test@gmail.com");
		
//		System.out.println(m.getUser_name());
//		System.out.println(m.getUser_pass());
//		System.out.println(m.getUser_email());
		
		//replace : 치환형태의 함수입니다.(문자 및 문자열숫자(쌍따옴표 붙은 숫자) 사용가능)
		//replaceAll: replace에서 조금 발전된 치환형태의 함수(JAVA에서는 replace와 통용됨). 구버전에선 구분해야함
		String str = "홍길동님 환영합니다.";
		String str2 = str.replace("님", "고객님"); // 단어 바꿀때 사용.
		System.out.println(str2);
		
		String nm = "홍 길 동";
		String rnm = nm.replace(" ",""); //공백제거
		System.out.println(rnm);
		
		String nm3="자바가 진짜 사람을 자바요";
		String rnm3 = nm3.replaceAll("자바","JAVA");
		System.out.println(rnm3);
				
		
	}

}

class met{
	private String user_name;
	private String user_pass;
	private String user_email;

	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
}