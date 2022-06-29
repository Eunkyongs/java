//Thread 사용방식
// 하나의 클래스로 여러방식을 작동시킬수 있음

public class Thread1 {

	public static void main(String[] args) {
		
		/*Extend Thread*/
		int w=0;
		while(w<6) { // thread 5개 돌린것
//			box b = new box(w);
//			Thread t = new Thread(b);
//			t.start(); // thread는 시작을 start로시킴
			w++;
		}
		
		/*interface Runnable Thread*/
		
		for(int f=0; f<10; f++) {
			//쓰레드 메소드를 호출하여 개당 클래스에 cpu한개를 할당합니다.	
			box2 b2 = new box2(f);
			Thread t2 = new Thread(b2);
			t2.start(); // run method를 작동시키기 위한 명령어
		}
			
	}

}
//extends
class box extends Thread{
	int no = 0;
	public box(int a) {
		this.no = a; // thread에 값을 넘길때는 this로 받아서 넘겨야 함.
	}
	@Override
	public void run() { // thread형태의 기본메소드
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.no);
	}
}
//interface 의 thread
class box2 implements Runnable{  
	int no = 0;
	public box2(int b) {
		this.no = b;
	}
	
	
	@Override
	public void run() {//Thread의 기본 메소드- 이거없이는 Thread 가동 못함.
		try {
			Thread.sleep(1000); 
		}catch(Exception e) {
		}
		System.out.println(this.no);
	}
	
}
