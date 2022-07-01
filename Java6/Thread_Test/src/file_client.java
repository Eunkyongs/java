import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class file_client {
	public static void main(String[] args) {
		f_client fc = new f_client();
		fc.files();
	}
}

class f_client{
	Socket sk =null;
	String ip="127.0.0.1";
	int port =8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void files() {
		try {
			this.sk = new Socket(this.ip,this.port);
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			/*첨부파일을 byte 배열로 변경함.*/
			String url = "C:\\loopy.jpg";
			
			//클라이언트에서 보낼 이미지, 동영상, 음악,문서등등 파일을 보내는 형식.
			FileInputStream fs = new FileInputStream(url); // 파일을 읽어오는형태
			BufferedInputStream bs = new BufferedInputStream(fs);
			/*첨부파일전송형태*/
			
			byte img[] = new byte[bs.available()]; // byte의 전체 크기
//			System.out.println(bs.read(img)); // 용량체크. byte배열로 받기전엔 1픽셀씩 크기를읽어옴
			int fordata = 0;
			while((fordata=bs.read(img))!=-1) {
				this.os.write(img,0,fordata);
				
			}
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}