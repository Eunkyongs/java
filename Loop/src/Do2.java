
public class Do2 {

	public static void main(String[] args) {

		// 9*1~9*9 ���� ��µǴ� �ڵ� �ۼ�

		int a = 1; // �ݺ������ʰ�
		int b = 9; // ���������

		do {
			//����� �����갪 �޴� ���� �����ص� �ǳ�, �޸𸮻�뷮�� ������������.
			System.out.print(a * b + " ");
			a++;
		} while (a < 10);

		/*���빮��
		 ���� ������� ���� do~while������ �ڵ带 �ۼ��Ͻÿ�.
		 35 45 55 65 75 ->10�� ���� 
		 
		 5*7  5*9 5*11 5*13 5*15 -> 2�� ���� 5�°���
				 */
		/*		
		int c=5;
		int d=2;
		int e;
		
		do {
			e=(c+d)*5;
			System.out.print(e+" ");
			c++;
		}while(c<=15);
		*/
		
		//�������ڵ�
		int k = 3;
		int j;
		do {
		j= (k *10)+5;
	System.out.printf("%d ",j);
	
	k++;
	}while(k<8);
	
	}
}
