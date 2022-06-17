import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//인증번호발송 시스템 - awt6와 연결 선생님코드
public abstract class awt6_abstract_1 {
	
	static String pc =""; // pc가 뽑은 숫자 메모리에 저장 해두겠다
	//선생님 코드
	public abstract void setter(String userno); //setter
	public abstract String getter(); //getter

	Frame f=new Frame(); //400*180
	Button sendbt = null;  // 100*25
	Button okbt=null; //100*25
	Button xbt = null; //30*25
	TextField mid = null; //140*25
	Label msg = new Label();//250*25
	
	
	public void layout() {
		//프레임
		this.f.setBounds(200, 200, 400, 180);
		this.f.setVisible(true);
		this.f.setLayout(null);
		//버튼,텍스트필드 생성
		this.sendbt = new Button("인증번호발송");
		this.okbt = new Button("인증확인");
		this.xbt = new Button("X");
		this.mid = new TextField();
		//위치 설정
		this.sendbt.setBounds(80, 50, 100, 25);
		this.xbt.setBounds(300, 50, 30, 25);
		this.mid.setBounds(80, 90, 140, 25);
		this.okbt.setBounds(230,90, 100, 25);
		this.msg.setBackground(Color.orange);
		this.msg.setBounds(80, 130, 250, 25);
		//프레임에 추가
		f.add(sendbt);
		f.add(xbt);
		f.add(mid);
		f.add(okbt);
		f.add(msg);
		
		this.bt_click();
		
	}
	
	public void bt_click() {

		//인증번호발송버튼
		this.sendbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//랜덤으로 4자리 추출시 반복문을 통해서 4자리를 만들어야함
				Random ra = new Random();
				pc ="";
				for(int f = 1; f<5; f++){
					pc += String.valueOf(ra.nextInt(10)); 
				}
				setter("");
			}
		});
		
		//인증확인버튼
		this.okbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(pc);//pc 4자리 인증출력

				if(awt6_abstract_1.this.mid.getText().equals("")) {
					awt6_abstract_1.this.msg.setText("인증번호를 입력해 주시길 바랍니다.");
				}else {
					setter(awt6_abstract_1.this.mid.getText());
					awt6_abstract_1.this.msg.setText(getter());
				}
			}
		});
		
		
		//X버튼
		this.xbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}