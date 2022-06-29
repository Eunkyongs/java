import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
//Thread는 서버에서만.. client는 스레드없이 전송만
public class m_server {

	public static void main(String[] args) {
		chatroom cr = new chatroom();
		
	}
}
class chatroom { //기본사항 => 각 접속자마다 thread를 분할
	ServerSocket server = null;
	static final int port=9009; // thread에서 공용으로 사용하기 위함
	Socket sk = null;
	public chatroom(){
		try {
			this.server = new ServerSocket(this.port);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("*****멀티 채팅 시작!!*****");
		
		while(true) {
			try {
				sk = this.server.accept();//클라이언트 접속 허가 부분
				chat_thread ct = new chat_thread(this.sk); //accept 정보를 보냅니다.
				Thread t = new Thread(ct);
				t.start();
			}catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}

class chat_thread implements Runnable{
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	//배열을 메모리에 기억시킴- 이유: 누적시켜야함. 접속자 발생 시 thread가 새롭게 생성되므로 static에 올리지 않으면 누적 없이 계속 초기화되어버림
	static ArrayList<Socket> user = new ArrayList<>(); //접속자 . 몇명이 들어왔는지 카운팅
	
	public chat_thread(Socket s) { // 위에서 소켓으로 보냈기때문에 소켓으로 받아야함.
		this.sk = s;
		this.user.add(s);
		try {
			System.out.println("채팅에 참여하셨습니다.");
			System.out.println(this.sk); // 접속자 정보
			this.is = sk.getInputStream();
			this.os = sk.getOutputStream();
		}catch(Exception e) {
			System.out.println("클라이언트 접속정보가 올바르지 않습니다.");
		}
	}
	@Override
	public void run() {
		try {
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.message = new String (data,0,n);
				System.out.println(this.message);
				
				while(true) {
					System.out.println(this.user.size());
				this.sc = new Scanner(System.in);
				System.out.println("보낼 메세지를 입력하세요 : ");
				this.result = sc.nextLine();
				/*배열에 있는 vport에 대한 정보를 담은 수만큼 반복을 합니다.*/
				for(int j=0; j<this.user.size(); j++) {// for<while<do~while<foreach foreach가 가장빠름
					//배열에 있는 사용자 vport로 전송을 하게 됩니다.
					OutputStream all = this.user.get(j).getOutputStream();
					all.write(this.result.getBytes());//(전송)
					all.flush();//해당 전송 메세지를 비움(메모리)
				}
				/*test용
				this.os.write(this.message.getBytes());//채팅창으로 회신
				this.os.flush();
				Thread.sleep(10000);
				String m ="관리자 메세지 출력!!";
				this.os.write(m.getBytes());
				this.os.flush();
				*/
			}
		}catch(Exception e) {
			System.out.println("클라이언트가 종료 되었습니다.");
		}
		finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
				
			}catch(Exception e) {}	
		}
	}
}