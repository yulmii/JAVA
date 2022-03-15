package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex04_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = 0; //while문 실행값
		
		while(x == 0) {
			System.out.print("점수를 입력하시오 >> ");
			int score = scan.nextInt();
			
			if (score >= 80 && score <=100) {
				x=1;
				System.out.println("축하합니다. 합격입니다.");
			}else if(score <80 && score >=0) {
				x=1;
				System.out.println("아쉽네요.. 불합격입니다.");
			}else {
				x=0;
				System.out.println("0~100사이값을 입력하세요");}
			}
		scan.close();
		}
	/* 	[System.out.print("점수를 입력하시오 >> ");
	 	 int score = scan.nextInt();]-> while문 밖에 놨더니... 
	 score 값이 계속 0~100사이값이 아님
	 --> x가 0이라서 계속 무한 루프......*/
	}

