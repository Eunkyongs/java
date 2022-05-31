import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {

//		빈 배열 변수에 데이터가 있는 배열로 커스텀 방법
		int a [] = new int[3]; //3개의 공간만 제공함(데이터없이 3개의 공간만 있는 배열)
		int b [] = {1,2,3,4,5,6,7}; // 7개의 객체가 있는 상황(인덱스번호 0~6) 
//		System.out.println(a);
		int ea = b.length; // b배열 안에 몇개의 데이터 객체가 들어있는지 확인(1부터 셈)
//		System.out.println(a.length); // a배열의 데이터 공간 출력해서 확인해보기
		int a_ea=a.length; //a배열의 데이터 공간확인. 3칸
		int w=0; //배열의 인덱스번호가 0부터 시작하기때문에 반복도 0부터 시작
		int ct = 0; // 카운트 세는 변수는 반복문 밖에 별도로 세팅
		while(w<ea) { // b의 배열데이터 갯수보다 작은 만큼 반복
//			System.out.println(b[w]); // 배열의 객체가 잘 출력되는지 확인
			if(b[w]%2 == 0 && ct < a_ea) { //if(b배열의 값중 짝수만 && 새로운 a 배열의 전체 객체크기만큼만)
				a[ct] = b[w]; // 조건이 맞을때 b[w]값을 a배열에 대입
				ct++;//조건이 맞으면 인덱스번호를 +1씩 증가시킴
			}
			w++;
		}
		System.out.println(Arrays.toString(a)); // 배열a출력
	}

}
