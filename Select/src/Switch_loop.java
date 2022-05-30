
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign ="*";
		int total; // sysout을 switch문 밖에 사용하려면 total의 값도 선언을 해줘야 에러가 나지않음
		
		/*case안에 각각의 반복문을 사용 할 수 있습니다.
		 또한, 동일한 변수명을 사용해도 가능하며, case 각각의 다르게 작동하기 때문에 문제가 되는 사항은 없습니다.
		 단, case는 하나의 조건이 맞을 경우 나머지 case는 절대 작동하지 않음
		  */
		
		switch (sign) {
		case "+" ->{
			int f;
			total=0;
			for(f=1; f<=5; f++) {
				total += f; //
			}
			System.out.println("총 1~5까지 계산된 값은 "+total+"입니다."); // 스위치문 밖으로 sysout을 빼면 total값이 case문 안에 있기때문에 인식못함.
		}
		case "-"->{
			total=0;
			System.out.println("음수값은 출력 되지 않습니다.");
		}
		case "*" ->{
			int f=1; // +케이스에 사용한 변수명 f와 중복사용가능. *케이스 안에서만 사용되기때문에 중복사용가능하다.
			total=1;
			do {
				total*=f;
				f++;
			}while(f<=5);
			System.out.println("총 1~5까지 계산된 값은 "+total+"입니다.");
		}
		case "/" ->{
			total=0;
			
		}
		
		}
		
		
	}

}
