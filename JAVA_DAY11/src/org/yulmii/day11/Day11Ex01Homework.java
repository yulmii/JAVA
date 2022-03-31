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
		System.out.print("���� >> ");
		switch (scan.nextInt()) {
		case 1 : lotto01(); break;
		case 2 : lotto02(); break;
		case 3 : lotto03(); break;
		
		}

	}
	
	public void lotto03() {
		//���� �̾� 0���� ���ܽ�Ű�� ���
		//���迭 �����
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
				ball[index]=0;//�� ������ 0���� ����
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
			//���� ������ number�� ���� lotto �迭�� �������� �ֳ�?
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
		// 1. ������ �ݺ��ؼ� ����ň �߻���Ų��.
		// 2. �߻��� ������ �迭 1otto�� ������� �����Ѵ�.
		// 3. �߻� �ñ� ������ �̹� lotto�� ����� ���� ���� ���̸� �ٽ� ����.(2�� �ݺ�)
		// 4. �ٽ� ������ ������ lotto�� ����� ������ �ٽ� ���Ѵ�.(index�ʱ�ȭ)
		for (int cnt = 0; cnt < SIZE; cnt++) {
			int number = 1 + rand.nextInt(MAX);
			lotto[cnt] = number;
			for (int i = 0; i < cnt; i++) {
				if (lotto[cnt] == lotto[i]) {
					number = 1 + rand.nextInt(MAX);
					lotto[cnt] = number;
					i = -1;// i++������
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
