package org.yulmii;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		String city = scan.next();
		System.out.println("��°��� " + city + "�Դϴ�.");
		
		System.out.print("�̸��Է� : ");
		String name = scan.next();
		System.out.println("�̸��� " + name + "�Դϴ�.");
		
		System.out.print("�����Է� : ");
		int age = scan.nextInt();
		System.out.println("���̴�" + age + "�Դϴ�.");
		
		System.out.print("ü���Է� : ");
		double weight = scan.nextDouble();
		System.out.println("ü���� " + weight + "Kg �Դϴ�.");
		
		System.out.print("���ſ����Է� : ");
		boolean single = scan.nextBoolean();
		System.out.println("���ſ��δ� " + single + "�Դϴ�.");
				
		// scan�� �ݾ� �ش�.
		scan.close();
		
		
	}
}
