import java.util.Arrays;

public class example1 {

	public static void main(String[] args) {
		/* �迭+�⺻(Ŭ����)�޼ҵ� ���� 
		   1���迭�� ������ ���� ���� �ֽ��ϴ�.
		   �迭����Ʈ 22,33,44,55,66,77,88,99 �̸�
		   �ش� ��ü���� ��� ���� �� �հ谪�� ������ �޼ҵ�� ó���ǵ��� �մϴ�.
		   ��, �ݺ����� ������ do~while������ �ۼ��մϴ�.		  
		 */
		
		
		int num[]= {22,33,44,55,66,77,88,99};
		
//		a(num); // �迭num�� a�޼ҵ�� ����. static ����.
		example1 ex = null;  // void�϶� ���
		ex = new example1();
		ex.a(num);
	}
	
	//void = ��ü���� + �ν��Ͻ�(�޸�)���
	public void a(int[] n){
//	System.out.println(Arrays.toString(n));//main�޼ҵ��� �迭�� �Ѿ���� Ȯ��	
		int n_ea=n.length; //�迭����Ȯ��
		int w=0; // �ݺ������
		int t=0;//�հ谪�����
		do {
			t+=n[w];
			w++;
		}while(w<n_ea);
		System.out.printf("�հ� : %d",t);
		
	}

}
