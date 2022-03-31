package org.yulmii.day12;

import java.util.Scanner;

public class WeekendHomework2 {
	
	Scanner scan = new Scanner(System.in);
	public final int SIZE=100;
	int row = 1;
	String[][] program = new String[SIZE][8];
	String[] name = new String[SIZE];
	int[] kScore = new int[SIZE];
	int[] mScore = new int[SIZE];
	int[] eScore = new int[SIZE];
	int[] total = new int[SIZE];
	double[] avg = new double[SIZE];
	String[] grade = new String[SIZE];
	int[] rank = new int[SIZE];

	// 주말 과제2 : 성적 출력 프로그램 만들기
	/*
	 * ----- 성적 관리 프로그램 ----- 1)Input 2)Output 3)Search 4)Modify 5)Delete 6)End
	 * Choice : 1 성명 : 홍길동 국어점수 : 80 영어점수 : 80 수학점수 : 80 --- 입력 완료 --- 1)Input
	 * 2)Output 3)Search 4)Modify 5)Delete 6)End Choice : 2 성명 국어 영어 수학 총점 평균 학점 등수
	 * 홍길동 80 80 80 240 80.0 B 1 ---- 출력 완료 --- 1)Input 2)Output 3)Search 4)Modify
	 * 5)Delete 6)End Choice : 1 성명 : 김길동 국어점수 : 80 영어점수 : 80 수학점수 : 80 --- 입력 완료
	 * ---
	 * 
	 * Choice : 3 검색 할 이름 : 홍길동 성명 국어 영어 수학 총점 평균 학점 등수 홍길동 80 80 80 240 80.0 B 1
	 * ---- 출력 완료 ---
	 */
	public WeekendHomework2() {
		program[0][0] = "성명";
		program[0][1] = "국어";
		program[0][2] = "수학";
		program[0][3] = "영어";
		program[0][4] = "총점";
		program[0][5] = "평균";
		program[0][6] = "학점";
		program[0][7] = "등수";
		menu();
	}

