package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(�߰�), get(�����ͷε�), remove(����), size(index����) : ArrayList ��� util �޼ҵ� ���� ����ϴ� �κ�
		//Arrays.asList : �ε��� �迭 ������ ����
		//�߿�:add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰���. ��, index ��ȣ�� ���� �� ���� �����ϸ� �ش� index �κп� �����Ͱ� �߰���
		String member [] = {"�̼���","ȫ�浿","������","������"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
//		System.out.println(mb);
		int ea = mb.size();
//		System.out.println(ea);
		mb.add("������"); // �迭�� ���� ���� ������ �߰�
//		System.out.println(mb);
		mb.remove(1); // �迭�� ������ ����
//		System.out.println(mb);
		mb.add(3,"�������"); // �ε�����ȣ,������ �ϸ� �� �ε�����ȣ�ڸ��� ������ ��.
//		System.out.println(mb);
		String checks = mb.get(2);
		System.out.println(checks);
		/*���빮�� 
		 �������� 15,22,37,8,11,19,41 �Դϴ�.
		 �ش� �� �����͸� Ŀ�����Ͽ� �������ó�� ����Ͻÿ�.
		 [7,15,22,8,11,39,41]
		 */
		Integer numbers [] = {15,22,37,8,11,19,41};
		
		/*ArrayList���� int�� ������� ���� (Integer)�����*/
		ArrayList<Integer> nb = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(nb);
		nb.remove(2);
		nb.remove(4);
		nb.add(4,39);
		nb.add(0,7);
		System.out.println(nb);
		
	
	}

}
