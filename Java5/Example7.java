package Ex;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		/*
		 ���빮��: {"hong","lee","park","kim","kang","jang","ha","sa"};
		 abstract�� ����Ͽ� setter getter �� ������ �����մϴ�.
		 ���ο����� �ش� �����͸� �ܺ�Ŭ������ �����ϰ� ���� �������� �迭�� �����Ͽ� ��µǵ��� �մϴ�. 
		 ��, setter���� �迭 �������� 4�ڸ� �̸�(3�ڸ�����)�� �ִ� �迭�� ���� �����Ͽ� getter�� ���� �޾� ���ο��� �迭�� ����Ͻÿ�.
		 */
		
		String [] name = {"hong","lee","park","kim","kang","jang","ha","sa"};
		cc c = new cc();
		c.set(name);
		
	}

}

abstract class pp{
	
	public abstract void set(String[] nd);
	public abstract String[] get();
	
}

class cc extends pp{
	String[] a =null;
	ArrayList<String> ar = null;
	@Override
	public void set(String[] nd) {
		int ea = nd.length;
		this.ar = new ArrayList<>();
		for(int f=0; f<ea; f++) {
			int ea1 = nd[f].length();
			if(ea1<4) {
				ar.add(nd[f]);
			}
		}
		
		int w = 0;
		while(w<ar.size()) {
		this.a[w] += ar.get(ea);
		w++;
		}
	}
	@Override
	public String[] get() {
		return this.a;
	}
}