package org.yulmii.homework.ch02;

import java.util.Scanner;

public class Ch02Homework02 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			printInfo(); // printInfo()�Լ� ȣ��
			char yn= getYN();
		
			
			if(yn == 'n') {
				System.out.println("�����ϼ̽��ϴ�.");
				break;
			}
			
			}scan.close();
		}
			
		
	
	private static char getYN() {
		System.out.print("����Ͻðڽ��ϱ�?(y/n) >> ");
		char yn = scan.next().charAt(0);
		while(!(yn == 'y' || yn == 'n')) {	
			System.out.println("y �Ǵ� n�� �Է��ϼ���.");
			System.out.print("����Ͻðڽ��ϱ�?(y/n) >> ");
			yn = scan.next().charAt(0);
		}
		return yn;
	}

	public static void printInfo() {
		//����� ���̸� �Է¹޾Ƽ� ����ϴ� ���α׷�
		//�� ��Ʈ�� ������ �ٽ� �ϰڽ��ϱ�?  y OR n���Է¹޵����Ѵ�.
		
		String name = null;
		int age = 0;
		
		System.out.print("������ �Է� �ϼ��� >> ");
		name = scan.next();
		System.out.print("���̸� �Է� �ϼ��� >> ");
		age = scan.nextInt();
		System.out.printf("%s���� %d�� �Դϴ�.\n", name, age);
	}
}
