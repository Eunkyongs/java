
public class time3 {

	public static void main(String[] args) {
		/*
		//try-catch �� �ڵ����� ���� ��.
		try {
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		*/
		
		/*���빮�� : �ܺ� class�� �ֽ��ϴ�. ��, ���� Ŭ�������� �ش� �ܺ�Ŭ������ �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�ʵ��� �ε��� �߻��մϴ�.
		  8�ʵ��� "ó���� �Դϴ�. ��ø� ��ٷ� �ּ���"
		  8�� ���Ŀ� return���� "�Ա��� ��� ó�� �Ǿ����ϴ�."��� ���ڸ� �޵��� �Ͻʽÿ�. 
		 */
	
//		 cc c=new cc();
//		 System.out.println(c.print());
//		 c.ccc();
//		 System.out.println(c.print());
		 
		 //������Ǯ�� Ŭ����ȣ��
		 bank b =new bank();
		 b.money();
	}

}


class cc{
	private String msg ;
	public cc(){
		this.msg="ó���� �Դϴ�. ��ø� ��ٷ� �ּ���.";
	}
	
	public void ccc() {
		try {
			Thread.sleep(8000);
			this.msg ="�Ա��� ��� ó�� �Ǿ����ϴ�.";
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		this.print();
	}
	public String print() {
		return this.msg;
	}

}	

//������ Ǯ��
class bank{
	public void money() {
		try {
//			System.out.println("ó���� �Դϴ�. ��ø� ��ٷ� �ּ���.");
			System.out.println("test");
			int c =1/0; //
			Thread.sleep(8000);
			System.out.println("test1");
//			String kkk = this.mmsg();
//			System.out.println(kkk);
			
		}catch(Exception c) {
			System.out.println("test2");
		}
	}
	public String mmsg() {
		return "�Ա��� ��� ó���Ǿ����ϴ�.";
	}
	
}
