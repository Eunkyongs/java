
public class While1 {

	public static void main(String[] args) {
		int a = 1; //while�� ���۰�
		while(a<11) { // While(�����ǹ���){ // ������, ���ᰪ
			
//			System.out.print(a+",");
			
			a++;//���� or ����
		}
		int b = 10;
		while(b >=5) {
//			System.out.print(b+",");
			b--;
		}
		/* ���빮�� : ���� ������ while������ �ۼ��Ͻÿ�.
		 22~16���� ���ڸ� ����Ͻÿ� 
		 */		
		int c=22;
		while(c>=16) {
//			System.out.print(c+",");			
//			System.out.printf("%d ",c);
			c--;
		}
		//�ǹ������� while������ �̷������� ���
		int aa=1; // �ʱⰪ
		int bb=10;// ���ᰪ
		while(aa<=bb) { //�ݺ����� ����
//			System.out.printf("%d ",aa);
			aa++;//����
		}
		
		/*
		 ���빮��: ����2���� �̿��Ͽ� ������ �°� ���� ����Ͻÿ�.
		 99~47���� ���
		 */
		int d=99; // �ʱⰪ
		int e=47; // ���ᰪ
		while(d>=e) { //���ǹ���
			System.out.printf("%d ",d);
			d--; // ����
		}
		
	}

}
