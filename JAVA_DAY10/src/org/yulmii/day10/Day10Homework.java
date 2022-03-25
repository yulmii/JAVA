package org.yulmii.day10;

import java.util.Scanner;

public class Day10Homework {

	public static void main(String[] args) {

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // ��� ���ϸ� 365��
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int month = 0, day = 0;
		
		for (int i = 0; i < days.length; i++) {
			total += days[i];
		}

		System.out.println("1���� " + total + "���Դϴ�.");

		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		// System.out.printf("%d���� %d�ϱ��� �ִ�.\n", month, days[month-1]);
		System.out.print("�� �Է� : ");
		day = scan.nextInt();

		/*
		 * 1�� 1�Ϻ��� ��� ��ĥ���� �� ���� �������� �������.
		 */
		total = day; // �̷��� �ʱ�ȭ�ص� �ȴ�. �ֳ��ϸ� �� �� �� �� �Է� �� �ּ��� �̹� �޿� �� ���� ������ �� �����ϱ�.
		for (int i = 0; i < month - 1; i++) {
			total = total + days[i];
		}

		System.out.printf("1��1�� ���� %d�� %d�ϱ����� %d���� �������ϴ�.\n", month, day, total);
		// ��¥ �Է��� 100��?
		int Dday=100-days[month-1]-day;
		int Dmonth=month+1;
		for(;;) {
			Dday-=days[Dmonth-1];
			Dmonth+=1;
			if(Dday<=days[Dmonth]) {
				break;
		}
		}
			
		
		System.out.printf("%d�� %d�� 100�� �Ĵ� %d�� %d�� �Դϴ�.",month , day , Dmonth , Dday);
		
	}

}
