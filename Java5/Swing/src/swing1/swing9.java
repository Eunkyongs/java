package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

public class swing9 extends JFrame {
	//JEditorPane
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("하이브리드 웹앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(10, 10, 768, 745);
		contentPane.add(webpage);
		webpage.setContentType("text/html"); 
		//ContentType:문자도사용 그리고 HTML코드도 사용
		webpage.setText("<h1>ZANMANG LOPPY</h1>"
				+"<a href='https://mobile.twitter.com/zm_loopy'><img src ='https://pbs.twimg.com/profile_images/1533255035974406144/Lw00v4vo_400x400.jpg'></a>"
				+ "<br><font color = 'orange'>메롱</font>"
				+ "<br><input type ='text' id='name'>"
				+ "<br><input type ='checkbox'>동의함"
				);
	}
}
