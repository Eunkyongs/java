
public class Do1 {

	public static void main(String[] args) {

		int a = 1; // �ʱⰪ
		do {
//			System.out.print(a+" ");
			a++; // ����,����
		} while (a < 11); // ������,���ᰪ

		/*
		 * ���빮�� 5~0���� ��µǴ� do~while���� �ۼ� �Ͻÿ�
		 */

		int b = 5;
		do {
		
//			System.out.printf("%d ", b);
			b--;
		} while (b>=0);
		
		
		//���� 2���� �� �޾Ƽ� �����ϴ� do~while �ݺ���
		int c = 50;//���ʰ�
		int d = 60;//���ᰪ
		do {
			System.out.print(c+" ");
			c++;
		}while(c<=d);
	
	}
}
