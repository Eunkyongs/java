//FileOutputStream

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class file12 {

	public static void main(String[] args) throws IOException{
		
		String test="�����Դϴ�.";
//		FileOutputStream os = new FileOutputStream("C:\\Java5\\File_Stream\\src\\array.txt");
		OutputStream os = new FileOutputStream("C:\\Java5\\File_Stream\\src\\array.txt");
		
		byte[] data = test.getBytes();//����->ASCII�� ��ȯ
		os.write(data);
		os.flush(); 
		//Stream�� ����� ��� ���� �޸𸮿� �ְ� �˴ϴ�. 
		//flush() �޸𸮰��� ��� ���� �۾��ϰ� �˴ϴ�.
	}

}
