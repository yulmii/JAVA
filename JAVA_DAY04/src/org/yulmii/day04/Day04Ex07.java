package org.yulmii.day04;

import java.util.Scanner;

public class Day04Ex07 {

	public static void main(String[] args) {
		
		/*
		���� �Է� >> ȫ�浿
		���� �Է� >> 24
		��� : ȫ�浿���� 24�� �Դϴ�.
		---------------------------
		��� �Ͻðڽ��ϱ�(y/n) >> y
		���� �Է� >> ��浿
		���� �Է� >> 26
		��� : ��浿���� 26�� �Դϴ�.
		---------------------------
		��� �Ͻðڽ��ϱ�(y/n) >> p
		���: y�Ǵ� n�� �Է� �ϼ���.
		��� �Ͻðڽ��ϱ�(y/n) >> n
		�����ϼ̽��ϴ�. ���� ��ȸ�� ...
		*/
		// ��Ʈ : ���ڿ����� ���� �ϳ��� �����ϴ� ��� str.charAt(0)
		// ��Ʈ2 : ���ڿ��� �񱳴� str.equals("���ڿ�")
		// ���ڿ��� ==�����ڷ� �� �Ұ���. �ݵ�� equals()�޼ҵ�� ���Ѵ�.
		// String str = scan.next();
		// char yn = str.charAt(0);
		
		Scanner scan = new Scanner(System.in);
		char yn = 'y'; 
		
		while(yn == 'y') {
			System.out.print("���� �Է� >> ");
			String name = scan.next();
			System.out.print("���� �Է� >> ");
			int age = scan.nextInt();
			System.out.printf("��� : %s���� %d�� �Դϴ�.\n", name, age);
			System.out.println("--------------------------");
			System.out.print("��� �Ͻðڽ��ϱ�?(y/n) >> ");
			String anser = scan.next();
			yn = anser.charAt(0);
			while (yn != 'y' && yn != 'n') {
				System.out.println("��� : y�Ǵ� n�� �Է��ϼ���. >>");
				//System.out.print("��� �Ͻðڽ��ϱ�?(y/n) >> ");
				anser = scan.next();
				yn = anser.charAt(0);
			}
		}
		System.out.println("�����ϼ̽��ϴ�. ���� ��ȸ��...");
	}
}
