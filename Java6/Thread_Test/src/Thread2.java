import java.util.ArrayList;

public class Thread2 {
//Thread�� ���������� ������� ���� �ȳ���!!!!
	public static void main(String[] args) {
		/*���빮��
		 Thread�� �̿��Ͽ� ������ �迭�� ���� ������������ ��� ���Ͽ� ����� ����ϴ� �������α׷��� �����Ͻÿ�.
		 */
		int data[] = {6,9,10,15,3,17};
		/*��Ʈ : 6�̶�� �迭���� �μ������� Thread�� ����
		 6+5+4+3+2+1 ���� ������� print =>21
		 */
		
		number n = null;
		n=new number(data[0]);
		n.start();
		
		int ea = data.length;
		plusbox pb = null;
		for(int a=0; a<ea; a++) {
			pb=new plusbox(data[a]);
			pb.start();
		}
	}
}
//�������ڵ�
class plusbox extends Thread{
	int number =0;
	public plusbox(int no) { // Thread���� ���� ����ϱ� ���� �⺻ �޼ҵ�
		this.number = no;
	}
	
	@Override
		public void run() {// run�޼ҵ�� ���� �μ����� ������
		//�ݺ���
		int sum = 0;
		for(int z=this.number; z>0; z--) {
			sum += z;
		}
		System.out.println(sum);
		
		
	}
}

//���ڵ�
class number extends Thread{
	int num;
	int total = 0;
	int []newnum = null;
	public number(int a){
		this.num = a;
	}
	
	@Override
	public void run() { 
		
		int w = 0;
		this.newnum= new int [this.num]; 
		while(w<this.newnum.length) {
			
			w++;
		}
		
		
	
	
	}
}