package org.yulmii.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10Ex04 {

	public static int getInt() {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		while(true) {
			try {
				System.out.print("�����Է�:");
				number = scan.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println(">>> ���ܹ߻� : ������ �Է��ϼ���");
				// ���ۿ� �����ִ� ���ڸ� �����Ѵ�
				scan.next();
				continue;
			}
		}
		scan.close();
		return number;
	}

	public static void main(String[] args) {
		int number=getInt();
		System.out.println("number = "+number);
	}
}
	

