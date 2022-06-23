package java_test;

import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		basket b = new basket();
		b.basket_data();
		System.out.println("최종 결제금액은 "+ b.total+"원 입니다."); // basket class에 있는 total 값 불러올수 있음.
	}

}
class basket extends test3_data{
	static int total = 150; //메모리에 계속 상주하게
	public void basket_data() {
		String []user = { "사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8" };
	}
	
	
	
}