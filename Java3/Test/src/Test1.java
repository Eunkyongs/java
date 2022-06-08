
public class Test1 {

	public static void main(String[] args) {
		
		bb b = new bb();
		b.cname = "홍길동";
		String aws = b.bbb();
		System.out.println(aws);
	}

}

class bb{
	private String bname;
	public String cname;
	
	public void aaa(String user) { // setter
		if(user =="홍길동") {
			this.cname = "이미 가입되어 있습니다.";
		}else {
			this.cname="가입 할 수 있는 고객입니다.";
		}
	}
	
	public String bbb() { //getter
		return this.cname;
	}
	
}