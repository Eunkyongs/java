import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		// Scanner�� �Բ� while ������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.

		Scanner in = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���.");
		int num = in.nextInt();

		int a = 1;
		int b;
		while (a < 10) {
			b = num * a;
			System.out.print(b + " ");
			a++;
		}

		in.close();
	}

}
