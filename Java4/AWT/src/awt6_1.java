//������ȣ�߼� �ý��� - awt6_abstract�� ���� �������ڵ�
public class awt6_1 {

	public static void main(String[] args) {
		
		awt6_handle_1 hd = new awt6_handle_1();
		hd.layout();
	}

}

class awt6_handle_1 extends awt6_abstract_1{
	String message = "";  
	
	@Override
	public void setter(String userno) {
		System.out.println(pc); //pc 4�ڸ� ���� ���
		if(userno.equals(pc)) {
			this.message ="���� �Ϸ� �Ǿ����ϴ�.";
		}
		else {
			this.message = "������ȣ�� �ٽ� Ȯ�� �Ͻʽÿ�.";
		}
	
	
	}
	
	@Override
	public String getter() {

		return this.message;
	}
	
}