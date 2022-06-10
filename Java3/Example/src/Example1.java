import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	/*
	[UP&DOWN 게임]
	A파트 : PC 랜덤, Scanner 이용 5번
	B파트 : PC에서 랜덤숫자 와 사용자가 뽑은 숫자를 비교 및 결과 처리 
	
	
	1.PC가 숫자를 하나 선택?? (힌트: random사용) 1~10까지 사용  
	2.총 기회는 5번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?
	3.만약에 PC가 숫자7을 선택한 기준에서 사용자 숫자와 비교
	-pc:7, 사용자:2 => 결과 : UP
	4.총 기회는 4번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?
	5. pc:7 사용자:4 => 결과 : UP
	6.총 기회는 3번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력?
	7. pc:7 사용자: 7 => 정답입니다. 모든 프로세서는 정지(system.exit(0);)
	
	 
	 */	
		Example2 ex2 = new Example2();
		Scanner scan = new Scanner(System.in);
		/*일반 random형식 (random double 자료형)*/
//		int pc_num =(int)(Math.random()*10+1); // Pc가 1~10까지의 숫자중 하나 랜덤선택 . *10하면 0~9까지 출력되니 *10+1
		
		/*util 이용한 random*/
		Random r = new Random();
		int pc_num = r.nextInt(10)+1;
		
		int user_num =0; 
		int w = 5;
		while(w>0) { //스캐너 5번
			System.out.printf("총 기회는 %d번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력해주세요?",w);
			user_num= scan.nextInt();
			ex2.number(pc_num,user_num); //랜덤번호랑 사용자가 입력한 번호 보내기
			String bb = ex2.result(); // 비교결과 리턴 받음
			
			int check = bb.indexOf("정답"); //  indexOf :단어검색 (결과값 -1:없음, 0:있음)
//			System.out.println(check); // indexOf 결과값 확인
			
//			if(bb.equals("정답")) {  //비교결과 정답이면
			if(check == 0) { // 단어검색결과에 정답이라는 단어가 있으면
				System.out.println(bb); // 비교결과 리턴값 출력
				System.exit(0); // 종료시킴
			}else {
				System.out.println(bb); //비교결과 리턴값 출력
			}			
			w--;
		}		
		scan.close();
		
		
	}

}
