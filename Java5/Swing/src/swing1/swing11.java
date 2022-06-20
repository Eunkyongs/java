package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class swing11 extends JFrame {
	// ImageIcon : �̹��� ������ �ε��� �� ����մϴ�.
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing11 frame = new swing11();
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
	public swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("�̹����ε�");
		btn.setFont(new Font("����ü", Font.PLAIN, 12));
		btn.setBounds(10, 10, 163, 23);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(new Color(0, 0, 0)));
		lb.setBounds(10, 43, 410, 208);
		contentPane.add(lb);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("C:\\Java5\\Swing\\src\\swing1\\loopy2.jpg");
				Image reimg = img.getImage(); // �̹��� ���� ��θ� �ε�
				//getScaledInstance(����ũ��,����ũ��, ��ȯ���)
				//getScaledInstance�� ��ȯ��� ����
				//Image.SCALE_SMOOTH : �̹��� �ε巴�� ����
				//Image.SCALE_FAST : �̹����� ������ ���������� �ȼ� ������ ������ ����
				//Image.SCALE_DEFAULT : �̹����� ������ �ִ� �ػ󵵿� ���缭 ����
				//Image.SCALE_AREA_AVERAGING : ����� �ػ� ��հ����� ����
				Image resize = reimg.getScaledInstance(410, 208, Image.SCALE_AREA_AVERAGING);
				ImageIcon rimg = new ImageIcon(resize);
				lb.setIcon(rimg);
			}
		});
	}

}
