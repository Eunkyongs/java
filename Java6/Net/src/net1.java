import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
	//UnknownHostException : HOST 정보가 확인되지 않을 경우 , HOST: 도메인
	public static void main(String[] args) throws UnknownHostException { //확인불가 호스트 예외처리
		//InetAddress : IPnetworkAddress 
		//getByName : 접속할 도메인 주소명을 말합니다.
		InetAddress ia = InetAddress.getByName("www.naver.com");
//		System.out.println(ia); // ia.toString() = ia 같은내용 출력됨.
//		System.out.println(ia.toString());
//		System.out.println(ia.getHostName()); //getHostName : 도메인명
//		System.out.println(ia.getHostAddress());// DNS에 연결된 IP
	
//		ctrl+alt+shift+t = 터미널 단축키
		

		//getAllByName : 도메인에 IP정보를 확인. 배열로 구성해야함.
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length); // 해당 DNS에 IP갯수
		int w = 0;
		// 반복문으로 해당 dns가 가진 ip 모두출력
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
		
	}
}
