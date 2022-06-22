import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/*���� ��ɾ� ���� : read()-1�ܾ�, readLine()-1��, next()-1�ܾ�, nextLine()-1��  */
//BufferedReader (Output) ������ ����Լ� ���!
public class file7 {

	public static void main(String[] args) throws IOException {

		try {
			FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
//			System.out.println(fr.read()); // ������ �� �ҷ��������� Ȯ��.�� �ҷ�������쿣 ���ڷ� ��µ�.
//			System.out.println((char)fr.read()); // ������ ���� 1�� Ȯ��. ������ ������ Charset.forName()���� ���ڵ���ȯ�ʿ�. 
			
			
			//BufferedReader : Temp(�ӽ������) - ȿ�������� ������ ���� ������ ������ �� �ֽ��ϴ�.
			BufferedReader bf = new BufferedReader(fr); //readLine()���� �ش� ���� Ȯ���մϴ�.
//			System.out.println(bf.readLine());// Line���� �������� FileReader���� ���Ұ�. ���۸� �ѹ� ���ľ� �� 
//			bf.close(); // filereader�� �޾ұ⶧���� ���۸� �ݾƵ� ���ϸ����� ���� ����.
			
			//�ش� �ӽ� ����ҿ��� ����� ������ �Ѱ��� �Ѱ��� �������� �ε��ϰ� �˴ϴ�.
			//Buffer�� ���� ���� ����Ͽ��� ��� ������ ���� ������ ���� ����ϰ� �˴ϴ�.
			
//			BufferedReader bf2 = new BufferedReader(fr); // ���Ϸε� �ȵ�. FileReader�� 1ȸ��. �ٽ� ������ �ε��ϰ� ������ ���ο� FileReader�����ؼ� �����;� ��.
			
			/*
			//���ǹ� ���ÿ��� �ѹ� �۵��� �̷������ �˴ϴ�.
			if(bf.readLine() != null) {
				System.out.println(bf.readLine());
			}
			*/
			/*
			 //�ݺ������� ���
			int w = 0;
			while(w<=1) {
				String data = bf.readLine();
				System.out.println(bf.readLine());

				w++;
			}
			*/
			/*
			 //buffer�� �ӵ��� ������� ���κп� ������ ���� �Ǵ� �迭�� ���� �� ����ϴ°��� �����մϴ�.
			String line="";
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			*/
			 /*������ ������ ���� ������ Ȯ��*/
			//LineNumberReader : ���� ��ü ���� ������ Ȯ���ϴ� Ŭ���� �Դϴ�.
			FileReader fr2 = new FileReader("C:\\Java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			BufferedReader bf2 = new BufferedReader(fr2);
			LineNumberReader li = new LineNumberReader(bf2);
			int ea = 0;
			while(li.readLine() != null) {
				ea = li.getLineNumber();
			}
			System.out.println(ea);
			
			
			
			
		}catch(Exception z) {
			System.out.println(z);
		}
		
		
	}

}
