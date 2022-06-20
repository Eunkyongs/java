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
	public swing6() {//����� ������. abstract�� �����°� ���x
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
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
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
		
		//Ű�� ������� ����Ǵ� �̺�Ʈ Ŭ����
		tel.addKeyListener(new KeyAdapter() {
			//keyPressed :  Ű�� ������
			//keyReleased : Ű�� �����ٰ� up�� �Ǿ�����
			//keyTyped : Ű�� ���ڸ� �Է� ������
			@Override
			public void keyTyped(KeyEvent k) { 
				//�Է°��� ���� �ڸ���
				int i =tel.getText().length();
				if(i>11) {
					k.consume();
				}
				
//				System.out.println(k); // ����Ű�� �Ӽ�?�� �迭��ó�� �� �����ͼ� ������
//				System.out.println(k.getKeyChar()); // ���� Ű�� �� ������
//				System.out.println(k.getKeyCode()); // ���� Ű�� Ű�ڵ尪 ������
				int n = Integer.valueOf(k.getKeyChar()); // �Է��Ѱ��� �ƽ�Ű�ڵ尪���� �����
				System.out.println(n);
				if(n>=48 && n<=57) { // sysout���� �������� ����(getKeyChar() ��������, Integer ����� �ƽ�Ű �ڵ�� �����
					msg.setText("");
				}else {
					msg.setText("���ڸ� �Է��ϼ���");
//					if(!Character.isDigit(n)) {
						k.consume(); //keyType�� �̿� consume�� �ش� �Է½� null�� ������
//						return;
//					}
				}
			}
			
		});
	}

}
