//인증번호발송 시스템 - awt6_abstract와 연결
public class awt6 {

	public static void main(String[] args) {
		
		awt6_handle hd = new awt6_handle();
		hd.layout();
	}

}

class awt6_handle extends awt6_abstract{
	private int vcnum; //랜덤생성된 인증번호 넘어온것 
	private int innum; // 사용자입력인증번호
	private int re ;
	@Override
	public void numcheck(int n) { 
		this.vcnum=n;//인증번호
		
	System.out.println(n);//인증번호 console에 보이게
		
	}
	
	@Override
	public void numcheck1(int n1) {
		this.innum=n1; //사용자입력번호
		
		if(this.innum == this.vcnum) {
			this.re=0;
			checkok();
		}		
	}
	
	
	@Override
	public int checkok() {
		return this.re;
	}
	
	
	
	
}