import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yy��MM��dd��"); // mm=�� MM=month �� YYYY=year �⵵ DD=day �� (��,���� �ҹ��ڵ� ����. ���� �ҹ����ϸ� �����γ��ͼ� �ȴ�)
		SimpleDateFormat time = new SimpleDateFormat("h:m:s"); // h=hour,�� m=minute,�� s=second, �� 
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));

		//format : �԰�ȭ�� ���·� ���� ǥ���Ҷ� ����ϰ� �˴ϴ�.
		// ctrl+shift+o : import �����ϴ� ����Ű. �ҷ��� ��ƿ ���̻� ������� ������ �����
		
		int money = 10000;

		int coupon =20;

		double a = coupon * 0.01;

		System.out.println(a);
		
		double b=money*a;
		System.out.println(b);
		double c= money - b;
		System.out.println(c);

			
		
		
	}

}


