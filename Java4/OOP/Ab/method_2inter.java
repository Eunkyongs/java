package Ab;
//interface : ���� ����� �޼ҵ常 ����, �߰��� ������ ó���ϴ� ������ default�� �߰���(java ver.14����)  
public interface method_2inter {
	//interface�� �޼ҵ� �̹Ƿ� �ʵ忡 �ڷ����� ���� �� �� ����
	public String names(); // String names() return�޼ҵ� ����.
	
	default void setbox(String name) { //setter
		System.out.println(name); //�������, �ܼ���µ ���. this ��� ����
	}
	default String box3(String n) { // getter 
		//interface���� default �����ϸ� ���� �޼ҵ带 �����
		return null;
	}
}

interface method_2re extends method_2inter{
	//interface�� extends�� �θ�interface�� �ε��� �� �ֽ��ϴ�.
}