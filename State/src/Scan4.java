import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("�Է��� ������ �����ּ���!");
		// String memo = a.next(); // next() : �����̽��� �Է±����� ����(���鰪 ���� ���Ĵ� �Է¹��� ����)
		
		String memo = a.nextLine(); // nextLine(): �����̽��� ���� ��� �Է����� (space bar �Է����� ����� �������� �Է°����� ��� ����)
		System.out.println(memo);

		a.close(); // scanner ����. ���ἱ�� ���������� �޸� ��ȯ�� �ȵ�. 
		
		String name = "park"; // String + ���� = %s
		byte num = 25;  //���ڴ� %d
		/*
		 [�߿����]
		 %f : float,double
		 %t : date, time  �ð�,��¥
		 %b : boolean(true, false)
		  */
		
		//System.out.println(name+"���� ���̴�"+num+"�Դϴ�.");
		//printf:f��� ���� format �� ���մϴ�.
		System.out.printf("%s���� ���̴� %d �Դϴ�.",name,num); //%->�ش簪�� �����ͼ� ���
		
	}

}
