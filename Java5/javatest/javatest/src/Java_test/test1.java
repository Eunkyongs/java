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
		System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3]를 선택해 주세요?");
		int user_num = this.scan.nextInt();
		String user_sub;
		int w = 0;
		switch(user_num) {
		
		case 1 ->{
			System.out.println("추가할 과목명을 입력하세요?");
			user_sub = this.scan.next().intern();
			while(w<this.subject.size()) {
				if(this.subject.get(w) != user_sub) {
					this.subject.add(user_sub);
					msg ="정상적으로 등록 되었습니다.";
					break;
				}else {
					msg ="이미 등록된 과목명이 있습니다.";
				}
				w++;
			}
			System.out.println(msg);
		}
		case 2->{
			System.out.println("삭제할 과목명을 입력하세요?");
			user_sub= this.scan.next();
			while(w<this.subject.size()) {
				if(this.subject.get(w) != user_sub) {
					msg ="해당 과목명이 없습니다.";
				}else {
					this.subject.remove(user_sub);
					msg ="정상적으로 삭제 되었습니다.";
				}
				w++;
			}
			System.out.println(msg);
		}
		case 3->{
			
		}
		default->{
			msg ="잘못된 입력 입니다.";
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