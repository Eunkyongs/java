
public class For_plus {

	public static void main(String[] args) {
		/* 1~10���� ��� ���ڸ� ���� ������� ����Ͻÿ� */

		int f;
		int total = 0;
		for (f = 1; f < 11; f++) { // total �������� �ݺ����� ���������� ������Ŵ
			total=total+f; // 0+1�� ����. �ݺ��� ���ǿ� ���� �����ϸ鼭 f���� 1�� ����.
//			total += f; // += ��ȣ�̿��� total=total+f; ª���Է�
		}
//		System.out.println("�� �հ�:" + total);
//		+=(���ϱ� �Ҵ�) -=(���� �Ҵ�) *=(���ϱ� �Ҵ�) /=(������ �Ҵ�)
		// b =b-f; -> b-=f

		/*
		 * ���빮�� ��ü���� 500�� �ֽ��ϴ�. �� 8ȸ ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��� �� ���� 12�� �����ϵ��� �Ͽ� �������� ����Ͻÿ�
		 * �����:404
		 */

		int ff;
		int tot = 500;
		for (ff = 1; ff < 9; ff++) {

			tot = tot - 12;

		}
		System.out.println("������:" + tot);

		/* ������ �ڵ�
		int alls = 500;
		int m = 12;
		int w;
		for (w = 1; w < 9; w++) {
			alls -= m;
		}
		System.out.println(alls);*/

		/*���빮��
		 ������ 2�� 2*1~2*9���� �� �� �հ踦 ����Ͻÿ� 
		 ���� �հ�:90
		 */
		
	}

}
