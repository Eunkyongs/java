import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Scanner�� �̿��� ���� ���� ����
public class file6 {

	public static void main(String[] args) throws IOException {
		
		try {
		FileWriter fw = new FileWriter("C:\\Java5\\File_Stream\\src\\db.txt");
		Scanner sc = new Scanner(System.in); // ����� �����Է�
		System.out.println("������ �Է��� �ּ���:");
		
		for(int a=0; a<3; a++) { //3�� �ݺ�
		
		String notice =( sc.nextLine())+ "\r\n"; // �ٹٲ� (���๮��) \n, \r, \r\n
		
		fw.write(notice); //�ش� �Է»����� db.txt�� ����
		}
		sc.close();
		fw.close();
		}
		catch(Exception z){
			System.out.println(z);
		}
		
		
	}
}
