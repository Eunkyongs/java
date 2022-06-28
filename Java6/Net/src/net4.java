import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class net4 {

	public static void main(String[] args) throws Exception{
		String page ="https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url = new URL(page);
		/*Stream을 사용하면 read만 사용가능(byte이용, 숫자로읽음), Reader사용은 readLine 사용 위한것(String) 
		 	flush() 사용형태: BufferedOutputStream 선언시 사용
		 
		 */
		//InputStreamReader => byte이용
		//BufferedReader=>readLine();
		
		InputStream is = url.openStream(); //openStream net부분에만 사용
		BufferedInputStream bs = new BufferedInputStream(is); // 배열 byte[]
		byte html[] = new byte[1024];
//		FileOutputStream fs = new FileOutputStream("game.html"); // 배열 값 로드해서 저장
		BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html")); // flush 사용가능. buffer사용하는게 저장 속도가 더 빠름
		int s = 0;
		//Stream은 read에 byte배열명을 입력
		while((s=bs.read(html)) != -1) { // bs는 숫자배열이기때문에 null쓰면안되고 -1 해야함. read를 할때는 무조건 배열값을 넣어야함.
			fs.write(html,0,s);
		}
		fs.flush();
		bs.close();
		fs.close();
	}

}
