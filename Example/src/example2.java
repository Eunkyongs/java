import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		/* 
		 �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 product : ����,����,���,��,����,Ű��,�ٳ���,���� �� 
		 ����, ��, Ű�� �� �����Ͽ����ϴ�. 
		 �ش� ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ��Ͻÿ�.	
		 ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ� �ݺ����� Free�Դϴ�.
		 ���:[����,���,����,�ٳ���,����]
		 */
		
		String product[] = {"����","����","���","��","����","Ű��","�ٳ���","����"}; // �ε��� 1,3,5 ����
		
		example2 e = null;
		e = new example2();
		e.fruit(product);
		basket(product);
	}
	public void fruit(String []data) {
//		System.out.println(Arrays.toString(data)); // �迭 �Ѿ���°� Ȯ��
		String [] list = new String[5]; // ������ ������ �����ϰ� �ٽ� ������ �迭
		int list_ea = list.length;
		int data_ea = data.length; // �迭����Ȯ��
		//		System.out.println(data_ea); �迭���� ����ؼ� ����Ȯ��
		int c = 0; //���ο�迭�� �ε�����ȣ �ο����� ī����
		int w = 0; // �ݺ������ 
		while(w<data_ea) {
//			System.out.println(data[w]);
			if(w%2==0 && w<data_ea || data[w].equals("����")) {
				list[c]=data[w];
			c++;
			}
			w++;
		}
		System.out.println(Arrays.toString(list));
	}
	
	//������ Ǯ��
	public static void basket(String pd[]) {
		int ea = pd.length;
		int no = 5;
		int idx = 0;
		String newproduct [] = new String [no];
		for(String p : pd) {
			if(!p.equals("����") && !p.equals("��") && !p.equals("Ű��")) {
				newproduct[idx] = p;
				idx++;
			}
		}
		System.out.println(Arrays.toString(newproduct));
	}
}
