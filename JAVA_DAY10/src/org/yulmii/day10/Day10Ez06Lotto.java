package org.yulmii.day10;

import java.util.Arrays;
import java.util.Random;

public class Day10Ez06Lotto {
	public static final int MAX = 45;
	public static final int SIZE = 6;

	public static void main(String[] args) {
		Random rand = new Random();// 난수 발생기
		int[] lotto = new int[SIZE];
		for (int k = 0; k < 100; k++) {
			for (int i = 0; i < SIZE; i++) {
				int n = rand.nextInt(MAX) + 1;
				lotto[i] = n;
				for (int j = 0; j < i; j++) {
					while (lotto[j] == lotto[i]) {
						n = rand.nextInt(MAX) + 1;
						lotto[i] = n;
						j = 0;
					}
				}
			}
			for (int l = 0; l < SIZE; l++) {
				for (int m = 0; m < l; m++) {
					if (lotto[l] == lotto[m])
						System.out.println("error");
					System.out.println(Arrays.toString(lotto));

				}
			}
		}
	}
}
