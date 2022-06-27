import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//bufferedWriter
//Buffered : read, writer 단독으로 사용하는 경우는 거의 없음. 
public class file17 {

	public static void main(String[] args) throws IOException {
		
		try {
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os); 
		bw.write("홍길동 입니다.");
		bw.close();

		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//아래 두줄 한줄로
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String test =  br.readLine();
		System.out.println(test); // 버퍼로 무언가를 받을 때 위쪽에 다른 무언가가 선언된 후에(ex.inputstream 등) 사용해야 함
		
		
		System.out.println(bw);
		}catch(Exception e) {
			
		}
		
	}

}
