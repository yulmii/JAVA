package org.yulmii.homework.ch02;

import java.util.Scanner;

public class Ch02Homework {
	public static void main(String[] args) {
		//����� ���̸� �Է¹޾Ƽ� ����ϴ� ���α׷�
		//�� ��Ʈ�� ������ �ٽ� �ϰڽ��ϱ�?  y OR n���Է¹޵����Ѵ�.
		Scanner scan = new Scanner(System.in);
		String name = null;
		int age = 0;
		
		System.out.print("������ �Է� �ϼ��� >> ");
		name = scan.next();
		System.out.print("���̸� �Է� �ϼ��� >> ");
		age = scan.nextInt();
		System.out.printf("%s���� %d�� �Դϴ�.", name, age);
		System.out.print("����Ͻðڽ��ϱ�?(y/n) >> ");
		char yn = scan.next().charAt(0);
		//while(yn != 'n' && yn != 'y') {
		while(!(yn == 'y' || yn == 'n')) {	
			System.out.println("y �Ǵ� n�� �Է��ϼ���.");
			System.out.print("����Ͻðڽ��ϱ�?(y/n) >> ");
			yn = scan.next().charAt(0);
		}
		if(yn == 'y') {
			System.out.println("Dd");
		}
		System.out.println("�����ϼ̽��ϴ�.");
		scan.close();
	}
}
