import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 �迭 ������: ȫ�浿, �̼���, ������ ������ �����Ͱ� �ֽ��ϴ�.
		 ���� Ŭ�������� ���ڸ� �ϳ� �����մϴ�.
		 ��, ���ڰ� null�� ���� �� ������, �迭�����Ϳ� ���Ծ��� "������"�̶�� �������� �ֽ��ϴ�.
		 �ܺ� Ŭ������ : data_list �̸�
		 �߻� Ŭ������ : v_constuct �Դϴ�.
		 �ܺ� Ŭ���� �ȿ� ���� Ŭ���� �� : check �Դϴ�.
		 
		 [�������]
		 ���� class���� �������� ������ ���
		 ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�." ��� ���
		 ���� class���� �̼����� ������ ���
		 ���� Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�." ��� ���
		 ��, ArrayList�� �迭�� �ε� �Ͻʽÿ�.*/
			
		data_list v =new data_list();
		v.userinput("ȫ�浿");
	}

}

abstract class v_constuct{
	String username;
	String data_list[];
	public abstract void userinput(String nm);
}
class data_list extends v_constuct{
	@Override
	public void userinput(String nm) {
		if(nm==null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");
		}else {
			this.username=nm;
//			System.out.println(this.username); //���ο��� �̸� �� �Ѿ������ Ȯ��
			check ck = new check(); // �ڽ�Ŭ������ ���ο� ȣ�������ʰ� ���⼭ ȣ���ص� ��°���
			ck.db();
		}
	};
	
	class check{
		String username=data_list.this.username; // ���θ޼ҵ忡�� ������ �� ����
		String data_list[]; // field�� �迭�� �޴� ��ü ���� 
		ArrayList<String> ar = null; // ArrayList util �� field�� ��ü�� �����س���
		public void db() {
			//�ش� �ʵ忡 �ִ� ArrayList�� �ν��Ͻ��� ����
			this.data_list = new String[] {"ȫ�浿","�̼���","������"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); // this�� ó��
			this.compare(); // ���� db�� ����� ������ ���ϴ� �޼ҵ�
		}
		public void compare() {
			int ea = this.ar.size();
			int w = 0;
			boolean bl = false;
			do {
				if(this.username.equals(this.ar.get(w))) {
					bl = true;
				}
				w++;
			}while(w<ea);
			
			if(bl == true) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
			}
			else {
				System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�.");
			}
		}
		
		/* ���ڵ�->��Ǯ�� ��
		String msg; 
		public void message() {
			int w =0;
			int ea1 = data_list.size();
			boolean tf = false;
//			System.out.println(this.data_list);
			while(w<ea1) {
				if(this.username.equals(this.data_list.get(w)) {
					tf=true;
				}
			w++;	
			}
			
			if(tf==true) {
				msg ="�ش� ����ڰ� �ֽ��ϴ�.";
			}else {
				
				msg="�ش� ����ڴ� �����ڰ� �ƴմϴ�.";
			}
			System.out.println(username+", "+msg);
			
		}	
		*/	
	}
}