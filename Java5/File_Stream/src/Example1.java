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
		//파일로드
		FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\movie_db.txt",Charset.forName("UTF8"));
		BufferedReader bf = new BufferedReader(fr);
		
		//파일을 배열로 집어넣음
		ArrayList<String> moviedb = new ArrayList<>();
		String movie = "";
		while ((movie=bf.readLine()) != null) { 
			moviedb.add(movie); 
		}
		bf.close();
		//사용자가 검색할 영화제목 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 영화 제목을 입력하세요?");
		try {
			String mname = scan.nextLine();
			int ea =moviedb.size();
		
			for(int f=0; f<ea; f++) {
				if(mname == moviedb.get(f)) {
					System.out.println(moviedb.get(f));
				}else {
					System.out.println("검색한 영화는 확인되지 않습니다.");
					break;
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
