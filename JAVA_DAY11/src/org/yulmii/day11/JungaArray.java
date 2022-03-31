package org.yulmii.day11;

import java.util.Arrays;

public class JungaArray {

	public static void main(String[] args) {
		
		      int by [][] = new int [9][];
		      by[0]= new int [5];
		      by[1]= new int [4];
		      by[2]= new int [3];
		      by[3]= new int [2];
		      by[4]= new int [1];
		      by[5]= new int [2];
		      by[6]= new int [3];
		      by[7]= new int [4];
		      by[8]= new int [5];
		      int number=1;
		      for(int i=0; i<by.length; i++) {
		         for(int j=0; j <by[i].length; j++) {
		          by[i][j]=number++;     
		         }		      
		      }
		      
		      for(int i=0; i<by.length; i++) {
			         for(int j=0; j <by[i].length; j++) {
			        	 System.out.print(by[i][j]+"\t");
			         }		      
			         System.out.println();
			      }
		      System.out.println(Arrays.deepToString(by));
		      
		   }

}
