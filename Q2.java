import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*���빮��. ���ǹ� �ڵ带 �ۼ� �Ͻÿ�.
���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�. 
���� �⺻ �ڻ�ݾ� : 100,000
"1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�." ��� �޼����� ���� ���� ���� �Ǿ�� �մϴ�.
1���� �Է½� "�ش� �ݾ��� �Է��ϼ���"
����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ���� �� �ڻ� �ݾ��� ����Ͻø� �˴ϴ�.
2���� �Է½� "����� �ݾ��� �Է��ϼ���"
����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ� �� �ڻ� �ݾ��� ����Ͻø� �˴ϴ�.*/
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
		
		int input=scan.nextInt();
		scan.close();
		
		int asset = 100000;
		int result;
		if(input == 1) {
			Scanner one= new Scanner(System.in);
			System.out.println("�ش� �ݾ��� �Է��ϼ���");
			int money1=one.nextInt();
			one.close();
			result= money1+asset;
			System.out.println(result);
		}else {
			Scanner two= new Scanner(System.in);
			System.out.println("�ش� �ݾ��� �Է��ϼ���");
			int money2=two.nextInt();
			two.close();		
			result= asset-money2;
			System.out.println(result);
		}
		
		
		
		
	}

}
