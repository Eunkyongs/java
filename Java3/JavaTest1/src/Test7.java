import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("색상을 입력해 주세요.[빨강,주황,노랑,초록]");
		String color = scan.next();
		String Eng_color=null;
		switch(color) {
		
		case "빨강"->{
			Eng_color = color.replace("빨강", "red"); 
		}
		case"주황"->{
			Eng_color = color.replace("주황", "orange");
		}
		case"노랑"->{
			Eng_color = color.replace("노랑", "yellow");
		}
		case"초록"->{
			Eng_color = color.replace("초록", "green");
		}
		default->{
			Eng_color="해당 단어는 번역이 되지 않습니다.";
		}
		}
		System.out.println(Eng_color);
		
		scan.close();
		
	}

}
