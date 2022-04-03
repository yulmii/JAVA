package org.yulmii.day14;

import java.io.IOException;
import java.util.Scanner;

public class ScoreManage {
Scanner scan ;
	public ScoreManage() {
		scan = new Scanner(System.in);
		
		String number=getNumber();
		System.out.println();
		System.out.println(number);
		
		getNumber();
	}	
	
	public String getNumber(){
		int num = 0;
		while (!scan.hasNextInt()) {
			scan.next(); 
			System.err.print("에러! 숫자가 아닙니다. \n재 선택 : "); }
		
		return scan.next();
		 
		
	}
	public int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while ((ch = System.in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num=num*10;
					System.out.println(num);
					num = num + ch-48;
					System.out.println(num);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return num;

	}
	public static void main(String[] args) {
		
		new ScoreManage();
	}
}
