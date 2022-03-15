package org.yulmii;

import java.util.Scanner;

public class CircleArea {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//평을 입력 받아서 제곱미터로 출력하는 프로그램
		//1평은 약 3.30579m^2
		final double 평계산 = 3.30579;
		double 제곱미터 = 0;
		double 평 = 0;
		double 평수로 = 0;
		double 제곱미터로 = 0;
		
		System.out.println("평수 입력 : ");
		평 = scan.nextDouble();
		제곱미터로 = 평 * 평계산;
		String msg01 = String.format("평이 %f인 곳은 %f제곱미터입니다.\n", 평, 제곱미터로);
		System.out.println(msg01);
		
		// 제곱미터를 입력받아서 평을 출력하는 프로그램
		System.out.println("제곱미터 입력 : ");
		제곱미터 =scan.nextDouble();
		평수로 = 제곱미터 / 평계산;
		String msg02 = String.format("제곱미터가 %f인 곳은 %f평입니다.\n", 제곱미터, 평수로);
		System.out.println(msg02);
	}
		
	
	public static void ex01(String[] args) {
		
		// 상수 PI 선언 -	Math.PI로도 가능
		final double PI = 3.141592;
		double r = 10;
		double circleArea = 0;
		
		//키보드로 반지름을 입력받아서 사용 하기
		System.out.print("반지름 입력: ");
		r= scan.nextDouble();
		
		//연산하기 - 반지름을 이용해서 면적을 구한다.
		//항과 연산자 사이에는 공백이 없어도 된다.
		//가독성을 위한 띄어쓰기
		circleArea = r * r * PI;
		
		//결과 출력
		//System.out.println("반지름이 " +r+"인 원의 면적은 ");
		//System.out.println(circleArea + "입니다.");
		//pintln()대신 printf()로 사용 (print format 사용)
		//System.out.printf("반지름이 %.1f인 원의 넓이는 %.4f입니다.\n", r, circleArea);
		String msg = String.format("반지름이 %.1f인 원의 넓이는 %.4f입니다.\n", r, circleArea);
		System.out.println(msg);
	}

}
