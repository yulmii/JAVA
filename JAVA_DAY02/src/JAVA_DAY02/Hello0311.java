package JAVA_DAY02;

public class Hello0311 {
	 // 멤버필드(Field)-클랫의 멤버, 클래스의 전역변수 같은거
	static String name = "이유림;";
	static String job = "프로그래머";
	//static은 정적이다.
	
	//속성, 변수, attribute
	//behavior, method, function, 기능, 함수는 비슷한 의미이다.
	static int sum(int a,int b) {
		return a + b;
	}
	
	
	//주석 : 클래스의 멤버는 크게 Static멤버와 non-Static멤버가 있다.
	//static
	//main ctrl+space bar
	public static void main(String[] args) {
		//지역변수 (local variable) - 함수 내부에 선언 된 변수
		int i = sum(10,20);
		
				
		System.out.println("Hello world!");
		System.out.println("Name : " + name);
		System.out.println("job : " + job);
	}
}