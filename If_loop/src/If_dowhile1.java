
public class If_dowhile1 {

	public static void main(String[] args) {
		
		/*
		 ���빮�� :  ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�.
		 */
		
		final int six = 6; //6�� ��������
		int d=1; //�ʱⰪ
		int e;
		do {	
			e=six*d;
			if(e>=35) {
//				System.out.print(e+" ");
			}
			d++;
		}while(d<10);
	
		
		/*���빮�� : 14~27���� ���� �� ¦������ ��� ���Ͽ� ���� ������� ����Ͻÿ� �����:140*/
		
		int num=14; //�ݺ��� ���۰�
		int tot=0; // �������� ����
		do {
			if(num%2==0) {//�ݺ��� ����� ���� ¦���� ���
				tot+=num; //¦���ΰ� ���ض�
			}			
			num++; // 1�� ����
		}while(num<28); //27���� �ݺ��ϰڴ�.
		System.out.print("�����:"+tot); // �ݺ��� ���� �� tot�� ����� ¦������ �հ� ���
		
		
	}

}
