import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/* ���빮��:����ڰ� �� 3���� ���ڸ� �Է��մϴ�. 3���� ���ڸ� ��� ���Ͽ� �� �հ���� ����Ͻÿ�. */

		Scanner sc = new Scanner(System.in); // �Է¿���ȣ��
		int user; // ����� �Էº���
		int d = 1; // �ݺ����� ���
		long total = 1; // �Է��� ������ �� ����. long�� �Է½� ���� ������� -���� �߻���
		do {
			System.out.println(d + "��° ���ڸ� �Է��ϼ���.");
			user = sc.nextInt(); // ����� �Է�
			total *= user; // ����ڰ� �Է��� ���ڸ� ��� ���ϴ� ���� ����
			d++;
		} while (d < 4); // 3�� �ݺ�
		System.out.println("�հ�:" + total); // ����ڰ� �Է��� ���ڸ� ��� ���� �հ� ���
		sc.close();// �Է¿��� ����

	}

}
