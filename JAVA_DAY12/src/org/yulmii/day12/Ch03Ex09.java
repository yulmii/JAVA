package org.yulmii.day12;

public class Ch03Ex09 {

   
   public Ch03Ex09() {
      //ex09();
	   Ch03Ex09_02();
	   }
   
   public void ex09() {
      int[][] arr = new int[4][4];
      // 1~10 ������ ������ ���ڸ� arr�迭�� ������� �����Ѵ�.
      for(int i = 0; i<arr.length; i++) {
         for(int j = 0; j<arr[i].length; j++) {
            arr[i][j]= (int)(Math.random()*10+1);
         
         }
         
      }
      // arr�迭�� ������ ����Ѵ�.
      for(int i = 0; i<arr.length; i++) {
         for(int j =0; j<arr[i].length; j++) {
            System.out.print(arr[i][j]+"\t");
         }
         System.out.println();
      }
   }
   
   public static void Ch03Ex09_02() {
	   int[][] arr = new int[4][4];
	  int row,col;
	   
	   for(int cnt =0 ;cnt<16;cnt++) {
		   col= (int)(Math.random()*4);
		   row= (int)(Math.random()*4);
		   while(arr[row][col]!=0) {
			   col= (int)(Math.random()*4);
			   row= (int)(Math.random()*4);
		   }                         
			   arr[row][col]=cnt%8+1;
	   }
	   
	   for(int i = 0; i<arr.length; i++) {
	         for(int j =0; j<arr[i].length; j++) {
	            System.out.print(arr[i][j]+"\t");
	         }
	         System.out.println();
	      }
   
   }
   public static void main(String[] args) {
      new Ch03Ex09();

   }

}