import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num= scan.nextInt();
		
		String msg;
		if(num>60) {
			msg="해당 숫자는 60까지만 입력이 되어야 합니다.";	
		}
		else {
			if(num %2==0) {
				msg= "짝수 입니다.";
			}else {
				msg="홀수 입니다.";
			}
		}
		System.out.printf("입력하신 숫자는 %d, %s",num,msg);

	scan.close();
	}

}
