
public class Test2 {

	public static void main(String[] args) {
		String array[][]= {
				{"�̼���","ȫ�浿","������"},
				{"90","40","100"},
				{"88","60","70"},
				{"70","100","55"}
		};
		//����� 
		/*
		 �̼��� 90 40 100
		 ȫ�浿 88 60 70
		 ������ 70 100 55 
		 */
		
		int ea1 = array.length; // 4 ff
		int ea2 = array[0].length; //3 f
		
		int f,ff;
		for(f=0; f<3; f++) {  // 3����
			System.out.println(array[0][f]);
			for(ff=0; ff<3; ff++) { //3����
				System.out.println(array[f+1][ff]); //ū�ݺ����� 0���׷� ��������Ƿ� 1���׷���� ����ϵ��� f+1
			}
		}
		
		
	}

}
