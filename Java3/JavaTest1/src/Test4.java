import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원하시는 구구단은 몇단인가요?");
		
		int user_input=scan.nextInt();
		
		int dw=1;
		int total;
		
		if(user_input < 0) {
			System.out.println("음수값은 구구단을 이용할 수 없습니다.");
		}else {
			do {
				total = user_input*dw;
				System.out.println(user_input+"*"+dw+"="+total);
				dw++;
			}while(dw<=9);
		}
		
		scan.close();
		System.exit(0);
		
	}

}
