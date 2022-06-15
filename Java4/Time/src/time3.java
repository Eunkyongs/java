
public class time3 {

	public static void main(String[] args) {
		/*
		//try-catch 는 자동으로 정지 됨.
		try {
			System.out.println("수업시작");
			Thread.sleep(5000);
			System.out.println("수업종료");
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		*/
		
		/*응용문제 : 외부 class가 있습니다. 단, 메인 클래스에서 해당 외부클래스를 로드하면 해당 메소드에서 즉각적으로 8초동안 로딩이 발생합니다.
		  8초동안 "처리중 입니다. 잠시만 기다려 주세요"
		  8초 이후에 return으로 "입금이 모두 처리 되었습니다."라는 문자를 받도록 하십시오. 
		 */
	
//		 cc c=new cc();
//		 System.out.println(c.print());
//		 c.ccc();
//		 System.out.println(c.print());
		 
		 //선생님풀이 클래스호출
		 bank b =new bank();
		 b.money();
	}

}


class cc{
	private String msg ;
	public cc(){
		this.msg="처리중 입니다. 잠시만 기다려 주세요.";
	}
	
	public void ccc() {
		try {
			Thread.sleep(8000);
			this.msg ="입금이 모두 처리 되었습니다.";
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		this.print();
	}
	public String print() {
		return this.msg;
	}

}	

//선생님 풀이
class bank{
	public void money() {
		try {
//			System.out.println("처리중 입니다. 잠시만 기다려 주세요.");
			System.out.println("test");
			int c =1/0; //
			Thread.sleep(8000);
			System.out.println("test1");
//			String kkk = this.mmsg();
//			System.out.println(kkk);
			
		}catch(Exception c) {
			System.out.println("test2");
		}
	}
	public String mmsg() {
		return "입금이 모두 처리되었습니다.";
	}
	
}
