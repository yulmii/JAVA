package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex04_2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� >> ");
		int score = scan.nextInt();
		while (score < 0 || score > 100) {
			System.out.print("0~100���� ���� �Է��ϼ��� >> ");
			score = scan.nextInt();
		}
		//���������� ��	
		if (score >= 80/* && score <=100 ���ʿ� ����*/) {
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		}else/* if(score <80 && score >=0)*/ {
			System.out.println("�ƽ��׿�.. ���հ��Դϴ�.");
		}/*else {
			System.out.println("0~100���̰��� �Է��ϼ���");}*/
	scan.close();
	}
}
