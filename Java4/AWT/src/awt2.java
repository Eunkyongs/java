import java.awt.*; //���awt�ɼ� ��������
import java.awt.event.*;

import javax.swing.JOptionPane;

//�ܺ� Ŭ������ awt ����
public class awt2 {

	public static void main(String[] args) {
		login lg = new login();
	}

}
class loginok extends login{ // ȭ�� ��ȯ �ϴ� �ڽ� Ŭ����
	public loginok() {
		//�θ�Ŭ������ ����Ǿ��ֱ⶧���� ������ ���������� �״�� ������ �� ����.
		this.fr.setTitle("�α��� �� ������");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
	
}

class login { // ������ > extends abstract(�߻� class)�� ���� �ε��Ͽ� �ʵ忡 �����Ŵ 
	Frame fr =new Frame();
	Font ft = new Font("����ü",Font.BOLD,20); //("�۲�",Font.BOLD(����),����ũ��)
	
	//id,pw �Է��ʵ�, ��ư, �� ����
	TextField mid = new TextField();
	TextField mpw = new TextField();
	
	Button loginbt = new Button("�α���");
	Button closebt = new Button("���α׷� ����");
	Button joinbt = new Button("ȸ������");
	
	Label msg = new Label();
	
	public login() {
		//������ ����
		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	
		//�Է��ʵ� ����
		this.mid.setFont(ft); // ���� �Ӽ��� �����ϰ��� �ϴ� ������Ʈ
		this.mpw.setFont(ft);
		this.mpw.setEchoChar('*'); //password�ʵ忡 �Է½� �Է¹��ڴ�� *�� ���̵��� ���� 
				
		//��ư,�ؽ�Ʈ�ʵ�,�� ��ġ ����
		this.mid.setBounds(100, 60, 200, 40);
		this.mpw.setBounds(100, 120, 200, 40);
		this.loginbt.setBounds(100, 180, 200, 40);
		this.joinbt.setBounds(100, 240, 200, 40);
		this.closebt.setBounds(100, 300, 200, 40);
		this.msg.setBounds(100,100,200,20);
//		this.msg.setBackground(Color.red); // ����ġȮ�ο�
		
		
		//frame�� ���� �߰�
		this.fr.add(this.mid);
		this.fr.add(this.mpw);
		this.fr.add(this.loginbt);
		this.fr.add(joinbt);
		this.fr.add(this.closebt);
		this.fr.add(msg);
		
		this.clicks();
	}
	public void clicks() { //��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ�
		
		this.joinbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); // �ش� ������ ����
				loginok ok = new loginok(); // ���� ������ �ε�
			}
		});
		
		this.closebt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���α׷� ���� �̺�Ʈ �ڵ鸵 �޼ҵ�
				System.exit(0);
			}
		});
		
		this.loginbt.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // swing API ��� �ɼ� �ε�
			@Override
			public void actionPerformed(ActionEvent e) {
				//�α��� ��ư ���̵� �� �н����� ����
				
				String user_id = mid.getText(); //Object��.getText(����ڰ� �Է��� ���� �����ö� ����մϴ�.)
				String user_pw = mpw.getText();
				
				if(user_id.equals("")) { // null��� ���� => null���� ���� �ִ� ���¸� ����.
					msg.setText("���̵� �Է��ϼ���.");
//					alert.showMessageDialog(null, "���̵� �Է��ϼ���.","���޼���",JOptionPane.ERROR_MESSAGE);
				}else {
					if(user_pw.equals("")) {
					msg.setText("��й�ȣ�� �Է��ϼ���.");
					}else {
					msg.setText("�α����� ���� �մϴ�.");
					}
				}
			}
		});
		
	}
}