package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex04_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = 0; //while�� ���ప
		
		while(x == 0) {
			System.out.print("������ �Է��Ͻÿ� >> ");
			int score = scan.nextInt();
			
			if (score >= 80 && score <=100) {
				x=1;
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			}else if(score <80 && score >=0) {
				x=1;
				System.out.println("�ƽ��׿�.. ���հ��Դϴ�.");
			}else {
				x=0;
				System.out.println("0~100���̰��� �Է��ϼ���");}
			}
		scan.close();
		}
	/* 	[System.out.print("������ �Է��Ͻÿ� >> ");
	 	 int score = scan.nextInt();]-> while�� �ۿ� ������... 
	 score ���� ��� 0~100���̰��� �ƴ�
	 --> x�� 0�̶� ��� ���� ����......*/
	}

