import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//Client
	public static void main(String[] args) throws Exception {
		System.out.println("클라이언트");
		String ip ="127.0.0.1"; //localhost: 127.0.0.1 (내컴퓨터에서 테스트할경우.) 다른pc와 통신시 접속할 ip주소 입력.192.168.1.134
		int port = 8080;
		try {
			Socket sc = new Socket(ip,port); // 접속할 서버ip, 접속할 서버port . ip와 port를 사용해서 접속을 했는지 확인 
			System.out.println("서버에 연결 되었습니다.");
			String cmsg="안녕하세요";
			/*Client에서 Server로 보내는 통로*/
			OutputStream os = sc.getOutputStream();
			
			/*Server에서 보내는 값을 받는 통로*/
			
			/*Client에서 적용한 메세지를 메모리에 적용 후 byte로 전송*/
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			/*Server에서 회신된 내용을 byte배열로 받은 후 출력 */
			byte data[] = new byte[1024];
			int n =is.read(data);
			String sm = new String (data,0,n);
			System.out.println(sm);
			
		}catch(Exception e) {
			System.out.println("서버 연결에 실패하였습니다.");
		}
	}

}
