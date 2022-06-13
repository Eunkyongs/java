import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {

	public awt1() {
	}
	
	public static void main(String[] args) {
		//Frame > Bound > Object (실무에선 패널 사용하지않고 바운드 사용)
		Frame fr = new Frame(); //창
		
		fr.setTitle("AWT 기초 화면"); 
		fr.setVisible(true);
		fr.setLayout(null);//패널을 사용 안함
		fr.setBounds(750, 150, 500, 500); // (화면 x축(가로), 화면 y축 (세로), 가로크기, 세로크기)
		
		Button btn = new Button("출력");
		Button closebtn = new Button("닫기");
		Label msg = new Label(""); 
//		msg.setBackground(Color.CYAN); //setBackground(Color.blue) 색상입력
		btn.setBounds(40, 40, 100, 30); //타이틀높이 25가량. 감안해서 위치 조정
		closebtn.setBounds(160, 40, 100, 30);
		msg.setBounds(40, 100, 300, 30);
		
		//Object를 Frame에 적용하게 됩니다.
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);
		
		//이벤트메소드 부분
		//addActionListener(버튼에만 적용) : 이벤트 메소드 단, this사용 절대 안됨!!
		closebtn.addActionListener(new ActionListener() { 
			// new ActionListener() : Override 메소드 자동생성
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btn.addActionListener(new ActionListener() {
			String a ="홍길동"; //addActionListener : 이벤트 메소드 필드에 String을 생성
			
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(this.a); // this를 이용하여 핸들링 가능함.
			}
		});
	
	}

}
