import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class example6 {

	public static void main(String[] args) {
		/*
		 2�� �迭�̸�, 2���迭 �����ʹ� ������ �����ϴ�.
		 user_list :ȫ�浿 �̼��� ������ ������ ������� ������ ����屺 
		 user_point: 3000 1000 25000 19800 5750 3630 0 
		 
		 ���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ���?"
		 �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ尪���� �Ű������� �̿��Ͽ� ���� �� �ش� ������� ����Ͻø� �˴ϴ�.		 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���?");
		String name=scan.next();
		point p = null;
		p = new point();
		p.point1(name);
		
	}

}
class point{
	public void point1(String user) {
//		System.out.println("test");
		String data[][] = {
				{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
				{"3000", "1000", "25000","19800", "5750", "3630", "0"}
		};
		
		int ea1=data.length; // �迭����2
		int ea2=data[0].length; // �迭�ȵ����Ͱ��� 7

			int ww=0;
			while(ww<ea2){
				if(user.equals(data[0][ww])) {
				 System.out.printf("%s ���� ����Ʈ�� %s �Դϴ�.", data[0][ww],data[1][ww]);
					
				}
				ww++;
			}
		
		
		
	}
}
