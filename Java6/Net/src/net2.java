import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//전송 형태의 프로토콜
//TCP(연결 프로토콜)-전송속도가 빠름 , 
//UDP(사용자 데이터 프로토콜) - 전송속도가 느림(1:1일 경우 굉장히 빠름)
/*PORT(TCP)
80: WEB(http://) // 8080 : 가상포트
21: FTP (파일 전송시 사용)
22: SSH (shell같은것) - Linux, Unix (파일전송,서버 외부접속) 
23: TELNET - window (서버 외부접속)
443: WEB(https://)
25: SMTP(메일서버) -메일보내기
110: POP3(메일받기) - 문자,파일받기. 서버와 비동기화
143 :IMAP(메일받기) - 문자, 파일받기.서버와 동기화
*/

/*SNMP: UDP(문자발송시스템), VPN(가상IP)-UDP*/
public class net2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해 주세요.");
		String url = sc.next();
		
		URL u = new URL(url); // URL(클래스) : 네트워크경로를 말합니다.
		URLConnection con = u.openConnection(); // 해당 경로를 연결
		
//		System.out.println(con);
		int imgsize = con.getContentLength(); // indexOf기능  -1 (없음), 그외에는 파일확인해 이미지크기 출력해줌
//		System.out.println(imgsize);
		String imgtype = con.getContentType(); //파일 속성을 확인하는 부분. 80port가 막혀있으면 이미지링크를 http://로 호출할경우 image가 아닌 text이런식으로 뜸
		System.out.println(imgtype);
		long date =  con.getDate(); // 파일로드날짜 서버 시스템에 올라가있는 시간. 우리가 아는 시간으로 변환이 필요함
		System.out.println(date);
		
		InputStream is =  u.openStream(); //openStream :URL에서 파일을 읽어올 때 사용함
		BufferedInputStream bi = new BufferedInputStream(is); // URL에서 읽은 파일을 임시 저장
		byte data[] = new byte[1024]; // 1024byte = 1kb 해당 파일을 조각냄
		FileOutputStream fo = new FileOutputStream("copy.jpg");
//		System.out.println(bi.read(data));
		int imgdata =0;
		int cnt =0; // 반복값
		
		while((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata); // 조각난 파일을 붙여넣기 하는 상태
			cnt += imgdata;//1024++
			System.out.println("다운로드 중..."+(cnt*100)/imgsize+"%"); // (카운터값*100)/이미지크기+"%" : 0~100%까지 표현하는 공식 
		}
		fo.flush();
		fo.close();
		System.out.println("다운로드가 완료 되었습니다.");
	}

}
