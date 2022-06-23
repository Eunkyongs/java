import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

//Reader (최상위) - 새로 생성하면 자동으로 오버라이드 read,close메소드 뜸
//(하위) BufferedReader, FileReader, CharArrayReader(배열) - 문서파일 ASCII
//(하위) InputStreamReader - 이미지, 동영상, 오디오


//InputStream(입력)
public class file9 {

	public static void main(String[] args) throws IOException {
		//Stream : 이미지, 동영상, 오디오 같은 파일을 로드하기 위해서(바이너리)
		//InputStream : 모든 입력장치에 대한 값을 받는 클래스입니다. 기본(int)
		//InputStream (최상위 입력장치)
		// (하위클래스) - FileInputStream(파일전용), AudioInputStream(오디오전용), ObjectInputStream

		InputStream is = new InputStream() { //기본클래스를 로드하여 오버라이드 메소드 
			// 단독으로 사용되는 경우보단 파일리더등과 같이 사용됨 . close 사용안함. 
						
			@Override
			public int read() throws IOException { //byte단위 1~2 -> 1024 숫자 늘릴수있음  
				int a = 15;
				return a;
			}
		};
		
//		int b = is.read(); //InputStreamReader 거치지않고 InputStream을 바로 출력도 가능함. 언어패킷변경불가
		
		//InputStreamReader (언어패킷 변경)
		/*FileInputStream으로 파일 받아왔을때 언어패킷 변경 : 
		 InputStreamReader("파일명","EUCKR"); or InputStreamReader("파일명","UTF8"); 
		 BufferedReader처럼 Charset,forName 사용안하고 바로 인코딩변경선언  
		 */
		InputStreamReader ir = new InputStreamReader(is);  // inputStream으로 입력받은 언어패킷 변경은 ,Charset.forName("UTF8") 사용
		try {
//			System.out.println(is.read());
		}catch(Exception z) {
			System.out.println(z);
		}
		
		//키보드값 로드
		InputStream user = System.in ; // 스캐너와 동일하게 키보드로 입력 받음.
		try {
			int code = user.read(); //키보드 입력 ASCII 코드값을 반환함
			if(code ==13) {
				System.out.println("엔터키는 사용하실 수 없습니다.");
			}
//			System.out.println(code);
		}catch(Exception z) {
			
		}
		
	}

}
