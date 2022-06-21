package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		/*
		 응용문제: {"hong","lee","park","kim","kang","jang","ha","sa"};
		 abstract를 사용하여 setter getter 를 무조건 적용합니다.
		 메인에서는 해당 데이터를 외부클래스로 전달하고 최종 정보값만 배열로 생성하여 출력되도록 합니다. 
		 단, setter에서 배열 데이터중 4자리 미만(3자리까지)에 있는 배열만 새로 생성하여 getter로 값을 받아 메인에서 배열로 출력하시오.
		 */
		
		String [] name = {"hong","lee","park","kim","kang","jang","ha","sa"};
		cc c = new cc();
		c.set(name);
		ArrayList<String> re= c.get();
		System.out.println(re);
		
	}

}

abstract class pp{
	
	public abstract void set(String[] nd);
	public abstract ArrayList<String> get();
	
}

class cc extends pp{
	String[] a;
	ArrayList<String> ar;
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
	}
	@Override
	public ArrayList<String> get(){
		return this.ar;
	}
}
