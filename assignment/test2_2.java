import java.util.Scanner;

public class test2_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 사용자 이름을 입력해 주세요 : ");
		String search_name = scan.next();
		
		user_data ud = new user_data();
		ud.userlist(search_name);
		String result = ud.get();
		System.out.println(result);
	}
}
class user_data {
	private String search;
	private String msg="해당 사용자는 가입되지 않았습니다.";

	public void userlist(String s_name) {
		String  list[] = {"강보경","권용환","금새록","김동주","김민재","성유리","손진호","안희성"};
		this.search= s_name;
		int w= 0;
		while(w<list.length) {
			if(this.search.equals(list[w])) {
				this.msg = "해당 사용자가 있습니다";
			}
			w++;
		}
		
	}
	
	public String get() {
		return this.msg;
	}
	
}
