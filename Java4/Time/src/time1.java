
public class time1 {

	public static void main(String[] args) {
		/*try-catch�� : ����ó����� �����̶�� �մϴ�.*/

		int w = 0;
		while(w<=10) {
			
			try {  //���� �߻��� �ڵ带 ����
				Thread.sleep(1000); // 1000 = 1��
				//Thread.sleep : �Ͻ��������¸� ���մϴ�.
			}catch(InterruptedException e) { // �ǹ����� Exception���� ��� 
				/*InterruptedException : �ش� ���� �߻��� �Ǿ��� ��� ó���ϱ� ���� ����*/
			}
			
			
			System.out.println(w);
			w++;
		}
		
	}

}
