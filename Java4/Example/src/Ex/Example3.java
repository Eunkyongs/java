package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		/*
		 ���빮�� (����) 
		 ���Ե� ȸ������ �� ���� �����Ϳ��� ����Ʈ�� ���� ������� ������̸��� �����Ͽ� ����մϴ�.
		 
		  ���
		  [���缺,�ѿ�,���Ѽ�,������,�赵��,���Ѱ�,ȫ�浿,���,�̼���,������,������]

		 -���μ��� �ڵ� ������ ������ free-
			String data[][]={
				{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
				{"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
				{"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
				{"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
				{"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
				{"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
				{"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
				{"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
				{"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
				{"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
				{"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
		};
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(data));
		System.out.println(list.get(1)[0]);
			 */
		
		/*���빮��: ���Ե� ��� ȸ���� ����Ʈ �� ���� ���Ͻÿ�
		 ��, abstract�� ������ ����ؾ� �մϴ�.
		 ���: "ȸ�� ��ü�� ����Ʈ �հ��: 34390 �Դϴ�."
		*/
//		member_point mp = new member_point();
//		mp.set();
//		int z = mp.get();
//		System.out.printf("ȸ�� ��ü�� ����Ʈ �հ��: %d �Դϴ�.",z );
		
		plus ps = new plus();
		ps.setter();
		int a = ps.getter();
		System.out.println("ȸ�� ��ü�� ����Ʈ �հ��: "+a+"�Դϴ�.");
	}
}
//Ǯ�� �ڵ�
abstract class abc{
	ArrayList<String[]> userdb = null;
	abstract void setter();
	abstract int getter();
	abstract void db();
}
class plus extends abc{
	int total = 0;
	
	@Override
	void setter() {
		this.db();//void db�޼ҵ� �۵�, ������ �ҷ�����
		int ea =this.userdb.size();
		int dw = 0;
		do {
			this.total += Integer.parseInt(this.userdb.get(dw)[6]); //�����Ͱ� ���ڿ��̱⶧���� ���ڷ� ��ȯ�ؼ� �� ����
			dw++;
		}while(dw<ea);
	}
	@Override
	int getter() {
		return this.total;
	}
	@Override
	void db() {
		String user[][] = {
				{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
				{"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
				{"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
				{"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
				{"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
				{"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
				{"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
				{"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
				{"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
				{"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
				{"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
		};
	this.userdb = new ArrayList<String[]>(Arrays.asList(user));
	
	}
}

/*
//���ڵ�
abstract class point{
	String a1[][];
	ArrayList<String[]> list = null;
	ArrayList<String> plist = null;
	public abstract void set();
	public abstract int get();
	public abstract void data();
}
class member_point extends point{
	int ea = 0;
	int result= 0;

	@Override
	public void set() {
		this.data();
		this.ea = this.list.size(); // 11
		this.plist = new ArrayList<String>();
		int w=0;
		while(w<this.ea) {
			this.plist.add(this.list.get(w)[6]);
			this.result += Integer.parseInt(this.plist.get(w));
			w++;	
		}
	}
	
	@Override
	public int get() {
		return result;
	}
	
	@Override
	public void data() {
		this.a1 = new String [][] {
			{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			{"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			{"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			{"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
			{"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
			{"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
			{"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
			{"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
			{"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
			{"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
			{"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
		};
	
		this.list = new ArrayList<String[]>(Arrays.asList(this.a1));
	}
}
*/