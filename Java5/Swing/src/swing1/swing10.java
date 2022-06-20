package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing10 extends JFrame {

	public String list[]= {"SKT","KT","LGT","�˶���"};
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String list[]= {"SKT","KT","LGT","�˶���"};
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("����ü", Font.PLAIN, 12));
		cb.setBounds(27, 27, 137, 23);
		contentPane.add(cb);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(new Color(0, 255, 102)));
		msg.setBounds(27, 60, 375, 15);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// �迭 index���·� �ε�, ��, �ʵ忡 �迭�� ���� �Ǿ�� ��.
				int v = cb.getSelectedIndex(); 
				
				// setText������ String���� ����ȯ�ؼ� ����ؾ���. ��ȯ��� 
//				String data = String.valueOf(cb.getSelectedItem()); // getSelectedItem -> �ڷ��� Object�� ����, String �����Ϸ��� ����ȯ�ʿ���
//				String data = cb.getSelectedItem().toString();//java14�̻󿡼� ���
//				String data = String.valueOf(e.getItem());
//				String data = e.getItem().toString();
				msg.setText(swing10.this.list[v]);
			}
		});
		
	}
}
