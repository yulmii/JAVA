package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex01 {

	public static void main(String[] args) {
		String source = "300 true Hello flase 3.14 OK 서울시 010-1234-5678";
		// Scanner -> 자동완성 java.utill
		Scanner scan = new Scanner(source);
		
		// while 반복문 - 조건이 거짓일때까지 반복 수행한다.
		while(scan.hasNext()) {
			if (scan.hasNextDouble()) {
				System.out.println(scan.next());	
			}else {
				scan.next();
			}
			
			
		}
	}
}
