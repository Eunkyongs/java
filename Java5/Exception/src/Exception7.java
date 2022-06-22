import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*
		���빮��2: ���������� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88}
		�ش� ������ ���� ���ڰ��� ��µǵ��� ��迭 �Ͻñ� �ٶ��ϴ�.
		��, ���ο����� �ش� �迭�� �ܺ�Ŭ���� (setter)�� �����մϴ�.
		�ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� ���� �մϴ�.
		getter���� �ش� �迭�� return���� �������� �մϴ�.
		��, �ܺ�Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó���ǵ��� �մϴ�.
		*/
		
		try {
			redata r= new redata();
			Object data []={"ȫ�浿",55,"������","������",48,"�̼���","����",34,88};
			r.setter(data);
			LinkedList result = r.getter(); //return�޴� ���� �迭class�̹Ƿ� �ش� class������ ���� �� �޾ƾ� �˴ϴ�. 
			// getter�� �ڷ����� LinkedList�̹Ƿ� �������� LinkedList�� ����. LinkedList<String>���� �ᵵ ����.
			System.out.println(result);
		}
		catch(Exception a){
			if(a.getMessage()!=null) {
			System.out.println(a.getMessage());
			}
		}
	}
}

class redata{
	
	LinkedList<String> redata = new LinkedList<>(); //�̸������͸� ������ ��迭 ����. ���� LinkedList�� �������� �����Ƿ� null;�� �����ص� ������. 
	
	public void setter(Object[] call) throws Exception{
		int ea = call.length; // 9��
		int w =0;
		
		// Object�϶� (int)call[1] �̷������� Ȯ���� �μ����տ� �ڷ��� �ٿ���.  
		//Object�迭�� ���� ������ Ȯ��
//		int check = Integer.valueOf((int)call[1]);
//		int check =(int)call[1];
		// Object�迭�� ���ڵ����� Ȯ��
//		String check =(String)call[0]; 
//		String check = new String((String)call[0]);
		do {
			try {
				//�ش� �迭�� �ε�� (�ڷ���)��ȯ�� �ϴ� ������ Object �迭�̹Ƿ� �����Ͽ���.
				String check = String.valueOf((String)call[w]);
				this.redata.add(check);
			}catch(Exception ex){ // �ڽ� class���� ���� �߻��� ��µǴ� catch��. �� throw ����ϸ� �ٽ� main���� ���޵˴ϴ�. �߿��� ������ throw�� ���޽� �ش� �ݺ����� �����ϰ� �˴ϴ�.
//				System.out.println(ex); // ĳġbox�ȿ��� ��ü������ ���� �ذ�. throw�� ����ϸ� main �޼ҵ�� ���ܻ��� �Ѿ
			}
			w++;
		}while(w<ea);
	}
	public LinkedList<String> getter() { //�迭 class�̸����� getter�� ���� �� �ֽ��ϴ�.
		return this.redata;
	}
	
}
