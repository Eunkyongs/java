import java.util.ArrayList;

public class Exception3 {
	public static void main(String[] args) {
		//���빮��
		// data = {"hong45","lee90","kang100","park70","kim72"};
		/*
		 �ش� �迭 ������ ���� main2��� �޼ҵ�� ���� �����ϴ�.
		 �ش� ���� ���� �� ����ó���� ������ �߻� ���Ѿ� �ϸ�,
		 ���� ���� �������� ���� ���� ������ �˴ϴ�.
		 main2������ �ش� �迭 ���� ���� �� �ش� ������ ��� �ջ��� ����� ���;� �˴ϴ�.
		 ��, ���� ��ȯ�� ������ �߻��� ��� finally�� üũ �� �ش� main2 �޼ҵ�� �ٽ� ȣ���Ͽ� ���������� �����Ͱ� �������� �Ͻʽÿ�. */

		//������ �ڵ�
		String data[] = {"hong45","lee90","kang100","park70","kim72"};
		try {
			total_method(data);
		}catch(Exception z) {
			System.out.println(z);
		}
		finally {
			ArrayList<String> rdata = new ArrayList<String>();
			int j =0;
			String modify;
			while(j<data.length) {
				modify=data[j].replaceAll("[a-zA-Z]", "");
				rdata.add(modify);
				j++;
			}
			String cdata[] = new String[rdata.size()];
			
			int q=0;
			do {
				cdata[q]=rdata.get(q);
				q++;
			}while(q<rdata.size());
			
			try {
				total_method(cdata);
			}catch(Exception h){
//				System.out.println(h.toString());
				//printStackTrace() :������!!! �����߻� �ٿ��� ���� ����ε�, �ǹ����� �Ⱦ��� �޸𸮰� ��� �����Ǿ� ����Ǵϱ� �����������
//				System.out.println(h.getMessage()); // null�� ������ ����
				if(h.getMessage()==null) {
					System.exit(0);
				}else {
					System.out.println(h);
				}
				
			}
		}
	}
	static public void total_method(String db[]) throws Exception {
		
		int w =0;
		int ea = db.length;
		int values;
		int jumsu=0;
		while(w<ea){
			values = Integer.valueOf(db[w]);
			jumsu += values; 
			w++;
		}
		System.out.println(jumsu);
		
		Exception e = new Exception();
		throw e;
	}
	

	/*	//���ڵ�
		String data[] = {"hong45","lee90","kang100","park70","kim72"};
		Exception3 ex = new Exception3();
		try {
			ex.main2(data);
		}catch(Exception z) {
			System.out.println(z);
		}finally {
			int dw=0;
			int c=0;
			String re;
			String aa[]=null;
			do {
			re = data[dw].replace("[a-zA-Z]", "");
			aa[c] += re;
			c++;
			dw++;
			}while(dw<data.length);
		}
	}
	public void main2 (String []a) throws Exception {
		int total=0;
		int score;
		for(int f =0 ; f<a.length; f++) {
			score = Integer.valueOf(a[f]);
			total += score; 
		}
		System.out.println(total);
		Exception e = new Exception();
		throw e;
	}*/
}
