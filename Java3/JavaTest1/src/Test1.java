import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("on & off �� �ϳ��� �Է��� �ּ���.");
		String user_input=scan.next();
		
		String msg=null;
		
		if(user_input.equals("on")) {
			msg="true";
		}else if(user_input.equals("off")) {
			msg="false";
		}else {
			msg="�߸��� �Է��Դϴ�.";
		}
		
		System.out.println(msg);
		
		scan.close();
	}

}
