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
		se.add("통신사를 선택해 주세요");
		se.add("SKT");
		se.add("KT");
		se.add("LGT");
		se.add("알뜰폰");
		f.add(ck);
		f.add(se);
//		addItemListener : Checkbox, Choice에서 사용함
		ck.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
//				String checks =(String) e.getItem(); //체크박스는 자료형 뭐를 쓰던 다 에러남. 그래서 형변환을 해줘야함
//				System.out.println(checks); //
				if(e.getStateChange()==1) { // 체크박스의 상태 확인
					agree = true;
//					System.out.println("동의하셨습니다.");
				}else {
					agree = false;
//					System.out.println("동의를 하셔야 합니다.");
				}
				
				
//				System.out.println(e.getStateChange()); // 체크박스의 체크된 상태 확인 1: check, 2:uncheck
				
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
