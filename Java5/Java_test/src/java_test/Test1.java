/*
 �ش� �����Ͱ� �ִ� ��Ȳ �Դϴ�. �ش� ������ �� �ְ� ������ ����ڸ� ����� �Ͻÿ�.
��� ��
1�� : Daniel(98)
{
{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
{"65","74","23","75","68","96","88","98","54"}
}

�� abstract�� �ʼ��� ����Ͻñ� �ٶ��ϴ�.*/
package java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) {
	
		String data[][] = {
				{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
				{"65","74","23","75","68","96","88","98","54"}
				};
//		//���ڵ� �ε�
//		highscore hs = new highscore();
//		hs.set(data);
//		String result = hs.get();
//		System.out.println("1��:"+ result);
		
		//�������ڵ� �ε�
		fs f = new fs();
		f.load();
	}
}
//������ Ǯ��
abstract class data{
	public abstract int index(int data2[]);
	public abstract void load();
}
class fs extends data{
	@Override
	public int index(int[] data2) {
		int z=0;
		int s=0;
		while(s<data2.length) {
			if(data2[z]<data2[s]) {
				z=s;
			}
			s++;
		}
		return z;
	}
	@Override
	public void load() {
		String [] nm = { "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
		String [] sc = {"65","74","23","75","68","96","88","98","54"};
		int ea = sc.length;
		int sc2[] = new int [ea];
		int w = 0;
		while(w<ea) {
			sc2[w] = Integer.parseInt(sc[w]); 
			w++;
		}
		
		int ck = index(sc2);
		System.out.printf("1��:%s�� %s��",nm[ck],sc[ck]);
		
//		Arrays.sort(sc2);
//	Static String best = null;
//		this.best = String.valueOf(sc2[ea-1]).intern();
		
	}
}




/*
//���ڵ�
abstract class score{
	public abstract void set(String[][] sdata);
	public abstract String get();	
}
class highscore extends score{
	private String[][] score;
	private String hs = ""; 
	private ArrayList<String> st = null;
	@Override
	public void set(String[][] sdata) {
		this.score = sdata;
		int ea1 = this.score.length;//2
		int ea2 = this.score[0].length;//9
		int w =0;
		
		this.st = new ArrayList<>();
		for(int f=0; f<ea2; f++ ) {
		this.st.add(this.score[1][f]);
		}
		Collections.sort(this.st);

		
		while(w<ea1) {
			int ww = 0;
			while(ww<ea2) {
//				if(this.score[1][ww].equals("98") ) {
				if(this.st.get(ww) == this.score[1][ww]) {//������ ����ؾߵǳ�..
					this.hs += this.score[w][ww]+" ";
				}
				ww++;
			}
			w++;
		}
	}
	@Override
	public String get() {
		return this.hs;
	}
}
*/