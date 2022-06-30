import java.util.Scanner;

public class test2_1 {

	public static void main(String[] args) {
		
		user_num un = new user_num();
		un.user_input();
		int result = un.sum();
		System.out.printf("입력하신 숫자의 총 합은 %d 입니다!",result);
	}

}

class user_num{
	int total = 0;
	
	public void user_input() {
		Scanner scan = new Scanner(System.in);
		int w=1;
		int in_num;
		while(w<=8) {
			System.out.println(w+"번째 숫자를 입력해 주세요.");
			in_num = scan.nextInt();
			this.total += in_num;
			w++;
		}
	}
	
	public int sum() {
		return this.total;
	}
	
	
}
