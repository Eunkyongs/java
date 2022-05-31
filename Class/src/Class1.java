
public class Class1 {// main클래스

	public static void main(String[] args) { //일반 main 함수
		
		Adata a = new Adata(); // Adata Class 먼저 로드
		Bdata b = new Bdata(); // Bdata Class 먼저 로드
		System.out.println(a.aa); // Adata Class안에 aa라는 문자 자료형 객체값을 가져옴. 
		// 해당되는 클래스명 로드, 클래스안에 변수명 .으로 구분
		System.out.println(b.aa);// Bdata Class안에 aa라는 문자 자료형 객체값을 가져옴. 
		
		Cdata c = new Cdata(); // 로드할때 사용하는변수명과 클래스에 사용한 변수명 같으면 안됨
		/*Cdata안의 변수 자료형을 선언함. => 현재 기본함수에서 값만 입력한 뒤, 객체값을 받아 산술식으로 계산함(인스턴스 변수)*/
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa + c.bb;
		System.out.println(c.cc);
//		System.out.println(c.cc);
		
		
	}

}
//aa는 각각의 다른 클래스에 있기 때문에 중복되지 않습니다.
class Adata{// main클래스 작동 후 명령이 떨어져야 작동
	String aa = "홍길동"; // Adata class에 속한 변수.
}

class Bdata{
	String aa = "이순신";
}

class Cdata{
	//해당 Cdata에 있는 클래스에는 자료형에대한 변수만 선언 합니다.
	//단, 계산 수식은 함수가 없는 상황이므로 수식 또는 sysout을 사용하지 못함.
	int aa; 
	int bb;
	int cc;
//int cc = aa + bb;
}