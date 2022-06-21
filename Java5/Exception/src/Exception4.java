public class Exception4 {

	public static void main(String[] args) {
		try { //실행시 처음 작동 1
		ex e = new ex(); //2
		e.loader("ok");//3
			
		//자기 자신을 바로 예외상황으로 만듦
		Exception aaa =new Exception();
		throw aaa; // throw : 자신을 호출하여 예외가 발생하면 자신을 호출한 class로 return 
		}catch(Exception e){ // 예외 발견전까진 작동안함 . catch(Exception | NumberFormatException e) 이렇게도 사용가능
			if(e.getMessage()!=null) {
			System.out.println(e);
			}
		}
//		}catch(IOException i) { // IO 사용안하는데 IOException 사용하면 error
			
//		}
	}

}
class ex{
	Exception ep = null; // 대기상태 //Exception 발생할수있으니 미리 선언해서 대기시켜놈. 
	public void loader(String a) throws Exception{ // throws try~catch를 받기위한 class를 로드
		/*잘못된 문법사항 (자신의 오류를 상위 main class에 모두 전달하는 상황임)*/
//		if(a=="ok") {
//			// 정상적이지만, loader class자체적인 오류가 발생	
//			int keycode = Integer.valueOf(a); 
//			
//		}else {
//			//해당 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우
//			this.ep = new Exception(); 
//			throw this.ep; 
//			}
		
		//올바른 문법
		try {
			if(a=="ok") {
				int keycode = Integer.valueOf(a);
			}
			else {
				System.out.println("test");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			 // 자신의 오류사항을 return받아서 확인함
			this.ep = new Exception(); //throw 사용시 문제를 완벽하게 파악하기 위해 선언
			throw this.ep; // 문제발생시 main클래스로 return // 메소드이름라인에 throws 없으면 사용불가
		}
	}
}