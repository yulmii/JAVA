package org.yulmii.day09;

import java.util.Scanner;

public class HomeworkDay09 {
	
	public static void gugudan() {

		Scanner scan = new Scanner(System.in);
		System.out.print("시작 단 : ");
		int startDan = scan.nextInt();
		System.out.print("끝나는 단 : ");
		int endDan = scan.nextInt();
		if (startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for (int i = 0; i <= (endDan - startDan) / 3; i++) {
			for (int cnt = 0; cnt < 10; cnt++) {
				for (int dan = startDan + i * 3; dan < startDan + (i * 3) + 3; dan++) {
					if (dan <= endDan) {
						if (cnt == 0) {
							System.out.printf("=== %d단 === \t\t\t\t", dan);
						} else {
							System.out.printf("%d * %d = %2d\t\t\t\t", dan, cnt, dan * cnt);
						}
					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		gugudan();
	}
}

