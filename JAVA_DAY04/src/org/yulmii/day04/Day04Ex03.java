package org.yulmii.day04;

public class Day04Ex03 {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		//대입 연산자 사례
		a += 3; // a = a + 3; ---> a는 6이된다.
		// 복합 대입 연산
		b *= 3; // b == 9
		c %= 2; // c == 1
		
		int d=3;
		// 증감 연산자 사례
		a = d++; //후위연산 - 먼저 값을 사용후 계산한다. a=3 ---> d=4
		System.out.printf("a=%d, d=%d\n",a,d);
		// %f, %s, %d, %i, %o, %x ... 변환문자열, 변환서식
		// %-10d, %-10.2f
		a = ++d; // a==5, d==5
		System.out.printf("a=%d, d=%d\n",a,d);
		a = d--; // a==5, d==4
		System.out.printf("a=%d, d=%d\n",a,d);
		a = --d; // a==3, d==3
		System.out.printf("a=%d, d=%d\n",a,d);
	}
	
}