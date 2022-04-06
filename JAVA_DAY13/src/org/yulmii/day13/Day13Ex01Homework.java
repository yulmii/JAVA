package org.yulmii.day13;

import java.util.Scanner;

public class Day13Ex01Homework {
	//�迭 �ʵ� ����
	final int MAX = 5;
	String[] name, grade ;
	int[] kor, eng, math, total, rank;
	double[] avg;
	int top;
	Scanner scan;
	
	public Day13Ex01Homework() {
		// 2. Default  ������ : ��� �ʵ� �ʱ�ȭ �� ����
		name = new String[MAX];
		kor = new int[MAX];
		math = new int[MAX];
		eng = new int[MAX];
		total = new int[MAX];
		avg = new double[MAX];
		grade = new String[MAX];
		rank = new int[MAX];
		scan = new Scanner(System.in);
		top = 0;
		//3.��Ʈ�ѷ� �ݺ����� - ��Ʈ�ѷ����� 
		boolean isGo=true;
		while(isGo) {
			isGo= controller();
		}
		//4.false �� �������°�
		System.out.println("�������� ���α׷� �����մϴ�.");
	}
	
	public int menu() {
		int no = 0;
		System.out.println("1)INPUT 2)OUTPUT 3)SEARCH 4)MODIFY 5)DELETE 6)END");
		System.out.print("Choice : ");
		no = scan.nextInt();
		return no;
	}
	public boolean controller() {
		boolean isOk = true;
		int no = menu();
		switch(no) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : 
			System.out.println(":::END:::"); 
			isOk= false;
			break;
		default :
			System.out.println("��� : �׷� �޴��� �����ϴ�.");
		}
		
		return isOk;
	}
	
	public void print(String str) {
		System.out.print(str);
	}
	public void println(String str) {
		System.out.println(str);
	}
	
	public void setRank() {
		for(int i=0;i<top;i++) {			
			rank[i]=1;
			for(int j=0;j<top;j++) {
				if(total[i]<total[j]) {
					rank[i]+=1;
				}
			}
		}
	}
	public void input() {
		System.out.println(":::INPUT:::");
		//top���� �迭�� �����͸� �Է¹޴´�.
		//����,����, ���� ������ �Է¹޾Ƽ� ����,���, ����,����� ���
		//top ����
		//top�� MAX���� ũ�ų� ������ ���̻� �Է� �Ұ���.
		if(top<MAX) {
			println("��� : ");
			print("���� �Է� : ");
			name[top]=scan.nextInt();
			print("���� ���� : ");
			kor[top]=scan.nextInt();
			print("���� ���� : ");
			math[top]=scan.nextInt();
			print("���� ���� : ");
			eng[top]=scan.nextInt();
		
			total[top] = kor[top] + math[top] + eng[top];
			avg[top] = total[top] / 3.0;// �Ҽ��� ù°¥�������� ���?
			if (avg[top] > 95) {
				grade[top] = "A+";
			} else if (avg[top] > 90) {
				grade[top] = "A";
			} else if (avg[top] > 85) {
				grade[top] = "B+";
			} else if (avg[top] > 80) {
				grade[top] = "B";
			} else if (avg[top] > 75) {
				grade[top] = "C+";
			} else if (avg[top] > 70) {
				grade[top] = "C";
			} else if (avg[top] > 65) {
				grade[top] = "D+";
			} else if (avg[top] > 60) {
				grade[top] = "D";
			} else {
				grade[top] = "F";
			}
			int cnt = 0;
		      while(cnt < top) {
		          rank[cnt] = 1;
		          for(int j=0; j < top; j++) {
		            if(total[cnt] < total[j]) {
		                rank[cnt] += 1;
		                }
		            }
		            cnt++;
		        }
		      
			top++;
		}
	}
	
	public void output() {
		 System.out.println(":::OUTPUT:::");
	}
	
	public void search() {
		System.out.println(":::SEARCH:::");
	}
	
	public void modify() {
		System.out.println(":::MODIFY:::"); 
		if
	}
	
	public void delete() {
		 System.out.println(":::DELETE:::");
	}
	
	public static void main(String[] args) {
		new Day13Ex01Homework();
	}
}
