//Thread �����
// �ϳ��� Ŭ������ ��������� �۵���ų�� ����

public class Thread1 {

	public static void main(String[] args) {
		
		/*Extend Thread*/
		int w=0;
		while(w<6) { // thread 5�� ������
//			box b = new box(w);
//			Thread t = new Thread(b);
//			t.start(); // thread�� ������ start�ν�Ŵ
			w++;
		}
		
		/*interface Runnable Thread*/
		
		for(int f=0; f<10; f++) {
			//������ �޼ҵ带 ȣ���Ͽ� ���� Ŭ������ cpu�Ѱ��� �Ҵ��մϴ�.	
			box2 b2 = new box2(f);
			Thread t2 = new Thread(b2);
			t2.start(); // run method�� �۵���Ű�� ���� ��ɾ�
		}
			
	}

}
//extends
class box extends Thread{
	int no = 0;
	public box(int a) {
		this.no = a; // thread�� ���� �ѱ涧�� this�� �޾Ƽ� �Ѱܾ� ��.
	}
	@Override
	public void run() { // thread������ �⺻�޼ҵ�
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.no);
	}
}
//interface �� thread
class box2 implements Runnable{  
	int no = 0;
	public box2(int b) {
		this.no = b;
	}
	
	
	@Override
	public void run() {//Thread�� �⺻ �޼ҵ�- �̰ž��̴� Thread ���� ����.
		try {
			Thread.sleep(1000); 
		}catch(Exception e) {
		}
		System.out.println(this.no);
	}
	
}
