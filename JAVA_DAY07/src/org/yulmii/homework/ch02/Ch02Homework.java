package org.yulmii.homework.ch02;

import java.util.Scanner;

public class Ch02Homework {
	public static void main(String[] args) {
		//성명과 나이를 입력받아서 출력하는 프로그램
		//한 셋트가 끝나면 다시 하겠습니까?  y OR n만입력받도록한다.
		Scanner scan = new Scanner(System.in);
		String name = null;
		int age = 0;
		
		System.out.print("성명을 입력 하세요 >> ");
		name = scan.next();
		System.out.print("나이를 입력 하세요 >> ");
		age = scan.nextInt();
		System.out.printf("%s님은 %d세 입니다.", name, age);
		System.out.print("계속하시겠습니까?(y/n) >> ");
		char yn = scan.next().charAt(0);
		//while(yn != 'n' && yn != 'y') {
		while(!(yn == 'y' || yn == 'n')) {	
			System.out.println("y 또는 n만 입력하세요.");
			System.out.print("계속하시겠습니까?(y/n) >> ");
			yn = scan.next().charAt(0);
		}
		if(yn == 'y') {
			System.out.println("Dd");
		}
		System.out.println("수고하셨습니다.");
		scan.close();
	}
}
