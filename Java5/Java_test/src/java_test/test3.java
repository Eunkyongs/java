package java_test;

import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		basket b = new basket();
		b.basket_data();
		System.out.println("���� �����ݾ��� "+ b.total+"�� �Դϴ�."); // basket class�� �ִ� total �� �ҷ��ü� ����.
	}

}
class basket extends test3_data{
	static int total = 150; //�޸𸮿� ��� �����ϰ�
	public void basket_data() {
		String []user = { "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" };
	}
	
	
	
}