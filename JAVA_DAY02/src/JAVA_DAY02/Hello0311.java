package JAVA_DAY02;

public class Hello0311 {
	 // ����ʵ�(Field)-Ŭ���� ���, Ŭ������ �������� ������
	static String name = "������;";
	static String job = "���α׷���";
	//static�� �����̴�.
	
	//�Ӽ�, ����, attribute
	//behavior, method, function, ���, �Լ��� ����� �ǹ��̴�.
	static int sum(int a,int b) {
		return a + b;
	}
	
	
	//�ּ� : Ŭ������ ����� ũ�� Static����� non-Static����� �ִ�.
	//static
	//main ctrl+space bar
	public static void main(String[] args) {
		//�������� (local variable) - �Լ� ���ο� ���� �� ����
		int i = sum(10,20);
		
				
		System.out.println("Hello world!");
		System.out.println("Name : " + name);
		System.out.println("job : " + job);
	}
}