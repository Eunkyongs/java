import java.io.FileWriter;
import java.io.IOException;

//���� ���� (write)
public class file4 {

	public static void main(String[] args) throws IOException, Exception {
		try {
			//FileWriter : ���� �����͸� ���Ͽ� ���� Class
			
			String user[] = {"ȫ�浿40","������60","c","d"}; 
//			FileWriter fw = new FileWriter("C:\\Java5\\File_Stream\\src\\array.txt");
			FileWriter fw = new FileWriter("C:\\Java5\\File_Stream\\src\\array.txt",true); 

			//FileWriter true ����ϸ� ���� �Էµ� ������ �ʱ�ȭ ���� ����. ���� ������ �ڿ� write�� �Է��ϴ� �����Ͱ� ���� �Էµ�. 
			for(int f =0; f<user.length; f++) {
				fw.write(user[f]); // write : ����, �迭�����Ͱ��� ���Ͽ� ����(�Է½�Ŵ) 
			}
			fw.close();//���Ͽ��»����� �����Ͽ� �����մϴ�.
			
		}catch(Exception x){
			System.out.println("test");
		}
			
	}

}
