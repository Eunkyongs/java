import java.util.Timer;
import java.util.TimerTask;

public class time2 {
	
	
	public static void main(String[] args) {
		Timer timer = new Timer(); //Timer util�� �̿��Ͽ� �ð��Լ��� ����մϴ�.
		
//		timer.scheduleAtFixedRate(new gogo(), 5000, 5000); // rate �Է� �� ctrl+space�ϸ� �ڵ��ϼ���
		//(���� �� �޼ҵ�&Ŭ����, �� �ʵڿ� ��������, �ݺ��ð� )
		//scheduleAtFixedRate : ���������� �ݺ� �۾��� �� ���
		
		TimerTask tk = new TimerTask() {
			int a = 0;
			String adata[]= {"ȫ�浿","�̼���","������","������"};
			
			@Override
			public void run() {
				if(a>=4) {
					a=0;
				}
				System.out.println(adata[a]);
				a++;
			}
		};
		timer.scheduleAtFixedRate(tk, 0, 5000); //��ʱ���, �ε�ȭ�� ���
	}
}

class gogo extends TimerTask{ //TimerTask:�ð� �۾�
	public void run() {//Task���� �����ϴ� �޼ҵ��Դϴ�.
		System.out.println("�ð� �Լ� �� �۵��� �ɱ��???");
	}
}