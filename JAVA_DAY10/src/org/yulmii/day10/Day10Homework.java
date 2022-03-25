package org.yulmii.day10;

import java.util.Scanner;

public class Day10Homework {

	public static void main(String[] args) {

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 모두 합하면 365일
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int month = 0, day = 0;
		
		for (int i = 0; i < days.length; i++) {
			total += days[i];
		}

		System.out.println("1년은 " + total + "일입니다.");

		System.out.print("월 입력 : ");
		month = scan.nextInt();
		// System.out.printf("%d월은 %d일까지 있다.\n", month, days[month-1]);
		System.out.print("일 입력 : ");
		day = scan.nextInt();

		/*
		 * 1월 1일부터 몇월 며칠까지 몇 일이 지났는지 출력하자.
		 */
		total = day; // 이렇게 초기화해도 된다. 왜냐하면 몇 월 몇 일 입력 시 최소한 이번 달에 몇 일이 지났을 수 있으니까.
		for (int i = 0; i < month - 1; i++) {
			total = total + days[i];
		}

		System.out.printf("1월1일 부터 %d월 %d일까지는 %d일이 지났습니다.\n", month, day, total);
		// 날짜 입력후 100일?
		int Dday=100-days[month-1]-day;
		int Dmonth=month+1;
		for(;;) {
			Dday-=days[Dmonth-1];
			Dmonth+=1;
			if(Dday<=days[Dmonth]) {
				break;
		}
		}
			
		
		System.out.printf("%d월 %d일 100일 후는 %d월 %d일 입니다.",month , day , Dmonth , Dday);
		
	}

}
