package org.yulmii.day04;

public class Day04Ex03 {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		//���� ������ ���
		a += 3; // a = a + 3; ---> a�� 6�̵ȴ�.
		// ���� ���� ����
		b *= 3; // b == 9
		c %= 2; // c == 1
		
		int d=3;
		// ���� ������ ���
		a = d++; //�������� - ���� ���� ����� ����Ѵ�. a=3 ---> d=4
		System.out.printf("a=%d, d=%d\n",a,d);
		// %f, %s, %d, %i, %o, %x ... ��ȯ���ڿ�, ��ȯ����
		// %-10d, %-10.2f
		a = ++d; // a==5, d==5
		System.out.printf("a=%d, d=%d\n",a,d);
		a = d--; // a==5, d==4
		System.out.printf("a=%d, d=%d\n",a,d);
		a = --d; // a==3, d==3
		System.out.printf("a=%d, d=%d\n",a,d);
	}
	
}