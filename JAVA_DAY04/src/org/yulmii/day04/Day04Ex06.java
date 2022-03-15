package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 >> ");
		int month = scan.nextInt();
		while (month<1 || month>12) {
			System.out.println("달은 1월부터 12월까지 밖에 없습니다");
			System.out.print("월을 입력하세요 >>");
			month = scan.nextInt();		
		}
		int day = 31;
		switch(month) {
		case 2: day = 28; break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		}
		System.out.printf("%d월은 %d일 까지 있습니다.", month, day);
	}
}
