import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*���빮��: �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� ���� �˴ϴ�.
		  �� �� ���������� ���� 3�̸�(3������)�� ���� Ȯ���Ͽ� �迭 �����͸� �簡�� �մϴ�.
		  ���������:"ȫ�浿","�̼���","������","�������","������","������"
		  ����������: 4,3,1,1,2,2
		  ����� : ["������","�������",������","������"] 
		  */
		
		String member[] = { "ȫ�浿","�̼���","������","�������","������","������"};
		int lv[] = {4,3,1,1,2,2};
		
		//���ڵ�
		int lv_ea=lv.length; // �迭�� ��ü ���� �ľ�
		int a [] = new int[4]; // ������ ������ ���ο� �迭
		String [] b =new String[4];
		int count=0; // ��迭�� �ε�����ȣ �ο���
		int dw = 0; //�ݺ������
		
		do {
		if(lv[dw]<3) {
			a[count]=lv[dw];
			b[count]=member[dw];
			count++;
		}
			dw++;
		}while(dw<lv_ea);
		System.out.println(Arrays.toString(b));

		//������ Ǯ��
		String new_member [] = new String[8];
		int ea = member.length;
		int f;
		int ct=0;
		for(f=0; f<ea; f++) {
			if(lv[f]<3) {
				new_member[ct]=member[f];
				ct++;
			}
		}
		System.out.println(Arrays.toString(new_member)); 
		// Arrays(��ƿ��).toString(�Ӽ�) :����,����,�Ҽ� [] ���� �迭 �������� ����ϴ� �Լ��Դϴ�.
		
	}
}
