import java.util.Arrays;

/*�迭 �ű� �������� ��Ȯ�ϰ� �����Ͽ� �űԹ迭�� �����ϱ�*/
public class oop2 {

	public static void main(String[] args) {
		array1 ar = new array1();
		
		
	}

}

class array1{
	private int ar1[];
	private int ea;
	
	public array1() {
		//�迭�� �ʵ忡 �ִ� ���� �������� ó���ϴ� ���(this)
		this.ar1 = new int []{1,2,3,4,5,6,7}; // this�� �迭 �����ϰ� ������ �̷������� ����~! 
		this.ea = this.ar1.length;
		// 5�̻� �迭���� ��������
		int w=0;
		String newdata = "";
		while(w<ea) {
			if(this.ar1[w]>=5) {
				newdata += this.ar1[w] + ","; //�ش� ���ǿ� �´� ���� ���ڿ��� ��ȯ�Ͽ� ����
			}
			w++;
		}
		String ar2[] = newdata.split(","); //�ش� ����� ���ڿ��� split���� �����Ͽ� �迭�� �ӽ���ȯ(split�� ���� �����ڷ��������� ����� �ȵ˴ϴ�.)
		int ar2_ea = ar2.length;
		int oridata []= new int [ar2_ea]; //���ڿ� ������ŭ �迭 �����ڰ��� �߰�
		
		int ww=0;
		while(ww<ar2_ea) {
			oridata[ww] = Integer.parseInt(ar2[ww]); //���ڸ� ���ڷ� ��ȯ�Ͽ� �ű� �迭�����ڿ� ���� ������(ar2�迭�� �����ڷ������� �����Ǿ����� �����ڷ����� int������ ��ȯ)
			ww++;
		}
		System.out.println(Arrays.toString(oridata));
	}
	
	
}