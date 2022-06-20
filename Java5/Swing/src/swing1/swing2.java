package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		// ArrayList, LinkedList (�迭��) - add, remove, get, size
		// Map (�迭Ű, �迭��) - put(add ��Ż��) , remove, get, size
		// Map�� �迭Ű ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ���մϴ�.(�ӵ� �ֻ��)
		// ���� Ű���� ���� �������� ����� ������ ���ŵ˴ϴ�.
		// ��Ű���� ���� �ߺ���Ű�� ����
		Map<String, String> m = new HashMap<>();
		//hong -> Hash function(HashMap) -> 0x21949CB (�ߺ����� �߻����� ����)
		m.put("hong", "ȫ�浿");  
		m.put("kang", "������");
		
		System.out.println(m.get("kang")); // �Ϲ� �ε��� ��ȣ�� ������ null�� ���, �迭 Ű���� �־�� �ҷ�����
		m.put("", "�����ż�");//����ִ� Ű�� ����� �� �� ������, Map�� �������� �ùٸ��� ���� 
		// ����ִ°��� Ű������ �ν���. ������ �̷��� ��������� ����
		m.put("park", ""); //Ű�� ������ ���� ������� ���� ����
		
		if (m.get("park").equals("")) {
			m.put("park", "��");
		}
		m.remove("hong");
		System.out.println(m);
		
		//Map : �������� �ڷ����� ����� �� ���� <String,Object>->�������� �ڷ��� ȥ���Ҷ�
		//Map���� Object �����ؼ� ���� �ް� ���� �ʾƵ� ��(Ű������ ȣ���ϱ⶧����). ���� ���� int�� �����߻� Integer�� �ؾ� �����ȳ�
		
		Map<String, Integer> m2 = new HashMap<>();
		m2.put("age", 32);
		m2.put("level", 5);
//		System.out.println(m2.get("level"));
		System.out.println(m2.keySet()); // Ű�� ���
		System.out.println(m2.values()); //���� ���
		System.out.println(m2.containsKey("age")); //containsKey: �ش� Ű�� �ִ��� Ȯ�� (false:����, true:����)
	}

}
