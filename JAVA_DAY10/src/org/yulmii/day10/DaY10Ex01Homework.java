package org.yulmii.day10;

import java.util.Scanner;

public class DaY10Ex01Homework {

	public DaY10Ex01Homework() {
		ex01();
	}

	public void ex01() {
		Scanner  scan= new Scanner(System.in);
		
		System.out.print("시작 단 입력 : ");
		int startDan = scan.nextInt();
		while(startDan<2||startDan>9) {
			System.out.println("단은 2~9사이만 유효합니다.");
			System.out.print("시작 단 입력 : ");
			startDan = scan.nextInt();
		}
		System.out.print("끝나는 단 입력 : ");
		int endDan = scan.nextInt();
		while(endDan<2||endDan>9) {
			System.out.println("단은 2~9사이만 유효합니다.");
			System.out.print("끝나는 단 입력 : ");
			endDan = scan.nextInt();
		}
		if(startDan>endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		for (int dan = startDan; dan <= endDan; dan += 3) {
			/*
			 * System.out.print((dan+0)+"단\t"); System.out.print((dan+1)+"단\t");
			 * if(dan+2<10) { System.out.print((dan+2)+"단\n"); }else { System.out.println();
			 * }
			 */
			for (int i = 0; i < 3; i++) {
				System.out.print((dan + i < endDan+1) ? (dan + i) + "단\t" : "");
			}
			System.out.println();
			for (int i = 1; i <= 9; i++) {
				/*
				 * System.out.print(dan+0+"*"+i+"="+(dan+0)*i+"\t");
				 * System.out.print(dan+1+"*"+i+"="+(dan+1)*i+"\t"); if(dan+2<10) {
				 * System.out.print(dan+2+"*"+i+"="+(dan+2)*i+"\n"); }else {
				 * System.out.println(); }
				 */
				for (int j = 0; j < 3; j++) {
					System.out.print(dan + j < endDan+1 ? dan + j + "*" + i + "=" + (dan + j) * i + "\t" : "");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		new DaY10Ex01Homework();
	}
}
