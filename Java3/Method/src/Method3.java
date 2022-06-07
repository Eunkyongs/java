
public class Method3 {

	public static void main(String[] args) {
		/*
		 응용문제: 인수값 2개의 숫자를 적용하여 계산되도록 합니다.
		 최종 계산값을 받아서 결과를 출력하시오.
		 157, 45 
		 157*45
		 최종 결과값 출력: 7065
		 */
		num n  = new num();
		
		int total=n.n1(157,45);
		System.out.println(total);
		
		n.n2();//n2에 값 전달없이 작동되도록 호출만 함.
		/*
	   응용문제 : 다음 숫자 하나를 해당 메소드로 전달하게 됩니다.
	   해당 메소드에서는 다음과 같이 처리합니다.
	   숫자 3을 전달하면 3*1~ 3*9까지의 모든 결과값을 더하여 sysout으로 출력되도록 하십시오. 
	   */
	
		int result = n.n3(3);
			System.out.println("결과값:"+result);
		
		String ck = n.mb("hong");
		System.out.println(ck);
	}
}

class num {
	public int n1(int a, int b) {
		int c=a*b;
		return c;
	}
	public void n2() {
		int z = n1(100,200); //같은 클래스안에 있는 n1활용해서 계산
		System.out.println(z);
	}
	
	public int n3(int a) {
		int f;
		int b=0;
		for(f=1; f<=9; f++) {
			b+= f*a;
			
		}
		return b; // return 사용시 절대 반복문 안에다 적용하면 안됩니다. 절대불가!!
		//조건문이라도 더블로 return사용 안됩니다.(사용은 가능하지만 너무 많은return발생되니 되도록 지양할것) 조건문에 break를 걸더라도 return은 무조건 반복문 밖에다 적용할것!
	}
	public String mb(String mid) {
		String msg ="";

		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg; //해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return시킴.
	}
	
}