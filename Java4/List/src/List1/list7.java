package List1;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		/*응용문제 : 
		 ArrayList 또는 LinkedList 둘 중에 원하는 메소드를 구현하시면 됩니다.
		 2차배열 형태입니다.
		 해당 데이터 값을 모두 더하여 짝수 인지 홀수 인지를 확인하시오.
		 
		 Integer data[][]={
		 	{10,20,30,40,50,60,70},
		 	{3,6,9,12,15,17,19}
		 };
		 
		 결과 : 총 합은 361이고 홀수 입니다.
		 */
		
		 Integer data[][]={
				 	{10,20,30,40,50,60,70},
				 	{3,6,9,12,15,17,19}
				 };
		
		 ArrayList []ar = new ArrayList[2];
		 int ea=0;
		 int total =0;
		 String msg="";
		 for(int f=0; f<2;f++) {
			 ar[f]=new ArrayList<Integer>();
			 for(int ff =0; ff<7; ff++) {
			 ar[f].add(data[f][ff]);
			 total +=(Integer) ar[f].get(ff);
			 }
		 }
		 if(total%2==0) {
			 msg="짝수입니다.";
		 }else {
			 msg="홀수입니다.";
		 }
		 System.out.print("총 합은 "+total+"이고 "+msg);
}
}
