import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/*
	 GUI 모드 : (Java7)AWT(abstract window 도구툴), SWING(AWT-그래픽)
	 CUI 모드 : Scanner(X)
	 
	 SWING :JFrame -> JPanel -> JObject
	 */
	
	public static void main(String[] args) {
		//awt 생성방식
		//Frame -> Panel -> Object (생성순서)
		//Object -> Panel -> Frame (적용순서) 
		
		popclose pc = new popclose();
		Frame fr = new Frame(); //프레임 창 생성
		fr.setTitle("사용자 로그인"); // 창 이름
		fr.setSize(500,500); // 창 크기
		fr.setVisible(true); // 사용 유/무
		
		fr.addWindowListener(pc); //자체적인 awt메소드를 상속받아 처리
		
		Panel pa = new Panel(); // 패널
		
		
		CheckboxGroup radio = new CheckboxGroup();//체크박스 그룹설정 
		
		TextField id = new TextField(10); //TextField 에 10자까지 입력
		TextField pw = new TextField(10);
		TextField sa = new TextField("사원번호를 입력하세요");
		Button b1 = new Button("로그인"); // Object 버튼
		Checkbox c1 =  new Checkbox("자동로그인");
		Checkbox c2 =  new Checkbox("동의함",false,radio);
		Checkbox c3 =  new Checkbox("동의안함",true,radio);
		
		
		fr.addWindowListener(null);
		pa.add(c3);
		pa.add(c2);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1); // add 추가. 패널에 오브젝트(버튼)추가  object>panel
		pa.add(c1); // 체크박스 추가
		fr.add(pa); // 프레임에 패널 추가  panel > frame
	}
}

class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		System.gc();
	}
}