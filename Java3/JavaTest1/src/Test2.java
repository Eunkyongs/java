
public class Test2 {

	public static void main(String[] args) {

		int score=90;
		String msg;
			
		if(score>=90) { //100~90 
			msg="등급 A 입니다.";
		}else if(score>=70) { //70~89
			msg="등급 B 입니다.";
		}else if(score>=50) {//50~69
			msg="등급 C 입니다.";
		}else {	
			msg="일반 등급 입니다.";
		}
		System.out.println(msg);
	}
}
