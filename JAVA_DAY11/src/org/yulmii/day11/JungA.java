package org.yulmii.day11;

import java.util.Arrays;

public class JungA {
	public static void main(String[] args) {
        //비정방형배열 만드는 방법
        int by [][] = new int [5][];
        by[0]= new int [5];
        by[1]= new int [3];
        by[2]= new int [1];
        by[3]= new int [3];
        by[4]= new int [5];
        
        //값 넣고 
        int number=1;
        for(int i=0; i<by.length; i++) {
           for(int j=0; j <by[i].length; j++) {
            by[i][j]=number++;     
           }            
        }
        
        //출력방법
        for(int i=0; i<by.length; i++) {
              for(int j=0; j <by[i].length; j++) {
            	  if( i==1&&j==0) {
            		  System.out.print("\t"); 
            	  }
            	  if(i==2) {
            		  System.out.print("\t\t");             		  
            	  }
            	  if(i==3&&j==0) {
            		  System.out.print("\t");             		  
            	  }
                 System.out.print(by[i][j]+"\t");
                 }
                    
              System.out.println();
           }
        System.out.println(Arrays.deepToString(by));
    
        byte vu=127;
        System.out.println(vu);
     }

	
}
