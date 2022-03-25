package org.yulmii.day09;

import java.util.Scanner;

public class Day09Ch03Ex01 {

	public Day09Ch03Ex01() {
		// TODO Auto-generated constructor stub
	//디폴트 생성자
		ex01();
	}

	private void ex01() {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int n = scan.nextInt();
		while(n!=-1) {
			count++;
			sum+=n;
			n= scan.nextInt();
		}
		if(count !=0) {
			System.out.printf("정수의 개수는 %d개이며 평균은 %.1f입니다.",count,(double)sum/count);
		}else
			System.out.println("입력된 값이 없습니다.");
	}
	public static void main(String[] args) {
		new Day09Ch03Ex01();
	}
}
