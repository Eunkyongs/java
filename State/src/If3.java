
public class If3 {

	public static void main(String[] args) {

		// boolean �ڷ����� true or false �� �����ϰ� �˴ϴ�. �ֵ���ǥ ���x
		boolean ck = true;
		if (ck == true) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");
		} else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}

		String id, pw;

		id = "park";
		pw = "a1234";

		// && : �Ѱ��� ���� �̻� ��� ���� ��� and, �׸���
		// || : �Ѱ��� ���� �̻󿡼� �Ѱ��� ���� ��� or
		if (id == "park" && pw == "a1234") { // &&��ȣ �� ���� ������ ��� ���̾�� if�� ������
			System.out.println("�α��� �ϼ̽��ϴ�.");
		} else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���.");
		}
		if (id == "park" || id == "kim") {
			//if (id == "park" || pw == "a1234") {
		   // �� �����߿� �Ѱ����� ���� ��� �۵�. ����
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		} else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}
	}

}
