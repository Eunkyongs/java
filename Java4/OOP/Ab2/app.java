package Ab2;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		members mb = new members();
//		mb.opp();
//		mb.oop();
		
		//(�θ�)=(�ڽ�)=>�������̽� �������� ����� �������̵常 ȣ����(����ȯ)
//		members mb = new members(); // �ڽ�class����
//		app_data2 ap = mb;//�������̽� ����(Ŭ����->�������̽� ����)
		
		app_data2 ap = new members();
		members mb2 = (members)ap; // �ڽ�class�� �������̽��� �纯ȯ(�������̽�->Ŭ���� ��ȯ)		
		
//		ap.opp();
//		ap.opp2();
//		mb.oop(); // ��� �θ𿡼� �����°� �ƴϰ� ���� ����޼ҵ�� ����� ȣ���ϸ� ���x ���� ȣ���ؾ� ��밡����.
	}

}
/*
 class members implements app_data1{
	 //app_data1�� ������ �ڷ��� �����ϴ� ���
	 @Override
	public void user_join() {
		 System.out.println("test");
	}
 }
*/
 
 class members implements app_data2 {
	@Override
	public void opp() {
		System.out.println("Test");
	}
	@Override
	public void opp2() {
		System.out.println("test2");
	}
	
	public void oop() { // ���� ȣ���ؾ� ��밡��
		System.out.println("test3");
	}
	
}