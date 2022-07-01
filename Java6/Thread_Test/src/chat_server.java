import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/*
 [Server - port2]

1.Server에서 포트를 2개 오픈 -> 8001, 8002
2. Client 1은 8001로 접속, Client 2는 8002로 접속

[Server - port1]

1. Server에서 포트 8003 오픈
2. Client 1,2 모두 8003으로 접속

두 방법 모두 내용은 같고, 서버에서 들어오는 경로만 잘 체크 하면됨.*/

//Server에 여러개의 포트를 오픈 8001,8002
//Exception : bind Exception (PORT 충돌) -> 포트 사용중인지 확인해야함.
public class chat_server {
	public static void main(String[] args) {
		/* 포트여러개
		int port[] = {8001,8002};
		int ea = port.length;
		int w = 0;
		openchat oc = null;
		while(w<ea) {
			oc = new openchat(port[w]);
			oc.start();
			w++;
		}
		*/
		//포트1개
		int port = 8003;
		openchat oc = null;
		oc = new openchat(port);
		oc.start();
	}
}

class openchat extends Thread{
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	
	public openchat(int p) {
		this.pt = p;
	}
	
	@Override
	public void run() {
		try {
			this.sk= new ServerSocket(this.pt);
			
			while(true) {
			Socket s = this.sk.accept(); //해당 port 모두 오픈
			
			this.is =  s.getInputStream();
			this.os = s.getOutputStream();
			
			/*client에서 받는 메세지*/
			byte data[] = new byte[1024];
			int n  = is.read(data);
			String message = new String(data,0,n);
			System.out.println(message);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	
}