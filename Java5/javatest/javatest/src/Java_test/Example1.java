package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 응용문제: 사용자가 6개의 숫자를 입력하는 로또 프로그램 입니다.
		 프로세서 시작시 "숫자를 입력해 주세요: "라고 출력. 총 6번의 숫자를 입력받게 됩니다.
		 그리고 lotto.txt 결과를 가진 파일을 로드하여 사용자가 입력한 값과 결과를 비교하여 몇개를 맞췄는지 검토하는 프로그램 코드를 작성하시오.
		 
		 [결과예시]
		 로또 결과 :  총 3개의 번호를 맞추셨습니다.!
		 */
		
		lotto l = new lotto();
		l.load(); // 파일로딩파트
		l.usernum(); // 숫자입력파트
		l.compare(); // 비교파트
		int result =l.get(); 
		System.out.printf("로또결과 : 총 %d개의 번호를 맞추셨습니다!",result);
	}

}

class lotto {
	FileReader fr=null;
	ArrayList<Integer> u_num = new ArrayList<>(); //사용자 입력숫자 저장 배열
	ArrayList<Integer> f_num = new ArrayList<>(); //파일숫자 저장 배열
	private int count = 0;
	
	//파일로딩
	public void load() throws IOException {
		try {
		this.fr = new FileReader("C:\\EK\\EK\\src\\Java_test\\lotto.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		
		int w =0;
		while(w<6) { //br.readLine() != null 
			this.f_num.add(Integer.parseInt(br.readLine()));
			w++;
		}
		br.close();
//		System.out.println(this.f_num); // 파일에 저장된 숫자배열 확인
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//사용자 숫자 입력파트
	public void usernum() {
		Scanner scan = new Scanner(System.in);
		int w = 0;
		while(w<6) {
			System.out.println("숫자를 입력해 주세요 :");
			int usernum = scan.nextInt();
			this.u_num.add(w,usernum);
			w++;
		}
//		System.out.println("사용자 입력 숫자:"+this.u_num);//입력배열확인
	}
	
	//파일로드값 사용자입력값 비교
	public void compare() {
		for(int f =0; f <u_num.size(); f++) {
			for(int ff =0; ff<f_num.size(); ff++) {
				if(u_num.get(f) == f_num.get(ff)) {
					this.count++;
				}
			}
		}
	}
	//메인으로 리턴
	public int get() {
		return this.count;
	}
}
