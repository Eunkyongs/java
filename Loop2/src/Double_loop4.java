
public class Double_loop4 {

	public static void main(String[] args) {
		/*���빮��: ���չݺ��� for, do~while */
		
		int f;
		for(f=2; f<=3; f++) {
			int w = 1;
			do {
//				System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		}
		
		/*���빮��: ������ 7~9�ܱ��� ��, �� ������ �������� 5������ �������� �մϴ�. 7*1=7~7*5=35,8*1=8...9*5=45
		  ����(do~while, while)*/
		
		int dw = 7;//ū�ݺ��� �ʱⰪ
		do { //ū�ݺ���
			int w= 1; //�����ݺ��� �ʱⰪ
			while(w<=5) { //�����ݺ��� 1~5���� �ݺ�
//				System.out.println(dw+"*"+w+"="+(dw*w)); //������ ���
				w++; // ����
			}
			dw++;//����
		}while(dw<=9); //ū�ݺ��� 7~9���� �ݺ�
		
		/*���빮�� : ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�. ��, for ~ while������ ���۵ǵ��� �մϴ�.
		 1*1=1
		 2*2=4
		 3*3=9
		 4*4=16
		 5*5=25
		 6*6=36
		 7*7=49
		 8*8=64
		 9*9=81
		  */

		int f1,to;
		for(f1=1; f1<=9; f1++) {
			int w=f1;
			while(w<=f1) {
				to = f1*w;
//				System.out.println(f1+"*"+w+"="+to);
				
				w++;
			}
		}
		
//		������ Ǯ��
		
		int g;
		int total2;
		for(g=1; g<=9; g++) {
			int y=g; // ū �ݺ����� ���� �����ϰ� �ʱⰪ�� ū�ݺ����� �ݺ������δ���
			while(y<=g) {
				total2 = y * g;
//				System.out.printf("%d*%d=%d ",y,g,total2);
				y++;
			}
		}
		
		/*���빮�� ���� �ش� �����ó�� ����� �ǵ��� ����ݺ����� �̿��Ͻÿ�(while~ do~while)
		 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8	  
		 */
		
		int w1=1;
		int tot;
		while(w1<5) {
			int	dw1=w1;
			do {
				tot=w1+dw1;
				System.out.println(w1+"+"+dw1+"="+tot);
				dw1++;
			}while(dw<=4);
			w1++;
		}
				
	}

}
