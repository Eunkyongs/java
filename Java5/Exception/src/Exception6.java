//���ڵ�
public class Exception6 {

	public static void main(String[] args) {
		/*
		 ���빮��1: ����ڰ� 45*3+16+5+22*8 �� ������ ��. 
		 �ش� ���갪�� �������� �ܺ� Ŭ������ �����մϴ�.
		 �ش� �ܺ�Ŭ���������� �ش� ���� ¦���ϰ�� ���ܿ����� �߻��ϸ�, 
		 Ȧ���ϰ�� "Ȧ���� �Դϴ�."�� �ٽ� ȸ�ŵǵ��� �մϴ�.
		 ¦���ϰ�� "����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�." ���
		 */
		//����1
		int user= 45*3+16+5+22*8; // 332? 
		
		calc ca = new calc();
		ca.dd(user);
		try {
			String result=ca.re();
			System.out.println(result);
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
}
//����1�� Ŭ����
class calc{
	String msg ="";
	public void dd(int sum) {
		if(sum %2 ==0) {
			this.msg="����ó�� �߻����� ��Ȯ���� �ʿ��մϴ�";
		}else {
			this.msg="Ȧ���� �Դϴ�.";
		}
	}
	public String re() throws Exception {
		return this.msg;
	}
}	