package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3_1 {

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

//		pointdata pd = new pointdata();
//		pd.setter();
		
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
		
		
		int f,ff;
		int ea1=data[0].length;//7
		int ea2=data.length;//11
		int a[] =new int[ea2];
		int cc=0;
		ArrayList<String> list = new ArrayList<>(Arrays.asList());
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList());
		
			for(ff=0; ff<ea2; ff++) {
				list.add(data[ff][6]);
				list2.add(cc+data[ff][0]);
				cc++;
			}
		System.out.println(list);
		System.out.println(list2);
		Collections.sort(list);
		
		
		int c=0;
		for(f=0; f<list2.size(); f++) {
			
//			a[c] = Integer.parseInt(list.get(f));
			c++;
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int w=0;
		while(w<a.length) {
		if(list2.get(w).equals(a[w]) ) {
			System.out.println(a[w]);

		}else {
			
		}
		w++;
		}
		
	}

}
/*
abstract class ab{
	ArrayList<String[]> list = null;
	ArrayList<String> point = null;
	ArrayList<Integer> pp = null;
	ArrayList<String> user = null;
	ArrayList<String> fpoint = null;
	public abstract void setter();
	public abstract void db();
	public abstract String getter();
}
class pointdata extends ab{
	int p = 0;
	String [] u =null; 
	
	@Override
	public void setter() {
		this.db();
		int ea =this.list.size(); // 11
		
		this.point = new ArrayList<>();
		this.pp = new ArrayList<>();
		this.user = new ArrayList<>();
		
		//����Ʈ�� ���� ����Ʈ ����
		for(int f =0; f<ea; f++) {
			this.point.add(this.list.get(f)[6]);
		}
		
		//����Ʈ�� ���ڷ� ��ȯ�ؼ� ������ �ٽ� ���������� ��ȯ
		for(int ff = 0; ff<this.point.size(); ff++) {
			this.p = Integer.parseInt(this.point.get(ff));
			this.pp.add(p);
		}
		Collections.sort(pp); // ����
		this.fpoint = new ArrayList<>();
		int w = 0;
		while(w<ea) {
			String z =String.valueOf(this.pp.get(w));
			this.fpoint.add(z); // ����>���ں�ȯ�ؼ� �ٽù迭����
			w++;
	}
//		System.out.println(fpoint);
		
		//����Ʈ�� ������ ������� �̸� ������
		this.user = new ArrayList<>();
		int dw = 0;
		do {
			int dw1 =0;
			do {
//				if(this.fpoint.get(dw).equals(this.list.get(dw)[6])) {
			System.out.println(this.list.get(dw)[0]);
//				}
			dw1++;
			}while(dw1<ea);
		dw++;
		}while(dw<ea);		
		
		
	}
	@Override
	public void db() {
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
		this.list=new ArrayList<String[]>(Arrays.asList(data));
	}
	@Override
	public String getter() {

		return null;
	}
}
*/