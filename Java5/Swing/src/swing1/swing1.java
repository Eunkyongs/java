package swing1;

public class swing1 {

	public static void main(String[] args) {
		// wrapper class (BOX����)
		//float, char, byte, long, short (�⺻Ÿ��)
		//wrapper class : Byte, Integer, Long, Double
		
		Integer a = new Integer(20); //new Integer(�ڽ�) 
		int b = new Integer(20); //int �����ϸ� �ڽ̻��°� ��ڽ����� �ٲ�
		
		if(a==b) { //���ϴ� �� ������ ��� �ڽ̻��¸� �����ڰ��ƴ� equals ����ؼ� ���� ���ؾ���. 
			System.out.println(a+b);
		}
		
		Integer no1 = 10; // ��ڽ�
		Integer no = new Integer(99); // �ڽ�
		//int aa = no; // ��ڽ�(�ڵ�) �̷��� ��ڽ��� ���� �����
		Integer bb= no.intValue();//��ڽ�. �̷��Դ� �� ������� ����
		System.out.println(bb);
		
		/*�عڽ̰� �ڽ��� ���Ҷ��� equals�� ����ؾ߸� �񱳰� �̷����*/
		
	}

}
