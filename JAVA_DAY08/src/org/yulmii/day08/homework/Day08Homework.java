package org.yulmii.day08.homework;

import java.util.Scanner;

public class Day08Homework {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("¼÷Á¦ 1 : ");
//		Homework01(null);
//		System.out.println("¼÷Á¦ 2 : ");
//		Homework02(null);
		System.out.println("¼÷Á¦ 3 : ");
		Homework03(null);
//		System.out.println("¼÷Á¦ 4 : ");
//		Homework04(null);
//		System.out.println("¼÷Á¦ 5 : ");
//		Homework05(null);
//		System.out.println("¼÷Á¦ 6 : ");
//		Homework06(null);
		System.out.println("¼÷Á¦ 7 : ");
		Homework07(null);
//		System.out.println("¼÷Á¦ 8 : ");
//		Homework08(null);
//		System.out.println("¼÷Á¦ 9 : ");
//		Homework09(null);

	}

	public static void Homework01(String[] args) {
		/*
		 * ¼÷Á¦ 1  
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

		for (int row = 0; row < 9; row++) {
			int size = row < 4 ? row : 8 - row;
			for (int col = 0; col < 5; col++) {
				System.out.print(col <= size ? "*" : "^");
			}
			System.out.println();
		}

	}

	public static void Homework02(String[] args) {
		/*
		 * ¼÷Á¦ 2
		 *********
		 * ^******* ^^***** ^^^*** ^^^^*
		 */
		for (int row = 0; row < 5; row++) {
			int size = row < 4 ? row : 8 - row;
			for (int col = 0; col < row; col++) {
				System.out.print("^");
			}
			for (int col = 0; col < (5 - row) * 2 - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Homework03(String[] args) {
		/*
		 * ¼÷Á¦ 3 .
		 ^^^^* 
		 ^^^*** 
		 ^^***** 
		 ^*******
		 *********
		 ^******* 
		 ^^***** 
		 ^^^*** 
		 ^^^^*
		 */
		
	}

	public static void Homework04(String[] args) {
		/*
		 * ¼÷Á¦ 4
		 *********
		 **** **** 
		 ***   *** 
		 **     ** 
		 *       *
		 **     **
		 ***   ***
		 **** ****
		 *********
		 */
	}

	public static void Homework05(String[] args) {
		/*
		 * ¼÷Á¦ 5 Å©±âÀÔ·Â(È¦¼ö¸¸) : 9
		 *********
		 *  * *  * 
		 * *   * * 
		 **     **
		 *       *
		 **     **       
		 * *   * * 
		 *  * *  *
		 *********
		 */
	}

	public static void Homework06(String[] args) {
		/*
		 * ¼÷Á¦ 6
		 *********
		 **     ** 
		 * *   * * 
		 *  * *  *
		 *   *   *
		 *  * *  * 
		 * *   * *
		 **     **
		 *********
		 */
	}

	public static void Homework07(String[] args) {
		/*
		 * ¼÷Á¦ 7 (À¯¸²¾¾¸¸)
		 *********
		  *******
		   *****
		    ***
		     *
		    ***
		   *****
		  *******
		 *********
		 */
		int n=0;
		while(n%2!=1) {
			System.out.print("¼ýÀÚ ÀÔ·Â(È¦¼ö¸¸) >> ");
			n = scan.nextInt();
		}
		for (int row = 0; row < n; row++) {
			int size = row < (n/2) ? row : (n-1) - row;
			for (int col = 0; col < size; col++) {
				System.out.print(" ");
			}
			for (int col = 0; col < ((n/2)+1 - size) * 2 - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Homework08(String[] args) {
		/*
		 * ¼÷Á¦ 8 
	         *       *
		    ***     ***
		   *****   *****
		  ******* *******
		 *****************
		 */
	}

	public static void Homework09(String[] args) {
		/*
		 * ¼÷Á¦ 9 : ¿øÇü ¸¸µé±â(½ÂÁØ¾¾¸¸)
		 */
	}
}
