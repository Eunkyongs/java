
public class Example6 {

	public static void main(String[] args) {
		/*
		 * ���빮��6: 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�. ��, 1~5������ ��簪�� ���ϰ�, 6~10������ ��簪�� ���մϴ�. �ش�
		 * �ΰ��� ���� ���Ͽ� ���� ���� ū��, ���Ѱ��� ū���� ����� ����Ͻÿ�
		 */
		int a = 1; // �ݺ����� ���
		int t1 = 1; // 1~5 ���Ѱ�
		int t2 = 0; // 6~10 ���Ѱ�
		int a1;

		// print��½� ���
		String m1 = "1~5���� ��簪�� ���� ��";
		String m2 = "6~10���� ��簪�� ���� ��";
		String m3 = "�� �� Ů�ϴ�.";

		//while��
		while (a < 11) {
			if (a <= 5) { // a�� 5���� ���ų� ������
				t1 *= a; // ��簪 ���ϱ�
			} else if (a > 5) { // a�� 5���� Ŭ��
				t2 += a;
			}
			a++;
		}
		
		//do~while��
		do {
			if (a <= 5) {
				t1 *= a;
			} else {
				t2 += a;
			}
			a++;
		} while (a < 11);

		//for��
		for (a1 = 1; a1 < 11; a1++) {
			if (a1 <= 5) {
				t1 *= a1;
			} else if (a < 11) {
				t2 += a1;
			}
		}

		System.out.println(m1 + " " + t1);
		System.out.println(m2 + " " + t2);

		// ����� ��
		if (t1 > t2) {
			System.out.println(m1 + m3);
		} else {
			System.out.println(m2 + m3);
		}
		
//		������ Ǯ��
		
		int w=1;
		int total = 0 ;
		int total2 = 2 ;
		while(w<=10) {
			if(w<=5) {
				total2= total2*w;
			}else {
				total=total+w;
				}
			w++;
		}
		if(total2<total) {
			System.out.println("���Ѱ��� Ů�ϴ�.");
			
		}else if(total2>total) {
			System.out.println("���Ѱ��� Ů�ϴ�.");
		}
		else {
			System.out.println("�� �񱳰��� �����ϴ�.");
		}
		
	}

}
