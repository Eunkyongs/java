import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/*���빮��: 2���� ������ �迭�� �ֽ��ϴ�. �ش� ������ �迭�� ���� ��� ó�� ���� ����Ͻÿ�.
		 
		  1�� DATA : ���ѹα�,�Ϻ�, �߱�,��Ʈ��, �±�
		  2�� DATA : 40,35,70,55,32
		  ��� DATA : ["���ѹα�(40)","�Ϻ�(35)","�߱�(70)","��Ʈ��(55)","�±�(32)"]
  		 */

		
		String data_1[][] = {
				{"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"},
			    {"40","35","70","55","32"}
		};
			

		int ea2=data_1[0].length;	
		String to_data [] =new String [ea2]; 
		
		int ff;
		int c=0;
		
			for(ff=0;ff<ea2; ff++){
//			to_data[ff] = data_1[0][ff]+"("+data_1[1][ff]+");
			c++;
//			System.out.println(data_1[]);
			}
	
//		System.out.println(Arrays.toString(to_data));

		
		/*		
		//������ �ڵ�
		
		String data[][] = {
				{"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"},
				{"40","35","70","55","32"}
		};
		
		int ar=data.length;
		int ar2=data[0].length;
		String newdata [] = new String[data[0].length];
		int w=0;
		
		do {
			int ww=0;
			do {
			//				System.out.println(data[0][ww]);
				newdata[ww] =data[0][ww]+"("+data[1][ww]+")"; 
				ww++;
			}while(ww<ar2);
			
			w++;
		}while(w==0);
		System.out.println(Arrays.toString(newdata));
 */		
		
		/*���빮��: �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. 
		 �� �迭���� �ε����� ���� ��ȣ�� ���ؼ� ¦��, Ȧ�������� �迭 ��� �����ͷ� �缳���Ͻʽÿ�.
		 
		 Adata = 5,17,19,22,33
		 Bdata = 1,2,3,4,5
		 Result= ["¦��","Ȧ��","¦��","¦��","¦��"] 
		 */
/*		int dt[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		int dt_ea2=dt[0].length;
		int ww=0;
		int to;
		while(ww<dt_ea2) {
			to = dt[0][ww]+dt[1][ww];
				 if(to %2 == 1) {
					 System.out.println("Ȧ��");
				 }else {
					 System.out.println("¦��");
				 }
//				System.out.println(to);
			ww++;
		}
*/
		
//		������ Ǯ��
		
		int A1 [][]= {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		int data_ea = A1[0].length; // �迭�� ������ ������ŭ �ݺ��� 
		int f=0;
		int total;
		String result;
		String result_data[]=new String [data_ea];
		while(f<data_ea) {
			total = A1[0][f]+A1[1][f];
			if(total%2==0) {
				result="¦��";
			}else {
				result="Ȧ��";
			}
			result_data[f] = result;
			f++;
		}
		System.out.println(Arrays.toString(result_data));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
