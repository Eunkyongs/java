package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {
		payroll py = new payroll();
		py.start();
		int result[] = py.check();
		System.out.println("총 이체한 금액은 "+result[0]+"이며, 총 잔고금액은 "+result[1]+"입니다.");
	}

}

class payroll extends pay_abstract{
	String filename = null;
	int total = 0;
	int all_money = this.money; // 현재 통장에 있는 잔고 금액을 가져옴
	
	//입금파트
	public void input_sc(){
		Scanner sc = new Scanner(System.in);
		int c = 0 ;//반복문
		int m_in=0;//재무과 담당자가 입력하는 급여
		while(c<this.em_name.size()) {
			System.out.println("이체를 시작 합니다. ["+this.em_name.get(c)+"님]에게 이체하실 금액을 입력해 주세요:");
			m_in = sc.nextInt();
			this.total += m_in; // 이체된 전체 금액
			this.all_money -=m_in;
			c++;
		}
		sc.close();
		
	}
	
	
	@Override
	public void start() {
		try {
		this.filename = "C:\\javatest\\javatest\\src\\Java_test\\employee.txt";
		this.db();
		this.input_sc();
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	void db() throws IOException {
		this.em_name = new ArrayList<>(); // 빈배열
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
//		System.out.println(br.readLine()); //※주의사항 buffer임!!!
		String data = br.readLine();
		String user []=data.split(",");
		int ea =user.length; // 6
		int w =0;
		while(w<ea) {
			this.em_name.add(user[w]);
			w++;
		}
		br.close(); //버퍼리더 종료 
//		System.out.println(this.fr.getEncoding()); // 인코더 형식 확인
	}
	
	@Override
	public int[] check() {
		int aa = this.total;
		int bb = this.all_money;
		
		return new int [] {aa,bb};
	}
}