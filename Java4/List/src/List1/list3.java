package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 �ѹ������� 1: 3,6,9,12,15
		 �ѹ������� 2: 2,4
		 
		 ��� : 3,6,9,12,15,2,4 
		 */

		Integer n1[] = {3,6,9,12,15};
		Integer n2[] = {2,4};
		
		ArrayList<Integer> a1= new ArrayList<>(Arrays.asList(n1));
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(n2));
		
		int ea2 = a2.size();
		
		int w=0;
		while(w<ea2) {
			a1.add(a2.get(w));
			w++;
		}
		Collections.sort(a1); // ArrayList, LinkedList sort �������� ����		
		System.out.println(a1);
		
		int ea1 = a1.size();
		System.out.println(ea1);
		
//		Integer c[]=n1;
//		Arrays.sort(c); // �迭 ���� ���¿��� �����մϴ�.
//		System.out.println(Arrays.toString(c));
		
	}
}
