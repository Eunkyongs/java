import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//crawling ���
//https://webmail.lh.or.kr/login
public class net3 {

	public static void main(String[] args) throws Exception{
		String url = "http://www.jogunshop.com/index.html";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		int size = con.getContentLength();
		
		System.out.println(urls.getProtocol()); //�������� http or https üũ 
		System.out.println(urls.getPort()); //��Ʈ��ȣ �Է¾ȵǸ� -1��� 
		System.out.println(urls.getFile()); //�������ϸ� /login
		
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);//sysout���� ��� ��, �����ϱ� readLine����ؾ��� 
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