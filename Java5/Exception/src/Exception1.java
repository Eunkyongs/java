/*
 Exception : try,catch�� �Բ� ����� �ϰ� �˴ϴ�.(����ó������)
 ������ ���Ѱ� Ȯ���ϱ����� ���. �迭, ���, ���� �̷��ʿ��� ���� �߻�.
 
 -RuntimeException (Error �߻��� ����ó�� üũ�� ����) - Null, Class, Arraysize
 -OtherException (����ó�� üũ���� ��� ��)
 
 Exception[����]
 Arithmetic : 0���� ������ �߻�
 NullPointer : Null��ü�� �����Ҷ�
 ClassCast : Ŭ���� �� ��ȯ
 NumberFormat : ���������� ��ȯ
 ArrayIndexOutOfBound : �迭 ������ �ε�����ȣ ���� 
 IOException : ����� ���� �߻� -O 
 Exception : ��ü ����ó�� ��Ȳ -O => ���� �߻��� exception ��� �߻����� ����ؼ� �˷���
 
 ex) Center�� ���� 1 �̶�� ���� �������.
 String a= 1; ->error, �ڷ����� �����Ͱ� �����ʾƼ� ������.
 
 A USER ->������������ parseInt�� valueOf�� ����ȯ�ؼ� �����غ��� �������ִ� ���� 1�̹Ƿ� ���� �ƴ�                   
 String a="1"; 	            
 
 B USER ->���� 1�̹Ƿ� ���� �ƴ�
 int a =1;
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try { // try: �ش� ���� int�� ������(1)
			a = Integer.valueOf(b); // error�߻� . a1�̶�� �����ε�, ������ ���������� ��ȯ�� a��� ���ڷ� ���Ͽ� ���� �߻�.(2) 
			
		}catch(Exception z) {// ���ܹ߻��� ����ܻ������� ��� 
			System.out.println(z);  //(3) � �κп��� ������ �߻��Ͽ����� üũ�ؼ� ���
		}
		finally { // try,catch���� �ذ� �ȵǾ����� �ذ��� Ȯ������ ���
			b = b.replaceAll("[a-z][A-Z]", ""); //������ ��ó��(4) // replaceAll("[a-z][A-Z]", ""): a~z, A~Z���� �ܾ������ �������� ��ü�϶�� ��
			a = Integer.valueOf(b); //(5) �ٽ� ������ ���ۼ� �ؼ� ���
		}
		System.out.println(a); //(6) ���� ����� ���
		
	}

}
