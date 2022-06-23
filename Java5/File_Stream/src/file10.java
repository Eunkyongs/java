import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

//OutputStream (output) - 최상위
//(하위) FileOutputStream, ObjectOutputStream,AudioOutputStream(없음)  
public class file10 {

	public static void main(String[] args) {
//		String a = "홍길동"; // 문자
		String a = "123456789";
		//byte[] : 문자열을 ASCII 키 형태의 배열로 변경 할 때 사용
		byte[] b =a.getBytes();  //getBytes("언어패킷") 메소드
		System.out.println(Arrays.toString(b)); // ASCII코드 배열 출력됨.
		OutputStream os =System.out; // 출력만 사용 System.out.print역할
		
		try {
			os.write(b,0,b.length); //(byte배열이름, 배열번호, 배열크기) //번역기역할? ASCII코드를 숫자로 변환
//			os.flush(); // 출력파트
			
		}catch(Exception z) {
			
		}
			
			
	}

}
