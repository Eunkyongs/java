
public class Dowhile_plus {

	public static void main(String[] args) {
		/* do~while: 30~35���� �հ踦 ����Ͻÿ�. */

		int a = 30;
		int t = 0;
		do {
			t += a;
			a++;
		} while (a < 36);
		System.out.println("�հ�:"+t);

		/* ���빮�� �հ� ���� 189�� �ֽ��ϴ�. �� 1~10���� �հ�ġ�� ���� 189�� �� �� �հ踦 ���Ͻÿ�. ����� 134 */

		int aa = 1;
		int total = 189;
		do {
			total -= aa; // 189���� 1~10���� ���� ���� ���ϴ°Ŵ� ó�� 189���� 1~10�� ���½����� ����
			aa++; // ���� 1�� ����
		} while (aa < 11);
		System.out.println("�����:"+total);

	}

}
