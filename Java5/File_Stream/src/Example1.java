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
		/* ���ڵ�
		try {
			//���Ϸε�
			List<String> data = Files.readAllLines(Paths.get("C:\\Java5\\File_Stream\\src\\movie_db.txt"));
			//������ �迭�� �������
			ArrayList<String> moviedb = new ArrayList<>(data);
			Scanner scan = new Scanner(System.in);
			System.out.println("�˻��� ��ȭ ������ �Է��ϼ���?");
			String mname = scan.nextLine(); //����ڰ� �˻��� ��ȭ���� �Է�
			int ea =moviedb.size();
			int aa; 
			for(int f=0; f<ea; f++) {
				aa= data.get(f).indexOf(mname);
				if(aa>-1) {
					System.out.println(moviedb.get(f));
				}else {
					System.out.println("�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.");
					break;
				}
				scan.close();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		*/
		//������ Ǯ��
		try {//���� �ε� �� �޼ҵ� ����
			Scanner sc = new Scanner(System.in);
			System.out.println("1.������ȭ 2.����������ȭ : ");
			int user = sc.nextInt();
			if(user ==1) {
				movie m = new movie("movie_db.txt");
			}else if (user == 2) {
				System.out.println("���� �غ��� �Դϴ�.");
			}
			sc.close();
			
		}catch(Exception k) {
			if(k.getMessage() != null) {
				System.out.println("���� ���񽺰� ���������� �ʽ��ϴ�.");
			}
		}
	}
}

class movie{
	private String path ="C:\\Java5\\File_Stream\\src\\";
	private FileReader fr = null;
	private BufferedReader bf = null;
	private ArrayList<String> list = null;
	private Scanner sc = null;
	
	//���Ϸε�޼ҵ�
	public movie(String filename) throws IOException {
		try {
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.custom();
			this.fr.close();
			this.bf.close();
			this.search();
		}catch(Exception a) {
			System.out.println(a);
		}
	}
	//�ε��� ���� �迭ȭ
	public void custom() throws IOException{
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
//		String datas=""; // do~while ���� ������ �Ʒ��� �ֱ⶧���� ù ���� �� ���Ե� 
		String datas = this.bf.readLine();
		do {
			this.list.add(datas);
		}while((datas=this.bf.readLine()) != null);
	}
	
	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է��� �ּ���: ");
		//indexOf, contains
		String subject = this.sc.next().intern(); // equals �Ⱦ��� intern ���
		boolean call = false;
		if(subject == "����") {
			sc.close();
			System.exit(0);
		}
		for(String moviesb : this.list) { //for~each
//			if(moviesb.indexOf(subject) != -1) { // moviesb �迭���� indexOf�� �̿��ؼ� ����ڰ� �Է��� ���� �ִ��� Ȯ�� -1 ����
//				System.out.println(moviesb);
//			}
			if(moviesb.contains(subject)) {
				System.out.println(moviesb);
				call = true;
			}
		}
		
		if(call==false) {
			System.out.println("�����͸� Ȯ�� �� �� �����ϴ�.");
		}
		this.search(); //����Լ�. �ٸ� ��ȭ�� �� ã���������� search�޼ҵ� ó������ �ٽ� ���� . ����Լ� ����Ҷ��� ��ĳ�� �����ϸ� ���ϵǾ� ��ĳ�ʸ� ȣ������ ���ϹǷ� ������.
	}
}