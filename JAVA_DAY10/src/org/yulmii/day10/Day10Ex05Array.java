package org.yulmii.day10;

import java.util.Scanner;

public class Day10Ex05Array {
	static Scanner scan = new Scanner(System.in);
	public Day10Ex05Array() {
		// TODO Auto-generated constructor stub
		ex06();
	}
	
	public void ex05() {
		
		int[] intArray = new int[5];
		int max = 0;
		System.out.println("정수 5개를 입력라세요");
		
		for(int i=0 ; i<intArray.length;i++) {
			intArray[i] = scan.nextInt();
			if(intArray[i]>max) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
	}
	public void ex06() {
		int[] intArray
	}
	public static void main(String[] args) {

		new Day10Ex05Array();

	}
}
