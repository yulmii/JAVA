package org.yulmii.hoho;

import java.util.Scanner;

public class junho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Q. 5���� ������ �Է¹ް� �� �� ����鸸 ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�
		System.out.println("5���� ������ �Է����ּ���");
		int sum = 0;

		for (int i = 0; i < 5; ) {
			int numb = scanner.nextInt();
			if (numb <= 0) {
				continue;
				System.out.println("����(���)�� �Է����ּ���");
			} else {
				sum += numb;
				i++;
			}
		}
		System.out.println("5�� ������ ���� " + sum);
	}
}
