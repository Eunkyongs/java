import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/*
		  ���� ����� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		  ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		  "1~46�� ������ ���ڸ� �Է��� �ּ���:"
		  ����ڰ� �Է��� 5�� ���ڸ� �迭�� �����մϴ�. (main�� ó��)
		 
		  �ܺ� class�� �̿��Ͽ� PC�� ���� ��÷��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�. 
		  PC�� ���� 5���� ���ڸ� �迭�� �����մϴ�.(�ܺ� class method�� ����)
		  
		  ������ ��� method�� �ϳ� �� �����Ͽ� ����ڰ� �Է��� 5���� �迭�����Ϳ� 
		  PC�� ���� �迭 �����͸� �ش� method�� �����Ͽ�, ����Ͻø� �˴ϴ�.		  
		 
		 ��, ��� ����ϴ� �ݺ����� ������ do~while������ �ۼ��մϴ�.
		 
		 ���: ����ڻ��� 5������
		 	  pc������ 5������
		 */
		number n=new number();
		Scanner scan = new Scanner(System.in);
		System.out.println("1~46�� ������ ���ڸ� �Է��� �ּ���:");
		int u [] = new int [5];//������Է¼��� ������ �迭
		int dw=0;//�ݺ��� �� ������Է¼��� �����Ҷ� �ε�����ȣ �ο��� ���
		do {
			int user_num = scan.nextInt();
			u[dw]=user_num;
			dw++;
		}while(dw<5);
//		System.out.println(Arrays.toString(u)); //������Է��� ���ڰ� �迭�� �� ������ Ȯ��
		n.pc(u);//numberŬ������ pc�޼ҵ�� ����� �Է°� �迭 ����
	}
}
class number{
	public void pc(int un[]) {
//		System.out.println(Arrays.toString(un));//����� �Է°� �� �Ѿ�Դ��� Ȯ��
		
		Random r = new Random(); //random ��ƿ���
		int [] ran=new int[5];//������ƿ�� ������ ���� ������ �迭
		int w = 0;//�ݺ��� �� ������ƿ�� ������ ��������� �ε�����ȣ �ο��� ��� 
		do{
			ran[w] = (r.nextInt(45)+1); //������ƿ�� ������ ���ڹ��� 1~46
			w++;
		}while(w<5);
//		System.out.println(Arrays.toString(ran)); // �迭�� ���� �� ������ Ȯ��
		r=null;
		result(un,ran);//result�޼ҵ�� ������Է°��� �����������ں���
	}
	public static void result(int u[], int p[]) {
		System.out.println("����ڰ� ���� ����: "+ Arrays.toString(u));
		System.out.println("PC�� ���� ����: "+Arrays.toString(p));
	}
}