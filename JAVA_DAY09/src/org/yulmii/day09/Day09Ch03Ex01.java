package org.yulmii.day09;

import java.util.Scanner;

public class Day09Ch03Ex01 {

	public Day09Ch03Ex01() {
		// TODO Auto-generated constructor stub
	//����Ʈ ������
		ex01();
	}

	private void ex01() {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int n = scan.nextInt();
		while(n!=-1) {
			count++;
			sum+=n;
			n= scan.nextInt();
		}
		if(count !=0) {
			System.out.printf("������ ������ %d���̸� ����� %.1f�Դϴ�.",count,(double)sum/count);
		}else
			System.out.println("�Էµ� ���� �����ϴ�.");
	}
	public static void main(String[] args) {
		new Day09Ch03Ex01();
	}
}
