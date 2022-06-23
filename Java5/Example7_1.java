package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example7_1 {

	public static void main(String[] args) {
		/*
		 응용문제: {"hong","lee","park","kim","kang","jang","ha","sa"};
		 abstract를 사용하여 setter getter 를 무조건 적용합니다.
		 메인에서는 해당 데이터를 외부클래스로 전달하고 최종 정보값만 배열로 생성하여 출력되도록 합니다. 
		 단, setter에서 배열 데이터중 4자리 미만(3자리까지)에 있는 배열만 새로 생성하여 getter로 값을 받아 메인에서 배열로 출력하시오.
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