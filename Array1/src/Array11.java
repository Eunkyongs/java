import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		/*���빮�� : ���� �迭���� �ֽ��ϴ�. �ش� �迭 ���� ���Ͽ� ����� ������ ����Ͻÿ�.
		Adata = "hong" ,"kim", "park", "jang", "lee", "soun"
		Bdata = 80, 100, 46, 38, 65, 88
		����迭�� ���� ������ 60���̻�(����)�� �հ��ڸ� ����մϴ�.
		����迭[hong, kim, lee, soun]*/
		
		String [] Adata = {"hong" ,"kim", "park", "jang", "lee", "soun"};
		int [] Bdata = {80, 100, 46, 38, 65, 88};
		
		int a_ea = Adata.length; // �迭�� ���� Ȯ��
		 
		int f;//�ݺ����� ����� ����		
		String name [] = new String[4] ; // ���ǿ� �����ϴ� ������ ���� ���ο� �迭 ����
		int ct=0; // ���ο� �迭�� �ε�����ȣ �ο��ϱ����� ī���� ����
		for(f=0; f<a_ea; f++) {//0���� �����ؼ� �迭�� ���̺��� 1���������� �ݺ�
			if(Bdata[f]>=60) { //����������ִ� Bdata�迭���� 60�̻��� ���� �ϸ�
				name[ct]=Adata[f]; // ���μ����� �迭�� �̸��� ����ִ� Adata�迭�� �����͸� ���Խ�Ŵ
				ct++;//������ �����ϸ� �ε�����ȣ ����
			}			
		}
		System.out.println(Arrays.toString(name)); //�ݺ��� ���� �� ���� ������ name�迭�� ���� ���.
	}

}
