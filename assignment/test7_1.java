import java.util.ArrayList;

public class test7_1 {
	public static void main(String[] args) {
		/*
		 * 응용문제 다음 숫자배열이 있습니다 해당배열값을 짝수,홀수 각각 값을 가져와서 배열로 처리 합니다. 멀티쓰레드를 이용하여 출력합니다. 결과
		 * 짝수:[2,6,10,22,42,50] 홀수:[1,7,11,15,43,51]
		 */
		int[] num = { 1, 2, 6, 7, 10, 11, 15, 22, 42, 43, 50, 51 };
		listodd lo=null;
		listeven le=null;
		int w=0;
		while(w<num.length) {
			if(num[w] %2 == 0) {
				le= new listeven(num[w]);
				le.start();
			}else {
				lo=new listodd(num[w]);
				lo.start();
			}
		w++;	
		}
		}
}
class listeven extends Thread {
	static ArrayList<Integer> evenlist = new ArrayList<>();
	 int nb=0;
	public listeven(int a) {
		this.nb =a;		
	}
	@Override
	public void run() {
		this.evenlist.add(this.nb);
		System.out.println("짝수"+this.evenlist);
	}
}
class listodd extends Thread {
	static ArrayList<Integer> oddlist = new ArrayList<>();
	 int nb=0;
	public listodd(int a) {
		this.nb =a;		
	}
	@Override
	public void run() {
		this.oddlist.add(this.nb);
		System.out.println("홀수"+this.oddlist);

	}
}

