package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {//지우면 에러남. abstract로 보내는건 상관x
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		tel.setBorder(new LineBorder(new Color(171, 173, 179)));
		tel.setFont(new Font("\uB3CB\uC6C0\uCCB4", tel.getFont().getStyle(), tel.getFont().getSize()));
		tel.setBounds(10, 34, 263, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC778\uC99D\uBC88\uD638 \uBC1B\uAE30");
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setBounds(283, 33, 145, 23);
		contentPane.add(btnNewButton);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(new Color(255, 51, 102)));
		msg.setBounds(10, 65, 408, 15);
		contentPane.add(msg);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//키를 누를경우 적용되는 이벤트 클래스
		tel.addKeyListener(new KeyAdapter() {
			//keyPressed :  키를 누를때
			//keyReleased : 키를 눌렀다가 up이 되었을때
			//keyTyped : 키를 문자를 입력 받을때
			@Override
			public void keyTyped(KeyEvent k) { 
				//입력값에 대한 자리수
				int i =tel.getText().length();
				if(i>11) {
					k.consume();
				}
				
//				System.out.println(k); // 누른키의 속성?을 배열값처럼 쫙 가져와서 보여줌
//				System.out.println(k.getKeyChar()); // 누른 키의 값 가져옴
//				System.out.println(k.getKeyCode()); // 누른 키의 키코드값 가져옴
				int n = Integer.valueOf(k.getKeyChar()); // 입력한값이 아스키코드값으로 변경됨
				System.out.println(n);
				if(n>=48 && n<=57) { // sysout에는 정상적인 문자(getKeyChar() 보이지만, Integer 변경시 아스키 코드로 변경됨
					msg.setText("");
				}else {
					msg.setText("숫자만 입력하세요");
//					if(!Character.isDigit(n)) {
						k.consume(); //keyType을 이용 consume은 해당 입력시 null로 간주함
//						return;
//					}
				}
			}
			
		});
	}

}
