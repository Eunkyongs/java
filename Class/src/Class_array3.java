import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*���빮��: ���� ���� �迭 ������ ���� �ֽ��ϴ�.
		 a1 : ȫ�浿, �̼���, ������, ������, ������
		 a2 : 100, 80, 39, 60, 55
		 "�˻��ϰ��� �ϴ� �̸��� �����ּ���."����ϰ� �˴ϴ�.
		 �˻�� �̼��� �̶�� �˻��� �ϰ� �Ǹ� "�̼��Ŵ��� 80�� �Դϴ�." ��� ����� �Ǿ�� �մϴ�.   
		 */
		
		String a1[] = {"ȫ�浿", "�̼���", "������", "������", "������"};
		String a2[] = {"100","80","39","60","55"};		

		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
		String name = scan.next();
		
		dd d = null;
		d = new dd();		
//		d.score(a1,a2,name); // a1,a2�迭���� ����ڰ� �Է��� �̸��� class dd�� score �޼ҵ�� ���� . ()�� ����ִ°�:�Ű�����
		//d.score(1,2,3) =>�μ���(���ڰ�)
		d.ck(a1, a2, name);
		
	}

}

class dd{
	//�޼ҵ忡 ()�ȿ� ��
/*	public void score(String n[], String s[], String ns){
//		System.out.println(Arrays.toString(n));// main�޼ҵ忡�� �޾ƿ� �迭�� ����� �� �ǳ� Ȯ��
//		System.out.println(ns); // main�޼ҵ忡�� �Էµ� ������Է°��� �� ��µǳ� Ȯ��
		int ea = s.length; // main�޼ҵ忡�� �޾ƿ� �迭�� ���� Ȯ��
		int f;		//�ݺ����� ���
		for(f=0;f<ea;f++) { // �迭���̸�ŭ �ݺ�
			if(ns.equals(n[f])) { // ����ڰ� �˻��� �̸��� �迭�� ���Ұ��� ������
				System.out.printf("%s���� %s�� �Դϴ�.",ns,s[f]); // ���� ���
			}
		}		
	}
*/	
	//������ Ǯ��
	public void ck(String data1[], String data2[], String user) {
		
		int w=0;
		
		int eaa=data1.length;
		
		boolean ck = false;
		do {
			if(user.equals(data1[w])) { // �迭�� ������ ���� ���� ���.
				ck = true;
				String js = data2[w];
				System.out.printf("%s���� %s�� �Դϴ�.",user,js);
			}
			w++;
		}while(w<eaa);
		
		if(ck==false) { // ����Ŭ�������� ����ڰ˻��Ͽ��� ��� �迭���� ���� ��Ȳ
			System.out.println("�˻��ϰ����ϴ� ����ڴ� Ȯ���� �ȵ˴ϴ�.");
		}
	}
}