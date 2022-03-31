package org.yulmii.day11;

import java.util.Arrays;

public class Day11Ex03Array2 {
	int[][] arr = new int[5][5];
	
	public Day11Ex03Array2() {
		//Ex03Test01();
		//Ex03Test02();
		//Ex03Test03();
		//Ex03Test04();
		Ex03Test05();
		
	}
	public void Ex03Test05() {
		//	1	2	3	4	5
		//	16	17	18	19	6	
		//	15	24	25	20	7
		//	14	23	22	21	8
		//	13	12	11	10	9
		int number=1;
		int plus=1, minus=-1;
		
		for(int i = 0 ; i>5 ; i++) {
			for(int j = 0 ; j>5;j++) {
				System.out.print(i+","+j+"\t");
					
			}System.out.println();
		}
		
	}
	public void Ex03Test04() {
		//	1	2	3	4	5
		//		6	7	8		
		//			9
		//		10	11	12
		//	13	14	15	16	17
		int number=1;
        for(int i=0 ; i<arr.length ; i++) {
            int c =(i<3)? i : 4-i;
            for(int j= c; j<arr[i].length-c;j++) {
            	arr[i][j]=number++;
            }
        }
        for(int i=0 ; i<arr.length ; i++) {
        	if(i<3) {
        		for(int j=i;j<arr[i].length-i;j++) {
        			arr[i][j]=number++;	
        		}
        	}
        	for(int j= c; j<arr[i].length-c;j++) {
        		arr[i][j]=number++;
        	}
        }
        printArr();
		
	}
	public void Ex03Test03() {
		//	1	2	3	4	5	
		//	10	9	8	7	6	
		//	11	12	13	14	15	
		//	20	19	18	17	16	
		//	21	22	23	24	25	
		System.out.println(Arrays.toString(arr));
		int number=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
//				if(i%2==0) {
//					arr[i][j]=number++;					
//				}else {
//				arr[i][4-j]=number++;
//				}
				int c = i%2==0? j:4-j;
				arr[i][c]=number++;
			}
		}
		printArr();
	}
	
	public void Ex03Test02() {
		//	5	4	3	2	1
		//	10	9	8	7	6
		//	15	14	13	12	11
		//	20	19	18	17	16
		//	25	24	23	22	21
		int number=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][4-j]=number++;
			}
		}
		//출력
		printArr();
	}
	
	public void	Ex03Test01(){
		//	1	2	3	4	5	6
		//	6	7	8	9	10
		//	11	12	13	14	15
		//	16	17	18	19	20
		//	21	22	23	24	24
		
		int number=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=number++;
			}
		}
		//출력
		printArr();
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
		new Day11Ex03Array2();
	}
}
