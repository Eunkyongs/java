import java.util.Random;
import java.util.Scanner;


public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10까지 숫자를 하나 선택하세요: ");
		int no = sc.nextInt();
//		memorys m = new memorys(); // 이런식으로 클래스 호출하게되면 메모리 초기화 하기가 힘듬
		memorys m = null;
		m = new memorys();
		m.ms(no);
		m=null; //해당 인스턴스를 비움(메모리 초기화. 나중에 포트폴리오 작업할때 사용..) 
		m = new memorys(); // null이용해서 인스턴스를 비웠기때문에 재할당 가능.
		m.rd();
		
		sc.close();
	}

}

class memorys{
	public void ms(int user) {
		//Math.random() 랜덤 메소드 사용법- 기본은 자료형 double입니다.
		/*random=>보안코드, 인증코드, 추첨, 룰렛*/
		double a = Math.random(); //0.0~1.0 . 
		int w=0;
		while(w<=10) {
			int b =(int) (Math.random()*10)+1; //*10(0~9),*10+1(1~10). random은 기본적으로 소수. 정수로 출력하기위해선 int자료형으로 형변환해줘야함
//			System.out.printf("%d ",b);
		w++;
		}
		
		
		/*if(user==b) {
			System.out.println("당첨");
		}else {
		
		System.out.println("다음기회에");
		}*/
		}
	public void rd() { // rd=random util 사용법
		Random r = new Random(); //random 객체 생성 및 인스턴스 적용
		int w = 0;
		while(w<5) {
			System.out.println(r.nextInt(45)+1); // 0~9까지 r.nextInt를 사용.
			w++;
		}
		r=null;
	}
	}