package org.yulmii.day11;

public class kmin {
	int[][] arr = new int[5][5];
	public kmin() {
		// TODO Auto-generated constructor stub
		//ex01();
		ex02();
	
	}
	public void ex01() {
		
		int number=1;
		for(int i = 0; i < 3; i++) {
	         for(int j = 0; j < i; j++) {
	        	 arr[i][j]=0;	            
	         }
	         for(int j = i; j < 5-(2*i); j++) {
	        	 arr[i][j]=number++;
	         }
	         
		}
		for(int i = 0; i < 2; i++) {
	         for(int j = 0; j < 1-i; j++) {
	        	 arr[i][j]=0;
	            
	         }
	         for(int j = 4; j < (i+2)*2-1; j++) {
	            arr[i][j]=number++;
	         }
	      }
		printArr();
	}
	public void ex02() {
		for(int i = 0; i < 3; i++) {//i=1ÀÏ´ë
	         for(int j = 0; j < i; j++) { //j=0
	            System.out.print(" " + "\t");
	         }
	         for(int j = 0; j < 5-(2*i); j++) {//j=0???
	            System.out.print("*" + "\t");
	         }
	         System.out.println();
		}
		for(int i = 0; i < 2; i++) {
	         for(int j = 0; j < 1-i; j++) {
	            System.out.print(" " + "\t");
	         }
	         for(int j = 0; j < (i+2)*2-1; j++) {
	            System.out.print("*" + "\t");
	         }
	         System.out.println();
	      }
	}
	
	public void printArr() {
	      for (int i = 0; i < arr.length; i++) {
	         for (int j = 0; j < arr[i].length; j++) {
	            System.out.print(arr[i][j]!=0 ? arr[i][j] + "\t" : "\t");
	         }
	         System.out.println();
	      }
	   }
	public static void main(String[] args) {
		new kmin();
	}
}
