import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		// for��+Scanner �̿��� ���������

		Scanner aa = new Scanner(System.in);//�Է¿����ε�
		System.out.println("���Ͻô� �����ܼ��ڸ� �Է��ϼ���."); //�Է��ؾ��� ���� ���̵�
		int bb = aa.nextInt(); // ����� �Է�
		aa.close();//��ĳ�� ����
		int f; // �ݺ��� ��� ����
		int zz; // �ݺ��� ������� �����
		for (f = 1; f <= 9; f++) {//�ݺ�����
			zz = bb * f;//�������
			System.out.printf("%d ", zz); // ���

		}

		


	}

}
