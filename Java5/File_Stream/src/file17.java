import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//bufferedWriter
//Buffered : read, writer �ܵ����� ����ϴ� ���� ���� ����. 
public class file17 {

	public static void main(String[] args) throws IOException {
		
		try {
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os); 
		bw.write("ȫ�浿 �Դϴ�.");
		bw.close();

		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//�Ʒ� ���� ���ٷ�
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String test =  br.readLine();
		System.out.println(test); // ���۷� ���𰡸� ���� �� ���ʿ� �ٸ� ���𰡰� ����� �Ŀ�(ex.inputstream ��) ����ؾ� ��
		
		
		System.out.println(bw);
		}catch(Exception e) {
			
		}
		
	}

}
