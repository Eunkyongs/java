public class Datatype {

	public static void main(String[] args) {
		//String : ���� " " ������ ���.
		String a = "1234"; // "" �ȿ� �ԷµȰ��� ������ ���ڷ� �ν�. 1234�� �������� �ֵ���ǥ�ȿ� ���� ���ڷ� �ν�
		System.out.println(a);
		
		/* ������*/
		//�ڷ����¸� ũ�������� �޸𸮸� ���̻���ϰԵ�. ������ �ڷ��� ��� �ʿ�
		byte b = 100; // byte : -128 ~ 127
		System.out.println(b);

		short c = 32767; // short : -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 2147483647; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 9000000000000000000L; // long ���� ���� L ����ؾ���.
		// long : 9,000,.... 0�� 18�� �⺻ �޸� �Ҵ翡�� �߰� ����� ���ɹ����� �þ.
		System.out.println(f);
		/*������ ��*/
		
		/*�Ǽ���*/
		float z = 3.5f; // 3.40248000000+38 (���ڳ��� f�� ������ ��� �ؾ���.)
		System.out.println(z);

		double k = 44.142465; // 1.784+308 (���ڳ��� d ��/�� ��ε�)
		// ���� double �ڷ��� ���� ���� d�� �ٿ����ϳ�, ������ ���� �Ҽ��� �ν� �ߵ�.
		System.out.println(k);
		/*�Ǽ��� ��*/
	}

}
