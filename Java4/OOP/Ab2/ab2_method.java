package Ab2;
import Ab.method_1; // package Ab���� main class�� �ε���


public class ab2_method  extends Ab.method_1{

	public static void main(String[] args) {
//		@Override =>main static void �������̵� �ؿ��� ��쿡�� �ּ����� ǥ���س�
		Ab.method_1 at = new Ab.method_1(); // ��Ű���� �ٸ� ���¿��� Ŭ���� or �޼ҵ� �ε��ϰ������ public ����ؾ� �ε尡����
		
		at.main(args); // main �޼ҵ� ����
		at.recall(); // public �޼ҵ� ����
		at.name(); // protected�޼ҵ� ����
		
	}

}
