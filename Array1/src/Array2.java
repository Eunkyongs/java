
public class Array2 {

	public static void main(String[] args) {
		/*hong
		  kim
		  park
		  lee
		  jang
		  jung*/
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
//		System.out.println(id[4]);
//		int word = id[0].length(); // ������ �迭���� �ܾ� �����ľǿ��� ��� ()->������ ���� �����ľǽÿ��� ���
//		System.out.println(word);
		
		
		/*���빮��: �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�. �ش� �迭�� �� ����� ���̵� 3�ܾ� �̻� ��½�Ű�ÿ�.*/
	/*
		int w=0;
		while(w<=6) {
			int word = id[w].length();
			if(word>=4) {
				System.out.println(id[w]);
			}				
		w++;
		}
		
		//������ Ǯ��
		int member = id.length; // ��ü ȸ������ �ľ��ϱ� ����
		int w1=0;
		int word1; // ������ �迭 �������� ���� ���� �ľ�
		while(w1<member) {
			word1 = id[w1].length(); // ���� ���� �ľ�
			if(word1>3) {//���ܾ� �̻�(������)�� �����͸� ���
				System.out.println(id[w1]);
			}
			w1++;
		}
	*/
		/*���빮��: �迭�����ʹ� ������ ����
		  15 60 11 14 27 
		  ���� �����Ͱ��� ��� ���ؼ� ���� ������� ����Ͻÿ�.*/
		
		int num[]= {15,60,11,14,27}; //�迭����
		int f; // �ݺ����� ���
		int d = num.length; //�迭�� ������ ���� �ľ�. �迭�����Ͱ�����ŭ �ݺ��� ����������.
		int t=0; // ����������� ���
		for(f=0; f<d; f++) { // ���� �����Ҷ� �ε�ȣ >=, <= ����ϸ� �迭 ���� �ۿ� ���ڰ� Ƣ��� ���� �߻��Ҽ�����
			t += num[f]; //�迭���� �����Ͱ� ���� 
		}
		System.out.println(t);// ��������� ���
		
// ������ Ǯ��
		int data[] = {15,60,11,14,27};
		int total=0;
		int dw=0;
		int data_ea=data.length;
		do {
			total+=data[dw];
		dw++;	
		}while(dw<=data_ea-1);// <= ����ϰ������ �迭�� ���߱����� -1�ؼ� ���� ������
		System.out.println("�� �հ�: "+total);
		
		
		
		
	}

}
