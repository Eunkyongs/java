package Ab2;
public class Example1 {
	public static void main(String[] args) {
		home h[] = {new computer(),new monitor()}; //�������̽� ����
		home h2[] = {new phone()}; //extends�� home�� �ε��Ͽ���
		h[0].broken(50);
		h[1].broken(0);
		h2[0].broken(18);
	}
}

class computer implements home{
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���� ������!!");
	}
	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ�!!");
	}
	@Override
	public void broken(int n ) {
		if(this.bk<=n) {
			System.out.println("��ǻ�� ����!!");
		}else if(this.bk>n && n>0) {
			this.poweron();
		}else {
			this.poweroff();
		}
	}
	
}
class monitor implements home{
	@Override
	public void poweron() {
		System.out.println("����� ���� ������!!");
	}
	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ�!!");
	}
	@Override
	public void broken(int n) {
		if(this.bk<=n) {
			System.out.println("����� ����!!");
		}else if(this.bk>n && n>0) {
			this.poweron();
		}else {
			this.poweroff();
		}
	}
}
/*
 �޴����� �߰� ����� �ʿ��մϴ�.
 �޴��� ����� �ּ�����(20)->�����۵� 40�̻� 80�̻�Ǹ� ����
 1.������ ���޵����� ȭ���� ���峯 ���(������ �۵��� �ȵǴ� ���) - 20~39������
 2.������ ���޽�Ű���� ������ �ȵ� ���(������ �ƿ� �ȵǴ� ���) -20�̸� ������ ���
 */

class phone implements home, home2{
	@Override
	public void poweron() {
		System.out.println("�޴��� ���� ������!!");
	}
	@Override
	public void poweroff() {
		System.out.println("�޴��� ���� �ߴ�!!");
	}
	@Override
	public void broken(int n) {
		if(this.bk<=n) { // n�� bk=80 ���� ���ų� ũ�� ����
			System.out.println("�޴��� ����!!");
		}else if(this.bk>n && n>0) {// n�� bk=80���� �۰ų� 40���� ���ų� ũ��
			if(n<=39 && n>=20) { // 20~39 
				this.b_display();
			}else if(n<20) { // 20����
				this.b_charge();
			}else
			this.poweron();
		}else {
			this.poweroff();
		}
	}
	@Override
	public void b_display() {
		System.out.println("�޴��� ���� �������̳� ȭ���۵��� �ȵ�!!");
	}
	@Override
	public void b_charge() {
		System.out.println("�޴��� ���� �������̳� ���� ����!!");
	}
}