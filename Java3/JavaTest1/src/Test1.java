import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("on & off 중 하나를 입력해 주세요.");
		String user_input=scan.next();
		
		String msg=null;
		
		if(user_input.equals("on")) {
			msg="true";
		}else if(user_input.equals("off")) {
			msg="false";
		}else {
			msg="잘못된 입력입니다.";
		}
		
		System.out.println(msg);
		
		scan.close();
	}

}
