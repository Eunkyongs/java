import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//������ȣ�߼� �ý��� - awt6�� ����
public abstract class awt6_abstract {

	public abstract int checkok(); //getter
	public abstract void numcheck(int n);
	public abstract void numcheck1(int n1);
	
	Frame f=new Frame(); //400*180
	Button sendbt = null;  // 100*25
	Button okbt=null; //100*25
	Button xbt = null; //30*25
	TextField num = null; //140*25
	Label l = new Label();//250*25
	
	
	public void layout() {
		//������
		this.f.setBounds(200, 200, 400, 180);
		this.f.setVisible(true);
		this.f.setLayout(null);
		
		//��ư,�ؽ�Ʈ�ʵ� ����
		this.sendbt = new Button("������ȣ�߼�");
		this.okbt = new Button("����Ȯ��");
		this.xbt = new Button("X");
		this.num = new TextField();
		
		//��ġ ����
		this.sendbt.setBounds(80, 50, 100, 25);
		this.xbt.setBounds(300, 50, 30, 25);
		this.num.setBounds(80, 90, 140, 25);
		this.okbt.setBounds(230,90, 100, 25);
		this.l.setBackground(Color.orange);
		this.l.setBounds(80, 130, 250, 25);
		
		
		//�����ӿ� �߰�
		f.add(sendbt);
		f.add(xbt);
		f.add(num);
		f.add(okbt);
		f.add(l);
		
		this.bt_click();
		
	}
	
	public void bt_click() {

		//������ȣ�߼۹�ư
		this.sendbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int number= r.nextInt(10000)+1;
				numcheck(number);
			}
		});
		
		//����Ȯ�ι�ư
		this.okbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userinput = awt6_abstract.this.num.getText();//�Է°� �޾ƿ���
				int usernum = Integer.parseInt(userinput); // ���ڷ� �������Է°� ���ں�ȯ
				numcheck(usernum);//����ڰ� textfield�� �Է��Ѱ� ���ڷ� ��ȯ�ؼ� numcheck�γѱ�
					
				int nc = checkok(); //checkok���� �Ѿ�°� nc�ι���

				if(nc!=0) {
						l.setText("������ȣ�� Ʋ�Ƚ��ϴ�. Ȯ�����ּ���.");
					}else if (nc==0) {
						l.setText("������ȣ�� Ȯ�εǾ����ϴ�.");	
					}else {
						l.setText("������ȣ�� �Է����ּ���");
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
