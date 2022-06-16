import java.awt.*;
import java.awt.event.*;
public abstract class awt5_abstract { 

	public abstract String signok(); // getter
	public abstract void idcheck(String id);//setter
	public abstract void dataload(); // Database

	Frame fr = new Frame();
	Button checkbt = null;
	Button closebt = null;
	TextField mid = null;
	Label msg = new Label();
	
	public void design() {
		//frame����
		this.fr.setBounds(200, 200, 300, 450);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		//button, �ؽ�Ʈ�ʵ� �߰�
		this.checkbt = new Button("�ߺ�üũ");
		this.closebt = new Button("����");
		this.mid = new TextField();
		
		//��ü�� ��ġ ����
		this.msg.setBackground(Color.lightGray);
		this.msg.setBounds(25, 130, 250, 25);
		
		this.mid.setBounds(25, 100, 150, 25);
		
		this.checkbt.setBounds(190, 100, 80, 25);
	
		this.closebt.setBounds(190, 400, 80, 25);
		
		
		//�����ӿ� ��ü �߰�
		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(checkbt);
		this.fr.add(closebt);
		
		this.click(); //awt �������� �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵�
	}
	public void click() {
		//�ߺ�Ȯ�ι�ư
		this.checkbt.addActionListener(new ActionListener() {
			@Override
			//setText:��°�, getText:�Է°���������
			public void actionPerformed(ActionEvent e) {
//				awt5_abstract.this.msg.setText("üũ�Ϸ�"); 
				//�߻�Ŭ������ ���� �Ѿ�� �ʾ����Ƿ� ȣ���Ϸ��� �߻�Ŭ���� �̸����Բ� ȣ���ؾ���
				String userid = awt5_abstract.this.mid.getText(); 
				
				if(userid.equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}else {
					idcheck(userid); // �߻�Ŭ������ this����ϸ� �ȵ�.
					String result =signok();
					if (result==null) {
						msg.setText("��밡���� ���̵� �Դϴ�.");
					}else {
						msg.setText("�ٸ� ���̵� �Է��� �ּ���.");
					}
				}
			}
		});
		
		//�����ư ������ â������
		this.closebt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	
	
	
}
