package org.yulmii.day10;

import java.util.Arrays;
import java.util.Random;

public class 정아님lotto {
	public static final int MAX = 6;
	public static final int SIZE = 6;

	public static void main(String[] args) {
		// 로또
		Random rand = new Random(); // 난수 발생기
		int lotto[] = new int[SIZE];

		int n = rand.nextInt(MAX) + 1;
		for (int l = 0; l < 100; l++) {
			for (int i = 0; i < SIZE; i++) {

				lotto[i] = rand.nextInt(MAX) + 1;

				for (int k = 0; k < i; k++) {

					if (lotto[i] == lotto[k]) {

						i--;
						break;
					}
				}

			}

			for (int p = 0; p < SIZE; p++) {
				for (int m = 0; m < l; m++) {
					if (lotto[l] == lotto[m])
						System.out.println("error");
					System.out.println(Arrays.toString(lotto));

				}
			}
		}
	}

}
