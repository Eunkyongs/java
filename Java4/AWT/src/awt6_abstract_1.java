import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//������ȣ�߼� �ý��� - awt6�� ���� �������ڵ�
public abstract class awt6_abstract_1 {
	
	static String pc =""; // pc�� ���� ���� �޸𸮿� ���� �صΰڴ�
	//������ �ڵ�
	public abstract void setter(String userno); //setter
	public abstract String getter(); //getter

	Frame f=new Frame(); //400*180
	Button sendbt = null;  // 100*25
	Button okbt=null; //100*25
	Button xbt = null; //30*25
	TextField mid = null; //140*25
	Label msg = new Label();//250*25
	
	
	public void layout() {
		//������
		this.f.setBounds(200, 200, 400, 180);
		this.f.setVisible(true);
		this.f.setLayout(null);
		//��ư,�ؽ�Ʈ�ʵ� ����
		this.sendbt = new Button("������ȣ�߼�");
		this.okbt = new Button("����Ȯ��");
		this.xbt = new Button("X");
		this.mid = new TextField();
		//��ġ ����
		this.sendbt.setBounds(80, 50, 100, 25);
		this.xbt.setBounds(300, 50, 30, 25);
		this.mid.setBounds(80, 90, 140, 25);
		this.okbt.setBounds(230,90, 100, 25);
		this.msg.setBackground(Color.orange);
		this.msg.setBounds(80, 130, 250, 25);
		//�����ӿ� �߰�
		f.add(sendbt);
		f.add(xbt);
		f.add(mid);
		f.add(okbt);
		f.add(msg);
		
		this.bt_click();
		
	}
	
	public void bt_click() {

		//������ȣ�߼۹�ư
		this.sendbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//�������� 4�ڸ� ����� �ݺ����� ���ؼ� 4�ڸ��� ��������
				Random ra = new Random();
				pc ="";
				for(int f = 1; f<5; f++){
					pc += String.valueOf(ra.nextInt(10)); 
				}
				setter("");
			}
		});
		
		//����Ȯ�ι�ư
		this.okbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(pc);//pc 4�ڸ� �������

				if(awt6_abstract_1.this.mid.getText().equals("")) {
					awt6_abstract_1.this.msg.setText("������ȣ�� �Է��� �ֽñ� �ٶ��ϴ�.");
				}else {
					setter(awt6_abstract_1.this.mid.getText());
					awt6_abstract_1.this.msg.setText(getter());
				}
			}
		});
		
		
		//X��ư
		this.xbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}