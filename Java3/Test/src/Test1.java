
public class Test1 {

	public static void main(String[] args) {
		
		bb b = new bb();
		b.cname = "ȫ�浿";
		String aws = b.bbb();
		System.out.println(aws);
	}

}

class bb{
	private String bname;
	public String cname;
	
	public void aaa(String user) { // setter
		if(user =="ȫ�浿") {
			this.cname = "�̹� ���ԵǾ� �ֽ��ϴ�.";
		}else {
			this.cname="���� �� �� �ִ� ���Դϴ�.";
		}
	}
	
	public String bbb() { //getter
		return this.cname;
	}
	
}