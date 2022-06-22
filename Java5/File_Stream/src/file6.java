import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Scanner를 이용한 파일 쓰기 사용법
public class file6 {

	public static void main(String[] args) throws IOException {
		
		try {
		FileWriter fw = new FileWriter("C:\\Java5\\File_Stream\\src\\db.txt");
		Scanner sc = new Scanner(System.in); // 사용자 직접입력
		System.out.println("내용을 입력해 주세요:");
		
		for(int a=0; a<3; a++) { //3번 반복
		
		String notice =( sc.nextLine())+ "\r\n"; // 줄바꿈 (개행문자) \n, \r, \r\n
		
		fw.write(notice); //해당 입력사항을 db.txt에 저장
		}
		sc.close();
		fw.close();
		}
		catch(Exception z){
			System.out.println(z);
		}
		
		
	}
}
