import java.util.Arrays;

public class example3 {

	public static void main(String[] args) {
		/*
		 �迭+�⺻(Ŭ����)�޼ҵ� ����
		 product : ����,����,���,��,����,Ű��,�ٳ���,����
		 moneys: 35000,8000,4000,5500,3800,4400,11000,18900
		 ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
		 ��, �� �� ����� �ٳ����� �����ϰ� �� �����ݾ��� ����Ͻÿ�.
		 �����:75600
		 */
		
		String p [] = {"����","����","���","��","����","Ű��","�ٳ���","����"};
		int m [] = {35000,8000,4000,5500,3800,4400,11000,18900};
		
		example3 e= null;
		e = new example3();
		e.cart(p,m);
		
	}
	public void cart(String []item, int []cost) {
		int i_ea=item.length;//�迭����
		int w =0; // �ݺ�����
		int total=0; // �հ谪�����
		do {
			if(!item[w].equals("���") && !item[w].equals("�ٳ���")) { // item�迭�� �����Ͱ� ����� �ٳ����� �ƴѰ��
//				System.out.println(item[w]);���ǿ� �����ϴ� �� �������� ����ؼ� Ȯ��
				total += cost[w]; // ������ �����ϸ� total�� �� ����
			}
			w++;
		}while(w<i_ea); // �迭���̸�ŭ �ݺ�
		System.out.printf("�� ���� �ݾ��� %d�� �Դϴ�.",total); // ���,�ٳ��� ������ �հ� ���
	}
}