package org.yulmii.day15;

import java.util.Scanner;

public class geafhr {
	Scanner scan;

	public geafhr() {
		scan = new Scanner(System.in);
		char yn = checkYn("adfjlsfd'");
		System.out.println(yn);
	}

	public char checkYn(String str) {
		System.out.print("다시 검색하시겠습니까? \n(다시 검색 : 'y' or 'Y' menu : 아무키)\n >> ");
		char yn = scan.next().charAt(0);
		if (yn == 'y' || yn == 'Y') {
			System.out.println(str);
			yn = 'y';
		}
		return yn;
	}

	public static void main(String[] args) {
		new geafhr();
	}
}
