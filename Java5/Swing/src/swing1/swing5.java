package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {
	
	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		/*Frame을 absolute 형태로 layer을 변경 합니다.*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(54, 164, 354, 15);
		contentPane.add(msg);
		
		mid = new JTextField();
		mid.setBounds(54, 53, 354, 37);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JButton btnNewButton = new JButton("아이디체크");
		
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setBounds(160, 104, 108, 23);
		contentPane.add(btnNewButton);
		
		

		/* 핸들링 class가 object보다 상위코드에 있으면 해당 object를 로드 하지 못합니다.*/
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("아이디를 입력하세요");
				}else {
					int lg =mid.getText().length(); // 입력 문자 갯수
					if(lg<5) {
						msg.setText("아이디는 5자 이상 사용 가능합니다.");
					}else {
						msg.setText("아이디 검토 중 입니다..");
					}
				}
			}
		});
		
	}
}
