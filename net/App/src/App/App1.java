package App;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {

		/*
		 * ����.[����������Ʈ] �������� ���� �����Ͱ� �����մϴ�. ���α׷� ���� �� �ش� ������̸��� �Է��մϴ�. 
		 * �ش� ���� ������ �� ����� �̸��� ������ �����͸� ��µǵ��� �մϴ�.
		 * ���μ��� ���� ��� �˻��� ������ �л����� �Է��� �ּ���? ȫ�浿 �˻��� ���� ����[��ü]? ��ü 
		 * �˻������� �л��� : ȫ�浿 / ���������� :����: 55 ����: 60 ����: 77 ����: 90 -> ��ü �˻���
		 * 
		 * �˻��� ������ �л����� �Է��� �ּ���? ȫ�浿 �˻��� ���� ����[��ü]? ���� 
		 * �˻������� �л���: ȫ�浿 / ����������:����: 60
		 * 
		 * �����Ͱ� { 
		 * {"������","�̰���","���","������","������"}, 
		 * {"80","78","92","67","40"},//����
		 * {"40","80","80","92",",100"},//���� 
		 * {"95","30","55","90","65"},//����
		 * {"20","80","100","95","30"}//���� 
		 * };
		 * 
		 * A��Ʈ : ����ڰ� �ش� ������ �Է� �� �� �ִ� ���μ����� �����ϰ�, ���� ������� return�޾Ƽ� ó���ؾ��մϴ�. ��, �ش� �����Ϳ�
		 * ���� ����ڸ� �Է��� ��� �����͸� ã�� ���߽��ϴ�. ��� �ԷµǾ�� �մϴ�. ���� ������ ��ü�� �Է��� ��� ����� ������� ���
		 * ����մϴ�. �ش� Ư�������� �Է��� ��� �ش���� ������ ��µǵ��� �մϴ�.
		 //��ĳ�ʻ���, App2�� �Է¹޴� ������ ������  
		 * 
		 * 
		 * 
		 * B��Ʈ: A��Ʈ���� ���޹��� ����� �Է°� ���¿� ���缭 ������� A��Ʈ�� �ٽ� �� ���� �Ͻø� �˴ϴ�.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� ������ �л����� �Է��� �ּ���?");
		String name = scan.next();
		
		App2 a2 = new App2();
		a2.a(name,null);
		String re= a2.get();
		if(re=="ok") {
		System.out.println("�˻��� ���� ����[��ü]?");
		String score = scan.next();
		a2.a(name,score);	
		String re1=a2.get();
		}
		else {
			System.out.println("���α׷� ����");
		}
		
		System.out.printf("�˻������� �л���:%s ����������:%s",name);
		System.out.printf(a2.get());
		
		
		
	}
	
}