	public void menu() {

		System.out.println("1)Input 2)Output 3)Search 4)Modify 5)Delete 6)End");
		System.out.print("Choice : ");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			Input();
			System.out.println("--- 입력 완료 ---");
			menu();
			break;
		case 2:
			Output();
			System.out.println("--- 출력 완료 ---");
			menu();
			break;
		case 3:
			Search();
			System.out.println("--- 검색 완료 ---");
			menu();
			break;
		case 4:
			Modify();
			System.out.println("--- 수정 완료 ---");
			menu();
			break;
		case 5:
			Delete();
			System.out.println("--- 삭제 완료 ---");
			menu();
			break;
		case 6:
			End();
			break;
		default:
			System.out.println("잘못 입력");
			menu();
		}
	}

	public void program() {
		for (int i = 1; i < row; i++) {
			total[i] = kScore[i] + mScore[i] + eScore[i];
			avg[i] = total[i] / 3;// 소수점 첫째짜리까지만 어떻게?
			if (avg[i] > 95) {
				grade[i] = "A+";
			} else if (avg[i] > 90) {
				grade[i] = "A";
			} else if (avg[i] > 85) {
				grade[i] = "B+";
			} else if (avg[i] > 80) {
				grade[i] = "B";
			} else if (avg[i] > 75) {
				grade[i] = "C+";
			} else if (avg[i] > 70) {
				grade[i] = "C";
			} else if (avg[i] > 65) {
				grade[i] = "D+";
			} else if (avg[i] > 60) {
				grade[i] = "D";
			} else {
				grade[i] = "F";
			}
			int cnt = 0;
		      while(cnt < row) {
		          rank[cnt] = 1;
		          for(int j=0; j < row; j++) {
		            if(total[cnt] < total[j]) {
		                rank[cnt] += 1;
		                }
		            }
		            cnt++;
		        }
			
		}
		for (int i = 1; i < row; i++) {
			program[i][0] = name[i];
			program[i][1] = String.valueOf(kScore[i]);
			program[i][2] = String.valueOf(mScore[i]);
			program[i][3] = String.valueOf(eScore[i]);
			program[i][4] = String.valueOf(total[i]);
			program[i][5] = String.valueOf(avg[i]);
			program[i][6] = grade[i];
			program[i][7] = String.valueOf(rank[i]);
		}
	}

	public void Input() {
		System.out.print("성명 : ");
		name[row] = scan.next();
		System.out.print("국어 점수 : ");
		kScore[row] = scan.nextInt();
		System.out.print("수학 점수 : ");
		mScore[row] = scan.nextInt();
		System.out.print("영어 점수 : ");
		eScore[row] = scan.nextInt();
		row++;
		program();
	}

	public void Output() {
		for(int i = 0 ; i<program[0].length; i++) {
			System.out.print(program[0][i]+"\t");
		}
		System.out.println();
		for (int i = 1; i < program.length; i++) {
			for (int j = 0; j < program[i].length; j++) {
				if (name[i] != null) {
					System.out.print(program[i][j] + "\t");
				}
			}
			if (name[i] != null) {
				System.out.println();
			}
		}
	}

	public void Search() {
		System.out.print("찾으실 성명 : ");
		String findName = scan.next();
		int a = Search1(findName);
		while (a == 100) {
			System.out.println("찾으실 성명 : ");
			findName = scan.next();
			a = Search1(findName);
		}
	}

	public int Search1(String findName) {

		for (int i = 1; i < row; i++) {
			if (name[i].equals(findName)) {
				for (int k = 0; k < program[0].length; k++) {
					System.out.print(program[0][k] + "\t");
				}
			}
		}
		System.out.println();
		int findRow = 100;
//		for(int j=0 ; j<program[0].length;j++) {
//			System.out.print(program[0][j]+"\t");
//		}
//		System.out.println();
//		
		for (int i = 1; i < row; i++) {
			if (name[i].equals(findName)) {
				findRow = i;
				for (int j = 0; j < program[findRow].length; j++) {
					System.out.print(program[findRow][j] + "\t");
				}
				System.out.println();
			}
	
		}
		if (findRow == 100) {
			System.out.println("그런 사람 없습니다.");
		}

		return findRow;
	}

	public void Modify() {
		System.out.println("수정할 성명 : ");
		String findName = scan.next();
		int a = Search1(findName);
		while (a == 100) {
			System.out.println("수정할 성명 : ");
			findName = scan.next();
			a = Search1(findName);
		}
		System.out.printf("현재 %s님의 국어점수는 %d 수학점수는 %d 영어점수는 %d 입니다.\n", name[a], kScore[a], mScore[a], eScore[a]);
		System.out.print("변경할 국어 점수 : ");
		kScore[a] = scan.nextInt();
		System.out.print("변경할 수학 점수 : ");
		mScore[a] = scan.nextInt();
		System.out.print("변경할 영어 점수 : ");
		eScore[a] = scan.nextInt();
		program();
	}

	public void Delete() {

		System.out.print("삭제할 성명 : ");
		String findName = scan.next();

		int a = Search1(findName);
		while (a == 100) {
			System.out.print("삭제할 성명 : ");
			findName = scan.next();
			a = Search1(findName);
		}
		/*name[a]=null;
		kScore[a]=0;
		mScore[a]=0;
		eScore[a]=0;
		*/
		for (int i = a; i <= row+1; i++) {
			name[i] = name[i + 1];
			kScore[i] = kScore[i + 1];
			mScore[i] = mScore[i + 1];
			eScore[i] = mScore[i + 1];
			
			/*
			total[i] = total[i + 1];
			avg[i] = avg[i + 1];
			grade[i] = grade[i + 1];
			rank[i] = rank[i + 1];
			*/
		}
		row--;
		program();

	}

	public void End() {
		System.out.println("성적 관리 프로그램을 종료합니다.");
	}

	public static void main(String[] args) {

		System.out.println("----- 성적 관리 프로그램 -----");
		new WeekendHomework2();

	}
}
