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
		Button btn = new Button("�˻�");
		search.setBounds(10, 30, 150, 25);
		btn.setBounds(200, 30, 80, 25);
		fr.add(search);
		fr.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sh=search.getText();
				if(sh.equals("")) {
					System.out.println("�˻�� �Է����ּ���.");
				}else {
					System.out.println(sh);
					try {//Desktop.getDesktop().browse : awt���� �ü�� ȯ�濡 �ִ� �⺻ �������� ����ϰ� �˴ϴ�.
						//URI: java.net API�Լ�(��Ʈ��ũ��Ʈ�Դϴ�.) ��� �ܿ� �Ķ���Ͱ��� ���մϴ�. �Ķ����>>?query=
						Desktop.getDesktop().browse(new URI("http://search.naver.com/search.naver?query="+sh));
						
					}catch(Exception ee){
						System.out.println("url ���� �߻�");
					}
				}
			}
		});
		
		
		/*
		try {
			Desktop.getDesktop().browse(new URI("http://naver.com"));
			
		}catch(Exception e){
			System.out.println("url ���� �߻�");
		}
		*/
		
	}

}
