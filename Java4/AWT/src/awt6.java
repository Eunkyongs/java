//������ȣ�߼� �ý��� - awt6_abstract�� ����
public class awt6 {

	public static void main(String[] args) {
		
		awt6_handle hd = new awt6_handle();
		hd.layout();
	}

}

class awt6_handle extends awt6_abstract{
	private int vcnum; //���������� ������ȣ �Ѿ�°� 
	@Override
	public void numcheck(int n) { 
		this.vcnum=n;//������ȣ
		System.out.println("�߼۵� ������ȣ: "+n);//������ȣ console�� ���̰� ����
	}
	
	@Override
	public int checkok() {
		return this.vcnum;
	}
	
	@Override
	public void setter(int usernum) {
		
	}
	
	@Override
	public String getter() {

		return null;
	}
	
}