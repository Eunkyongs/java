public class Exception4 {

	public static void main(String[] args) {
		try { //����� ó�� �۵� 1
		ex e = new ex(); //2
		e.loader("ok");//3
			
		//�ڱ� �ڽ��� �ٷ� ���ܻ�Ȳ���� ����
		Exception aaa =new Exception();
		throw aaa; // throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� class�� return 
		}catch(Exception e){ // ���� �߰������� �۵����� . catch(Exception | NumberFormatException e) �̷��Ե� ��밡��
			if(e.getMessage()!=null) {
			System.out.println(e);
			}
		}
//		}catch(IOException i) { // IO �����ϴµ� IOException ����ϸ� error
			
//		}
	}

}
class ex{
	Exception ep = null; // ������ //Exception �߻��Ҽ������� �̸� �����ؼ� �����ѳ�. 
	public void loader(String a) throws Exception{ // throws try~catch�� �ޱ����� class�� �ε�
		/*�߸��� �������� (�ڽ��� ������ ���� main class�� ��� �����ϴ� ��Ȳ��)*/
//		if(a=="ok") {
//			// ������������, loader class��ü���� ������ �߻�	
//			int keycode = Integer.valueOf(a); 
//			
//		}else {
//			//�ش� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ���
//			this.ep = new Exception(); 
//			throw this.ep; 
//			}
		
		//�ùٸ� ����
		try {
			if(a=="ok") {
				int keycode = Integer.valueOf(a);
			}
			else {
				System.out.println("test");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			 // �ڽ��� ���������� return�޾Ƽ� Ȯ����
			this.ep = new Exception(); //throw ���� ������ �Ϻ��ϰ� �ľ��ϱ� ���� ����
			throw this.ep; // �����߻��� mainŬ������ return // �޼ҵ��̸����ο� throws ������ ���Ұ�
		}
	}
}