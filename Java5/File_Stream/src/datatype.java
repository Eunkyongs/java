import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		// intern(): equals�� ������� �ʰ� == (�ε��ȣ�� ��밡��)
		
		String data2[] = {"ȫ�浿", "�̼���"};
		String data[] = new String[] {"ȫ�浿"};
		String a ="ȫ�浿";
		String b ="ȫ�浿";
		String c =new String("ȫ�浿").intern();
		String d =new String("ȫ�浿");
		String h = new String(data[0]).intern();
		String h2 = new String(data[1]).intern();
		String h3 = new String(data[1]).intern();
		String e = data[0];
		Scanner sc = new Scanner(System.in);
		String f = sc.next().intern();
		String g = new String(a);
		
		System.out.println(a==f);
		
		//new String : �Ҽ��� ���� �����й��� �ڷ���(����, �迭��)
		
		
		
		
//		if(c.equals(e)) {
//			System.out.println("���� �����ϴ�.");
//		}
	}

}
