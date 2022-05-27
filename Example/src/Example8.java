import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/* 응용문제 8: 사용자 패스워드는 a1234입니다. 사용자가 패스워드를 입력합니다. 단 3회이상 실패시 다음과 같이 출력되도록 합니다.
		 "패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다." 단, 패스워드가 맞을 경우 "로그인 되었습니다." 라고 출력되어야 합니다. */
			
/*		//풀이
		final String pw = "a1234";
		int c=3;
		Scanner sc = new Scanner(System.in);
		int w =0;
		String msg = "패스워드를 입력해 주세요:";
		while (w<3) {
			System.out.println(msg);
			String userpw = sc.next();
			if(pw.equals(userpw)) {
				System.out.println("로그인 되었습니다.");
				break;
			}else {
				msg="올바른 패스워드를 넣어주세요.";
				c--;
				if(c==0) {
				System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
				}
			}
			w++;
		}
*/		
		
		
		
		
		
		
		
		
		
		
		String pw = "a1234"; //pw값		
		Scanner scan = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요. : ");
		
		//do~while문 사용
		int dw=1;
		do {
			String user = scan.next();//사용자 입력
			if(user.equals(pw)) {
				System.out.println("로그인 되었습니다.");
				break;
			}else {
				System.out.println("패스워드가 틀렸습니다.");
				if(dw==0){
				
				System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
				}
			}
			dw++;
			
			
			
		}while(dw<=3);

		
		
		
		
		
		
		
		
		//for문 사용
		/*		int f; // 반복문사용변수
		for (f = 1; f <= 3; f++) { //3번까지 입력
			
			String user = scan.next();//사용자 입력
			
			if (user.equals(pw)) {//조건문. 
				System.out.println("로그인 되었습니다."); //패스워드값이 맞을경우 출력될 내용
				break; //반복문 강제종료할때 사용합니다.
			}	
			else {
				System.out.println("패스워드가 틀렸습니다.");
				
			}
			 // 3번이상 틀렸을때
			System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
		}
*/		

		


		//while문 사용
/*		while(dw<=3) {
			String user = scan.next();//사용자 입력
			
			if(user.equals(pw)) {
				System.out.println("로그인 되었습니다.");
			}else { 
				System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다."); // 3번이상 틀렸을때
			}
			
			dw++;

		}
*/	
scan.close();

	}
}

