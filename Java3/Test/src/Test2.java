
public class Test2 {

	public static void main(String[] args) {

		//배열값 중 css라는 단어를 빼고 나머지를 출력 -> if문을 반복문 안에 사용
		//배열값 중 css라는 단어가 있는지 확인하는 출력프로세서를 제작 ->if문을 반복문 밖에 사용
		String adata[] = {
			"자바", "HTML", "CSS","스프링"	
		};
		
		int ea = adata.length; // 4
		
		int w = 0; // 배열 반복문 돌릴땐 인덱스번호가 0부터 시작하므로 무조건 0부터 시작!
		while(w<ea) { //조건을 w<=ea 로 하게되면 반복이 0~4까지 되기때문에 배열은 0~3번까지 있으므로 에러남. 굳이 <= 연산자를 사용하고 싶을때 -1 붙이면 에러 안남
			if(!adata[w].equals("CSS")) { // equals 안쓰고 == 쓰는 경우 -> 숫자, true, false, null
				System.out.println(adata[w]); // 배열을 반복문안에서 출력해봐야할때, 반복문 돌아가는 숫자변수를 배열원소자리에 넣으면댐
			}
			w++;
		}
		
		//if문을 반복문 안에 쓰는 경우 :  반복문중에 값을 필터링해야하는경우.
		//if문을 반복문 밖에 쓰는 경우 :  반복문 종료 후에 해당 값의 유/무 확인해야하는 경우.
	
		int z =0;
		boolean k = false;
		while(z<ea) {
			if(adata[z].equals("CSS")) { // 값 검토
				k = true;
			}
			z++;
		}
		if(k == false) { // 값의 유무확인
			System.out.println("해당 단어는 없습니다.");
			}
		else {
			System.out.println("해당 단어가 포함되어 있습니다.");
		}
	}

}
