import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		//Ŭ���� + �޼ҵ� + �迭
		String users[] = {"ȫ�浿", "�̼���","������"};
		
		/*���빮��: ����ڰ� �ڽ��� �̸��� �Է��մϴ�.
		 ����� �̸��� �ش� class�� ������ ��ϵ� ����� ���� �� ������ ����� ������ Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 ��ϵ� ����� �� ��� "������ �Ǿ� �ֽ��ϴ�." ��� ����ϰ�, Ȯ���� ���� ���� ��� "�̰����� �Դϴ�."��� ����մϴ�.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �̸��� �Է��ϼ���.");
		String name = scan.next();
		arrays.lists(users, name);
		scan.close();
	}

}

class arrays {
	public static void lists(String a[], String n) { 
				int w=0;
				int ea = a.length;
				String msg=""; // �޼ҵ�� �ش� ���� �����Ҷ��� ����ִ� ���� ��Ȯ�ϰ� �����ϼž� �մϴ�.
				// String "" or null int 0 ->����ִ� �� ǥ��.
				boolean ck = false;
				while (w<ea) {
					if(n.equals(a[w])) {
						msg="������ �Ǿ��ֽ��ϴ�.";
						ck=true;
					}
					w++;
				}
				if(ck==false) {
					msg="�̰����� �Դϴ�.";
				}
//				arrays.message(msg); // ���� Ŭ�������� �޸𸮿� �ö�������ʱ⶧���� ���°ų� ��������
				
				arrays ar = null; 
				ar= new arrays();
				ar.message(msg);
	}
	
	public void message(String m) {
		System.out.println(m);
	}
	


}