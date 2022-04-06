package org.yulmii.day13;

import java.util.Scanner;

public class Day13Ex01Homework {
	//배열 필드 선언
	final int MAX = 5;
	String[] name, grade ;
	int[] kor, eng, math, total, rank;
	double[] avg;
	int top;
	Scanner scan;
	
	public Day13Ex01Homework() {
		// 2. Default  생성자 : 멤버 필드 초기화 및 실행
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
		//3.콘트롤러 반복실행 - 콘트롤러에서 
		boolean isGo=true;
		while(isGo) {
			isGo= controller();
		}
		//4.false 때 보여지는것
		System.out.println("성적관리 프로그램 종료합니다.");
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
			System.out.println("경고 : 그런 메뉴는 없습니다.");
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
		//top번지 배열에 데이터를 입력받는다.
		//국어,영어, 수학 정수를 입력받아서 총점,평균, 학점,등수를 계산
		//top 증가
		//top이 MAX보다 크거나 같으면 더이상 입력 불가능.
		if(top<MAX) {
			println("경고 : ");
			print("성명 입력 : ");
			name[top]=scan.nextInt();
			print("국어 점수 : ");
			kor[top]=scan.nextInt();
			print("국어 점수 : ");
			math[top]=scan.nextInt();
			print("국어 점수 : ");
			eng[top]=scan.nextInt();
		
			total[top] = kor[top] + math[top] + eng[top];
			avg[top] = total[top] / 3.0;// 소수점 첫째짜리까지만 어떻게?
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
