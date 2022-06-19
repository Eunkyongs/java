package Ex;

public class Example5 {

	public static void main(String[] args) {
		/*
		 특강문제
		 abstract를 이용하여 구구단 8단 결과를 모두 더한 결과값을 return을 받아 메인에서 출력되도록 합니다. 
		 */
		gu g = new gu();
		g.setter(8);
		int result =g.getter();
		System.out.printf("구구단 8단의 결과를 모두 더하면 : %d",result);
	}
}

abstract class gugu{
	public abstract void setter(int a);//setter
	public abstract int getter(); //getter
}

class gu extends gugu{
	private int total; 
	@Override
	public void setter(int a) {
		int w =1;
		while(w<=9) {
			this.total += a*w; 
			w++;
		}
	}
	@Override
	public int getter() {
		return this.total;
	}
}
