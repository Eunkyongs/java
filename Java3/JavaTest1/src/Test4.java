import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���Ͻô� �������� ����ΰ���?");
		
		int user_input=scan.nextInt();
		
		int dw=1;
		int total;
		
		if(user_input < 0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�.");
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
