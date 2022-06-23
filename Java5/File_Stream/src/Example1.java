import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 응용문제. 해당 사용자가 영화 제목을 검색합니다.
 해당 영화 제목에 맞는 데이터값이 있을 경우 
 영화 전체에 대한 정보를 출력하게 됩니다.
 힌트 : Scanner 사용
 "검색할 영화 제목을 입력하세요?:" 범죄도시2
 [범죄도시]-추천5 2022년 4월 개봉
 
 "검색할 영화 제목을 입력하세요?:" 뽀로로
 "검색한 영화는 확인되지 않습니다."
 */
public class Example1 {

	public static void main(String[] args) throws IOException {
		/* 내코드
		try {
			//파일로드
			List<String> data = Files.readAllLines(Paths.get("C:\\Java5\\File_Stream\\src\\movie_db.txt"));
			//파일을 배열로 집어넣음
			ArrayList<String> moviedb = new ArrayList<>(data);
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 영화 제목을 입력하세요?");
			String mname = scan.nextLine(); //사용자가 검색할 영화제목 입력
			int ea =moviedb.size();
			int aa; 
			for(int f=0; f<ea; f++) {
				aa= data.get(f).indexOf(mname);
				if(aa>-1) {
					System.out.println(moviedb.get(f));
				}else {
					System.out.println("검색한 영화는 확인되지 않습니다.");
					break;
				}
				scan.close();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		*/
		//선생님 풀이
		try {//파일 로드 및 메소드 전달
			Scanner sc = new Scanner(System.in);
			System.out.println("1.개봉영화 2.개봉예정영화 : ");
			int user = sc.nextInt();
			if(user ==1) {
				movie m = new movie("movie_db.txt");
			}else if (user == 2) {
				System.out.println("서비스 준비중 입니다.");
			}
			sc.close();
			
		}catch(Exception k) {
			if(k.getMessage() != null) {
				System.out.println("현재 서비스가 정상적이지 않습니다.");
			}
		}
	}
}

class movie{
	private String path ="C:\\Java5\\File_Stream\\src\\";
	private FileReader fr = null;
	private BufferedReader bf = null;
	private ArrayList<String> list = null;
	private Scanner sc = null;
	
	//파일로드메소드
	public movie(String filename) throws IOException {
		try {
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.custom();
			this.fr.close();
			this.bf.close();
			this.search();
		}catch(Exception a) {
			System.out.println(a);
		}
	}
	//로드한 파일 배열화
	public void custom() throws IOException{
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
//		String datas=""; // do~while 사용시 조건이 아래에 있기때문에 첫 값에 빈값 들어가게됨 
		String datas = this.bf.readLine();
		do {
			this.list.add(datas);
		}while((datas=this.bf.readLine()) != null);
	}
	
	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목을 입력해 주세요: ");
		//indexOf, contains
		String subject = this.sc.next().intern(); // equals 안쓰게 intern 사용
		boolean call = false;
		if(subject == "종료") {
			sc.close();
			System.exit(0);
		}
		for(String moviesb : this.list) { //for~each
//			if(moviesb.indexOf(subject) != -1) { // moviesb 배열에서 indexOf를 이용해서 사용자가 입력한 값이 있는지 확인 -1 없음
//				System.out.println(moviesb);
//			}
			if(moviesb.contains(subject)) {
				System.out.println(moviesb);
				call = true;
			}
		}
		
		if(call==false) {
			System.out.println("데이터를 확인 할 수 없습니다.");
		}
		this.search(); //재귀함수. 다른 영화를 또 찾을수있으니 search메소드 처음부터 다시 실행 . 재귀함수 사용할때는 스캐너 종료하면 리턴되어 스캐너를 호출하지 못하므로 에러남.
	}
}