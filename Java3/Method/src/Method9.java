import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 ���빮��:�����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ����Դϴ�.
		 �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ�ϴ� (Y,N)�����մϴ�.
		 �ش� Ȱ��ȭ ���� �����Ͽ� "Y" �� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1���迭�� �籸�� �� ���ο��� ��µǵ��� �մϴ�.
		 ���:[���Ϲ��,����������,���ڽ�,�̺�Ʈ,�߼�]
		 ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 */
		
		menus mns = new menus();
		System.out.println(Arrays.toString(mns.pt()));
	}
}
class menus{
	private String mn[][] ;
	private String nmn[];
	public menus(){
		String ms[][]= {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"} // Y�� �Ÿ� �迭�� ���̰�
		};
		this.mn = ms;
		d();
	}
	public void d() {
		int ea1 = this.mn.length; // 2
		int ea2 = this.mn[0].length; // 7
		String aa[] = new String[ea2];
		int count =0;
		
			int dww=0;
			do {
				if(this.mn[1][dww].equals("Y")) { //2���迭�� �ι�° �׷��� �����Ͱ� Y�ΰ��
					aa[count]=this.mn[0][dww]; // ���� ������ 1���迭�� ù��° �׷��� ������ �߰�
					count++;
				}
				dww++;
			}while(dww<ea2);
			this.nmn = aa;
	}
	public String [] pt() {
		return this.nmn;
	}
}

/*
 class aaa{
 int a;				->field
 String b;
 	public aaa{ -> constructor, Ŭ���� ȣ��� �ٷ� ����.
 	}
 	->method 
 	public void
 	public static void
 	public String abc	
 }
 
 */
