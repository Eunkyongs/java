import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

//OutputStream (output) - �ֻ���
//(����) FileOutputStream, ObjectOutputStream,AudioOutputStream(����)  
public class file10 {

	public static void main(String[] args) {
//		String a = "ȫ�浿"; // ����
		String a = "123456789";
		//byte[] : ���ڿ��� ASCII Ű ������ �迭�� ���� �� �� ���
		byte[] b =a.getBytes();  //getBytes("�����Ŷ") �޼ҵ�
		System.out.println(Arrays.toString(b)); // ASCII�ڵ� �迭 ��µ�.
		OutputStream os =System.out; // ��¸� ��� System.out.print����
		
		try {
			os.write(b,0,b.length); //(byte�迭�̸�, �迭��ȣ, �迭ũ��) //�����⿪��? ASCII�ڵ带 ���ڷ� ��ȯ
//			os.flush(); // �����Ʈ
			
		}catch(Exception z) {
			
		}
			
			
	}

}
