import java.util.ArrayList;

public class test7_1 {
	public static void main(String[] args) {
		/*
		 * ���빮�� ���� ���ڹ迭�� �ֽ��ϴ� �ش�迭���� ¦��,Ȧ�� ���� ���� �����ͼ� �迭�� ó�� �մϴ�. ��Ƽ�����带 �̿��Ͽ� ����մϴ�. ���
		 * ¦��:[2,6,10,22,42,50] Ȧ��:[1,7,11,15,43,51]
		 */
		int[] num = { 1, 2, 6, 7, 10, 11, 15, 22, 42, 43, 50, 51 };
		listodd lo=null;
		listeven le=null;
		int w=0;
		while(w<num.length) {
			if(num[w] %2 == 0) {
				le= new listeven(num[w]);
				le.start();
			}else {
				lo=new listodd(num[w]);
				lo.start();
			}
		w++;	
		}
		}
}
class listeven extends Thread {
	static ArrayList<Integer> evenlist = new ArrayList<>();
	 int nb=0;
	public listeven(int a) {
		this.nb =a;		
	}
	@Override
	public void run() {
		this.evenlist.add(this.nb);
		System.out.println("¦��"+this.evenlist);
	}
}
class listodd extends Thread {
	static ArrayList<Integer> oddlist = new ArrayList<>();
	 int nb=0;
	public listodd(int a) {
		this.nb =a;		
	}
	@Override
	public void run() {
		this.oddlist.add(this.nb);
		System.out.println("Ȧ��"+this.oddlist);

	}
}

