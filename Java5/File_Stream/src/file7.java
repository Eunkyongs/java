import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/*공통 명령어 사항 : read()-1단어, readLine()-1줄, next()-1단어, nextLine()-1줄  */
//BufferedReader (Output) 무조건 재귀함수 사용!
public class file7 {

	public static void main(String[] args) throws IOException {

		try {
			FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
//			System.out.println(fr.read()); // 파일이 잘 불러와졌는지 확인.잘 불러와진경우엔 숫자로 출력됨.
//			System.out.println((char)fr.read()); // 파일의 글자 1개 확인. 깨져서 나오면 Charset.forName()으로 인코딩변환필요. 
			
			
			//BufferedReader : Temp(임시저장소) - 효율적으로 파일을 보다 빠르게 가져올 수 있습니다.
			BufferedReader bf = new BufferedReader(fr); //readLine()으로 해당 값을 확인합니다.
//			System.out.println(bf.readLine());// Line으로 읽으려면 FileReader에선 사용불가. 버퍼를 한번 거쳐야 함 
//			bf.close(); // filereader를 받았기때문에 버퍼만 닫아도 파일리더도 같이 닫힘.
			
			//해당 임시 저장소에서 저장된 내용중 한개당 한개의 라인으로 로드하게 됩니다.
			//Buffer는 최초 값을 출력하였을 경우 무조건 다음 라인의 값을 출력하게 됩니다.
			
//			BufferedReader bf2 = new BufferedReader(fr); // 파일로드 안됨. FileReader는 1회성. 다시 파일을 로드하고 싶으면 새로운 FileReader선언해서 가져와야 함.
			
			/*
			//조건문 사용시에도 한번 작동이 이루어지게 됩니다.
			if(bf.readLine() != null) {
				System.out.println(bf.readLine());
			}
			*/
			/*
			 //반복문으로 출력
			int w = 0;
			while(w<=1) {
				String data = bf.readLine();
				System.out.println(bf.readLine());

				w++;
			}
			*/
			/*
			 //buffer는 속도가 빠른대신 사용부분에 무조건 변수 또는 배열로 받은 후 사용하는것을 권장합니다.
			String line="";
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			*/
			 /*데이터 문서의 라인 갯수를 확인*/
			//LineNumberReader : 파일 전체 라인 갯수를 확인하는 클래스 입니다.
			FileReader fr2 = new FileReader("C:\\Java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			BufferedReader bf2 = new BufferedReader(fr2);
			LineNumberReader li = new LineNumberReader(bf2);
			int ea = 0;
			while(li.readLine() != null) {
				ea = li.getLineNumber();
			}
			System.out.println(ea);
			
			
			
			
		}catch(Exception z) {
			System.out.println(z);
		}
		
		
	}

}
