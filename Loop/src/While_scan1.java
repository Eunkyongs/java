import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/*���빮�� : �� 2���� ������ �ϰ� �˴ϴ�. ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner�� �����Ͻÿ�. */

		Scanner sc = new Scanner(System.in); // �Է¿���

		int userin; // ������Էº���
		int f=1; // �ݺ��������
		int total = 0; // ������Է°� �� ����
		while (f<3) { // �ݺ����� 2��
//			System.out.println("���� ���ڸ� �Է��ϼ���.");
			System.out.println(f+"��° ���ڸ� �Է��ϼ���.");
			userin = sc.nextInt(); // ����� �Է�

			total += userin; // ������Է°� �հ迬��
			f++;
		}
		System.out.println("�հ�:" + total); // ����ڰ� �Է��� �� �հ� ���
		sc.close(); // �Է¿��� ����

		
		
	}

}
