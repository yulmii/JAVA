package org.yulmii;

import java.util.Scanner;

public class CircleArea {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//���� �Է� �޾Ƽ� �������ͷ� ����ϴ� ���α׷�
		//1���� �� 3.30579m^2
		final double ���� = 3.30579;
		double �������� = 0;
		double �� = 0;
		double ����� = 0;
		double �������ͷ� = 0;
		
		System.out.println("��� �Է� : ");
		�� = scan.nextDouble();
		�������ͷ� = �� * ����;
		String msg01 = String.format("���� %f�� ���� %f���������Դϴ�.\n", ��, �������ͷ�);
		System.out.println(msg01);
		
		// �������͸� �Է¹޾Ƽ� ���� ����ϴ� ���α׷�
		System.out.println("�������� �Է� : ");
		�������� =scan.nextDouble();
		����� = �������� / ����;
		String msg02 = String.format("�������Ͱ� %f�� ���� %f���Դϴ�.\n", ��������, �����);
		System.out.println(msg02);
	}
		
	
	public static void ex01(String[] args) {
		
		// ��� PI ���� -	Math.PI�ε� ����
		final double PI = 3.141592;
		double r = 10;
		double circleArea = 0;
		
		//Ű����� �������� �Է¹޾Ƽ� ��� �ϱ�
		System.out.print("������ �Է�: ");
		r= scan.nextDouble();
		
		//�����ϱ� - �������� �̿��ؼ� ������ ���Ѵ�.
		//�װ� ������ ���̿��� ������ ��� �ȴ�.
		//�������� ���� ����
		circleArea = r * r * PI;
		
		//��� ���
		//System.out.println("�������� " +r+"�� ���� ������ ");
		//System.out.println(circleArea + "�Դϴ�.");
		//pintln()��� printf()�� ��� (print format ���)
		//System.out.printf("�������� %.1f�� ���� ���̴� %.4f�Դϴ�.\n", r, circleArea);
		String msg = String.format("�������� %.1f�� ���� ���̴� %.4f�Դϴ�.\n", r, circleArea);
		System.out.println(msg);
	}

}
