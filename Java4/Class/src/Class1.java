/*�θ�Ŭ���� �� �ڽ�(����)Ŭ���� ����*/
public class Class1 {

	public static void main(String[] args) {

		/*�θ� �ν��Ͻ��� ������ ���� ������ �ڽ� class�� ���� ȣ������ ����*/
		// class�ȿ� classȣ��ÿ��� �θ�Ŭ���� ���� ȣ�� �صΰ�, �ڽ�Ŭ���� ȣ�� �ؾ���
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); 
		// �θ�class.�ڽ�class �̸����� = �θ�Ŭ������.new �ڽ�Ŭ������(); => (�ν��Ͻ��� ����)   
		pc.c_box();
		
	}
}

class parents{ //�θ� class
	String a = "ȫ�浿"; //�θ�Ŭ���� �ʵ忡 �ִ� ��������.(this)
	String b;
	class  child{ //�ڽ�class
		int a = 20; //�ڽ�Ŭ���� �ʵ�. 
		
		public void c_box() { //�ڽ� method
			double c = 10.5; //c_box�ȿ����� ��밡���� ��������
			System.out.println(c); //�ڽĸ޼ҵ����� �������� ���
			System.out.println(this.a); // �ڽ�Ŭ���� ���� ��������
			System.out.println(parents.this.a); //�θ�Ŭ���� ���� �������� 
			System.out.println(parents.this.b); //�θ�Ŭ���� ���� �������� 
			// �θ�Ŭ���� �ʵ��� ��ü�� a ���� �θ�Ŭ������.this ����ؾ���. �׳� this���� �ڽ�Ŭ���� �ʵ忡 �ִ� a�� ����.
		}
		
	}
	
	public void p_box() { //�θ� method
			
//		class p_aaa{ // �޼ҵ�ȿ��� Ŭ���� �� �� ����. ���� ������� ����.
//		}
		String a ="�̼���"; // p_box �޼ҵ� �� ������ ��� ������ �������� ����
//		System.out.println(a); // this�� ���������� ��Ī. this.a�ϰԵǸ� �θ�Ŭ���� �ʵ��� ȫ�浿 ��µ�. �̼����� ����ϰ������ �׳� a �Է�.
		this.b = a; // �θ�Ŭ���� ���������� b �� �������� a ����
	}
}