package org.yulmii.day12.homework;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreManage {
	Scanner scan;
	String[][] program;
	String[] name;
	int[] kScore;
	int[] mScore;
	int[] eScore;
	int[] total;
	double[] avg;
	String[] grade;
	int[] rank;
	int row;
	
	
	
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
	public ScoreManage() {
		scan = new Scanner(System.in);
		program = new String[100][8];
		name = new String[100];
		kScore = new int[100];
		mScore = new int[100];
		eScore = new int[100];
		total = new int[100];
		avg = new double[100];
		grade = new String[100];
		rank = new int[100];
		row = 1;
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
			menu();
			break;
		default:
			menu();
		}
	}

	

	public void Input() {
		System.out.print("성명 : ");
		name[row] = scan.next();
//		program[row][0] = String.valueOf(name[row]);
		System.out.print("국어 점수 : ");
		kScore[row] = scan.nextInt();
//		program[row][1] = String.valueOf(kScore[row]);
		System.out.print("수학 점수 : ");
		mScore[row] = scan.nextInt();
//		program[row][2] = String.valueOf(mScore[row]);
		System.out.print("영어 점수 : ");
		eScore[row] = scan.nextInt();
//		program[row][3] = String.valueOf(eScore[row]);
//		program[row][4] = String.valueOf(total[row]);
//		program[row][5] = String.valueOf(avg[row]);

//		program[row][6] = grade[row];
		row++;

	}

	public void Output() {
		function.program();

		for (int i = 0; i < program.length; i++) {
			for (int j = 0; j < program[i].length; j++) {
				if (program[i][j] != null) {
					System.out.print(program[i][j] + "\t");
				}
			}
			if (program[i][0] != null) {
				System.out.println();
			}
		}
	}

	public void Search() {
		System.out.print("찾으실 성명 : ");
		String findName = scan.next();
		Search1(findName);
	}

	public int Search1(String findName) {
		function.program();
		for (int i = 1; i < row; i++) {
			if (name[i].equals(findName)) {
				for (int k = 0; k < program[0].length; k++) {
					System.out.print(program[0][k] + "\t");
				}
			}
		}
		System.out.println();
		int findRow = 100;
		for (int i = 1; i < row; i++) {
			while (name[i].equals(findName)) {
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
//		program[a][1] = String.valueOf(kScore[a]);
		System.out.print("변경할 수학 점수 : ");
		mScore[a] = scan.nextInt();
//		program[a][2] = String.valueOf(mScore[a]);
		System.out.print("변경할 영어 점수 : ");
		eScore[a] = scan.nextInt();
		program();
//		program[a][3] = String.valueOf(eScore[a]);
//		total[a] = kScore[a] + mScore[a] + eScore[a];
//		program[a][4] = String.valueOf(total[a]);
//		avg[a] = total[a] / 3;// 소수점 첫째짜리까지만 어떻게?
//		program[a][5] = String.valueOf(avg[a]);
//		if (avg[a] > 95) {
//			grade[a] = "A+";
//		} else if (avg[a] > 90) {
//			grade[a] = "A";
//		} else if (avg[a] > 85) {
//			grade[a] = "B+";
//		} else if (avg[a] > 80) {
//			grade[a] = "B";
//		} else if (avg[a] > 75) {
//			grade[a] = "C+";
//		} else if (avg[a] > 70) {
//			grade[a] = "C";
//		} else if (avg[a] > 65) {
//			grade[a] = "D+";
//		} else if (avg[a] > 60) {
//			grade[a] = "D";
//		} else {
//			grade[a] = "F";
//		}
//
//		program[a][6] = grade[a];

	}

	public void Delete() {
		int a = Search();
		while (a == 100) {
			a = Search();
		}
		for (int i = 0; i < program[a].length; i++) {
			program[a][i] = null;
		}
		/*
		 * for(int j=row; j>a+1; j--) { for(int k = 0; program[j].length;k++) {
		 * program[j][k]= }
		 * 
		 * } row--;
		 */
	}

	public void End() {
		System.out.println(Arrays.deepToString(program));
		System.out.println("성적 관리 프로그램을 종료합니다.");
	}

	public static void main(String[] args) {

		System.out.println("----- 성적 관리 프로그램 -----");
		new ScoreManage();

	}
}
