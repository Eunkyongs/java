import java.util.Arrays;

public class example5 {

	public static void main(String[] args) {
		/* 2���迭 + �⺻(Ŭ����)�޼ҵ� ����
		 ��ϵ� ���� vip���� ����Ʈ�� ����Ͻÿ�.
		 
		 user_list : ȫ�浿, �̼���, ������, ������, �������, ������, ����屺
		 user_level : gold, vip, guest, gold, vip, vip, guest
		 
		 ��� ���: �̼���, �������, ������,		 
		 
		 [�׷��ε���][�������ε���]
		 */
		String data[][] = {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"gold","vip","guest","gold","vip","vip","guest"}			
		};
		example5 e = null;
		e= new example5();
		e.aa(data);
	}
	public void aa(String user[][]) {
		int ea1=user.length; // �� �迭�� ���� = 2
		int ea2=user[0].length; //�迭�� ���� ���� = 7
		int f;
		/*
		for(f=0; f<ea2; f++) {
			if(user[1][f].equals("vip")) { //2���迭�� �ι�° �迭�� ���Ұ� vip�� ������
				System.out.print(user[0][f]+", "); // 2���迭�� ù��° �迭�� �̸� ���
			}
			
		}
		*/
		int w = 0;
		while(w<ea1) {
			int ww=0;
			while(ww<ea2) {
				if(user[w][ww].equals("vip")) {
				System.out.println(user[0][ww]);
					
				}
				
				
				ww++;
			}
			w++;
		}
		
		
		
	
		
	}

}

