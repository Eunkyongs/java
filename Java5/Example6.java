package Ex;

public class Example6 {

	public static void main(String[] args) {
		
		int data[] = {10,20,30,40,50}; // ���ù迭 . 
		
		order or =  new order(); 
		or.order_check(data); // setter�� ���� ����
		int result = or.order_recall(); // getter���� ���� ����� ������
		System.out.println(result); //���������
	}
}
abstract class abstr{ // �߻�Ŭ����
	//�ʵ� �ڷ��� ����
	//�߻� �޼ҵ� �����, abstract �ܾ public ��, �� �ƹ����� �ֵ� ��
	abstract public void order_check(int adata[]); //setter 
	public abstract int order_recall(); //getter
}

class order extends abstr{ //�߻�Ŭ���� ��� �� �����ص� �߻�޼ҵ� ��� �������̵�� �޾ƿͼ� ����ؾ���.
	//�ʵ弱��:1���̻��� �޼ҵ忡 ���� ����ؾ� �� ���
	private int total = 0; 
	@Override
	public void order_check(int[] adata) {//�迭�� �ݺ� + ¦������ ��� ������
		int ea = adata.length;
		int w = 0;
		while(w<ea) {
			if(adata[w] % 2 == 0) {
				this.total += adata[w];
			}
			w++;
		}
//		this.order_recall() // �ش������ ���� ������� ����.
	}
	
	@Override
	public int order_recall() { // �������� ����

		return this.total;
	}
	
}