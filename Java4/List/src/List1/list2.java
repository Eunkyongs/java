package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*���빮�� : �ش� ������ �� �� �޸�� �����ʹ� ��� ���� �ؾ� �մϴ�.
		  �� ������ 
		  �����, ������, ��â��, �ڵ���, �̰���, �����, ������
		  
		  ���
		  �����, ������
		  */
		
//		String []user_data = {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
//		
//		ArrayList<String> ar= new ArrayList<>(Arrays.asList(user_data));
//		int ea = ar.size(); 
//		
//		int w = 0;
//		do {
//			int ea2 = ar.size(); // node�� ������ �ٽ� �ľ���
//			int ww=0;
//			while(ww<ea2) {
//			if(!ar.get(ww).equals("�����") && !ar.get(ww).equals("������")) {
//			ar.remove(0);	
////			System.out.println(ar);
//			}		
//			}
//			w++;
//		}while(w<ea);
		
		/*
		 ���빮�� ¦���� ���ڸ� ��� �����մϴ�.
		 10,7,6,1,11,37,41,22
		 
		 ���
		 7,1,11,37,41  
		 */
		
		Integer numb [] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numb));

		//�������ڵ�
//		int no = num.size();
//		int z =0;
//		do {
//			int no2 = num.size();
//			int zz=0;
//			do {
//				if(num.get(zz)%2==0) {
//					num.remove(zz);
//					break;
//				}
//				zz++;
//			}while(zz<no2);
//			z++;
//		}while(z<no);
//		System.out.println(num);
		
		
		
		int nea = num.size();
		int f,ff;
		for(f=0; f<nea; f++) {
			int nea1 = num.size();
			for(ff=0; ff<nea1; f++) {
				if(num.get(ff)%2 == 0) {
					num.remove(ff);
					break;
				}
			}
		}
		System.out.println(num);
		
		
		
	}
}
