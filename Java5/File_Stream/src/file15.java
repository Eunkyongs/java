import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//이미지 용량제한
public class file15 {

	public static void main(String[] args) throws IOException{
		String file = "C:\\Java5\\File_Stream\\src\\img7.jpg";
		InputStream is = new FileInputStream(file); // Stream 이라는 단어가 들어가있다면 1회용 이다 라고 기억할것 . 한번 사용 하면 또 다시 불러와야함
		
		//FileinputStream을 buffer로 사용하게 되면, 더 이상 FileinputStream을 사용못함
		//그 수단으로 buffer에 new FileInputStream을 생성하여 별도로 사용할 수 있도록 셋팅함.
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		
		byte filesize[] = new byte[bi.available()]; // 용량제한 걸때는 전체용량 읽어와야함.
		
		int total =bi.read(filesize);
//		System.out.println(is.read(filesize));
		if(total>92160) { // 1024*90
			System.out.println("이미지 제한 용량은 90kb까지 입니다.");
		}else {
			System.out.println("정상적으로 등록 되었습니다.");
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(total);
		}
		
		
	}

}
