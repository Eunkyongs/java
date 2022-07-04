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
		System.out.println("원하시는 작업을 선택하세요. 1.입력 2.검색 3.가장 긴 단어 찾기");
		int num = this.scan.nextInt();
		if(num==1) {
			this.input();
		}else if(num==2) {
			this.search();
		}else if(num==3) {
			this.longword();
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	public void input() {
		System.out.println("영어 단어를 입력해 주세요: ");
		String engword = this.scan.next().intern();
		this.eng.add(engword);
		System.out.println("입력하신 단어를 한국어로 입력해 주세요:");
		String korword = this.scan.next().intern();
		this.kor.add(korword);
		System.out.printf("영어단어: %s \n한국어: %s \n", engword,korword);
		word();
	}
	public void search() {
		System.out.println("검색할 단어를 입력해 주세요: ");
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