import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 숙제 : ArrayList 를 무조건 이용하여 결과값을 출력되도록 합니다.
 원시데이터 => {"red","green","blue","pink","orange","black","white","hotpink","gray"}
 해당 데이터 색상 값중 6자 미만의 색상은 모두 삭제 후 결과 배열값으로 생성하시오.
 
 결과: [orange, hotpink]
 */
//ArrayList
public class example1 {

	public static void main(String[] args) {
		
		String color[] = {"red","blue","green"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(color));
		System.out.println(al); // arraylist 출력시엔 arrays.tostring 사용X
		al.remove(1);
		System.out.println(al);
		
		int number[] = {1,2,3,4}; 
		Integer number2[] = {number[0],number[1],number[2],number[3]};
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(number2)); // aslist에 int원시배열을 넣으려면 원시배열을 Integer로 선언해야 함. 아니면 Integer로 변환해서 넣어야함.
		System.out.println(al2);
		
		/*망한코드ㅋㅋㅋ*/
//		int abc[] = {3,4,7,9,10};
//		List<Object> al3 = new ArrayList<>(Arrays.asList(abc)); // List <Object> : 최상위 모든 자료형 다 받을 수 있음
		//Object : 출력시 배열이 제대로 나오지 않음. Object는 배열 전체를 1개의 객체로 인식하기때문.   
//		System.out.println(al3.get(0));
//		Object test = al3.get(0); // int -> Object로 적용시 재 로드하기가 힘듬

		/*정식코드*/ 
		
		int abc[] = {3,4,7,9,10};
		List al3 = new ArrayList<>();
		int w = 0;
		while(w<abc.length) {
			al3.add(abc[w]);
			w++;
		}
		int num = Integer.parseInt(al3.get(1).toString());
		System.out.println(num);
		
		List al4 = new ArrayList<>(); // Object형 빈배열
		
		al4.add("A");
		al4.add(10);
		al4.add("B");
		al4.add(20);
		al4.add(30);
		
		
		String munja = String.valueOf(al4.get(0).toString());
		System.out.println(munja);
		
		int check = Integer.parseInt(al4.get(1).toString());
		System.out.println(check);
		
		
	}

}
