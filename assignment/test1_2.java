
public class test1_2 {
	private int total=0;
	
	public static void main(String[] args) {
		
		test1_2 t2 = new test1_2();
		
		int result = t2.re(5);
		System.out.println(result);
		
	}
	public int re(int n) {
		this.total = n*7;
		return this.total;
	}

}
