

public class For1 {

	public static void main(String[] args) {
		// �ݺ��� : �����͸� �ϰ������� �Է�, ����� �� �� �ֵ��� �ϴ� ����.

		int z = 1;
		// z++; //+1 ���� : ��� �� +1 ����
		// z--; //-1 ���� : ��� �� -1 ����
		// ++z; //+1 ���� : +1 ���� �� ���
		// --z; //-1 ���� : -1 ���� �� ���
		 System.out.println(z);

		// for(�ʱⰪ; ������(���ᰪ); �����Ǵ� ����)
		for (int a = 0; a < 10; a++) { // a��� ���ڸ� 0���� 9���� 1�� �����ϰ� �ݺ���� int a = 0; :�ʱⰪ a++ : a�� 1����
//			System.out.println(a);
		}

		int b;
		for (b = 5; b <= 10; b++) {
//			System.out.println(b);
		}

		int c;
		for(c = 10; c>3; c--) { // -- ����, �������� �߸��ϸ� �������� ���Ѵ�� �ݺ��Ǵ� ��� �߻�. 
			//���ǻ��� ������ c<3���� �߸� �����ϸ� 0~�������� ���� ���������� ��Ȳ�� �߻���
//			System.out.println(c);
		}
		
//		���빮�� : 20���� 27���� ���
		
		int d;
		for(d=20; d<=27; d++) {
//			System.out.print(d); //for�� ���� �ݺ��������� ���� ������� print�� ���
		}
		
//		���빮��: 39~21���� ���
		
		int e;
		for(e=39; e>20; e--) {
//			System.out.print(e+" ");
		}
//		1~10���� �������. ����2���̿�
		int aa; //�ʱⰪ
		int bb = 10; //����(����)��
		
		for(aa = 1; aa<=bb; aa++) {
//			System.out.print(aa+" ");
				}
		
/*	���빮�� ���� 2���� �̿��Ͽ� ���� �����͸� ����Ͻÿ�
	55~4���� ����մϴ�.*/ 
		int kk;
		int ll = 4;
		for(kk=55; kk>=ll; kk--) {
//			System.out.print(kk+" ");
		}
		
		
		
		
		
	}

}