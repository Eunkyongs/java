import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

//Reader (�ֻ���) - ���� �����ϸ� �ڵ����� �������̵� read,close�޼ҵ� ��
//(����) BufferedReader, FileReader, CharArrayReader(�迭) - �������� ASCII
//(����) InputStreamReader - �̹���, ������, �����


//InputStream(�Է�)
public class file9 {

	public static void main(String[] args) throws IOException {
		//Stream : �̹���, ������, ����� ���� ������ �ε��ϱ� ���ؼ�(���̳ʸ�)
		//InputStream : ��� �Է���ġ�� ���� ���� �޴� Ŭ�����Դϴ�. �⺻(int)
		//InputStream (�ֻ��� �Է���ġ)
		// (����Ŭ����) - FileInputStream(��������), AudioInputStream(���������), ObjectInputStream

		InputStream is = new InputStream() { //�⺻Ŭ������ �ε��Ͽ� �������̵� �޼ҵ� 
			// �ܵ����� ���Ǵ� ��캸�� ���ϸ������ ���� ���� . close ������. 
						
			@Override
			public int read() throws IOException { //byte���� 1~2 -> 1024 ���� �ø�������  
				int a = 15;
				return a;
			}
		};
		
//		int b = is.read(); //InputStreamReader ��ġ���ʰ� InputStream�� �ٷ� ��µ� ������. �����Ŷ����Ұ�
		
		//InputStreamReader (�����Ŷ ����)
		/*FileInputStream���� ���� �޾ƿ����� �����Ŷ ���� : 
		 InputStreamReader("���ϸ�","EUCKR"); or InputStreamReader("���ϸ�","UTF8"); 
		 BufferedReaderó�� Charset,forName �����ϰ� �ٷ� ���ڵ����漱��  
		 */
		InputStreamReader ir = new InputStreamReader(is);  // inputStream���� �Է¹��� �����Ŷ ������ ,Charset.forName("UTF8") ���
		try {
//			System.out.println(is.read());
		}catch(Exception z) {
			System.out.println(z);
		}
		
		//Ű���尪 �ε�
		InputStream user = System.in ; // ��ĳ�ʿ� �����ϰ� Ű����� �Է� ����.
		try {
			int code = user.read(); //Ű���� �Է� ASCII �ڵ尪�� ��ȯ��
			if(code ==13) {
				System.out.println("����Ű�� ����Ͻ� �� �����ϴ�.");
			}
//			System.out.println(code);
		}catch(Exception z) {
			
		}
		
	}

}
