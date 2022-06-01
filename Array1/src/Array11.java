import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		/*응용문제 : 다음 배열값이 있습니다. 해당 배열 값을 비교하여 사용자 정보를 출력하시오.
		Adata = "hong" ,"kim", "park", "jang", "lee", "soun"
		Bdata = 80, 100, 46, 38, 65, 88
		결과배열에 따른 조건은 60점이상(포함)중 합격자만 출력합니다.
		결과배열[hong, kim, lee, soun]*/
		
		String [] Adata = {"hong" ,"kim", "park", "jang", "lee", "soun"};
		int [] Bdata = {80, 100, 46, 38, 65, 88};
		
		int a_ea = Adata.length; // 배열의 길이 확인
		 
		int f;//반복문에 사용할 변수		
		String name [] = new String[4] ; // 조건에 만족하는 데이터 넣을 새로운 배열 선언
		int ct=0; // 새로운 배열에 인덱스번호 부여하기위한 카운터 변수
		for(f=0; f<a_ea; f++) {//0에서 시작해서 배열의 길이보다 1작은수까지 반복
			if(Bdata[f]>=60) { //점수가들어있는 Bdata배열에서 60이상을 만족 하면
				name[ct]=Adata[f]; // 새로선언한 배열에 이름이 들어있는 Adata배열의 데이터를 대입시킴
				ct++;//조건이 만족하면 인덱스번호 증가
			}			
		}
		System.out.println(Arrays.toString(name)); //반복문 종료 후 새로 선언한 name배열의 내용 출력.
	}

}
