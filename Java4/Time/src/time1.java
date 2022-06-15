
public class time1 {

	public static void main(String[] args) {
		/*try-catch문 : 예외처리기능 문법이라고 합니다.*/

		int w = 0;
		while(w<=10) {
			
			try {  //예외 발생할 코드를 적용
				Thread.sleep(1000); // 1000 = 1초
				//Thread.sleep : 일시정지상태를 말합니다.
			}catch(InterruptedException e) { // 실무에선 Exception으로 사용 
				/*InterruptedException : 해당 예외 발생이 되었을 경우 처리하기 위한 문법*/
			}
			
			
			System.out.println(w);
			w++;
		}
		
	}

}
