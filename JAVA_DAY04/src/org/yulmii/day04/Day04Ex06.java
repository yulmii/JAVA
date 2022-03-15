package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� >> ");
		int month = scan.nextInt();
		while (month<1 || month>12) {
			System.out.println("���� 1������ 12������ �ۿ� �����ϴ�");
			System.out.print("���� �Է��ϼ��� >>");
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
		System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.", month, day);
	}
}
