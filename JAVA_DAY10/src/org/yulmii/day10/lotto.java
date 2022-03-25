package org.yulmii.day10;

import java.util.Arrays;
import java.util.Random;

public class lotto {
	public static final int MAX = 6;
	public static final int SIZE = 6;
	static int gap = 0;

	public static void main(String[] args) {
		Random rand = new Random(); // 난수 발생기
		int[] lotto = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			int n = rand.nextInt(MAX) + 1;
			lotto[i] = n;
			for (int j = 0; j < i; j++) {
				gap = lotto[i] - lotto[j];
				if (gap == 0) {
					int m = rand.nextInt(MAX) + 1;
					lotto[i] = m;
					j=0;
				}
			}
		}
		for (int num : lotto) {
			System.out.print(num + "\t");
		}
		System.out.println();
		System.out.println(Arrays.toString(lotto));

	}

}
