import java.util.ArrayList;
import java.util.Arrays;

public class test3_1 {

	public static void main(String[] args) {
		
		String name = "honggildong";
		splitname sn = new splitname();
		String[] result =sn.namespell(name);
		System.out.println(Arrays.toString(result));
	}
}

class splitname{
	String []spell ;
	public String[] namespell(String a) {
		int w = 0;
		this.spell = new String [a.length()];//a.length()= 11
		while(w<a.length()) { 
			this.spell = (a.split(""));
			w++;
		}
		return this.spell;
	}
	
	
}