package org.yulmii.homework.ch02;

public class Ch03¿¹1 {
	public static void main(String[] args) {
		int i, sum;
		i = 1;
		System.out.print(i + "+");
		for (i = 2, sum = 1; i <= 10; i++) {
			if (i == 10) {
				sum += i;
				System.out.print(i + "=" + sum);
			} else if (i % 2 == 1) {
				sum -= i;
				System.out.print(i + "+");
			} else {
				sum += i;
				System.out.print(i + "-");
			}
		}
	}
}
