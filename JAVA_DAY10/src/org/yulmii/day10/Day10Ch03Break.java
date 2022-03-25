package org.yulmii.day10;

public class Day10Ch03Break {

	public Day10Ch03Break() {
		ex01();

	}

	public void ex01() {
		// 레이블
		for (int k = 0; k < 5; k++) {
			System.out.println(k+"번째 줄");
			aa: 
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 10; j++) {
					if (j == 2)
						break aa;
					System.out.print(j + "\t");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		new Day10Ch03Break();
	}
}
