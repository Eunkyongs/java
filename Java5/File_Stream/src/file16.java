import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

import javax.xml.transform.Source;

//�̹��� �б�, ����
public class file16 {

	public static void main(String[] args) throws IOException{
		//java12 ver �̻�
		//r, w, x => r(read):�б�, w(write):����, x(excute): ����
		//RandomAccess : ����ڰ� �ش� ���� �Ӽ� ������ ������ �� ����. 
		try {
			
		String files = "C:\\Java5\\File_Stream\\src\\img7.jpg";
		String cp = "img222.jpg";
		RandomAccessFile file =  new RandomAccessFile(files, "r");
		RandomAccessFile file2 =  new RandomAccessFile(cp, "rw"); 

		//FileChannel : IO(FileInputStream, FileOutputStream) �� ���� ����. input+output ��ģ ����
		//getChannel(): RandomAccessFile �ش� �޼ҵ带 �������� ����
		FileChannel fc = file.getChannel();
		FileChannel target = file2.getChannel();
		
		//transferTo, transferFrom (��������) 
//		fc.transferTo(0, fc.size(), target); // (�迭0, �迭����ȣ, �ش纹����ġ)
		
		target.transferFrom(fc, 0, fc.size()); // (���������ϸ� , �迭0, �迭����ȣ)
		
		System.out.println(fc);
		}catch(Exception e) {
			
		}
	}

}
 