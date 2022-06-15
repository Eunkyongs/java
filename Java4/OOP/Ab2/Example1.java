package Ab2;
public class Example1 {
	public static void main(String[] args) {
		home h[] = {new computer(),new monitor()}; //인터페이스 기준
		home h2[] = {new phone()}; //extends로 home을 로드하였음
		h[0].broken(50);
		h[1].broken(0);
		h2[0].broken(18);
	}
}

class computer implements home{
	@Override
	public void poweron() {
		System.out.println("컴퓨터 전원 공급중!!");
	}
	@Override
	public void poweroff() {
		System.out.println("컴퓨터 전원 중단!!");
	}
	@Override
	public void broken(int n ) {
		if(this.bk<=n) {
			System.out.println("컴퓨터 고장!!");
		}else if(this.bk>n && n>0) {
			this.poweron();
		}else {
			this.poweroff();
		}
	}
	
}
class monitor implements home{
	@Override
	public void poweron() {
		System.out.println("모니터 전원 공급중!!");
	}
	@Override
	public void poweroff() {
		System.out.println("모니터 전원 중단!!");
	}
	@Override
	public void broken(int n) {
		if(this.bk<=n) {
			System.out.println("모니터 고장!!");
		}else if(this.bk>n && n>0) {
			this.poweron();
		}else {
			this.poweroff();
		}
	}
}
/*
 휴대폰에 추가 기능이 필요합니다.
 휴대폰 고장시 최소전원(20)->정상작동 40이상 80이상되면 고장
 1.전원은 공급되지만 화면이 고장날 경우(공급중 작동이 안되는 경우) - 20~39까지만
 2.전원을 공급시키지만 충전이 안될 경우(공급이 아예 안되는 경우) -20미만 숫자일 경우
 */

class phone implements home, home2{
	@Override
	public void poweron() {
		System.out.println("휴대폰 전원 공급중!!");
	}
	@Override
	public void poweroff() {
		System.out.println("휴대폰 전원 중단!!");
	}
	@Override
	public void broken(int n) {
		if(this.bk<=n) { // n이 bk=80 보다 같거나 크면 고장
			System.out.println("휴대폰 고장!!");
		}else if(this.bk>n && n>0) {// n이 bk=80보다 작거나 40보다 같거나 크면
			if(n<=39 && n>=20) { // 20~39 
				this.b_display();
			}else if(n<20) { // 20이하
				this.b_charge();
			}else
			this.poweron();
		}else {
			this.poweroff();
		}
	}
	@Override
	public void b_display() {
		System.out.println("휴대폰 전원 공급중이나 화면작동이 안됨!!");
	}
	@Override
	public void b_charge() {
		System.out.println("휴대폰 전원 공급중이나 충전 고장!!");
	}
}