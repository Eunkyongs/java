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
		d.score(a1,a2,name); // a1,a2�迭���� ����ڰ� �Է��� �̸��� class dd�� score �޼ҵ�� ����
	}

}

class dd{
	public void score(String n[], String s[], String ns){
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
}