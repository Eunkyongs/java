import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
/*
 응용문제2
 사용자가 입력한 숫자에 맞춰서 구구단이 작동되며, 구구단 결과를 계산하여 짝수인지 홀수인지를 출력하시오.
 
  "구구단에 대한 숫자를 입력하세요?" 라고 메세지 출력되면 숫자입력. 
  입력된 해당 숫자에 맞춰서 모든 결과를 더하며, 더한 값에 따라 짝수인지 홀수인지를 출력하시면 됩니다.
  단, 해당 반복문은 for~do while문까지 한가지를 선택해서 작성하시오.
  
  조건문이 반복문 밖에 있어야함.
*/

		Scanner sc = new Scanner(System.in); // 입력엔진 호출
		
		System.out.println("구구단에 대한 숫자를 입력하세요?");
		
		int user;//사용자 입력값.
		user=sc.nextInt();
				
		int aa; //반복문에 사용하는 변수
		
		int total=0; // 연산에 사용할 변수
		for(aa=1; aa<=9; aa++) { 
			total+=(user*aa); 
			}
		System.out.println(total);
		
	if(total%2==0) {
		System.out.println("결과값은 짝수 입니다.");
				
	}else {
		System.out.println("결과값은 홀수 입니다.");
	}
	
		
		
	}

}
