package Java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		subject sj = new subject();
		sj.choice();
		ArrayList<String> result = sj.getter();
		System.out.println(result);
	}
}
class subject extends test1_abstract{
	private ArrayList<String> subject = new ArrayList<>(Arrays.asList(this.basesub));
	private Scanner scan = new Scanner(System.in);
	private String msg;
	@Override
	public void choice() {
		System.out.println("�����߰�[1], �������[2], ���񸮽�Ʈ Ȯ��[3]�� ������ �ּ���?");
		int user_num = this.scan.nextInt();
		String user_sub;
		int w = 0;
		switch(user_num) {
		
		case 1 ->{
			System.out.println("�߰��� ������� �Է��ϼ���?");
			user_sub = this.scan.next().intern();
			while(w<this.subject.size()) {
				if(this.subject.get(w) != user_sub) {
					this.subject.add(user_sub);
					msg ="���������� ��� �Ǿ����ϴ�.";
					break;
				}else {
					msg ="�̹� ��ϵ� ������� �ֽ��ϴ�.";
				}
				w++;
			}
			System.out.println(msg);
		}
		case 2->{
			System.out.println("������ ������� �Է��ϼ���?");
			user_sub= this.scan.next();
			while(w<this.subject.size()) {
				if(this.subject.get(w) != user_sub) {
					msg ="�ش� ������� �����ϴ�.";
				}else {
					this.subject.remove(user_sub);
					msg ="���������� ���� �Ǿ����ϴ�.";
				}
				w++;
			}
			System.out.println(msg);
		}
		case 3->{
			
		}
		default->{
			msg ="�߸��� �Է� �Դϴ�.";
			System.out.println(msg);
		}
		}
		scan.close();
		
	}		
	@Override
	public ArrayList<String> getter() {
		return this.subject;
	}
}