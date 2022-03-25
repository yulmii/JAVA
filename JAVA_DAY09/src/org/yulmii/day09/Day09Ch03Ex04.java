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
			System.out.print("시작 단 입력 : ");
			startDan = scan.nextInt();
			System.out.print("끝나는 단 입력 : ");
			endDan = scan.nextInt();
		}while(!((1<startDan&&startDan<=9)&&(1<endDan&&endDan<=9)));

		if (startDan>endDan) {
			int temp = startDan;
			startDan=endDan;
			endDan = temp;
		}
		for(int j = startDan ; j < endDan; j++ ) {
			for (int cnt = 1; cnt <= 30; cnt++) { // 1단에서 9단
				for (int dan = 2; dan <=4; dan++) { // 각 단의 구구셈 출력
					System.out.print(dan + "*" + cnt + "=" + dan * cnt); // 구구셈 출력
					System.out.print('\t'); // 하나씩 탭으로 띄기
				}
				System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
			}
		System.out.println();
		}
		

	}

	public static void main(String[] args) {
		new Day09Ch03Ex04();
	}
}