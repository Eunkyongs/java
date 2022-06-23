import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream을 이용한 파일 로드
public class file11 {

	public static void main(String[] args) throws IOException{
		
		try{
//		FileInputStream fs = new FileInputStream("C:\\Java5\\File_Stream\\src\\list.txt");
		InputStream fs = new FileInputStream("C:\\Java5\\File_Stream\\src\\list.txt"); // 하위로 불러서 최상위에 대입. 위에줄과 같은 내용임 
//		System.out.println(fs.available()); // available : 파일 전체크기
		
		//무제한용량 배열파일(파일 크기에 따라서 유동성있게 변함) ex)웹하드등
		byte temp[] = new byte[fs.available()]; 
		int ea = fs.read(temp);
		String data = new String(temp,"UTF-8"); 
		System.out.println(data);
		
		/* 
		byte temp[] = new byte[9999]; // 바이트크기 제약걸때사용. 해당크기를 설정할 수 있음. 바이트는 클수록 좋음-> 더 많은 데이터를 로드할 수 있음 // new byte[1024*16]; 1024*16 파일크기 이미지파일 첨부시 사용. 
		int ea = fs.read(temp); // ASCII코드로 전체를 읽어서 ea에 받도록
		String data = new String(temp,"UTF-8"); // String 문자형태로 배열을 받아서 출력
		System.out.println(data);
		*/
		}catch(Exception e) {
			
		}
		
	}
}
