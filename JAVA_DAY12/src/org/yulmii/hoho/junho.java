package org.yulmii.hoho;

import java.util.Scanner;

public class junho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Q. 5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램을 작성하라
		System.out.println("5개의 정수를 입력해주세요");
		int sum = 0;

		for (int i = 0; i < 5; ) {
			int numb = scanner.nextInt();
			if (numb <= 0) {
				continue;
				System.out.println("정수(양수)를 입력해주세요");
			} else {
				sum += numb;
				i++;
			}
		}
		System.out.println("5개 정수의 합은 " + sum);
	}
}
