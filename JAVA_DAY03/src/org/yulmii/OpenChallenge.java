package org.yulmii;

import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		
		System.out.println("가위바위보를 입력하세요.");
		Scanner  가위바위보 = new Scanner(System.in);
		System.out.print("철수 >> ");
		String 철수 = 가위바위보.next();
		System.out.print("영희 >> ");
		String 영희 = 가위바위보.next();
				
		if(철수.equals("가위")) {
			if(영희.equals("가위")) {
				System.out.println("바겼습니다.");}
			else if(영희.equals("바위")) {
				System.out.println("영희가 이겼습니다.");}
			else if(영희.equals("보")) {
					System.out.println("철수가 이겼습니다.");}
		else if(철수.equals("바위")) {
			if(영희.equals("가위")) {
				System.out.println("철수가 이겼습니다.");}
			else if(영희.equals("바위")) {
				System.out.println("영희가 이겼습니다.");}
			else if(영희.equals("보")) {
					System.out.println("철수가 이겼습니다.");}
			}
	
			
			
			}
		}
	}

}
