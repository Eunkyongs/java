package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//interface
public class Example8 {

	public static void main(String[] args) {
		box2 bx = new box2();
		bx.setter();
		bx.db();
		
		/*다음 결과처럼 각각의 배열로 나누어 진 것을 다음과 같이 배열로 정렬해 주시기 바랍니다.
		 결과출력: [홍길동=55, 이순신=60, 강감찬=80,유관순=95]
		 */
		
	}

}
//extends : abstract 상속, 일반class 상속
//implements : interface 상속

class box2 implements interface8,interface8_1{
	
//	private static final String User = null;
//	String user = this.user;
//	private int[] startnumber;
	
	private ArrayList<String> redata=null ;
	@Override
	public void db() {
		int w = 0;
		this.redata = new ArrayList<>();
		while(w<this.user.length) {
			this.redata.add(this.user[w]+"="+this.startnumber[w]);
			w++;
		}
		System.out.println(this.redata);
	}
	
	@Override
	public void setter() {
//		this.user="홍길동"; //인터페이스에서 선언한 변수를 강제로 변환 할수 없음
//		System.out.println(Arrays.toString(this.user)); //
//		System.out.println(Arrays.toString(this.startnumber)); //this.굵은글씨는 인터페이스에 있는 값. 변경불가
	}
	@Override
	public String getter() {

		return null;
	}
		
}
