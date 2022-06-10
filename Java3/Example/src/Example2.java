public class Example2 {
	private int user_num ;
	private int pc_num ;
	public String msg ; // 결과 메세지
	
	
	public void number(int pc_num,int user_num) { //setter (인수값 받음)
		this.user_num=user_num;
		this.pc_num = pc_num;
//		System.out.println(pc_num+" ,"+user_num); //1번파일에서 번호 잘넘어오는지 확인 ok
			
		//넘어온 랜덤숫자랑 사용자 입력 숫자 비교
		if(this.user_num < this.pc_num) { // 랜덤숫자가 더 클경우
				this.msg = "Up";
		}
		else if(this.user_num > this.pc_num) { // 랜덤숫자가 더 작을경우
			this.msg = "Down";
		}
		else { // 두 값이 같을 경우
			this.msg = "정답";
		}
	}
	public String result() { // 랜덤값과 사용자입력값 비교 결과 1번파일로 리턴 //getter(인수값x)
		return this.msg;
	}
}
