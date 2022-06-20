package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing12 extends JFrame {
	private String imgdata[] = {"loopy1.jpg","loopy2.jpg","loopy3.jpg"};
	public int count =0; 
	public String url = "C:\\Java5\\Swing\\src\\swing1\\";
	
	//http://naver.com/1.jpg C:\\Java5\\Swing\\src\\swing1\\loopy1.jpg :절대경로
	// ./1.jpg, ..1/jpg:상대경로
	
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing12 frame = new swing12();
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
	public swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(new Color(0, 0, 0)));
		lb.setBounds(10, 34, 668, 621);
		contentPane.add(lb);
		
		JButton prev = new JButton("이전");
		prev.setBounds(10, 10, 93, 23);
		contentPane.add(prev);
		
		JButton next = new JButton("다음");
		next.setBounds(585, 10, 93, 23);
		contentPane.add(next);
		ImageIcon v = new ImageIcon(url+imgdata[0]);
		lb.setIcon(v);
		
		
		//이전
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count--;
				if(swing12.this.count < 0) {
					swing12.this.count=0;
				}
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
				lb.setIcon(v);
			}
		});
		//다음
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count++;
				if(swing12.this.count > imgdata.length-1 ) {
//					swing12.this.count= 2; //원래는 숫자2대신 배열최대치값을 넣어야함
					swing12.this.count = imgdata.length-1;
				}
			ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
			lb.setIcon(v);
				
			}
		});
	}

}
