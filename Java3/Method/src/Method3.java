
public class Method3 {

	public static void main(String[] args) {
		/*
		 ���빮��: �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 ���� ��갪�� �޾Ƽ� ����� ����Ͻÿ�.
		 157, 45 
		 157*45
		 ���� ����� ���: 7065
		 */
		num n  = new num();
		
		int total=n.n1(157,45);
		System.out.println(total);
		
		n.n2();//n2�� �� ���޾��� �۵��ǵ��� ȣ�⸸ ��.
		/*
	   ���빮�� : ���� ���� �ϳ��� �ش� �޼ҵ�� �����ϰ� �˴ϴ�.
	   �ش� �޼ҵ忡���� ������ ���� ó���մϴ�.
	   ���� 3�� �����ϸ� 3*1~ 3*9������ ��� ������� ���Ͽ� sysout���� ��µǵ��� �Ͻʽÿ�. 
	   */
	
		int result = n.n3(3);
			System.out.println("�����:"+result);
		
		String ck = n.mb("hong");
		System.out.println(ck);
	}
}

class num {
	public int n1(int a, int b) {
		int c=a*b;
		return c;
	}
	public void n2() {
		int z = n1(100,200); //���� Ŭ�����ȿ� �ִ� n1Ȱ���ؼ� ���
		System.out.println(z);
	}
	
	public int n3(int a) {
		int f;
		int b=0;
		for(f=1; f<=9; f++) {
			b+= f*a;
			
		}
		return b; // return ���� ���� �ݺ��� �ȿ��� �����ϸ� �ȵ˴ϴ�. ����Ұ�!!
		//���ǹ��̶� ����� return��� �ȵ˴ϴ�.(����� ���������� �ʹ� ����return�߻��Ǵ� �ǵ��� �����Ұ�) ���ǹ��� break�� �ɴ��� return�� ������ �ݺ��� �ۿ��� �����Ұ�!
	}
	public String mb(String mid) {
		String msg ="";

		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg; //�ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return��Ŵ.
	}
	
}