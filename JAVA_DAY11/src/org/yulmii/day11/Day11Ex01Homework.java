package org.yulmii.day11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Day11Ex01Homework {
	public static final Random rand = new Random();
	public static final Scanner scan = new Scanner(System.in);
	public static final int SIZE = 6;
	public static final int MAX = 45;

	public Day11Ex01Homework() {
		System.out.print("선택 >> ");
		switch (scan.nextInt()) {
		case 1 : lotto01(); break;
		case 2 : lotto02(); break;
		case 3 : lotto03(); break;
		
		}

	}
	
	public void lotto03() {
		//공을 뽑아 0으로 제외시키는 방법
		//공배열 만들기
		int[] ball = new int[MAX];
		for(int i=0, num=1; i<MAX;i++) {
			ball[i]=num++;
		}
		int[] lotto = new int[SIZE];
		int cnt=0;
		while(cnt<SIZE) {
			int index= rand.nextInt(MAX);
			if(ball[index]!=0) {
				lotto[cnt] = ball[index];
				ball[index]=0;//공 뽑은거 0으로 제외
				cnt++;
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.toString(ball));
		
	}
	public void lotto02() {
		int[] lotto = new int[SIZE];
		int cnt=0;
		while(cnt<SIZE) {
			int number = 1 + rand.nextInt(MAX);
			//새로 생성된 number가 기존 lotto 배열에 같은값이 있나?
			boolean flag = true;
			for(int i = 0; i<cnt ; i++) {
				if(lotto[i]==number) {
					flag = false;
					break;
				}
			}
			if(flag) {
				lotto[cnt]=number;
				cnt++;
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	

	public void lotto01() {
		Integer[] lotto = new Integer[SIZE];
		// 1. 여섯번 반복해서 난수흫 발생시킨다.
		// 2. 발생된 난수를 배열 1otto에 순서대로 저장한다.
		// 3. 발생 시긴 난수가 이미 lotto에 저장된 값과 같은 값이면 다시 생성.(2중 반보)
		// 4. 다시 생성한 난수를 lotto에 저장된 값들을 다시 비교한다.(index초기화)
		for (int cnt = 0; cnt < SIZE; cnt++) {
			int number = 1 + rand.nextInt(MAX);
			lotto[cnt] = number;
			for (int i = 0; i < cnt; i++) {
				if (lotto[cnt] == lotto[i]) {
					number = 1 + rand.nextInt(MAX);
					lotto[cnt] = number;
					i = -1;// i++때문에
				}
			}
		}
		Arrays.sort(lotto, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				} else if (o2 > o1) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		// Arrays.sort(lotto);
		System.out.print(Arrays.toString(lotto));
	}

	public static void main(String[] args) {
		new Day11Ex01Homework();
	}
}
