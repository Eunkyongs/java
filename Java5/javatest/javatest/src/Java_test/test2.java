package Java_test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		pay p =new pay();
		p.set();
		int r1 = p.get();
		int r2 = p.get2();
		System.out.printf("�� ��ü�� �ݾ��� %d �̸� �� �ܰ� �ݾ��� %d �Դϴ�.",r1,r2);
	}
}
class pay implements test2_interface{
	private int total=0;
	private int balance = this.c_bank;
	private String msg[] = {"��ü�� �����մϴ�.[","��]���� ��ü�Ͻ� �ݾ��� �Է��� �ּ���:"};
	Scanner scan = new Scanner(System.in);
	@Override
	public void set() {
		
		int w = 0;
		int money;
		while(w<this.user.length) {
			System.out.println(msg[0]+this.user[w]+msg[1]);
			money = scan.nextInt();
			this.total +=money; // ��ü�ݾ�
			this.balance -=money; // �ܰ�
			w++;
		}
	}		
	@Override
	public int get() {
		return this.total ;
	}
	@Override
	public int get2() {
		return this.balance;
	}
}