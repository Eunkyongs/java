import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*���빮�� :  ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�.
		  �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�.
		  �ù��� 30,000�� �̻�(����) 
		  15000 48000 67000 8000 118200 49800 6000 18700
	      �����:[48000, 67000, 118200, 49800]	
		  */
		
		//[] :�ε��� ��ȣ
		int fs[] = new int[4]; // ������� 4���� �����͸� �����Ƿ� 4���� ������ ���� �迭 ����
		//[null,null,null,null]�̷�����
		
		int cart[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700};
		
		int fs_ea= fs.length;//fs�迭�� ��������Ȯ��
		
		int c_ea=cart.length; // cart�迭�� ��������Ȯ��
		
		int dw = 0; //�ݺ����� ���
		int f; //�ݺ����� ���
		int ct = 0; // ���ǹ��� ����� ī����. fs�迭�� �ε������� 0���� ���������� �ο��ϱ� ���� ����
		
		//do~while�� ���
		do {
			if(cart[dw] >= 30000 && ct<fs_ea) { // cart�迭�� ��ü���� 30000�̻��϶��� ct���� fs�迭�� �� ���� �����϶�
				fs[ct] = cart[dw];//if�� ������ ������ fs�迭�� cart�迭�� ��ü�� ���Խ�Ŵ
				ct++;				//������ �¾Ƽ� ������ ����Ǿ����� ct�� +1������Ŵ
			}			
			dw++;
		}while(dw<c_ea);
		System.out.println(Arrays.toString(fs));

/*			
		//for�� ���
		for(f=0; f<c_ea; f++ ) {
			if(cart[f]>=30000 && ct<fs_ea) {
				fs[ct] = cart[f];
				ct++;
			}
			System.out.println(Arrays.toString(fs));
*/			
/*
		//while�� ���	
		while(dw<c_ea) {
			if(cart[dw]>=30000 && ct<fs_ea) {
				fs[ct] = cart[dw];
				ct++;
			}
			dw++;
		}
		System.out.println(Arrays.toString(fs));
*/
		
		
		
		


		}
	}
