import java.util.Arrays;
import java.util.Scanner;

//사용자 정보 입력 및 결과 정보 출력
public class Score1 {
	static String [] msg = {"검색할 데이터 학생명을 입력해 주세요?","검색할 과목명을 입력하세요?[전체,국어,수학,과학,역사]"}; 
	//main method가 static이니 필드에 static으로 선언해줘야 호출가능함. private, public, default 사용시 에러발생.
	
	//gtdata():return메소드(출력)
	public static void main(String[] args) {
	
		Score2 sc = new Score2();
		Scanner text = new Scanner(System.in);
		System.out.println(msg[0]);
		String name = text.next(); //학생명 입력
		sc.stdata(name,null); //Score2에 메소드로 사용자 및 점수 전달
		
		String check = sc.gtdata(); // return 보낸 자료형으로 받아야함.
		
//		System.out.println(score); //return받는부분 출력되나 확인
//		System.exit(0);
		
		
		if(check.equals("true")) { // check=="true" 도 사용가능함.
			System.out.println(msg[1]);
			String subject = text.next(); //과목 입력
			sc.stdata(name, subject);
			String score = sc.gtdata(); // return 결과 확인
			
			if(subject.equals("전체")) {
				String score2[] = score.split(",");
				System.out.printf("점수데이터:국어 %s점, 수학 %s점, 과학 %s점, 역사 %s점",score2[0],score2[1],score2[2],score2[3]);
			}else {
			System.out.println("점수데이터 : "+subject+" "+ score + "점");
			}
		}else {
			System.out.println("해당 사용자는 존재하지 않습니다.");
			System.exit(0); // 0:정상종료, 1:비정상종료
		}
	
		
		text.close();
		System.gc();
	}

}
