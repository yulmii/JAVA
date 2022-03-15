package org.yulmii;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		//스캐너 선언
		Scanner scan = new Scanner(System.in);
		
		System.out.print("도시 입력 : ");
		String city = scan.next();
		System.out.println("사는곳은 " + city + "입니다.");
		
		System.out.print("이름입력 : ");
		String name = scan.next();
		System.out.println("이름은 " + name + "입니다.");
		
		System.out.print("나이입력 : ");
		int age = scan.nextInt();
		System.out.println("나이는" + age + "입니다.");
		
		System.out.print("체중입력 : ");
		double weight = scan.nextDouble();
		System.out.println("체중은 " + weight + "Kg 입니다.");
		
		System.out.print("독신여부입력 : ");
		boolean single = scan.nextBoolean();
		System.out.println("독신여부는 " + single + "입니다.");
				
		// scan을 닫아 준다.
		scan.close();
		
		
	}
}
