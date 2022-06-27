import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 	InputStream > InputStreamReader > BufferedReader (o)
 	InputStream > BufferedReader (x)
 	InputStream > BufferedInputStream (o)
 	InputStreamReader > BufferedReader (o)
 	
 	※BufferedReader - close() - 메모리 종료, BufferedWriter - flush() - 메모리 초기화, close() - 메모리 종료 
 */


public class filelast {

	public static void main(String[] args) throws IOException{
		
		String url = "src\\movie_db.txt";
		FileInputStream fs = new FileInputStream(url); 
		//BufferedInputStream bs=new BufferedInputStream(fs); // 인풋스트림받을땐 버퍼도 인풋스트림으로 선언해서 받아야 한번에 받아짐. 인풋스트림 선언후  버퍼리더로 받는거는 안됨 
		
		
		//byte a[] = new byte[400];
		InputStreamReader ir = new InputStreamReader(fs,"UTF8");
		BufferedReader br = new BufferedReader(ir); // inputStream을 bufferedReader로 바로 받을 수 없음. // InputStreamReader로 한번 거쳐서 받아야 받아짐.
//		System.out.println(fs.read(a));
	}

}
