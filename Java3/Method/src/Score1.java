import java.util.Arrays;
import java.util.Scanner;

//����� ���� �Է� �� ��� ���� ���
public class Score1 {
	static String [] msg = {"�˻��� ������ �л����� �Է��� �ּ���?","�˻��� ������� �Է��ϼ���?[��ü,����,����,����,����]"}; 
	//main method�� static�̴� �ʵ忡 static���� ��������� ȣ�Ⱑ����. private, public, default ���� �����߻�.
	
	//gtdata():return�޼ҵ�(���)
	public static void main(String[] args) {
	
		Score2 sc = new Score2();
		Scanner text = new Scanner(System.in);
		System.out.println(msg[0]);
		String name = text.next(); //�л��� �Է�
		sc.stdata(name,null); //Score2�� �޼ҵ�� ����� �� ���� ����
		
		String check = sc.gtdata(); // return ���� �ڷ������� �޾ƾ���.
		
//		System.out.println(score); //return�޴ºκ� ��µǳ� Ȯ��
//		System.exit(0);
		
		
		if(check.equals("true")) { // check=="true" �� ��밡����.
			System.out.println(msg[1]);
			String subject = text.next(); //���� �Է�
			sc.stdata(name, subject);
			String score = sc.gtdata(); // return ��� Ȯ��
			
			if(subject.equals("��ü")) {
				String score2[] = score.split(",");
				System.out.printf("����������:���� %s��, ���� %s��, ���� %s��, ���� %s��",score2[0],score2[1],score2[2],score2[3]);
			}else {
			System.out.println("���������� : "+subject+" "+ score + "��");
			}
		}else {
			System.out.println("�ش� ����ڴ� �������� �ʽ��ϴ�.");
			System.exit(0); // 0:��������, 1:����������
		}
	
		
		text.close();
		System.gc();
	}

}
