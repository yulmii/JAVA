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
		System.out.print("�ٽ� �˻��Ͻðڽ��ϱ�? \n(�ٽ� �˻� : 'y' or 'Y' menu : �ƹ�Ű)\n >> ");
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
