package org.yulmii.day10;

import java.util.Scanner;

public class Ch03Ex02Continue {

	public Ch03Ex02Continue() {
		// 정수 5개를 입력 받는다.
		// 입력 된 정수 중에 양수만을 누적한다. (continue 활용)
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int n = 0;
		System.out.println("정수 5개를 입력하세요.");
		for (int i = 0; i < 5; i++) {
			n = scan.nextLine();
			/*if(n<=0) {
				이때는 continue 안써도됨
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
