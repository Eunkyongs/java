
public class Test4 {

	public static void main(String[] args) {
//		loadbox b = new loadbox();
//		b.name();
//		b.name2();
		
		/*���빮�� �ܺ� class�� �̿��Ͽ� �ش� �޼ҵ� ���� ����մϴ�.
		 �ܺ� class�� books�̸�, �ȿ� �޼ҵ�� �� 3���� �޼ҵ尡 ���� �մϴ�.
		 �޼ҵ���� ���� book1, book2, book3���� �̷���� �ֽ��ϴ�.
		 book1 ȣ��� "book1�޼ҵ�"��� ���
		 book2 ȣ��� "book2�޼ҵ�"��� ���
		 book3 ȣ��� "book3�޼ҵ�"��� ���
		 */
		
		books bk =new books();
		bk.book1(35);
		bk.book2("�ٵ���");
		bk.book3("ȫ�浿",40);
//		System.out.println(bk.book4());
		/*return�޼ҵ忡 ���� 9�� 20�� �μ������� �����մϴ�.
		 �ش� �ΰ��� ���� ���Ͽ� ������� ����Ͻÿ�.*/
		
		int result = bk.book4(9,20); //booksŬ������ book4�޼ҵ�� 9,20�̶�� �μ��� ���� �� ���� ���� 
		System.out.println(result);
		/*book5���� ���ڸ� �ϳ� �μ������� �����մϴ�.
		 �ϳ��� �μ����� ���� book5������ ������ 100,200�� ���� ���� �μ����� ���Ͽ� ������� ����Ͻÿ�
		 �μ���:4
		 (100+200)*4
		 ���:1200
		 */
		bk.book5(4);
	}

}
class books{
	String zz ="����";
	public int a1,a2;

	public void book1(int z) {
//		System.out.println(z+this.zz);
	}
	public void book2(String y) {
//		System.out.println(y+this.zz);
	}
	public void book3(String x, int x1 ) {
//		System.out.println(x+","+x1+this.zz);
	}
	public int book4(int k, int j) {
//		String ka="ȫ�浿"; // int �޼ҵ� �ȿ��� string �ƿ� ����� ����.�ݴ��쵵 ����. �����ص� ��ȯ�� ���� ������
		int dd = k*j; // �μ��������� ���� ���� ������ �¿��� return��������
		return dd ; // ���� ��ȯ�� ����! sysout ��� �Ұ�
	}

	public void book5(int a1) {

	}
	
}




class loadbox{//class�� ������ method�� �־�� �մϴ�.
	
	public void name() {
		System.out.println("test");
		
	}
	
	public void name2() {
		int a =123;
		System.out.println(a);
	}
	
}