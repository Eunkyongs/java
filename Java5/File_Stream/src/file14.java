import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.IIOException;

//이미지(binary) 파일 설정 byte단위 (Filereader -> 이미지는 로드 불가)
//FileInputStream 이미지 로드시엔 Stream을 이용해야함.
//throws 사용안할경우 try~ catch(IOException e) 이런식으로 사용하면 throws 사용안해도 됨.
public class file14 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Java5\\File_Stream\\src\\img2.jpg"); 
//			FileInputStream fs = new FileInputStream("");
//			System.out.println(is.read()); //이미지 로드시 픽셀의 색 수치로 출력(0~255-rgb코드) 
			//read를 찍을 때 조심해야함. => Stream은 버퍼와 비슷하여 read를 사용하는 순간 해당 메모리에서 비워지는 사항이 발생합니다.
//			byte b [] = new byte [is.available()]; // is.available() -무제한. 용량제한걸땐 사용할수 없음
//			System.out.println(is.read(b));//전체크기 용량확인
			
			byte b [] = new byte [is.available()/100]; // 읽어들이는 배열의 크기를 강제로 조절함 1024=1kb // is.available()/1024 -> 1kb단위로 쪼개서 읽어들임
			
			FileOutputStream os = new FileOutputStream("img_test.jpg");
			
			//반복문 사용안하는 파일 내보내기
//			int img =is.read(b); // 전체용량 읽어오고
//			os.write(b);//파일로 내보내기 // 반복문 사용하지 않음.
			
			//반복문 사용하는 파일 내보내기
			int img = 0; //읽는 바이트수
			int check = 0;//읽는 횟수
//			while((img=is.read(b)) != -1) {
//				check += img;
//				System.out.println(check+"%");
//				os.write(b,0,img); //다운로드%를 표시할때 사용하기 위함. 몇% 받았는지 카운트 가능함. progress bar 사용에 적합. 
			
			//다운로드시 로드를 출력이나, progress를 이용하여 보여줄 때 사용
			while(true) { // loop
				img = is.read(b); //해당 파일을 읽어서 바이트 변수로 넘김
				if(img == -1) {
					break;
				}else {
					os.write(b,0,img);
				}
				check++;
				if(check % 2 == 0) {
					System.out.println(check+"%");
				}
				
			}
			
		}
		catch(IOException i) {
			
		}catch(Exception e) {
			
		}
	}

}
