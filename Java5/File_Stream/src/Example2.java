import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*해당 정보는 각 지점별 댐 수위 현황을 적용한 데이터 입니다.
 해당 데이터중 100미만의 수위를 가진 댐만 20220623.txt 파일로 내용이 저장되도록 하십시오.
광동댐,671.126
괴산댐,132.03
군남댐,23.29
달방댐,108.58
소양강댐,164.462
의암댐,69.79
청평댐,49.52
춘천댐,101.01
충주댐,119.613
충주조정지댐,64.55
팔당댐,24.87
평화의댐,163.53
한탄강댐,47.259
화천댐,163.46
횡성댐,166.56

 결과:군남댐, 의암댐, 청평댐, 충주조정지댐, 팔당댐, 한탄강댐*/

public class Example2 {

	public static void main(String[] args) throws IOException{
		
		try {
		
		FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\info.txt");

		
		
			
		//파일생성
		Path data = Paths.get("C:\\Java5\\File_Stream\\src\\20220623.txt");
		Files.createFile(data);
		}
		catch(Exception z) {
			System.out.println(z);
		}
		
		
		
		
		
		
	}

}
