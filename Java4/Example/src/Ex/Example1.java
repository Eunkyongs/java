package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {
	public static void main(String[] args) {
		// �ܺ� class�� ����Ͽ� ���� ���μ����� �ۼ��Ͻÿ�.
		/*
		 ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�. ��, 2���� �迭�� �ϳ��� �迭�� ��ġ���� �մϴ�. �״�� �ߺ��� ���� �ϳ��� ó���� �ϼž� �մϴ�.
		 1�� DB : 11,22,33,44,55 
		 2�� DB : 8,10,11,19,44
		 ������ : [8,10,11,19,22,33,44,55] 
		 ��Ʈ Collections �̿�(��, ArrayList, LinkedList�� ����)
		 */
		/*
		 1. 1��DB, 2��DB �ߺ��� �� �� 2�� DB ����
		 2. 2�� DB�� 1�� DB�� �߰�
		 3. 1�� DB sort�� ����
		 */
		
//		array ar = new array();
//		ar.arr();
		System.gc();
		outclass ot = new outclass();
		ot.fliter();
	}
}
//������Ǯ��
class outclass{
	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;
	public void fliter() {
		Integer []a = { 11, 22, 33, 44, 55 };
		Integer []b = { 8, 10, 11, 19, 44 };
		this.a1 = new ArrayList<Integer>(Arrays.asList(a));
		this.b1 = new ArrayList<Integer>(Arrays.asList(b));
		
		
		//�ݺ����� ����ؼ� a1,b1�� ���� ���� ��
		int w = 0;
		do {
			int ww = 0;
			int z = this.b1.size();
			while(ww<z) {
				if(this.a1.get(w) == this.b1.get(ww)) {
					this.b1.remove(ww); // �ߺ��� ���� ���� �����ϰ�
					this.b1.add(ww,0); // �ߺ��� �� ������ �ڸ��� 0�� �Է�
//					break;
				}
				ww++;
			}
			w++;
		}while(w<this.a1.size());

		//b1�� ���� 0�� �ƴϸ� a1�� b1�� �� �߰�
		int t = 0;
		while(t<this.b1.size()) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}
			t++;
		}
		Collections.sort(a1);
		System.out.println(this.a1);
	}
}

/*

//���ڵ�
class array {

	public void arr() {
		Integer db1[] = { 11, 22, 33, 44, 55 };
		Integer db2[] = { 8, 10, 11, 19, 44 };
		ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(db1));
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(db2));
		ArrayList<Integer> ar3 = new ArrayList<>(Arrays.asList());
		
		
		
		
		int w = 0;
		int ea1 = ar1.size();

		while (w < ea1) {
					ar1.add(ar2.get(w));
					w++;
			}
		Collections.sort(ar1);

		System.out.println(ar1);
		
	}
}
*/