/*
 Exception : try,catch와 함께 사용을 하게 됩니다.(예외처리사항)
 문제에 대한것 확인하기위해 사용. 배열, 통신, 파일 이런쪽에서 많이 발생.
 
 -RuntimeException (Error 발생시 예외처리 체크를 안함) - Null, Class, Arraysize
 -OtherException (예외처리 체크사항 모두 함)
 
 Exception[종류]
 Arithmetic : 0으로 나눌때 발생
 NullPointer : Null개체를 참조할때
 ClassCast : 클래스 형 변환
 NumberFormat : 숫자형으로 변환
 ArrayIndexOutOfBound : 배열 참조시 인덱스번호 오류 
 IOException : 입출력 문제 발생 -O 
 Exception : 전체 예외처리 현황 -O => 예외 발생시 exception 어떤거 발생인지 출력해서 알려줌
 
 ex) Center에 숫자 1 이라는 값이 있을경우.
 String a= 1; ->error, 자료형에 데이터가 맞지않아서 오류임.
 
 A USER ->문자형이지만 parseInt나 valueOf로 형변환해서 검토해보면 가지고있는 값이 1이므로 에러 아님                   
 String a="1"; 	            
 
 B USER ->숫자 1이므로 에러 아님
 int a =1;
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try { // try: 해당 값을 int로 변경함(1)
			a = Integer.valueOf(b); // error발생 . a1이라는 문자인데, 강제로 숫자형으로 변환시 a라는 문자로 인하여 오류 발생.(2) 
			
		}catch(Exception z) {// 예외발생시 어떤예외사항인지 출력 
			System.out.println(z);  //(3) 어떤 부분에서 문제가 발생하였는지 체크해서 출력
		}
		finally { // try,catch에서 해결 안되었을때 해결방안 확인위해 사용
			b = b.replaceAll("[a-z][A-Z]", ""); //데이터 재처리(4) // replaceAll("[a-z][A-Z]", ""): a~z, A~Z까지 단어가있으면 공백으로 대체하라는 뜻
			a = Integer.valueOf(b); //(5) 다시 문법을 재작성 해서 사용
		}
		System.out.println(a); //(6) 최종 결과값 출력
		
	}

}
