
public class Exception2 {

	public static void main(String[] args) {
		try {
//			test(); // �޼ҵ� ȣ�� ��ü error. Exception���� �������.
			Exception2 ex = new Exception2();
			String a ="ȫ�浿2";
			ex.test(a);
		}
		catch(Exception z) {
			System.out.println(z);
		}
		
	}
	public void test(String b) throws Exception, NumberFormatException {
		//throws�� main �޼ҵ忡�� ����ó�� ���� �ش� �޼ҵ带 ȣ�� �� ��츦 �������� ���.
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c; //����ó�� ����� ���� ���� main�޼ҵ�� �ٽ� return��Ŵ.
		// return�� �����ϰ� �ڵ��� ���� �Ʒ��ٿ� �ۼ��ؾ���. return�� ����� ������ ������ �ֽ��ϴ�.
	}
}
