package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;

//ProgressBar 사용법

public class swing8 extends JFrame {
	public JProgressBar progress = null;
	public JLabel lb = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setBounds(74, 33, 300, 20);
		contentPane.add(progress);
		
		this.lb = new JLabel("");
		lb.setBounds(74, 63, 300, 20);
		contentPane.add(lb);
		
		//swing 프로그램이 작동 후 해당 메소드로 1초 후 실행 되도록 적용함
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				pstart();
			}
		};
		t.schedule(task, 1000);
		
	}
	
	public void pstart() {
		int w=0;
		try {
			while(w<=100) {
				this.progress.setValue(w); //setValue: 해당 기본값을 말합니다.
				Thread.sleep(300);
				w++;
			}
		}catch(Exception k){
			System.out.println("오류발생");
		}
		
		if(this.progress.getValue()==100) {
			this.lb.setText("다운로드가 모두 완료 되었습니다.");
		}
		
		
	}
}
