import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*�ش� ������ �� ������ �� ���� ��Ȳ�� ������ ������ �Դϴ�.
 �ش� �������� 100�̸��� ������ ���� �︸ 20220623.txt ���Ϸ� ������ ����ǵ��� �Ͻʽÿ�.
������,671.126
�����,132.03
������,23.29
�޹��,108.58
�Ҿ簭��,164.462
�Ǿϴ�,69.79
û���,49.52
��õ��,101.01
���ִ�,119.613
������������,64.55
�ȴ��,24.87
��ȭ�Ǵ�,163.53
��ź����,47.259
ȭõ��,163.46
Ⱦ����,166.56

 ���:������, �Ǿϴ�, û���, ������������, �ȴ��, ��ź����*/

public class Example2 {

	public static void main(String[] args) throws IOException{
		
		try {
		
		FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\info.txt");

		
		
			
		//���ϻ���
		Path data = Paths.get("C:\\Java5\\File_Stream\\src\\20220623.txt");
		Files.createFile(data);
		}
		catch(Exception z) {
			System.out.println(z);
		}
		
		
		
		
		
		
	}

}
