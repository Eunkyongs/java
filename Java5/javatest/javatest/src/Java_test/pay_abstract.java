package Java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {
	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87000000;//ȸ�� �� �ܰ� �ݾ�
	
	protected String security = ""; // �� Ű�� Ȯ�ξȵǸ� �۵� �ȵǰ�
	public  void start(String a){};// �����ε�.�ʿ��Ҷ��� �ҷ�����
	public abstract void start();
	abstract void db () throws IOException; //����ó�� ������� �ʽ��ϴ�. (public ���� ���)
	public abstract int[] check(); // getter (return 2�� �̻�)
	
	
}
