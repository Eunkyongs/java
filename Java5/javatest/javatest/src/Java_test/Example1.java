package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 ���빮��: ����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� ���α׷� �Դϴ�.
		 ���μ��� ���۽� "���ڸ� �Է��� �ּ���: "��� ���. �� 6���� ���ڸ� �Է¹ް� �˴ϴ�.
		 �׸��� lotto.txt ����� ���� ������ �ε��Ͽ� ����ڰ� �Է��� ���� ����� ���Ͽ� ��� ������� �����ϴ� ���α׷� �ڵ带 �ۼ��Ͻÿ�.
		 
		 [�������]
		 �ζ� ��� :  �� 3���� ��ȣ�� ���߼̽��ϴ�.!
		 */
		
		lotto l = new lotto();
		l.load(); // ���Ϸε���Ʈ
		l.usernum(); // �����Է���Ʈ
		l.compare(); // ����Ʈ
	}

}

class lotto {
	FileReader fr=null;
	ArrayList<Integer> u_num = new ArrayList<>(); //����� �Է¼��� ���� �迭
	ArrayList<Integer> f_num = new ArrayList<>(); //���ϼ��� ���� �迭
	//���Ϸε�
	public void load() throws IOException {
		try {
		this.fr = new FileReader("C:\\javatest\\javatest\\src\\Java_test\\lotto.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		
		while(br.readLine() != null) { //br.readLine() != null 
			this.f_num.add(Integer.valueOf(br.readLine()));
		}
		br.close();
		System.out.println(this.f_num);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	//����� ���� �Է���Ʈ
	public void usernum() {
		Scanner scan = new Scanner(System.in);
		int w = 0;
		while(w<6) {
			System.out.println("���ڸ� �Է��� �ּ��� :");
			int usernum = scan.nextInt();
			this.u_num.add(w,usernum);
			w++;
		}
		System.out.println("����� �Է� ����:"+this.u_num);//�Է¹迭Ȯ��
	}
	
	//���Ϸε尪 ������Է°� ��
	public void compare() {
		
		int w =0 ;
		int count =0;
		while(w<this.u_num.size()) {
			if(this.f_num.get(0) ==  this.u_num.get(w)) {
				
				count++;
			}
			w++;
		}
		
		System.out.printf("�ζǰ�� : �� %d���� ��ȣ�� ���߼̽��ϴ�!",count);
		

		
	}
	
}
