
public class Over {

	public static void main(String[] args) {
//		pt p = new pt();
//		p.display();
		cd c = new cd();
		c.display("���� ���� �� ���"); // �����ε�
		c.display(); // �������̵�
	}
		

}
/*
 �����ε�(Overloading) : ���ο� �޼ҵ带 �����ϴ� ���� ���մϴ�.
 �������̵�(Override) : �θ� Ŭ�������� ��� ���� ���� �޼ҵ带 ����ϴ� ���� ���մϴ�. 
 */
class pt {
	public void display() {
		System.out.println("�ܺ� ���� ��");
	}
}

class cd extends pt{
	//aaaa() �޼ҵ�� �������̼��� ������� ����. �θ�class���� �������� �ʾ���.
	
	/*
	@Override
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	*/
	@Override // �������̼�(ǥ��) ���� �߻��� Ȯ�ο� (�������̵忡�� ���). �θ� Ŭ������ ���� �޼ҵ忡 ����ϸ� ���� 
	public void display() { // �������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����??");
		super.display(); // �θ��ִ� ���� �Ӽ� �޼ҵ尪�� �����ö� ����մϴ�.
	}
	public void display(String msg) { // �����ε�
		System.out.println(msg);
	}
	
}