import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*�����迭
		int a [] = new int[2];
		a[0]=22;
		a[1]=32;
		*/
		/* �����迭
		int b [] = {1,2,3,4};
		int [] c = {1,2,3,4};
		int [] d = new int[]{1,2,3,4};
		*/
		
		/* 2���迭 [][] */
		
		/*2�� �����迭
		String member2[][] = new String [3][3];
		*/
		
		//2�� �����迭
		String member [][] = {
				{"ȫ�浿","������","������"}, //{0,1,2}
				{"25","31","22"}		  //{0,1,2}	
				
		};
		int ea = member.length; // �迭�� ������ �����Ȯ��. �迭�� 2���̴� 2�� ����
		int data_ea = member[0].length; // �ش� �迭���� ������ ��ü�� ��ִ��� Ȯ�� 

//		System.out.println(data_ea);
		
//		System.out.println(member[1][2]);
		int f, ff; // �ݺ����� ���
		
		for(f=0; f<ea; f++) { // ū �ݺ����� �迭 ������ŭ loop . �迭�� 2���� 2�� �ݺ�
//			System.out.println(Arrays.toString(member[f]));//2���迭 ��½ÿ� �ε�����ȣ ��!!�־��ֱ�
			for(ff=0; ff<data_ea; ff++) { // ���� �ݺ����� �迭�� �ִ� ������ ���� ��ŭ loop . �迭���� ������ 3���� 3�� �ݺ�
//				System.out.println(member[f][ff]);
				
			}
		}
		
		
	/**/
		int [][] datas = {
				{1,3,5},
				{2,4,6}				
		};
		int fea = datas.length; // �迭���� Ȯ��
		int dea = datas[1].length; // �迭���� ������ ����Ȯ��
		int total=0;
		int w,ww;
		
		for(w=0; w<fea; w++) {
//			System.out.println(Arrays.toString(datas[w]));
			for(ww=0; ww<dea; ww++) {
//				System.out.println(datas[w][ww]);
				total += datas[w][ww];
			}
			
		}
//		System.out.println("�� �հ�� : "+total);
		
		/*���빮��:�ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ���Ͻÿ�.
		 1�� ������ : 11,42,22,16
		 2�� ������ : 7,33,10,29
		 �����:90		 
		 */
		
		int num [][] = {
				
				{11,42,22,16},
				{7,33,10,29}
		};
		
		int num_ea = num.length;
		int eaa=num[0].length;
//		System.out.println(num_ea);
//		System.out.println(eaa);
		
		int a,aa;
		int tt=0;
		int wh=0;

		//for��
/*		for(a=0; a<num_ea; a++) {
//			System.out.println(Arrays.toString(num[a]));
			for(aa=0; aa<eaa; aa++) {
				
				if(num[a][aa] % 2 ==0) {
					tt+= num[a][aa];
				}
			}
			
		}
		System.out.println("�����: "+tt);
*/		
		//while��
		while(wh<num_ea) {
//			System.out.println(Arrays.toString(num[wh]));
			int whh=0;
			while(whh<eaa) {
//				System.out.println(num[wh][whh]);
				if(num[wh][whh]%2 == 0) {
					tt += num[wh][whh];
				}
				whh++;
			}
			wh++;
		}
		System.out.println("�����:"+ tt );
		
/*		//������ Ǯ��
		int numbers[][]= {
				{11,42,22,16},
				{7,33,10,29}
		};
		int ws=0;
		int totals=0;
		while(ws<numbers.length) { //�տ� �����ʾ������� ������ ���� �����ؼ� ����ϵ��� �� ��
			int wz =0;
			while(wz<numbers[ws].length) {
				if(numbers[ws][wz] %2 == 0) {
					totals+=numbers[ws][wz];
				}
				wz++;
			}
			
			ws++;
		}
		System.out.println(totals);
		*/
	}

}
