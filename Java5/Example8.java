package Ex;

import java.util.Arrays;

//interface
public class Example8 {

	public static void main(String[] args) {
		box2 bx = new box2();
		bx.setter();
		
		/*���� ���ó�� ������ �迭�� ������ �� ���� ������ ���� �迭�� ������ �ֽñ� �ٶ��ϴ�.
		 ������: [ȫ�浿=55, �̼���=60, ������=80,������=95]
		 */
		
	}

}
//extends : abstract ���, �Ϲ�class ���
//implements : interface ���

class box2 implements interface8,interface8_1{
//	String user = this.user;
	@Override
	public void db() {
		
	}
	
	@Override
	public void setter() {
//		this.user="ȫ�浿"; //�������̽����� ������ ������ ������ ��ȯ �Ҽ� ����
		System.out.println(Arrays.toString(this.user)); //
		System.out.println(Arrays.toString(this.startnumber)); //this.�����۾��� �������̽��� �ִ� ��. ����Ұ�
	}
	@Override
	public String getter() {

		return null;
	}
		
}