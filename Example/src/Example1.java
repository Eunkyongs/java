import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*응용문제: while문으로 코드를 작성해야 하며, 프로세서는 다음과 같습니다.
		사용자가 상품을 전체 선택하였습니다.
	    질문은 "7000 결제하시겠습니까?" 라고 출력되며, 숫자 1이라고 입력하면 최종결제금액에 추가 되어 집니다. 
		단, 2라고 입력시 최종결제금액에 추가되어지면 안됩니다.
		
		총 질문 횟수는 4번 입니다.
		마지막에 최종 결제 금액이 나오도록 코드를 작성하시오.
		
		최종결제금액 14000
		*/
		
		Scanner sc = new Scanner(System.in);//입력엔진 호출
		final int cost=7000; //고정된 결제금액	
		int total=0;//결제금액을 더할 값
		int w=1;//반복문에 사용
		int user; //사용자 입력값
	
		while(w<=4) {//4번 반복할거다
			System.out.println("7000 결제하시겠습니까?");
			user=sc.nextInt();
			if(user==1) {
				total+=cost;
			}			
				w++;
				}
		System.out.println("최종금액은 "+total+"원 입니다.");
		
		
		
	sc.close();	
	}

}
