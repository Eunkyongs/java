package Java_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1_1 {

	public static void main(String[] args) throws IOException {
		
		lotto1 lt = new lotto1();
		lt.setter();
	}
}
class lotto1{
	Scanner sc = null;
	LinkedList<Integer> k = null; 
	String url ="C:\\javatest\\javatest\\src\\Java_test\\lotto.txt";
	public void setter() throws IOException {
		try {
		this.fileload();
		}catch(Exception e) {
		}
		
	}
	
	public String getter() {
		return null;
	}
	
	public void fileload() throws IOException{
//		InputStream is = new FileInputStream(null);
		try {
		FileInputStream fi = new FileInputStream(this.url);
//		System.out.println(fi.available()); // ��ü ũ��
		byte[] temp = new byte[fi.available()];
		int ea = fi.read(temp); // ����Ȯ��
		String test = new String(temp,0,ea);
		System.out.println(test);
		
		//�ݺ��� �̿��ؼ� LinkedList�� �߰�
		
		
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}