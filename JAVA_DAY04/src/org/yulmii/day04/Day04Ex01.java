package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex01 {

	public static void main(String[] args) {
		String source = "300 true Hello flase 3.14 OK ����� 010-1234-5678";
		// Scanner -> �ڵ��ϼ� java.utill
		Scanner scan = new Scanner(source);
		
		// while �ݺ��� - ������ �����϶����� �ݺ� �����Ѵ�.
		while(scan.hasNext()) {
			if (scan.hasNextDouble()) {
				System.out.println(scan.next());	
			}else {
				scan.next();
			}
			
			
		}
	}
}
