import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���.");
		int num= scan.nextInt();
		
		String msg;
		if(num>60) {
			msg="�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.";	
		}
		else {
			if(num %2==0) {
				msg= "¦�� �Դϴ�.";
			}else {
				msg="Ȧ�� �Դϴ�.";
			}
		}
		System.out.printf("�Է��Ͻ� ���ڴ� %d, %s",num,msg);

	scan.close();
	}

}
