import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���?");
		String mid = a.next();
		// System.out.println(mid);
		if (mid.equals("kim")) {
			// if(mid=="kim") { �Է¹��� ���ڿ��� ==��ȣ�δ� �´��� �Ǻ� �Ұ�. equals����ؼ� �Ǻ�
			// ���ڿ� ���´� scanner �̿�� equals��� �Լ��� ����մϴ�.
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		} else {
			System.out.println("Ȯ�ε��� �ʽ��ϴ�.");
		}
a.close();
	}

}
