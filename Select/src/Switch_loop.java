
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign ="*";
		int total; // sysout�� switch�� �ۿ� ����Ϸ��� total�� ���� ������ ����� ������ ��������
		
		/*case�ȿ� ������ �ݺ����� ��� �� �� �ֽ��ϴ�.
		 ����, ������ �������� ����ص� �����ϸ�, case ������ �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ������ �����ϴ�.
		 ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� ����
		  */
		
		switch (sign) {
		case "+" ->{
			int f;
			total=0;
			for(f=1; f<=5; f++) {
				total += f; //
			}
			System.out.println("�� 1~5���� ���� ���� "+total+"�Դϴ�."); // ����ġ�� ������ sysout�� ���� total���� case�� �ȿ� �ֱ⶧���� �νĸ���.
		}
		case "-"->{
			total=0;
			System.out.println("�������� ��� ���� �ʽ��ϴ�.");
		}
		case "*" ->{
			int f=1; // +���̽��� ����� ������ f�� �ߺ���밡��. *���̽� �ȿ����� ���Ǳ⶧���� �ߺ���밡���ϴ�.
			total=1;
			do {
				total*=f;
				f++;
			}while(f<=5);
			System.out.println("�� 1~5���� ���� ���� "+total+"�Դϴ�.");
		}
		case "/" ->{
			total=0;
			
		}
		
		}
		
		
	}

}
