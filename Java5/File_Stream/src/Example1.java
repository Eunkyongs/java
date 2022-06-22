import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 ���빮��. �ش� ����ڰ� ��ȭ ������ �˻��մϴ�.
 �ش� ��ȭ ���� �´� �����Ͱ��� ���� ��� 
 ��ȭ ��ü�� ���� ������ ����ϰ� �˴ϴ�.
 ��Ʈ : Scanner ���
 "�˻��� ��ȭ ������ �Է��ϼ���?:" ���˵���2
 [���˵���]-��õ5 2022�� 4�� ����
 
 "�˻��� ��ȭ ������ �Է��ϼ���?:" �Ƿη�
 "�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�."
 */
public class Example1 {

	public static void main(String[] args) throws IOException {
		//���Ϸε�
		FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\movie_db.txt",Charset.forName("UTF8"));
		BufferedReader bf = new BufferedReader(fr);
		
		//������ �迭�� �������
		ArrayList<String> moviedb = new ArrayList<>();
		String movie = "";
		while ((movie=bf.readLine()) != null) { 
			moviedb.add(movie); 
		}
		bf.close();
		//����ڰ� �˻��� ��ȭ���� �Է�
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է��ϼ���?");
		try {
			String mname = scan.nextLine();
			int ea =moviedb.size();
		
			for(int f=0; f<ea; f++) {
				if(mname == moviedb.get(f)) {
					System.out.println(moviedb.get(f));
				}else {
					System.out.println("�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.");
					break;
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
