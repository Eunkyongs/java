//������ Ǯ��
public class Exception6_1 {

	public static void main(String[] args) {
		/*
		 ���빮��. ����ڰ� 45*3+16+5+22*8 �� ������ ��. 
		 �ش� ���갪�� �������� �ܺ� Ŭ������ �����մϴ�.
		 �ش� �ܺ�Ŭ���������� �ش� ���� ¦���ϰ�� ���ܿ����� �߻��ϸ�, 
		 Ȧ���ϰ�� "Ȧ���� �Դϴ�."�� �ٽ� ȸ�ŵǵ��� �մϴ�.
		 ¦���ϰ�� "����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�." ���
		 */
		
		try {
			int sum = 45*3+16+5+22*8;
			cul cl = new cul();
			String result = cl.cul_method(sum); // getter���� �޼ҵ带 ������ �������� �ش� �޼ҵ��� �ڷ������� �޾ƾ� ��
			System.out.println(result);
		}catch(Exception a) {
			if(a.getMessage() != null) {
			System.out.println(a.getMessage());
			}
		}
	}

}
class cul {
	//�ڷ��� �޼ҵ忡�� return�� ����,����,Object�� ���� �ڷ����� ����Ǿ� ����
	public String cul_method(int s) throws Exception { // �μ��� �޴°��� String �޼ҵ忡���� int�� ����������. 
		if(s%2 ==0) {
			Exception ec = new Exception();
			throw ec;
//			throw new Exception("����ó�� �߻����� ��Ȯ���� �ʿ��մϴ�."); // ���� ������ �̷��� ���ٷε� ����� �� ����.
		}
		else {
			String msg= "Ȧ���� �Դϴ�.";
			return msg;
		}
	}
	
}