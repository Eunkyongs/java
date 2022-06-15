import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt4_class {
//awt4.java연계
	public void view() {
		decorate de = new decorate(); // awt4.java 자식 class 로드
		TextField input = new TextField();
		Frame f = new Frame();
//		Label lb = new Label();
		TextArea lb = new TextArea();
		f.setBounds(200, 200, 300, 300);
		f.setVisible(true);
		f.setLayout(null);
		
		Button btn= new Button("계산");
		Button closebtn= new Button("종료");
		lb.setBackground(Color.gray);

		input.setBounds(50, 50, 100, 25);
		btn.setBounds(180,50,80,25);
		closebtn.setBounds(50,200,80,25);
		lb.setBounds(50, 100, 200, 100);
		
		f.add(lb);
		f.add(input);
		f.add(btn);
		f.add(closebtn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int c = Integer.parseInt(input.getText());
				de.btn_push(c);// 사용자가 입력한 값을 btn_push 메소드로 전달
				lb.setText(de.calls());// awt4.java에 있는 getter메소드로 값을 받음
				
				}catch(Exception ee) {
					lb.setText("숫자만 입력하세요");
//					System.out.println("숫자만 입력하세요");
				}
				
			}
		});
		
		closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}
