public class Example2 {
	private int user_num ;
	private int pc_num ;
	public String msg ; // ��� �޼���
	
	
	public void number(int pc_num,int user_num) { //setter (�μ��� ����)
		this.user_num=user_num;
		this.pc_num = pc_num;
//		System.out.println(pc_num+" ,"+user_num); //1�����Ͽ��� ��ȣ �߳Ѿ������ Ȯ�� ok
			
		//�Ѿ�� �������ڶ� ����� �Է� ���� ��
		if(this.user_num < this.pc_num) { // �������ڰ� �� Ŭ���
				this.msg = "Up";
		}
		else if(this.user_num > this.pc_num) { // �������ڰ� �� �������
			this.msg = "Down";
		}
		else { // �� ���� ���� ���
			this.msg = "����";
		}
	}
	public String result() { // �������� ������Է°� �� ��� 1�����Ϸ� ���� //getter(�μ���x)
		return this.msg;
	}
}
