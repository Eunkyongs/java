import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//�̹��� �뷮����
public class file15 {

	public static void main(String[] args) throws IOException{
		String file = "C:\\Java5\\File_Stream\\src\\img7.jpg";
		InputStream is = new FileInputStream(file); // Stream �̶�� �ܾ ���ִٸ� 1ȸ�� �̴� ��� ����Ұ� . �ѹ� ��� �ϸ� �� �ٽ� �ҷ��;���
		
		//FileinputStream�� buffer�� ����ϰ� �Ǹ�, �� �̻� FileinputStream�� ������
		//�� �������� buffer�� new FileInputStream�� �����Ͽ� ������ ����� �� �ֵ��� ������.
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		
		byte filesize[] = new byte[bi.available()]; // �뷮���� �ɶ��� ��ü�뷮 �о�;���.
		
		int total =bi.read(filesize);
//		System.out.println(is.read(filesize));
		if(total>92160) { // 1024*90
			System.out.println("�̹��� ���� �뷮�� 90kb���� �Դϴ�.");
		}else {
			System.out.println("���������� ��� �Ǿ����ϴ�.");
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(total);
		}
		
		
	}

}
