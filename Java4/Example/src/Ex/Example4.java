package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 응용문제 : 사용자가 직접 숫자를 입력 받습니다. Scanner
		 단, 사용자가 문자를 입력할 경우 예외 처리가 진행되어야 합니다.
		 총 숫자 입력은 7번 이며, 사용자가 입력한 숫자를 오름차순으로 정렬 합니다.  
		 "숫자를 하나 입력해 주시길 바랍니다.:" -7번
		 결과: [6,22,37,44,45,80,100]
		 추가옵션 - 짝수와 홀수 값을 별도로 배열을 관리하도록 합니다.
		 [6,22,44,80,100]
		 [37,45]
		 */
		//내코드
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> numlist1 = new ArrayList<Integer>();
		ArrayList<Integer> numlist2 = new ArrayList<Integer>();
		Integer inputnum = 0;
		
		for(int f=0; f<7; f++ ) {
			System.out.println("숫자를 하나 입력해주시길 바랍니다.:");
			
			try {
				 inputnum=Integer.valueOf(scan.next()); // 문자입력시 에러 방지
				 if(inputnum %2==0){
					 numlist1.add(inputnum);
				 }else {
					 numlist2.add(inputnum);
				 }
			}
			catch(Exception e){
				System.out.println("숫자를 입력해 주세요.");
//				break;
			
			}
		}
		Collections.sort(numlist1);
		Collections.sort(numlist2);
		System.out.println(numlist1);
		System.out.println(numlist2);
		
		
	/*
		//선생님코드
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> data = new LinkedList<>();
		LinkedList<Integer> data2 = new LinkedList<>();
		int w =0;
		do {
			System.out.println("숫자를 하나 입력해주시길 바랍니다.:");
			try {
				Integer ck = Integer.valueOf(sc.next()); // 숫자 아닌값 입력되었을경우 에러방지위함
				if(ck%2 == 0) {
					data.add(ck);
				}else {
					data2.add(ck);
				}
				
			}catch(Exception e){
				System.out.println("숫자를 입력하셔야 합니다.");
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
