import java.awt.*;
import java.awt.event.*;

public class awt4 {
	public static void main(String[] args) {
		//awt4_class.java����
		decorate de = new decorate();
		de.view();
	}
}

class decorate extends awt4_class{
	
	public String result="";
	public void btn_push(int c) {
		/*����ڰ� �Է��� ���ڸ� �������� �������� �ۼ�*/
		
		int gugu=1;
		int f;
		
		for(f=1; f<=9; f++) {
			gugu=c*f;
			this.result += (c+"*"+f+"="+gugu +"\n") ;
		}

		
//		int w=1;
//		while(w<=9) {
//			gugu=c*w;
//			this.result += (c+"*"+w+"="+gugu +" ") ;
//
//			w++;
//		}
	}
	public String calls() {
		return this.result;
	}
	
}