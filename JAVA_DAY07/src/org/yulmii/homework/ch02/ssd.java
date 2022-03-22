package org.yulmii.homework.ch02;

public class ssd {
	public static void main(String[] args) {
	      // 1+2-3+4-5+6-7+8-9+10=7
	      int sum=2;
	      int i= 1;
	      while(i<=10) {
	         System.out.print(i);
	         if(i%2!=0) {
	            sum -= i;
	            System.out.print("+");
	         } else {
	            sum += i;
	            System.out.print((i==10)?"=":"-");
	         }i++;
	      } // end of for
	      System.out.println(sum);
	   }
}
