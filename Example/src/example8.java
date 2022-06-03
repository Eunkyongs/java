import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/*
		  다음 사용자 복권 관련 프로그램을 요청하였습니다.
		  사용자가 총 5개의 숫자를 입력하게 됩니다.
		  "1~46번 사이의 숫자를 입력해 주세요:"
		  사용자가 입력한 5개 숫자를 배열로 생성합니다. (main에 처리)
		 
		  외부 class를 이용하여 PC가 직접 당첨번호 5개를 랜덤하게 뽑아냅니다. 
		  PC가 뽑은 5개의 숫자를 배열로 생성합니다.(외부 class method로 생성)
		  
		  별도의 결과 method를 하나 더 생성하여 사용자가 입력한 5개의 배열데이터와 
		  PC가 뽑은 배열 데이터를 해당 method로 전달하여, 출력하시면 됩니다.		  
		 
		 단, 모든 사용하는 반복문은 무조건 do~while문으로 작성합니다.
		 
		 결과: 사용자뽑은 5개숫자
		 	  pc가뽑은 5개숫자
		 */
		number n=new number();
		Scanner scan = new Scanner(System.in);
		System.out.println("1~46번 사이의 숫자를 입력해 주세요:");
		int u [] = new int [5];//사용자입력숫자 저장할 배열
		int dw=0;//반복문 및 사용자입력숫자 저장할때 인덱스번호 부여에 사용
		do {
			int user_num = scan.nextInt();
			u[dw]=user_num;
			dw++;
		}while(dw<5);
//		System.out.println(Arrays.toString(u)); //사용자입력한 숫자가 배열에 잘 들어갔는지 확인
		n.pc(u);//number클래스에 pc메소드로 사용자 입력값 배열 보냄
	}
}
class number{
	public void pc(int un[]) {
//		System.out.println(Arrays.toString(un));//사용자 입력값 잘 넘어왔는지 확인
		
		Random r = new Random(); //random 유틸사용
		int [] ran=new int[5];//랜덤유틸로 생성된 숫자 저장할 배열
		int w = 0;//반복문 및 랜덤유틸로 생성된 숫자저장시 인덱스번호 부여에 사용 
		do{
			ran[w] = (r.nextInt(45)+1); //랜덤유틸로 생성된 숫자범위 1~46
			w++;
		}while(w<5);
//		System.out.println(Arrays.toString(ran)); // 배열에 숫자 잘 들어갔는지 확인
		r=null;
		result(un,ran);//result메소드로 사용자입력값과 랜덤생성숫자보냄
	}
	public static void result(int u[], int p[]) {
		System.out.println("사용자가 뽑은 숫자: "+ Arrays.toString(u));
		System.out.println("PC가 뽑은 숫자: "+Arrays.toString(p));
	}
}