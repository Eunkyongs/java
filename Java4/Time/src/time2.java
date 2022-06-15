import java.util.Timer;
import java.util.TimerTask;

public class time2 {
	
	
	public static void main(String[] args) {
		Timer timer = new Timer(); //Timer util을 이용하여 시간함수를 사용합니다.
		
//		timer.scheduleAtFixedRate(new gogo(), 5000, 5000); // rate 입력 후 ctrl+space하면 자동완성됨
		//(시작 할 메소드&클래스, 몇 초뒤에 시작할지, 반복시간 )
		//scheduleAtFixedRate : 지속적으로 반복 작업을 할 경우
		
		TimerTask tk = new TimerTask() {
			int a = 0;
			String adata[]= {"홍길동","이순신","강감찬","유관순"};
			
			@Override
			public void run() {
				if(a>=4) {
					a=0;
				}
				System.out.println(adata[a]);
				a++;
			}
		};
		timer.scheduleAtFixedRate(tk, 0, 5000); //배너광고, 로딩화면등에 사용
	}
}

class gogo extends TimerTask{ //TimerTask:시간 작업
	public void run() {//Task에서 실행하는 메소드입니다.
		System.out.println("시간 함수 잘 작동이 될까요???");
	}
}