package org.yulmii.day10;

import java.util.Scanner;

public class Ch03Ex02Continue {

	public Ch03Ex02Continue() {
		// ���� 5���� �Է� �޴´�.
		// �Է� �� ���� �߿� ������� �����Ѵ�. (continue Ȱ��)
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int n = 0;
		System.out.println("���� 5���� �Է��ϼ���.");
		for (int i = 0; i < 5; i++) {
			n = scan.nextLine();
			/*if(n<=0) {
				�̶��� continue �Ƚᵵ��
			}else {
				total+=n;
			}*/
			if(n<=0) {
				continue;
			}
			total+=n;
		}
		System.out.println("total = " + total);

	}

	public static void main(String[] args) {
		new Ch03Ex02Continue();
	}
}
