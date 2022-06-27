import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.IIOException;

//�̹���(binary) ���� ���� byte���� (Filereader -> �̹����� �ε� �Ұ�)
//FileInputStream �̹��� �ε�ÿ� Stream�� �̿��ؾ���.
//throws �����Ұ�� try~ catch(IOException e) �̷������� ����ϸ� throws �����ص� ��.
public class file14 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Java5\\File_Stream\\src\\img2.jpg"); 
//			FileInputStream fs = new FileInputStream("");
//			System.out.println(is.read()); //�̹��� �ε�� �ȼ��� �� ��ġ�� ���(0~255-rgb�ڵ�) 
			//read�� ���� �� �����ؾ���. => Stream�� ���ۿ� ����Ͽ� read�� ����ϴ� ���� �ش� �޸𸮿��� ������� ������ �߻��մϴ�.
//			byte b [] = new byte [is.available()]; // is.available() -������. �뷮���Ѱɶ� ����Ҽ� ����
//			System.out.println(is.read(b));//��üũ�� �뷮Ȯ��
			
			byte b [] = new byte [is.available()/100]; // �о���̴� �迭�� ũ�⸦ ������ ������ 1024=1kb // is.available()/1024 -> 1kb������ �ɰ��� �о����
			
			FileOutputStream os = new FileOutputStream("img_test.jpg");
			
			//�ݺ��� �����ϴ� ���� ��������
//			int img =is.read(b); // ��ü�뷮 �о����
//			os.write(b);//���Ϸ� �������� // �ݺ��� ������� ����.
			
			//�ݺ��� ����ϴ� ���� ��������
			int img = 0; //�д� ����Ʈ��
			int check = 0;//�д� Ƚ��
//			while((img=is.read(b)) != -1) {
//				check += img;
//				System.out.println(check+"%");
//				os.write(b,0,img); //�ٿ�ε�%�� ǥ���Ҷ� ����ϱ� ����. ��% �޾Ҵ��� ī��Ʈ ������. progress bar ��뿡 ����. 
			
			//�ٿ�ε�� �ε带 ����̳�, progress�� �̿��Ͽ� ������ �� ���
			while(true) { // loop
				img = is.read(b); //�ش� ������ �о ����Ʈ ������ �ѱ�
				if(img == -1) {
					break;
				}else {
					os.write(b,0,img);
				}
				check++;
				if(check % 2 == 0) {
					System.out.println(check+"%");
				}
				
			}
			
		}
		catch(IOException i) {
			
		}catch(Exception e) {
			
		}
	}

}
