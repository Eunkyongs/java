
public class If_for {

	public static void main(String[] args) {
//		상수:절대 변하지 않는 수 
		/*
		 * final int a = 1; // final을 사용시 변수->상수로 변경됨 
		 * a=3; a는 상수라 값을 변경할수없음 실행하면 에러남 
		 * System.out.println(a);
		 * 
		 * final String name= "홍길동";
		 * name = "이순신"; // name도 상수라 내용 변경 불가.
		 * System.out.println(name);
		 */

		final int ct = 3; // 상수, 고정값.
		int f; // 반복문에 사용
		boolean ok = false; // 조건에 대한 참,거짓 판별
		for (f = 1; f < 11; f++) { // 반복 조건
			if (f == ct) { // 반복문 값과 고정값이 같을 경우
				System.out.println("등록된 값이 확인 됩니다.");
				ok = true; // 조건에 대한 값을 변경
			} // 여기에 else를 쓰게되면 조건이 또 변경되어 반복문안의 조건문과 밖에 조건문이 둘 다 출력되게 됨
		}
		if (ok == false) {// 반복문이 끝났을때 반복문 안에 조건사항이 없을 경우 출력되는 코드
			System.out.println("확인이 되지 않는 숫자입니다.");
		}

		/*총 20번의 값을 반복합니다. 그 중 홀수값만 출력하도록 합니다.*/
		
		int ff; // 반복문에 사용
		String odd = ""; //odd-홀수 even-짝수
		for(ff=1; ff<21; ff++) { //반복조건 1~20까지 반복
			if(ff%2!=1) { // 반복문 값이 짝수일때 그 값 출력 홀수값(ff%2==1)or (ff%2==1)
				System.out.print(ff+" ");// 반복문 값이 홀수일때 홀수인 값 출력
			}
			else { //만약에 홀수 값일 경우 odd변수에 지속적으로 값을 추가하게 됩니다.
				odd += ff + " "; // 추가할 경우 " " 활용하여 적용
			}
		}
		System.out.println(odd); //홀수값 출력 
		
		}
	}