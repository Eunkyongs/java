//인증번호발송 시스템 - awt6_abstract와 연결
public class awt6 {

	public static void main(String[] args) {
		
		awt6_handle hd = new awt6_handle();
		hd.layout();
	}

}

class awt6_handle extends awt6_abstract{
	private int vcnum; //랜덤생성된 인증번호 넘어온것 
	@Override
	public void numcheck(int n) { 
		this.vcnum=n;//인증번호
		System.out.println("발송된 인증번호: "+n);//인증번호 console에 보이게 설정
	}
	
	@Override
	public int checkok() {
		return this.vcnum;
	}
	
	@Override
	public void setter(int usernum) {
		
	}
	
	@Override
	public String getter() {

		return null;
	}
	
}