import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class test4_1 {
	public static void main(String[] args) {
		word w = new word();
		w.word();
	}
}
class word{
	Scanner scan = new Scanner(System.in);
	ArrayList<String> eng = new ArrayList<>();
	ArrayList<String> kor = new ArrayList<>();
	public void word() {
		System.out.println("���Ͻô� �۾��� �����ϼ���. 1.�Է� 2.�˻� 3.���� �� �ܾ� ã��");
		int num = this.scan.nextInt();
		if(num==1) {
			this.input();
		}else if(num==2) {
			this.search();
		}else if(num==3) {
			this.longword();
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
	public void input() {
		System.out.println("���� �ܾ �Է��� �ּ���: ");
		String engword = this.scan.next().intern();
		this.eng.add(engword);
		System.out.println("�Է��Ͻ� �ܾ �ѱ���� �Է��� �ּ���:");
		String korword = this.scan.next().intern();
		this.kor.add(korword);
		System.out.printf("����ܾ�: %s \n�ѱ���: %s \n", engword,korword);
		word();
	}
	public void search() {
		System.out.println("�˻��� �ܾ �Է��� �ּ���: ");
		String findword = this.scan.next().intern();
		int w = 0;
		while(w<this.eng.size()) {
		if(this.eng.get(w)==findword) {
			System.out.println(this.kor.get(w));
		}else if(this.kor.get(w)==findword){
			System.out.println(this.eng.get(w));
		}
			w++;
		}
		word();
	}
	public void longword() {
		int g=0;
		
		for(int f=0; f<this.eng.size(); f++) {
			if((this.eng.get(g).length()<this.eng.get(f).length()) == true) {
				System.out.println(this.eng.get(f));
			}
		}
	}
}