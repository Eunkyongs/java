
public class While_plus {

	public static void main(String[] args) {
		/*5~10���� ���� �հ���� ���*/
		int w= 5; // �ʱⰪ
		int total =0; //�հ�ġ�� ������Ű�� ���� ������
		while(w<11) { //�ݺ�����
			total += w; //5~10���� ���� �հ�� ��� total=total+w; 
			w++; // ����
		}
		System.out.println("�հ�:"+total);
	
		/*���빮�� : 3~8���� ���� �� �հ���� ����Ͻÿ�  
		 3 4 5 6 7 8
		 �����:20160
		 */ 
		
		int num=3;
		int tot=1; // ���ϱ� �հ踦 ������ 1�� �⺻���� ����
		while(num<9) {
			
			tot=tot*num; //tot*=num; +�Ҷ��� �հ�� �����ϴ� �����ʱⰪ0���ϴ°� ����. ���ϱ�� �����ʱⰪ1 
			num++;
		}
		System.out.println("�հ�:"+tot);
	}

}
