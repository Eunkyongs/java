//������ȣ�߼� �ý��� - awt6_abstract�� ����
public class awt6 {

	public static void main(String[] args) {
		
		awt6_handle hd = new awt6_handle();
		hd.layout();
	}

}

class awt6_handle extends awt6_abstract{
	private int vcnum; //���������� ������ȣ �Ѿ�°� 
	private int innum; // ������Է�������ȣ
	private int re ;
	@Override
	public void numcheck(int n) { 
		this.vcnum=n;//������ȣ
		
	System.out.println(n);//������ȣ console�� ���̰�
		
	}
	
	@Override
	public void numcheck1(int n1) {
		this.innum=n1; //������Է¹�ȣ
		
		if(this.innum == this.vcnum) {
			this.re=0;
			checkok();
		}		
	}
	
	
	@Override
	public int checkok() {
		return this.re;
	}
	
	
	
	
}