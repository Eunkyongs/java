import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
		/*응용문제 : 협업 프로그래머가 해당 DB(DataBase)의 값 중 홀수값에 대한 총 갯수를 받고자 합니다.
		 해당 갯수를 출력 될 수 있도록 코드를 작성하시오.*/
		
		odbc db = new odbc();
//		db.odd_ea = 100; // 클래스 안에 private으로 선언한 변수는 클래스 외부에서 변수값을 변경할 수 없음. 
		System.out.println(db.result());
	}
}
class odbc{
	private int num[];  //배열값이 변경되지 않도록 사용
	private int odd_ea=0; //홀수일경우 +1씩 증가하기위한 필드 변수값
	
	public odbc(){
		int odata[] = {15,22,17,14,32,35,19,33};
		this.num = odata;
	}
	
	public int result() {
		int w=0;
		int ea=this.num.length; // 8개
		while(w<ea) {
			if(this.num[w] % 2 == 1) {
//				System.out.println(this.num[w]); //홀수값 확인
				this.odd_ea++; // 배열의 원소가 홀수일때 1씩 증가
			}
			w++;
		}		
		return this.odd_ea; //최종값을 return 시킴(홀수의 갯수를 반환)
	}
}