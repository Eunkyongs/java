package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing3 {
	//�ݺ����� �̿��Ͽ� Ű ���� �� �迭���� split���� �и� �۾�
	public static void main(String[] args) {
		String data[] = {"ȫ�浿","������","�̼���","������"};
		
		Map<String, String> m = new HashMap<>();
		
		//�ݺ��� ����ؼ� �ߺ����� �ʴ� Ű�������� �迭���� map�� ����ֱ�
		int w = 0;
		do {
			//�ߺ����� �ʴ� Ű�� ���� + �ش� �迭�� �ִ� index��ȣ
//			m.put("name"+w, data[w]); //�ߺ����� �ʴ� Ű�� ���� + �ش� �迭�� �ִ� index��ȣ
			m.put(String.valueOf(w), data[w]); // index��ȣ�� 0,1,2,3 �̷������� �ű涧 �̷�������� ��뵵 ������  
			w++;
		}while(w<data.length);
		System.out.println(m);
		
		Map<String, String> m2 = new HashMap<>();
		for(String names : data) {
			m2.put(names, names); //foreach�� Ű, ���� �����ϰ� ����
			
		}
		System.out.println(m2);
		
		//Ű�� �ִ� �迭 const // Ű�� �������� �迭�ȿ� �迭 ����?!
		String alldata [] = {"names=ȫ�浿","age=25","email=hong@naver.com"};
		Map<String, String> m3 = new HashMap<>();
		for(int f=0; f<alldata.length; f++) {
			String key[]= alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		                 
		System.out.println(m3);
		
		
		
	}

}
