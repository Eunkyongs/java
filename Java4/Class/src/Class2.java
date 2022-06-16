public class Class2 {

	public static void main(String[] args) {
		/*
		 응용문제 더블 클래스를 이용하여 자식 클래스에 결과값을 출력하는 프로세서를 제작하시오.
		 클래스는 2가지 있습니다.
		 부모 클래스 명은 : mother
		 자식 클래스 명은 : child
		 메인 클래스에서 mother 클래스로 값을 전달 합니다.
		 30, 50 숫자값을 적용합니다.
		 child에서 부모 클래스에 있는 값을 받아 두개의 숫자를 곱한 결과값을 출력하시오.
		 */
		mother m = new mother();
		m.m_method(30,50);
		mother.child mc = m.new child();
		mc.c_method();
	}

}

class mother{
	
	public int num1, num2;

	public void m_method(int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
	class child{
		int aa = mother.this.num1;
		int bb = mother.this.num2;
		//결과 출력
		public void c_method() {
			int sum = this.aa * this.bb;
			System.out.println(sum);
			
		}
	}
	
	
}