
public class Test2 {

	public static void main(String[] args) {

		int score=90;
		String msg;
			
		if(score>=90) { //100~90 
			msg="��� A �Դϴ�.";
		}else if(score>=70) { //70~89
			msg="��� B �Դϴ�.";
		}else if(score>=50) {//50~69
			msg="��� C �Դϴ�.";
		}else {	
			msg="�Ϲ� ��� �Դϴ�.";
		}
		System.out.println(msg);
	}
}
