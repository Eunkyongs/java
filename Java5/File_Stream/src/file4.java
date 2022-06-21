import java.io.FileWriter;
import java.io.IOException;

//파일 쓰기 (write)
public class file4 {

	public static void main(String[] args) throws IOException, Exception {
		try {
			//FileWriter : 문자 데이터를 파일에 쓰는 Class
			
			String user[] = {"홍길동40","김유신60","c","d"}; 
//			FileWriter fw = new FileWriter("C:\\Java5\\File_Stream\\src\\array.txt");
			FileWriter fw = new FileWriter("C:\\Java5\\File_Stream\\src\\array.txt",true); 

			//FileWriter true 사용하면 기존 입력된 사항을 초기화 하지 않음. 기존 데이터 뒤에 write로 입력하는 데이터가 새로 입력됨. 
			for(int f =0; f<user.length; f++) {
				fw.write(user[f]); // write : 문자, 배열데이터값을 파일에 적용(입력시킴) 
			}
			fw.close();//파일오픈사항을 종료하여 적용합니다.
			
		}catch(Exception x){
			System.out.println("test");
		}
			
	}

}
