public class Class2 {

	public static void main(String[] args) {
		/*
		 ���빮�� ���� Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�.
		 Ŭ������ 2���� �ֽ��ϴ�.
		 �θ� Ŭ���� ���� : mother
		 �ڽ� Ŭ���� ���� : child
		 ���� Ŭ�������� mother Ŭ������ ���� ���� �մϴ�.
		 30, 50 ���ڰ��� �����մϴ�.
		 child���� �θ� Ŭ������ �ִ� ���� �޾� �ΰ��� ���ڸ� ���� ������� ����Ͻÿ�.
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
		//��� ���
		public void c_method() {
			int sum = this.aa * this.bb;
			System.out.println(sum);
			
		}
	}
	
	
}