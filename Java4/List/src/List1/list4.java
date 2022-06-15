package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {
	
	public static void main(String[] args) {
		Integer a[] = {3,6,9,12,15};
		
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
		//LinkedList : 배열 중간중간 수정해야할경우는 ArrayList보다 빠름
		System.out.println(ln);
		//for(;;){} //for문 무한루프 , //do{}while(true); // do~while문 무한루프
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>(); // 비어있는 배열
		String user;
		while(true) {
			System.out.println("숫자를 입력하세요");
			user = sc.next();
			try { // 사용자가 입력한 값이 오류가 있는지 확인하는 파트
				int number = Integer.parseInt(user);
				list.add(number);
				int ea = list.size();
				if(ea>5) { //5개까지 배열이 입력되면 무한루프를 빠져나옴
					break;
				}
			}catch(Exception e) { // 오류가 발생하였을 경우 작동되는 파트
				System.out.println("해당 입력사항은 문자 입니다.\n제발 숫자만 입력하세요.");
			}
		}
		System.out.println(list);

	}
}
