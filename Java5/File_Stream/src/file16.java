import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

import javax.xml.transform.Source;

//이미지 읽기, 쓰기
public class file16 {

	public static void main(String[] args) throws IOException{
		//java12 ver 이상
		//r, w, x => r(read):읽기, w(write):쓰기, x(excute): 실행
		//RandomAccess : 사용자가 해당 파일 속성 권한을 설정할 수 있음. 
		try {
			
		String files = "C:\\Java5\\File_Stream\\src\\img7.jpg";
		String cp = "img222.jpg";
		RandomAccessFile file =  new RandomAccessFile(files, "r");
		RandomAccessFile file2 =  new RandomAccessFile(cp, "rw"); 

		//FileChannel : IO(FileInputStream, FileOutputStream) 와 같은 형태. input+output 합친 형태
		//getChannel(): RandomAccessFile 해당 메소드를 가져오는 역할
		FileChannel fc = file.getChannel();
		FileChannel target = file2.getChannel();
		
		//transferTo, transferFrom (복사형태) 
//		fc.transferTo(0, fc.size(), target); // (배열0, 배열끝번호, 해당복사위치)
		
		target.transferFrom(fc, 0, fc.size()); // (복사할파일명 , 배열0, 배열끝번호)
		
		System.out.println(fc);
		}catch(Exception e) {
			
		}
	}

}
 