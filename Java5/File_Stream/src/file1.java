import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class file1 {
	/*
 	I/O : inputStream, outputStream
 	입력스트림 : 프로그램으로 들어오는 스트림 (inputStream:키보드, 마우스, HDD(불러오기))
 	출력스트림 : 프로그램에서 밖으로 나가는 부분 (outputStream : 모니터,HDD(저장하기),프린터)
 	Stream : input, output 사용자 처리
 	JAVA.io(API)
 	File, FileReader (일반코드)-api와 관계x -> StreamAPI (FileinputStream)-api사용
 	FileWriter -> StreamAPI (FileoutputStream) 
  	*/
	public static void main(String[] args) throws Exception{
		/*
		FileReader : 
		1.문자 데이터를 file로 부터 읽어오는 클래스
  		2.파일 이름을 생성자 인수값(파라미터)로 사용해서 FileReader객체를 생성합니다.
		*/
		
		try {
		FileReader fr= new FileReader("C:\\Java5\\File_Stream\\src\\list.txt"); //예외처리 안하면 error발생.메소드에 throws IOException 선언해야함!
		String a="a1";
		tests(a); // 메인에서 IOException으로 선언해두었으면 받는 메소드의 throws도 동일하게 선언해야함. 메인에 Exception선언하고 받는 메소드에 IOException은 가능. 
		}
		catch(IOException z){ // IOException에 대한 예외처리 
			// catch도 if문의 else if처럼 사용갯수 제한없이 사용가능. Exception 여러개 사용가능. 위에있는 catch부터 순차적으로 처리. 
			//던지는걸 먼저하면 아래쪽 catch부터 역순진행
			System.out.println(z.getMessage()); // 에러발생시 에러내용 출력
		}
		catch(Exception z1){ // 일반 Exception에 대한 예외처리 방식
			System.out.println(z1.getMessage()); // 에러발생시 에러내용 출력
		}
	}
	static public void tests(String data) throws IOException, Exception{
		int k = Integer.parseInt(data);
		IOException ex= new IOException();
		throw ex;
		
	}

}
