import java.awt.event.*;
import java.awt.*;

public class awt7 {
	Checkbox ck = null;
	static boolean agree = false;
	
	public static void main(String[] args) {
		Frame f=new Frame();
		f.setBounds(200, 200, 400, 180);
		f.setLayout(null);
		f.setVisible(true);
		
		Choice se = new Choice();
		Checkbox ck = new Checkbox("Y");
		ck.setBounds(30, 20, 100, 100);
		se.setBounds(30, 120, 200, 100);
		se.add("��Ż縦 ������ �ּ���");
		se.add("SKT");
		se.add("KT");
		se.add("LGT");
		se.add("�˶���");
		f.add(ck);
		f.add(se);
//		addItemListener : Checkbox, Choice���� �����
		ck.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
//				String checks =(String) e.getItem(); //üũ�ڽ��� �ڷ��� ���� ���� �� ������. �׷��� ����ȯ�� �������
//				System.out.println(checks); //
				if(e.getStateChange()==1) { // üũ�ڽ��� ���� Ȯ��
					agree = true;
//					System.out.println("�����ϼ̽��ϴ�.");
				}else {
					agree = false;
//					System.out.println("���Ǹ� �ϼž� �մϴ�.");
				}
				
				
//				System.out.println(e.getStateChange()); // üũ�ڽ��� üũ�� ���� Ȯ�� 1: check, 2:uncheck
				
			}
		});
		
		se.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String change = (String) e.getItem();
				System.out.println(change);
				System.out.println(agree);
				
			}
		});
		
		
	}

}
