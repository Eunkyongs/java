
public class Q1 {

	public static void main(String[] args) {

		/*
		 * ���빮�� �迭(Array) ����ڰ� ��ٱ��Ͽ� ������ ���� �ϰ� �˴ϴ�. 
		 * ��, �ش� �ݾ� ����Ʈ�� ������� ����, ���� ��ü ���� �ݾ׸� ��� �ǵ��� �մϴ�. 
		 * 1500 22000 13000 14500 113800 45000
		 */

		int cart[]= {1500, 22000, 13000, 14500, 113800, 45000};
		
		int total=0; // �����ݾ� ���Ѱ� ���� ����
		int f; // �ݺ��� ���
		int data = cart.length; //�迭�� ������ �����ľ� 
		
		for(f=0; f<data; f++ ) {
			total+=cart[f];
		}
		System.out.printf("���� ���� �ݾ��� %d �� �Դϴ�.",total);
		
		
	}

}
