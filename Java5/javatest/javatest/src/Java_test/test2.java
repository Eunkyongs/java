package Java_test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		pay p =new pay();
		p.set();
		int r1 = p.get();
		int r2 = p.get2();
		System.out.printf("총 이체한 금액은 %d 이며 총 잔고 금액은 %d 입니다.",r1,r2);
	}
}
class pay implements test2_interface{
	private int total=0;
	private int balance = this.c_bank;
	private String msg[] = {"이체를 시작합니다.[","님]에게 이체하실 금액을 입력해 주세요:"};
	Scanner scan = new Scanner(System.in);
	@Override
	public void set() {
		
		int w = 0;
		int money;
		while(w<this.user.length) {
			System.out.println(msg[0]+this.user[w]+msg[1]);
			money = scan.nextInt();
			this.total +=money; // 이체금액
			this.balance -=money; // 잔고
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