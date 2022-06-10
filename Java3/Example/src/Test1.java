import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("주소를 입력해 주세요.:");
		String address = scan.nextLine();
		
		System.out.println("전화번호를 입력해 주세요.:");
		String phone = scan.nextLine();
		
		System.out.println("해당 정보를 확인해 주세요.");
		System.out.printf("주소: %s / 전화번호: %s",address,phone);
	
	scan.close();
	}

}
