import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
//		1~100���� ��� ���ϴ� �ݺ����� for������ �ۼ��Ͻÿ�.
		
/*		int a;//�ݺ������
		int t=0;//�հ谪 ����
		for(a=1; a<=100; a++) { // ����
			t+=a; //1~100���� ���ϱ�
		}
		System.out.println(t);//1~100���� ��� ���� �հ谪 ���*/
		
//		1~100���� ��� ���� �����
		
		int f; //�ݺ����� ����� ����
//		BigInteger : java���� ��� ������ ���� ���� �� �� �ִ� ������ �ڷ���.���� ū�� = ���Ѵ� �ǹ�
		BigInteger aa= new BigInteger("1"); // �հ迡 ����� �ڷ��� ���� 1 �� ���ʰ����� ����. ��, ""�� ������ �����ؾ� �մϴ�. 
		for(f=1; f<=100; f++) {
			aa = aa.multiply(BigInteger.valueOf(f));
			/*
			 multiply : ��Ģ���� �� ���ϱ⸦ �����
			 add: ��Ģ���� �� ���ϱ⸦ �����
			 subtract: ��Ģ���� �� ���⸦ �����
			 divide: ��Ģ���� �� �����⸦ �����
			 */ 
		}
		System.out.println(aa);
	
	}

}
