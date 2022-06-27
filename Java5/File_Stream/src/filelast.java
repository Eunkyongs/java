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
 	
 	��BufferedReader - close() - �޸� ����, BufferedWriter - flush() - �޸� �ʱ�ȭ, close() - �޸� ���� 
 */


public class filelast {

	public static void main(String[] args) throws IOException{
		
		String url = "src\\movie_db.txt";
		FileInputStream fs = new FileInputStream(url); 
		//BufferedInputStream bs=new BufferedInputStream(fs); // ��ǲ��Ʈ�������� ���۵� ��ǲ��Ʈ������ �����ؼ� �޾ƾ� �ѹ��� �޾���. ��ǲ��Ʈ�� ������  ���۸����� �޴°Ŵ� �ȵ� 
		
		
		//byte a[] = new byte[400];
		InputStreamReader ir = new InputStreamReader(fs,"UTF8");
		BufferedReader br = new BufferedReader(ir); // inputStream�� bufferedReader�� �ٷ� ���� �� ����. // InputStreamReader�� �ѹ� ���ļ� �޾ƾ� �޾���.
//		System.out.println(fs.read(a));
	}

}
