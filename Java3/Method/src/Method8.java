import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
		/*���빮�� : ���� ���α׷��Ӱ� �ش� DB(DataBase)�� �� �� Ȧ������ ���� �� ������ �ް��� �մϴ�.
		 �ش� ������ ��� �� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�.*/
		
		odbc db = new odbc();
//		db.odd_ea = 100; // Ŭ���� �ȿ� private���� ������ ������ Ŭ���� �ܺο��� �������� ������ �� ����. 
		System.out.println(db.result());
	}
}
class odbc{
	private int num[];  //�迭���� ������� �ʵ��� ���
	private int odd_ea=0; //Ȧ���ϰ�� +1�� �����ϱ����� �ʵ� ������
	
	public odbc(){
		int odata[] = {15,22,17,14,32,35,19,33};
		this.num = odata;
	}
	
	public int result() {
		int w=0;
		int ea=this.num.length; // 8��
		while(w<ea) {
			if(this.num[w] % 2 == 1) {
//				System.out.println(this.num[w]); //Ȧ���� Ȯ��
				this.odd_ea++; // �迭�� ���Ұ� Ȧ���϶� 1�� ����
			}
			w++;
		}		
		return this.odd_ea; //�������� return ��Ŵ(Ȧ���� ������ ��ȯ)
	}
}