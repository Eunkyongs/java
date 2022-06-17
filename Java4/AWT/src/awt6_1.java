//인증번호발송 시스템 - awt6_abstract와 연결 선생님코드
public class awt6_1 {

	public static void main(String[] args) {
		
		awt6_handle_1 hd = new awt6_handle_1();
		hd.layout();
	}

}

class awt6_handle_1 extends awt6_abstract_1{
	String message = "";  
	
	@Override
	public void setter(String userno) {
		System.out.println(pc); //pc 4자리 인증 출력
		if(userno.equals(pc)) {
			this.message ="인증 완료 되었습니다.";
		}
		else {
			this.message = "인증번호를 다시 확인 하십시오.";
		}
	
	
	}
	
	@Override
	public String getter() {

		return this.message;
	}
	
}