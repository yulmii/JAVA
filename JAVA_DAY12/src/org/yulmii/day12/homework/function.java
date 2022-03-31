package org.yulmii.day12.homework;



public class function {
	public function() {
		// TODO Auto-generated constructor stub
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
	public static void main(String[] args) {
		new function();
	}
}
