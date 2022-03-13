package JAVA_DAY02;

public class Hello0311teacher {
	   // 멤버필드(Field) - 클래스의 멤버, 클래스의 전역변수 같은것.
	   static String name = "김범준";
	   static String job = "프로그래머";
	   // static은 정적이다.
	   // 속성, 변수, attribute, argument, parameter, params, args ...
	   // behavior, method, function, 기능, 함수는 비슷한 의미이다.
	   static int sum(int a, int b) {
	      return a + b;
	   }
	   // 주석: 클래스의 멤버는 크게 static멤버와 not-static멤버가 있다.
	   // static 멤버는 클래스 차원의 멤버이고
	   // non-static멤버는 객체(instance) 차원 멤버이다.
	   // 객체는 클래스를 이용해서 만들 수 있다.
	   // 그리고 클래스는 객체를 만들기 위해서 필요하다.
	   // 클래스 -> 객체 생성.
	   // non-static 멤버는 객체 멤버이므로 객체를 안만들면 사용 못함.

	   // non-static으로 메소드 선언
	   void printInfo() {
	      // not-static 멤버 메소드에서 static멤버 호출 가능.
	      System.out.println("성명 " + name);
	      System.out.println("직업 " + job);
	   }
	   
	   // 실행 단축키 : Ctrl + F11
	   public static void main(String[] args) {
	      // 지역변수 (local variable) - 함수 내부에 선언 된 변수
	      // 정의 : static 멤버는 static 멤버만 호출 가능하다.
	      int i = sum(10, 20);
	      
	      // main함수에서 멤버 필드 접근
	      System.out.println("Name : " + name);
	      System.out.println("Job : " + job);
	      System.out.println("Hello world!");
	   }

}
