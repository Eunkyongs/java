
public class Example4 {

	public static void main(String[] args) {
		/*응용문제 두개의 값을 외부클래스로 보냅니다.
		 해당 클래스에서 두개의 값을 계산하게 됩니다.
		 계산형식은 다음과 같습니다
		 3,10을 보내게되면 두개의 값의 합을 구합니다
		 나머지 외부클래스에서 해당 결과값을 출력하는데, 두개의 합 값이 짝수, 홀수인지를 출력하는 extends를 구현하세요 */
		
		a2 a= new a2();
		a.cal(3,10);//숫자보냄
		a.pt();//결과 호출해서 출력
	}

}

class a1{
	private int n1;
	private int n2;
	protected int tt;
	protected String msg;
	
	public void cal(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		this.tt = this.n1+this.n2; // 받은 값 계산
	}
}
class a2 extends a1{
	public void pt() {
		if(this.tt %2 ==0) {
			this.msg ="짝수";
		}else {
			this.msg="홀수";
		}
		System.out.printf("결과값: %d,  %s 입니다.",this.tt,this.msg);
	}
}