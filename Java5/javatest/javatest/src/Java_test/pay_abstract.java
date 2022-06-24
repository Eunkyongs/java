package Java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {
	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87000000;//회사 총 잔고 금액
	
	protected String security = ""; // 이 키가 확인안되면 작동 안되게
	public  void start(String a){};// 오버로딩.필요할때만 불러오게
	public abstract void start();
	abstract void db () throws IOException; //예외처리 사용하지 않습니다. (public 빼고 사용)
	public abstract int[] check(); // getter (return 2개 이상)
	
	
}
