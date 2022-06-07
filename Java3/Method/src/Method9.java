import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 응용문제:관리자에서 메뉴를 활성화하는 프로세서입니다.
		 해당 메뉴 활성화는 2차 배열이며, 메뉴명, 활성화하는 (Y,N)구분합니다.
		 해당 활성화 값을 대입하여 "Y" 로 적용되는 인덱스 번호에 맞는 메뉴명을 1차배열로 재구성 후 메인에서 출력되도록 합니다.
		 결과:[로켓배송,로켓프레시,골드박스,이벤트,추석]
		 단, private 및 return을 활용하여 프로그램을 작성합니다.
		 */
		
		menus mns = new menus();
		System.out.println(Arrays.toString(mns.pt()));
	}
}
class menus{
	private String mn[][] ;
	private String nmn[] = new String[5];
	public menus(){
		String ms[][]= {
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"Y","Y","N","Y","Y","N","Y"} // Y인 거만 배열로 보이게
		};
		this.mn = ms;
		d();
	}
	public void d() {
		int ea1 = this.mn.length; // 2
		int ea2 = this.mn[0].length; // 7
		int count =0;
		
			int dww=0;
			do {
				if(this.mn[1][dww]=="Y") {
					this.nmn[count]=this.mn[0][dww];
					count++;
				}
				dww++;
			}while(dww<ea2);
//			System.out.println(Arrays.toString(this.nmn)); //배열에 저장된 값 확인
	}
	public String [] pt() {
		return this.nmn;
	}
}
