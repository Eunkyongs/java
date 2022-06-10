import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		/*
		 extends를 사용하여 다음 결과에 대한 코드를 작성하시오.
		 숫자 두개를 입력합니다.
		 두개의 숫자를 확인하여 다음과 같이 체크합니다.
		 1.첫번째 숫자가 두번째 숫자보다 클 경우
		 2.첫번째 숫자보다 두번째 숫자가 클 경우
		 3.첫번째 숫자가 두번째 숫자랑 같은 경우
		 
		 2.첫번째 숫자가 작을 경우 : 해당 두개의 값을 합친 결과값 출력 
		 1.두번째 숫자가 작을 경우 : 해당 범위 만큼 숫자를 모두 더한 결과값을 출력
		 3.첫번째와 두번째 숫자가 같을 경우 : "해당 값이 같습니다." 라고 메세지 출력
		   
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int num2 = scan.nextInt();

		n_ck2 n2 = new n_ck2();
		n2.aa(num1,num2);
		n2.bb();
		
		//선생님풀이용
//		int a = 10;
//		int b = 6;
//		exam2 ex= new exam2();
//		ex.exam1_method(a,b);
//		int result = ex.exam2_method();
//		System.out.println("최종 결과값"+result);
		
		scan.close();
		System.exit(0);
		
	}
}

class n_ck1{
	private int n1;
	private int n2;
	
	protected int r;
	
	protected int ck;
	protected String m2 = "해당값이 같습니다.";
	public void aa(int nn1, int nn2) {
		this.n1 = nn1;
		this.n2 = nn2;

		if(this.n1 < this.n2) { //첫번째 숫자가 작을경우
			this.r=this.n1+this.n2;
			this.ck = 1;
		}else if(this.n1 > this.n2) { // 두번째 숫자가 작을경우
			int f;
			for(f=this.n2; f<=this.n1; f++) {
				this.r+=f;
			}
			this.ck = 2;
		}else if (this.n1 == this.n2) { // 두 값이 같을경우
			this.ck =3;
		}
	}
}
class n_ck2 extends n_ck1{
	public void bb() {
		switch (this.ck) {
		
		case 1:
			System.out.println(this.r);
			break;
		
		case 2:	
			System.out.println(this.r);
			break;
		
		case 3:
			System.out.println(this.m2);
			break;
		}
	}
}

//선생님 풀이

class exam1{
	private int no1;
	private int no2;
	protected int ex_sum;
	public void exam1_method(int ex1_no, int ex2_no) {
		this.no1 = ex1_no;
		this.no2 = ex2_no;
		
		if(ex1_no>ex2_no) {
			this.ex_sum = ex1_no + ex2_no;
		}else if(ex1_no < ex2_no) {
			exam2_loop();
		}else {
			System.out.println("해당 값이 같습니다."); // 출력
		}
	}
	public void exam2_loop() {
		int w = this.no1;
		while(w<=this.no2) {
			this.ex_sum += w;
			w++;
		}
	}
	
}
class exam2 extends exam1{
	public int exam2_method() {
		return this.ex_sum;
	}
	
}

