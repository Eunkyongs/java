
public class Class1 {// mainŬ����

	public static void main(String[] args) { //�Ϲ� main �Լ�
		
		Adata a = new Adata(); // Adata Class ���� �ε�
		Bdata b = new Bdata(); // Bdata Class ���� �ε�
		System.out.println(a.aa); // Adata Class�ȿ� aa��� ���� �ڷ��� ��ü���� ������. 
		// �ش�Ǵ� Ŭ������ �ε�, Ŭ�����ȿ� ������ .���� ����
		System.out.println(b.aa);// Bdata Class�ȿ� aa��� ���� �ڷ��� ��ü���� ������. 
		
		Cdata c = new Cdata(); // �ε��Ҷ� ����ϴº������ Ŭ������ ����� ������ ������ �ȵ�
		/*Cdata���� ���� �ڷ����� ������. => ���� �⺻�Լ����� ���� �Է��� ��, ��ü���� �޾� ��������� �����(�ν��Ͻ� ����)*/
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa + c.bb;
		System.out.println(c.cc);
//		System.out.println(c.cc);
		
		
	}

}
//aa�� ������ �ٸ� Ŭ������ �ֱ� ������ �ߺ����� �ʽ��ϴ�.
class Adata{// mainŬ���� �۵� �� ����� �������� �۵�
	String aa = "ȫ�浿"; // Adata class�� ���� ����.
}

class Bdata{
	String aa = "�̼���";
}

class Cdata{
	//�ش� Cdata�� �ִ� Ŭ�������� �ڷ��������� ������ ���� �մϴ�.
	//��, ��� ������ �Լ��� ���� ��Ȳ�̹Ƿ� ���� �Ǵ� sysout�� ������� ����.
	int aa; 
	int bb;
	int cc;
//int cc = aa + bb;
}