package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex04_2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 >> ");
		int score = scan.nextInt();
		while (score < 0 || score > 100) {
			System.out.print("0~100사이 값을 입력하세요 >> ");
			score = scan.nextInt();
		}
		//빠져나오면 비교	
		if (score >= 80/* && score <=100 쓸필요 없음*/) {
			System.out.println("축하합니다. 합격입니다.");
		}else/* if(score <80 && score >=0)*/ {
			System.out.println("아쉽네요.. 불합격입니다.");
		}/*else {
			System.out.println("0~100사이값을 입력하세요");}*/
	scan.close();
	}
}
