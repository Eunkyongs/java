import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("입력할 내용을 적어주세요!");
		// String memo = a.next(); // next() : 스페이스바 입력까지만 적용(공백값 생긴 이후는 입력받지 못함)
		
		String memo = a.nextLine(); // nextLine(): 스페이스바 포함 모두 입력적용 (space bar 입력으로 생기는 공백이후 입력값까지 모두 받음)
		System.out.println(memo);

		a.close(); // scanner 종료. 종료선언 하지않으면 메모리 반환이 안됨. 
		
		String name = "park"; // String + 숫자 = %s
		byte num = 25;  //숫자는 %d
		/*
		 [중요사항]
		 %f : float,double
		 %t : date, time  시간,날짜
		 %b : boolean(true, false)
		  */
		
		//System.out.println(name+"님의 나이는"+num+"입니다.");
		//printf:f라는 뜻이 format 을 뜻합니다.
		System.out.printf("%s님의 나이는 %d 입니다.",name,num); //%->해당값을 가져와서 사용
		
	}

}
