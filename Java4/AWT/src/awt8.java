import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class awt8 {
	TextField search = null;
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setBounds(200, 200, 350, 180);
		fr.setLayout(null);
		fr.setVisible(true);
		TextField search = new TextField();
		Button btn = new Button("검색");
		search.setBounds(10, 30, 150, 25);
		btn.setBounds(200, 30, 80, 25);
		fr.add(search);
		fr.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sh=search.getText();
				if(sh.equals("")) {
					System.out.println("검색어를 입력해주세요.");
				}else {
					System.out.println(sh);
					try {//Desktop.getDesktop().browse : awt에서 운영체제 환경에 있는 기본 브라우저를 사용하게 됩니다.
						//URI: java.net API함수(네트워크파트입니다.) 경로 외에 파라미터값을 말합니다. 파라미터>>?query=
						Desktop.getDesktop().browse(new URI("http://search.naver.com/search.naver?query="+sh));
						
					}catch(Exception ee){
						System.out.println("url 오류 발생");
					}
				}
			}
		});
		
		
		/*
		try {
			Desktop.getDesktop().browse(new URI("http://naver.com"));
			
		}catch(Exception e){
			System.out.println("url 오류 발생");
		}
		*/
		
	}

}
