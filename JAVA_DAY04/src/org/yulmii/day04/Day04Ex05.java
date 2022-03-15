package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char grade;
		
		System.out.print("점수를 입력하세요(0~100) >> ");
		int score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.printf("학점은 %c 입니다.",grade);
		scan.close();
		
	}

}
