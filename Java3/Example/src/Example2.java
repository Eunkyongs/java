public class Example2 {
	private int user_num ;
	private int pc_num ;
	public String aa ;
	
	public void number(int pc_num,int user_num) {
		this.user_num=user_num;
		this.pc_num = pc_num;
//		System.out.println(pc_num+" ,"+user_num); //1�����Ͽ��� ��ȣ �߳Ѿ������ Ȯ�� ok
			
		//�Ѿ�� �������ڶ� ����� �Է� ���� ��
		if(this.user_num < this.pc_num) { // �������ڰ� �� Ŭ���
				this.aa = "Up";
		}
		else if(this.user_num > this.pc_num) { // �������ڰ� �� �������
			this.aa = "Down";
		}
		else { // �� ���� ���� ���
			this.aa = "����";
		}
	}
	public String result() { // �������� ������Է°� �� ��� 1�����Ϸ� ����
		return this.aa;
	}
}
