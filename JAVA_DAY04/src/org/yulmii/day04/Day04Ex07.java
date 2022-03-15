package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex07 {

	public static void main(String[] args) {
		
		/*
		성명 입력 >> 홍길동
		나이 입력 >> 24
		결과 : 홍길동님은 24세 입니다.
		---------------------------
		계속 하시겠습니까(y/n) >> y
		성명 입력 >> 김길동
		나이 입력 >> 26
		결과 : 김길동님은 26세 입니다.
		---------------------------
		계속 하시겠습니까(y/n) >> p
		경고: y또는 n만 입력 하세요.
		계속 하시겠습니까(y/n) >> n
		수고하셨습니다. 다음 기회에 ...
		*/
		// 힌트 : 문자열에서 문자 하나를 추출하는 기능 str.charAt(0)
		// 힌트2 : 문자열의 비교는 str.equals("문자열")
		// 문자열은 ==연산자로 비교 불가능. 반드시 equals()메소드로 비교한다.
		// String str = scan.next();
		// char yn = str.charAt(0);
		
		Scanner scan = new Scanner(System.in);
		char yn = 'y'; 
		
		while(yn == 'y') {
			System.out.print("성명 입력 >> ");
			String name = scan.next();
			System.out.print("나이 입력 >> ");
			int age = scan.nextInt();
			System.out.printf("결과 : %s님은 %d세 입니다.\n", name, age);
			System.out.println("--------------------------");
			System.out.print("계속 하시겠습니까?(y/n) >> ");
			String anser = scan.next();
			yn = anser.charAt(0);
			while (yn != 'y' && yn != 'n') {
				System.out.println("경고 : y또는 n만 입력하세요. >>");
				//System.out.print("계속 하시겠습니까?(y/n) >> ");
				anser = scan.next();
				yn = anser.charAt(0);
			}
		}
		System.out.println("수고하셨습니다. 다음 기회에...");
	}
}
