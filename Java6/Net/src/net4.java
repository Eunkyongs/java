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
		/*Stream�� ����ϸ� read�� ��밡��(byte�̿�, ���ڷ�����), Reader����� readLine ��� ���Ѱ�(String) 
		 	flush() �������: BufferedOutputStream ����� ���
		 
		 */
		//InputStreamReader => byte�̿�
		//BufferedReader=>readLine();
		
		InputStream is = url.openStream(); //openStream net�κп��� ���
		BufferedInputStream bs = new BufferedInputStream(is); // �迭 byte[]
		byte html[] = new byte[1024];
//		FileOutputStream fs = new FileOutputStream("game.html"); // �迭 �� �ε��ؼ� ����
		BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html")); // flush ��밡��. buffer����ϴ°� ���� �ӵ��� �� ����
		int s = 0;
		//Stream�� read�� byte�迭���� �Է�
		while((s=bs.read(html)) != -1) { // bs�� ���ڹ迭�̱⶧���� null����ȵǰ� -1 �ؾ���. read�� �Ҷ��� ������ �迭���� �־����.
			fs.write(html,0,s);
		}
		fs.flush();
		bs.close();
		fs.close();
	}

}
