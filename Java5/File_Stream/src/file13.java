import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;

public class file13 {

	public static void main(String[] args) throws IOException{
		try {
			
			//createDirectories : �ű� ���丮 ����
//			Files.createDirectories(Paths.get("C:\\Java5\\File_Stream\\src\\test"));
			
			//���Ϻ���
//			Path data1 = Paths.get("C:\\Java5\\File_Stream\\src\\movie_db.txt");
//			Path data2 = Paths.get("C:\\Java5\\File_Stream\\src\\movie_db.txt");
//			Files.copy(data1, data2);
			
			//�ش� ������ �ٸ� ���丮�� �̵�
//			Path data3 = Paths.get("C:\\Java5\\File_Stream\\src\\movie_db.txt");
//			Path directory = Paths.get("C:\\memo\\movie_db2.txt");
//			Files.move(directory, data3);
			
			//�ش� ���� �����
//			Path data4 = Paths.get("C:\\Java5\\Swing\\src\\swing1\\loopy4.jpg");
//			Files.delete(data3);
			
			//�ش� ���� ����
			Path data3 = Paths.get("C:\\Java5\\File_Stream\\src\\movie_db3.txt");
			Files.createFile(data3);
			
			
		}catch(Exception z){
			System.out.println(z);	
		}
		
	}

}
