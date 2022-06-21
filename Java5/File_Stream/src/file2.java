import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException {

		try {
//		FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\list.txt"); //java ver 8 때 사용.
			FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\list.txt",Charset.forName("EUCKR")); // Charset.forName("EUCKR"): java 12 이상 ->EUCKR(ANSI),UTF8,UTF16 
//		System.out.println(fr.getEncoding()); // 인코더 형식을 확인(FileReader) // 로드한 파일은 utf-8 인코딩이어도 현재 실행하는 java파일이 ms949인코딩 사용중이라 ms949 출력됨.
//		System.out.println(fr.read()); // 용량크기
//		System.out.println(m);
		
		int w = 0;
		while(true) { // loop를 활용하여 해당 파일에 문자를 모두 가져옴
			int m = fr.read(); // -1: 내용이 없음(더이상 문자가 없을경우)
			System.out.print((char)m); //2byte, char로 사용함
			if(m==-1) { // 더이상 가져올 문자가 없을경우 loop에서 빠져나감
				break;
			}
		}
		fr.close();//FileReader를 종료함. 클로즈를 안넣으면 변경 전 파일을 계속 불러옴
		}
		catch(IOException e){
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		finally {
			
		}
	}

}
