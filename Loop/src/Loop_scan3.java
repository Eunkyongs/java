import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		// Scanner�� �Բ� do~while ������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.

		Scanner scan = new Scanner(System.in); //�Է¿���ȣ��
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���."); //����ڰ� �Է��ؾ��ϴ�����
		int num = scan.nextInt(); //������Է°�

		scan.close(); // �Է¿��� ����

		int d = 1; //do~while�� �ʱⰪ����
		int res; //��������
		do {
			res = d * num; //����
			System.out.printf("%d ", res); //������
			d++; // ����
		} while (d < 10); //�ݺ�����

	}

}
