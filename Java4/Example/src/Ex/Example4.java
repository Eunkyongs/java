package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 ���빮�� : ����ڰ� ���� ���ڸ� �Է� �޽��ϴ�. Scanner
		 ��, ����ڰ� ���ڸ� �Է��� ��� ���� ó���� ����Ǿ�� �մϴ�.
		 �� ���� �Է��� 7�� �̸�, ����ڰ� �Է��� ���ڸ� ������������ ���� �մϴ�.  
		 "���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.:" -7��
		 ���: [6,22,37,44,45,80,100]
		 �߰��ɼ� - ¦���� Ȧ�� ���� ������ �迭�� �����ϵ��� �մϴ�.
		 [6,22,44,80,100]
		 [37,45]
		 */
		//���ڵ�
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> numlist1 = new ArrayList<Integer>();
		ArrayList<Integer> numlist2 = new ArrayList<Integer>();
		Integer inputnum = 0;
		
		for(int f=0; f<7; f++ ) {
			System.out.println("���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�.:");
			
			try {
				 inputnum=Integer.valueOf(scan.next()); // �����Է½� ���� ����
				 if(inputnum %2==0){
					 numlist1.add(inputnum);
				 }else {
					 numlist2.add(inputnum);
				 }
			}
			catch(Exception e){
				System.out.println("���ڸ� �Է��� �ּ���.");
//				break;
			
			}
		}
		Collections.sort(numlist1);
		Collections.sort(numlist2);
		System.out.println(numlist1);
		System.out.println(numlist2);
		
		
	/*
		//�������ڵ�
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> data = new LinkedList<>();
		LinkedList<Integer> data2 = new LinkedList<>();
		int w =0;
		do {
			System.out.println("���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�.:");
			try {
				Integer ck = Integer.valueOf(sc.next()); // ���� �ƴѰ� �ԷµǾ������ ������������
				if(ck%2 == 0) {
					data.add(ck);
				}else {
					data2.add(ck);
				}
				
			}catch(Exception e){
				System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
			}
			
			w++;
		}while(w<7);
		Collections.sort(data);
		Collections.sort(data2);
		System.out.println(data);
		System.out.println(data2);
		*/
	}

}