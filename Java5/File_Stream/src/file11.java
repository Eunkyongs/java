import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream�� �̿��� ���� �ε�
public class file11 {

	public static void main(String[] args) throws IOException{
		
		try{
//		FileInputStream fs = new FileInputStream("C:\\Java5\\File_Stream\\src\\list.txt");
		InputStream fs = new FileInputStream("C:\\Java5\\File_Stream\\src\\list.txt"); // ������ �ҷ��� �ֻ����� ����. �����ٰ� ���� ������ 
//		System.out.println(fs.available()); // available : ���� ��üũ��
		
		//�����ѿ뷮 �迭����(���� ũ�⿡ ���� �������ְ� ����) ex)���ϵ��
		byte temp[] = new byte[fs.available()]; 
		int ea = fs.read(temp);
		String data = new String(temp,"UTF-8"); 
		System.out.println(data);
		
		/* 
		byte temp[] = new byte[9999]; // ����Ʈũ�� ����ɶ����. �ش�ũ�⸦ ������ �� ����. ����Ʈ�� Ŭ���� ����-> �� ���� �����͸� �ε��� �� ���� // new byte[1024*16]; 1024*16 ����ũ�� �̹������� ÷�ν� ���. 
		int ea = fs.read(temp); // ASCII�ڵ�� ��ü�� �о ea�� �޵���
		String data = new String(temp,"UTF-8"); // String �������·� �迭�� �޾Ƽ� ���
		System.out.println(data);
		*/
		}catch(Exception e) {
			
		}
		
	}
}
