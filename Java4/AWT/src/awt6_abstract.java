import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//인증번호발송 시스템 - awt6와 연결
public abstract class awt6_abstract {

	public abstract int checkok(); //getter
	public abstract void numcheck(int n);
	
	Frame f=new Frame(); //400*180
	Button sendbt = null;  // 100*25
	Button okbt=null; //100*25
	Button xbt = null; //30*25
	TextField num = null; //140*25
	Label l = new Label();//250*25
	
	
	public void layout() {
		//프레임
		this.f.setBounds(200, 200, 400, 180);
		this.f.setVisible(true);
		this.f.setLayout(null);
		
		//버튼,텍스트필드 생성
		this.sendbt = new Button("인증번호발송");
		this.okbt = new Button("인증확인");
		this.xbt = new Button("X");
		this.num = new TextField();
		
		//위치 설정
		this.sendbt.setBounds(80, 50, 100, 25);
		this.xbt.setBounds(300, 50, 30, 25);
		this.num.setBounds(80, 90, 140, 25);
		this.okbt.setBounds(230,90, 100, 25);
		this.l.setBackground(Color.orange);
		this.l.setBounds(80, 130, 250, 25);
		
		
		//프레임에 추가
		f.add(sendbt);
		f.add(xbt);
		f.add(num);
		f.add(okbt);
		f.add(l);
		
		this.bt_click();
		
	}
	
	public void bt_click() {

		//인증번호발송버튼
		this.sendbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int number= r.nextInt(10000)+1;
				numcheck(number); // numcheck 메소드로 랜덤추출된 인증번호 보냄 
			}
		});
		
		//인증확인버튼
		this.okbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String userinput = awt6_abstract.this.num.getText();//입력값 받아오기
					int nc = awt6_abstract.this.checkok(); //checkok에서 넘어온값 nc로받음
					int verinum = Integer.parseInt(userinput); // 문자로 가져온입력값 숫자변환
					System.out.println("입력한 인증번호: "+verinum);
					
					if(nc == verinum) {
						l.setText("인증번호가 확인되었습니다.");
					}else {
						l.setText("인증번호가 틀렸습니다. 확인해주세요.");
					}
				}catch(Exception er) {
					l.setText("인증번호를 입력해주세요");
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
