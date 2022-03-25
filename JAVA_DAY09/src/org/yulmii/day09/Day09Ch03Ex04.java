package org.yulmii.day09;

import java.util.Scanner;

public class Day09Ch03Ex04 {
	static Scanner scan = new Scanner(System.in);

	public Day09Ch03Ex04() {
		gugudan();
	}

	private void gugudan() {
		int startDan = 0, endDan = 0;
		
		do{
			System.out.print("���� �� �Է� : ");
			startDan = scan.nextInt();
			System.out.print("������ �� �Է� : ");
			endDan = scan.nextInt();
		}while(!((1<startDan&&startDan<=9)&&(1<endDan&&endDan<=9)));

		if (startDan>endDan) {
			int temp = startDan;
			startDan=endDan;
			endDan = temp;
		}
		for(int j = startDan ; j < endDan; j++ ) {
			for (int cnt = 1; cnt <= 30; cnt++) { // 1�ܿ��� 9��
				for (int dan = 2; dan <=4; dan++) { // �� ���� ������ ���
					System.out.print(dan + "*" + cnt + "=" + dan * cnt); // ������ ���
					System.out.print('\t'); // �ϳ��� ������ ���
				}
				System.out.println(); // �� ���� ������ ���� �ٷ� Ŀ�� �̵�
			}
		System.out.println();
		}
		

	}

	public static void main(String[] args) {
		new Day09Ch03Ex04();
	}
}