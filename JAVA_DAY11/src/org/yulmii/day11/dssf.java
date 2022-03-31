package org.yulmii.day11;

import java.util.Arrays;

public class dssf {

	public static void main(String[] args) {
		int[][] num= new int[5][5];
		int number=1;
		for(int k=0; k<num.length;k++) {
			for(int l=0; l<num[k].length;l++) {
				num[k][l]=number++;
			}
		}
		
		for(int k=0; k<num.length;k++) {
			for(int l=0; l<num[k].length;l++) {
				System.out.print(num[k][l]+"\t");
			}
			System.out.println();
		}
			System.out.println(Arrays.deepToString(num));
		
	}
}
