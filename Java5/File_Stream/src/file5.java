import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일로드 사용법
public class file5 {

	public static void main(String[] args) throws IOException {
		//System.in : input
		//System.out : output
		
		try {
//		File fr = new File("C:\\Java5\\File_Stream\\src\\db.txt"); // 파일 불러올때는 file 사용불가 
		FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\db.txt",Charset.forName("UTF8"));
		//Scanner 사용시 : system.in(사용자가 직접입력), FileReader(파일을 로드)
		Scanner sc = new Scanner(fr); 
		
		/*
		for(;;) { // loop시 예외처리로 빠질 수 있음.
			String result = sc.nextLine();//파일 로드 된 입력 값을 result로 전달 . 파일로드할때는 next 말고 nextline사용(띄어쓰기 있을수 있으니)
			if(result !=null) {
			System.out.println(result); // 출력
			}else {
				sc.close();
				break;
			}
		}*/
		
		int count = 0;
		String result ="";
		
		while(sc.hasNext()) {//hasNext() : true(계속진행), false(정지) 
				sc.nextLine();
				count++;
		}
		System.out.println(count);
		sc.close();
		fr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	
	
	}

}
