import java.util.Scanner;

public class For_scan1 {

	public static void main(String[] args) {
		
		/*int a =5;
		System.out.println(a++); //���õ� ������ �ϴ� ��� ������Ŵ. ����� 5�� �ǰ�, �� �Ŀ� �������� �����Ǿ� a���� 6�� ��
		System.out.println(++a); //������ ���� ������Ű�� ����. ���ٿ��� a���� 6�� ��. ������Ű�� ����ϴ� 7�� ��µ�
			
		int b = 10;
		int c = 10;
		int d = b + c++;
		System.out.println(d);*/
		
		//for+Scanner�̿� �����հ� ���ϱ�
		Scanner sc = new Scanner(System.in); // �Է¿���
		int jumsu;//������Էº���
		int f;//�ݺ���
		int total = 0; //����ڰ� �Է��� ���� ���� �հ�
		for(f=1; f<4; f++) { // �ݺ�����
			System.out.println("������ �Է��� �ּ���."); 
			jumsu = sc.nextInt(); // ����ڰ� �Է��� ��
			sc.close(); // �Է¿�������
			total += jumsu; // ����ڰ� �Է��� ���� �հ� ������ �̰� total=total+jumsu;�� �ᵵ��
		}
		System.out.println("�� ������ ����:"+total); //�հ�
		
	}

}
