package org.yulmii.day08.homework;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 ^^^^*
		 ^^^***
		 ^^*****
		 ^*******
		 *********
		 */
		
		/*for(int row=0; row<5; row++) {
			int size = row<4 ? row : 8-row;
			for(int col=0; col<4-row ;col++) {
				System.out.print("^");
			}
			for(int col=0;col<(row+1)*2-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int row=0; row<5; row++) {
			int size = row<4 ? row : 8-row;
			for(int col=0; col<(row+1)*2+3 ;col++) {
				System.out.print(col<row"^");
			}
			for(int col=0;col<(row+1)*2-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void homework01(String[] args) {
		/* 
		 ^^^^*
		 ^^^**
		 ^^***
		 ^****
		 *****
		 ^****
		 ^^***
		 ^^^**
		 ^^^^*
		 */
		for(int row=0; row<9; row++) {
			int size = row<4 ? row : 8-row;
			for(int col=0; col<5;col++) {
				System.out.print(col<=size?"*":"^");
			}System.out.println();
		}
	}
	
	
	public static void ex04(String[] args) {
		/*
		 *****
		 ^****
		 ^^***
		 ^^^**
		 ^^^^*
		 ^^^**
		 ^^***
		 ^****
		 *****
		 */
		
		for(int row=0; row<9; row++) {
			int size = row<4 ? row : 8-row;
			for(int col=0; col<5;col++) {
				System.out.print(col<size?"^":"*");
			}System.out.println();
		}
	}
	public static void ex03(String[] args) {
		// 코딩은 지식이 많다고 잘하는것은 아니다. PRACTICE
		// 기초! 어려울수록 기본으로 간다.
		int cntJ = 0;
		int cntK = 5;

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5/*cntJ*/; j++) {
				//System.out.print("^");
				System.out.print(j<=cntJ ? "^":"*");
			}
			//for (int k = 1; k <= cntK; k++) {
				//System.out.print("*");
			//}
			System.out.println();
			//cntJ = i < 5 ? cntJ + 1 : cntJ - 1;
			cntK = i < 5 ? 5 - i : i - 3;
		}

	}
}
