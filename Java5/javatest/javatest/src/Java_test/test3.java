package Java_test;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class test3 extends JFrame {

	private JPanel contentPane;
	private JTextField adult;
	private JTextField teen;
	private JTextField day;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		
		JCheckBox checkBox = new JCheckBox("New check box");
		getContentPane().add(checkBox, BorderLayout.WEST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//장소
		JLabel title1 = new JLabel("캠핑 장소를 선택하세요");
		title1.setBounds(26, 19, 156, 27);
		contentPane.add(title1);
		
		JRadioButton r1 = new JRadioButton("남양주");
		r1.setBounds(26, 52, 115, 23);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("충북음성");
		r2.setBounds(164, 52, 115, 23);
		contentPane.add(r2);
		
		JRadioButton r3 = new JRadioButton("춘천");
		r3.setBounds(302, 52, 115, 23);
		contentPane.add(r3);
		
		//라디오버튼 그룹화 -  1개만선택되게
		ButtonGroup gp = new ButtonGroup();
		gp.add(r1);
		gp.add(r2);
		gp.add(r3);
		
		//인원수
		JLabel title2 = new JLabel("인원수를 입력하세요");
		title2.setBounds(26, 102, 131, 15);
		contentPane.add(title2);
		
		JLabel ad_lb = new JLabel("성인:");
		ad_lb.setBounds(26, 142, 50, 15);
		contentPane.add(ad_lb);
		
		adult = new JTextField();
		adult.setBounds(86, 139, 96, 21);
		contentPane.add(adult);
		adult.setColumns(10);
		
		
		JLabel te_lb = new JLabel("청소년(만10세이상):");
		te_lb.setBounds(258, 142, 123, 15);
		contentPane.add(te_lb);
		
		teen = new JTextField();
		teen.setColumns(10);
		teen.setBounds(391, 139, 96, 21);
		contentPane.add(teen);

		//캠핑날짜
		JLabel title3 = new JLabel("캠핑 날짜를 입력하세요");
		title3.setBounds(26, 179, 156, 15);
		contentPane.add(title3);
		
		JLabel day_lb = new JLabel("캠핑일자 : ");
		day_lb.setBounds(26, 215, 68, 15);
		contentPane.add(day_lb);
		
		day = new JTextField();
		day.setBounds(86, 212, 96, 21);
		contentPane.add(day);
		day.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("예시)2022-06-24");
		lblNewLabel_3.setBounds(258, 215, 131, 15);
		contentPane.add(lblNewLabel_3);
	
		//예약상태
		JProgressBar progress = new JProgressBar();
		progress.setStringPainted(true);
		progress.setBounds(26, 281, 320, 27);
		contentPane.add(progress);
		
		JButton reser_bt = new JButton("예약하기");
		reser_bt.setBounds(463, 281, 93, 27);
		contentPane.add(reser_bt);
		
		JButton close_bt = new JButton("종료");
		close_bt.setBounds(463, 413, 93, 27);
		contentPane.add(close_bt);
		
		JLabel check_lb = new JLabel("확인 및 입금하실 금액");
		check_lb.setBounds(26, 355, 156, 15);
		contentPane.add(check_lb);
		
		JLabel check = new JLabel("");
		check.setBorder(new LineBorder(new Color(0, 0, 0)));
		check.setBounds(26, 377, 406, 63);
		contentPane.add(check);
		
		JLabel wait = new JLabel("잠시만 기다려 주십시요..");
		wait.setVisible(false);
		wait.setBounds(26, 318, 253, 15);
		contentPane.add(wait);
		

		//예약버튼
		reser_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int w =0;
				try {
					wait.setVisible(true);
					while(w<=100) {
					progress.setValue(w);
					Thread.sleep(600);
					w++;
					}
				} catch (Exception e1) {
					System.out.println(e1);
				}
				
				
				
				
				
				
				
				
				
				
				
				


				

			}
		});

		//종료버튼
		close_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		

		

	}
}
