import java.util.Random;
import java.util.Scanner;


public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10���� ���ڸ� �ϳ� �����ϼ���: ");
		int no = sc.nextInt();
//		memorys m = new memorys(); // �̷������� Ŭ���� ȣ���ϰԵǸ� �޸� �ʱ�ȭ �ϱⰡ ����
		memorys m = null;
		m = new memorys();
		m.ms(no);
		m=null; //�ش� �ν��Ͻ��� ���(�޸� �ʱ�ȭ. ���߿� ��Ʈ������ �۾��Ҷ� ���..) 
		m = new memorys(); // null�̿��ؼ� �ν��Ͻ��� ����⶧���� ���Ҵ� ����.
		m.rd();
		
		sc.close();
	}

}

class memorys{
	public void ms(int user) {
		//Math.random() ���� �޼ҵ� ����- �⺻�� �ڷ��� double�Դϴ�.
		/*random=>�����ڵ�, �����ڵ�, ��÷, �귿*/
		double a = Math.random(); //0.0~1.0 . 
		int w=0;
		while(w<=10) {
			int b =(int) (Math.random()*10)+1; //*10(0~9),*10+1(1~10). random�� �⺻������ �Ҽ�. ������ ����ϱ����ؼ� int�ڷ������� ����ȯ�������
//			System.out.printf("%d ",b);
		w++;
		}
		
		
		/*if(user==b) {
			System.out.println("��÷");
		}else {
		
		System.out.println("������ȸ��");
		}*/
		}
	public void rd() { // rd=random util ����
		Random r = new Random(); //random ��ü ���� �� �ν��Ͻ� ����
		int w = 0;
		while(w<5) {
			System.out.println(r.nextInt(45)+1); // 0~9���� r.nextInt�� ���.
			w++;
		}
		r=null;
	}
	}