import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/*
	 GUI ��� : (Java7)AWT(abstract window ������), SWING(AWT-�׷���)
	 CUI ��� : Scanner(X)
	 
	 SWING :JFrame -> JPanel -> JObject
	 */
	
	public static void main(String[] args) {
		//awt �������
		//Frame -> Panel -> Object (��������)
		//Object -> Panel -> Frame (�������) 
		
		popclose pc = new popclose();
		Frame fr = new Frame(); //������ â ����
		fr.setTitle("����� �α���"); // â �̸�
		fr.setSize(500,500); // â ũ��
		fr.setVisible(true); // ��� ��/��
		
		fr.addWindowListener(pc); //��ü���� awt�޼ҵ带 ��ӹ޾� ó��
		
		Panel pa = new Panel(); // �г�
		
		
		CheckboxGroup radio = new CheckboxGroup();//üũ�ڽ� �׷켳�� 
		
		TextField id = new TextField(10); //TextField �� 10�ڱ��� �Է�
		TextField pw = new TextField(10);
		TextField sa = new TextField("�����ȣ�� �Է��ϼ���");
		Button b1 = new Button("�α���"); // Object ��ư
		Checkbox c1 =  new Checkbox("�ڵ��α���");
		Checkbox c2 =  new Checkbox("������",false,radio);
		Checkbox c3 =  new Checkbox("���Ǿ���",true,radio);
		
		
		fr.addWindowListener(null);
		pa.add(c3);
		pa.add(c2);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1); // add �߰�. �гο� ������Ʈ(��ư)�߰�  object>panel
		pa.add(c1); // üũ�ڽ� �߰�
		fr.add(pa); // �����ӿ� �г� �߰�  panel > frame
	}
}

class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		System.gc();
	}
}