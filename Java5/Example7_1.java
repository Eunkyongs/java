package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example7_1 {

	public static void main(String[] args) {
		/*
		 ���빮��: {"hong","lee","park","kim","kang","jang","ha","sa"};
		 abstract�� ����Ͽ� setter getter �� ������ �����մϴ�.
		 ���ο����� �ش� �����͸� �ܺ�Ŭ������ �����ϰ� ���� �������� �迭�� �����Ͽ� ��µǵ��� �մϴ�. 
		 ��, setter���� �迭 �������� 4�ڸ� �̸�(3�ڸ�����)�� �ִ� �迭�� ���� �����Ͽ� getter�� ���� �޾� ���ο��� �迭�� ����Ͻÿ�.
		 */
		newclass nc = new newclass();
		nc.setter();
		ArrayList<String> aa=nc.getter();
		System.out.println(aa);
	}
}
class newclass{
	ArrayList<String> ar2 = new ArrayList<>();
	
	public void setter() {
		String [] name = {"hong","lee","park","kim","kang","jang","ha","sa"};
		ArrayList<String> ar = new ArrayList<>(Arrays.asList(name));
		for(String nm : ar) {
			if(nm.length() <4) {
				ar2.add(nm);
			}
		}
	}
	public ArrayList<String> getter(){
		return ar2;
	}
}