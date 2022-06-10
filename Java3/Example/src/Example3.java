public class Example3 {

	public static void main(String[] args) {
		
		inherit2 ih2=new inherit2();
		ih2.it("홍길동", "aaa5");
		ih2.print();
	}

}

class inherit1 { 
	private String nm; // inherit1 해당 부분에서만 작동
	protected String pw; // inherit1, inherit2에서 모두 작동되도록 하며 외부에서는 로드 못함.
	public String aa ; //private으로 받은 부분을 inherit2에서도 사용할 수 있도록 하기 위함.
	
//	public String aa = nm; //이런식으로 값을 지정해버리면 제일먼저 실행되어 아래 it 메소드에서 값을 받지 못함.
	
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		this.aa = this.nm;  //-> 한번 거쳐야 자식클래스에서도 원활히 사용가능
	}
	
}

class inherit2 extends inherit1 {
	public void print() {
		System.out.println(this.aa+" "+this.pw);
	}
}