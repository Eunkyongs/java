import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) { // �ܺ� Ŭ���� ȣ�⸸ �մϴ�.
		//abstract ���빮��
		/*
		 1���迭���� �ֽ��ϴ�. �ش� �迭���� ��� ���� ���� ����մϴ�.
		 ��, abstract �⺻ void �̸��� sender ������ �ֽ��ϴ�.
		 ���� �� ����� sender���� ��� �ǵ��� �մϴ�.   
		 �迭�� abstract���� ����մϴ�.  
		 �迭 ������ : 6,13,22,9,12,64,32,47,39
		 */
		
		plus1 ps = new plus1();
		ps.sender();
	}

}

abstract class plus{
	public int a[]= new int[] {6,13,22,9,12,64,32,47,39}; 
	public int ea= this.a.length;
	
	abstract void sender();
}

class plus1 extends plus{
	@Override
	public void sender() {
		int w = 0;
		int total=0;
		while(w<this.ea) {
			total+=a[w];
			w++;
		}
	System.out.println(total);
	
	}
}