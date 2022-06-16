import java.awt.*;
import java.awt.event.*;
public abstract class awt5_abstract { 

	public abstract String signok(); // getter
	public abstract void idcheck(String id);//setter
	public abstract void dataload(); // Database

	Frame fr = new Frame();
	Button checkbt = null;
	Button closebt = null;
	TextField mid = null;
	Label msg = new Label();
	
	public void design() {
		//frame영역
		this.fr.setBounds(200, 200, 300, 450);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		//button, 텍스트필드 추가
		this.checkbt = new Button("중복체크");
		this.closebt = new Button("종료");
		this.mid = new TextField();
		
		//객체들 위치 설정
		this.msg.setBackground(Color.lightGray);
		this.msg.setBounds(25, 130, 250, 25);
		
		this.mid.setBounds(25, 100, 150, 25);
		
		this.checkbt.setBounds(190, 100, 80, 25);
	
		this.closebt.setBounds(190, 400, 80, 25);
		
		
		//프레임에 객체 추가
		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(checkbt);
		this.fr.add(closebt);
		
		this.click(); //awt 디자인이 완료 후 해당 핸들링 메소드로 이동
	}
	public void click() {
		//중복확인버튼
		this.checkbt.addActionListener(new ActionListener() {
			@Override
			//setText:출력값, getText:입력값가져오기
			public void actionPerformed(ActionEvent e) {
//				awt5_abstract.this.msg.setText("체크완료"); 
				//추상클래스가 아직 넘어가지 않았으므로 호출하려면 추상클래스 이름과함께 호출해야함
				String userid = awt5_abstract.this.mid.getText(); 
				
				if(userid.equals("")) {
					msg.setText("아이디를 입력하세요");
				}else {
					idcheck(userid); // 추상클래스라 this사용하면 안됨.
					String result =signok();
					if (result==null) {
						msg.setText("사용가능한 아이디 입니다.");
					}else {
						msg.setText("다른 아이디를 입력해 주세요.");
					}
				}
			}
		});
		
		//종료버튼 누르면 창닫히게
		this.closebt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	
	
	
}
