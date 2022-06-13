import java.awt.*; //모든awt옵션 가져오기
import java.awt.event.*;

import javax.swing.JOptionPane;

//외부 클래스로 awt 생성
public class awt2 {

	public static void main(String[] args) {
		login lg = new login();
	}

}
class loginok extends login{ // 화면 전환 하는 자식 클래스
	public loginok() {
		//부모클래스에 선언되어있기때문에 프레임 설정내용을 그대로 가져올 수 있음.
		this.fr.setTitle("로그인 후 페이지");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
	
}

class login { // 연습용 > extends abstract(추상 class)를 먼저 로드하여 필드에 적용시킴 
	Frame fr =new Frame();
	Font ft = new Font("돋움체",Font.BOLD,20); //("글꼴",Font.BOLD(굵게),글자크기)
	
	//id,pw 입력필드, 버튼, 라벨 생성
	TextField mid = new TextField();
	TextField mpw = new TextField();
	
	Button loginbt = new Button("로그인");
	Button closebt = new Button("프로그램 종료");
	Button joinbt = new Button("회원가입");
	
	Label msg = new Label();
	
	public login() {
		//프레임 세팅
		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	
		//입력필드 세팅
		this.mid.setFont(ft); // 글자 속성을 적용하고자 하는 오브젝트
		this.mpw.setFont(ft);
		this.mpw.setEchoChar('*'); //password필드에 입력시 입력문자대신 *로 보이도록 설정 
				
		//버튼,텍스트필드,라벨 위치 세팅
		this.mid.setBounds(100, 60, 200, 40);
		this.mpw.setBounds(100, 120, 200, 40);
		this.loginbt.setBounds(100, 180, 200, 40);
		this.joinbt.setBounds(100, 240, 200, 40);
		this.closebt.setBounds(100, 300, 200, 40);
		this.msg.setBounds(100,100,200,20);
//		this.msg.setBackground(Color.red); // 라벨위치확인용
		
		
		//frame에 영역 추가
		this.fr.add(this.mid);
		this.fr.add(this.mpw);
		this.fr.add(this.loginbt);
		this.fr.add(joinbt);
		this.fr.add(this.closebt);
		this.fr.add(msg);
		
		this.clicks();
	}
	public void clicks() { //버튼에 관한 모든 핸들링 메소드 집합소
		
		this.joinbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); // 해당 프레임 종료
				loginok ok = new loginok(); // 다음 프레임 로드
			}
		});
		
		this.closebt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//프로그램 종료 이벤트 핸들링 메소드
				System.exit(0);
			}
		});
		
		this.loginbt.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // swing API 경고 옵션 로드
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼 아이디 및 패스워드 검토
				
				String user_id = mid.getText(); //Object명.getText(사용자가 입력한 값을 가져올때 사용합니다.)
				String user_pw = mpw.getText();
				
				if(user_id.equals("")) { // null사용 금지 => null또한 값이 있는 상태를 말함.
					msg.setText("아이디를 입력하세요.");
//					alert.showMessageDialog(null, "아이디를 입력하세요.","경고메세지",JOptionPane.ERROR_MESSAGE);
				}else {
					if(user_pw.equals("")) {
					msg.setText("비밀번호를 입력하세요.");
					}else {
					msg.setText("로그인을 진행 합니다.");
					}
				}
			}
		});
		
	}
}