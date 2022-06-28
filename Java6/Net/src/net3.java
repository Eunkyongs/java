import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//crawling 사용
//https://webmail.lh.or.kr/login
public class net3 {

	public static void main(String[] args) throws Exception{
		String url = "http://www.jogunshop.com/index.html";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		int size = con.getContentLength();
		
		System.out.println(urls.getProtocol()); //프로토콜 http or https 체크 
		System.out.println(urls.getPort()); //포트번호 입력안되면 -1출력 
		System.out.println(urls.getFile()); //접속파일명 /login
		
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);//sysout으로 출력 시, 문서니까 readLine사용해야함 
		FileWriter write = new FileWriter("login.html");
		
		
//		FileOutputStream fs = new FileOutputStream("login.html");
//		byte html[] = new byte[1024];
		String str="";
		while((str=br.readLine()) != null) {
			write.write(str);
		}
		br.close();
	}
}