package org.yulmii.day11;

import java.util.Scanner;

public class Day11Ex02Homework {
	public static final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static final Scanner scan = new Scanner(System.in);
	int month, day, total, nextMonth, nextDay;
	// 실전에서는 Date 클래스  or Calendar 클래스를 사용하면 된다.
	
	public Day11Ex02Homework() {
		findDay();
		
	}
	
	public void findDay() {
		System.out.print("월/일 입력 >> ");
		month = scan.nextInt();
		day = scan.nextInt();
		System.out.print(month+"월 "+day+"일의 100일 후는");
		//반복한다.
		total = 100-(days[month-1]-day);
		System.out.println("total ="+total);
		int i = month % 12 ;
		while(total> days[i]) {
			total=total-days[i];
			i++;
			i %= 12;
		}
		nextMonth = i+1;
		nextDay= total;
		System.out.println(nextMonth+"월 "+nextDay+"일 입니다.");
		
	}
	
	public static void main(String[] args) {
		new Day11Ex02Homework();
	}
}
