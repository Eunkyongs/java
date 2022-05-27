import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * 응용문제9: A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다. "점수를 입력하세요?"라는 문구는 총 5번이 나오게
		 * 되며, 모든 점수는 합산한 후 5개의 점수에 대한 평균값을 출력합니다. for문으로 작성 출력 메시지는 "해당 점수의평점은: " 출력 단,
		 * 평점 점수가 40점 이하일 경우 "재시험입니다." 라고 메시지를 출력 후 프로세서는 종료합니다. 40점 이상일 경우 "합격" 이라고
		 * 메시지를 출력하십시오.
		 * 
		 * [추가기획] "입력하실 과목수를 적어주세요:" 라고 제일 먼저 출력 후 해당 과목수만큼 반복문이 적용이 되며, 과목수만큼 평균값이
		 * 적용되어야 합니다.
		 */
		/*
		 * Scanner scan = new Scanner(System.in); String msg = "점수를 입력하세요?";
		 * 
		 * int f; // 반복문사용 int user;// 사용자입력값 
		 * int total = 0; // 점수총합계산 
		 * int aver; //평균계산
		 * 
		 * System.out.println("입력하실 과목수를 적어주세요:"); 
		 * int user2 = scan.nextInt();
		 * 
		 * for (f = 1; f <= user2; f++) { System.out.println(msg); // 문구 출력 
		 * user = scan.nextInt();// 입력 
		 * total += user; }
		 * 
		 * System.out.println("점수: "+total);
		 * 
		 * aver=total/user2;
		 * 
		 * System.out.println("해당 점수의 평점은: "+aver);
		 * 
		 * if(aver<=40) { System.out.println("재시험입니다."); }else {
		 * System.out.println("합격"); }
		 * 
		 * scan.close();
		 */
		// 선생님 코드

		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요:");
		int subject= sc.nextInt();
		int w = 1;
		int user;
		int total = 0;

		while (w <= subject) {
			System.out.println("점수를 입력해 주세요: ");
			user = sc.nextInt();
			total += user;
			w++;
		}
//		System.out.println("최종 합계 점수는 "+total);
		double avg = ((double)(total)) / subject;//double형 소수점 아래자리 많이 받으려면((double)(total))
		String msg;
		if(avg<40) {
			msg="재시험 입니다.";
		}else {
			msg="합격 입니다.";
		}

		System.out.println("최종 합계 점수는 "+total+"점 / 평균 점수는 " + avg+"점 이며, "+msg);
		sc.close();
	}

}