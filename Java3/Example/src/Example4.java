
public class Example4 {

	public static void main(String[] args) {
		/*���빮�� �ΰ��� ���� �ܺ�Ŭ������ �����ϴ�.
		 �ش� Ŭ�������� �ΰ��� ���� ����ϰ� �˴ϴ�.
		 ��������� ������ �����ϴ�
		 3,10�� �����ԵǸ� �ΰ��� ���� ���� ���մϴ�
		 ������ �ܺ�Ŭ�������� �ش� ������� ����ϴµ�, �ΰ��� �� ���� ¦��, Ȧ�������� ����ϴ� extends�� �����ϼ��� */
		
		a2 a= new a2();
		a.cal(3,10);//���ں���
		a.pt();//��� ȣ���ؼ� ���
	}

}

class a1{
	private int n1;
	private int n2;
	protected int tt;
	protected String msg;
	
	public void cal(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		this.tt = this.n1+this.n2; // ���� �� ���
	}
}
class a2 extends a1{
	public void pt() {
		if(this.tt %2 ==0) {
			this.msg ="¦��";
		}else {
			this.msg="Ȧ��";
		}
		System.out.printf("�����: %d,  %s �Դϴ�.",this.tt,this.msg);
	}
}