package org.yulmii.homework.ch02;

import java.util.Scanner;

public class Ch02HomeworkT {
	
	public static void main(String[] args) {
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
			main(null);//재귀호출
			return;
		}
		System.out.println("수고하셨습니다.");
		scan.close();
	}
}
