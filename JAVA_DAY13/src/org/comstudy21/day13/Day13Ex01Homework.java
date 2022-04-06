package org.comstudy21.day13;

import java.io.IOException;
import java.util.Scanner;

public class Day13Ex01Homework {
	// 배열 필드 선언
	final int MAX = 10;
	String[] name, grade;
	int[] kor, eng, mat, total, rank;
	double[] avg;
	int top;
	Scanner scan;

	public Day13Ex01Homework() {
		// 2. Default 생성자 : 멤버 필드 초기화 및 실행
		name = new String[MAX];
		kor = new int[MAX];
		eng = new int[MAX];
		mat = new int[MAX];
		total = new int[MAX];
		avg = new double[MAX];
		grade = new String[MAX];
		rank = new int[MAX];
		scan = new Scanner(System.in);
		top = 0;

		// 테스트용 초기값 설정
		inputData("KIM", 65, 95, 100);
		inputData("LEE", 100, 100, 100);
		inputData("PARK", 85, 95, 100);
		inputData("KANG", 100, 100, 87);

		// 3. 콘트롤러 반복 실행 - 콘트롤러에서 종료를 선택하면 false 반환
		boolean isGo = true;
		while (isGo) {
			isGo = controller();
		}
		// 4. 종료 후 보여지는 문장
		System.out.println("프로그램 종료 - Good bye!");
	}

	public int menu() {
		int no = 0;
		System.out.println("1)INPUT 2)OUTPUT 3)SEARCH 4)MODIFY 5)DELETE 6)END");
		System.out.print("Choice : ");
		no = getNum();
		return no;
	}

	public void print(String str) {
		System.out.print(str);
	}

	public void println(String str) {
		System.out.println(str);
	}

	public int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while ((ch = System.in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num= num*10;
					num = num + ch-48;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입력오류");
		}
		return num;
	}

	public int getIntScore(String message) {
		print(message);
		int score = getNum();
		while (score < 0 || score > 100) {
			print("0~100사이 다시 입력: ");
			score = getNum();
		}
		return score;
	}

	public String mkGrade(double avg) {
		String grade = "F";
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "B";
		} else if (avg >= 60) {
			grade = "B";
		}
		int c = (int) avg % 10;
		if (avg >= 60 && c >= 7 || avg == 100) {
			grade += "+";
		} else if (avg >= 60 && c <= 3) {
			grade += "-";
		}
		return grade;
	}

	public void setRank() {
		for (int i = 0; i < top; i++) {
			rank[i] = 1;
			for (int j = 0; j < top; j++) {
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
	}

	public void calc(int index) {
		// 총점, 평균, 학점, 등수 계산
		total[index] = kor[index] + eng[index] + mat[index];
		avg[index] = total[index] / 3.0;
		grade[index] = mkGrade(avg[index]);
	}

	public void inputData(String n, int k, int e, int m) {
		name[top] = n;
		kor[top] = k;
		eng[top] = e;
		mat[top] = m;
		calc(top);
		// 입력이 끝나면 top을 증가하고
		top++;
		// top 증가 후 등수 계산
		setRank();
	}

	public void input() {
		println("::: INPUT :::");
		// top번지 배열에 데이터를 입력 받는다.
		// 성명, 국어,영어,수학 점수를 입력 받아서 총점,평균,학점,등수를 계산
		// top증가
		// top이 MAX보다 크거나 같으면 더 이상 입력 불가능.
		// 구현 하기 소요시간 15분
		if (top >= MAX) {
			println("경고 : 더 이상 입력 불가능");
			return; // 여기서 함수를 끝낸다. (아랫 부분 실행 안함)
		}
		print("성명입력:");
		String n = scan.next();
		int k = getIntScore("국어점수: ");
		int e = getIntScore("영어점수: ");
		int m = getIntScore("수학점수: ");
		// 2번 이상 사용되기 때문에 함수로 분리했다.
		inputData(n, k, e, m);
		
	}

	public boolean hasData() {
		if (top <= 0) {
			println("경고 : 내용이 없습니다!");
			return false;
		}
		return true;
	}

	public void output() {
		System.out.println("::: OUTPUT :::");
		// 각각 배열의 요소 값을 한 행씩 출력 한다.
		// 소요시간 10분
		// System.out.printf() 활용 한다.
		if (!hasData())
			return;
		System.out.printf("성명\t국어\t영어\t수학\t총점\t평균\t학점\t등수\n");
		for (int i = 0; i < top; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", name[i], kor[i], eng[i], mat[i], total[i], avg[i],
					grade[i], rank[i]);
		}
	}

	int[] searchIndex;
	int searCnt;

	public void search() {
		System.out.println("::: SEARCH :::");
		print("검색 이름 입력 : ");
		findByName();
		if (searCnt == 0) {
			char yn = checkYn("검색 이름 입력 : ");
			if (yn == 'y') {
				findByName();
			}
		}
		println("--- 검색 완료 ---");

		/*
		 * findByName(); char yn = checkYn("변경할 이름 입력 : "); // 2. 수정 idx를 선택한다.
		 * if(yn=='y') { modify1(); // 4. 결과가 있다면 새 정보 입력 // 5. 정보를 갱신한다.
		 * println("--- 수정 완료 ---"); }
		 */
	}

	public void findByName() {
		// 1. 이름으로 검색.
		// 2. 동명 2인 처리?
		// 3. 검색 목록(기존 output()기능 활용.
		// 4. 검색 결과 index를 저장하는 배열을 만든다.
		if (!hasData())
			return;
		searchIndex = new int[top];
		searCnt = 0;
		String sName = scan.next();
		for (int i = 0; i < top; i++) {
			if (name[i].indexOf(sName) != -1) {
				searchIndex[searCnt++] = i;
			}
		}
		if (searCnt == 0) {
			println("검색 결과 없음");
			return;
		}

		System.out.printf("번호\t성명\t국어\t영어\t수학\t총점\t평균\t학점\t등수\n");
		for (int i = 0; i < searCnt; i++) {
			int idx = searchIndex[i];
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", idx, name[idx], kor[idx], eng[idx], mat[idx],
					total[idx], avg[idx], grade[idx], rank[idx]);
		}
	}

	public void modify() {
		System.out.println("::: MODIFY :::");
		// 1. search 한다.
		print("변경할 이름 입력 : ");
		findByName();
		if (searCnt == 0) {
			print("다시 하겠습니까?(y/n)>>");
			char yn = scan.next().charAt(0);
			if(yn=='y') {
				modify();
				return;
				
			} else {
				return;
			}
		}
		
		modify1();
			
		// 4. 결과가 있다면 새 정보 입력
		// 5. 정보를 갱신한다.
		println("--- 수정 완료 ---");
	}

	public char checkYn(String str) {
		char yn = 'y';
		while (searCnt == 0) {
			print("다시 검색하시겠습니까? \n(다시 검색 : 'y' or 'Y' menu : 아무키)\n >> ");
			yn = scan.next().charAt(0);
			if (yn == 'y' || yn == 'Y') {
				println(str);
				findByName();
				yn = 'y';
			} else {
				yn='y';
				return yn;
			}
			break;
		}
		return yn;
	}

	public void modify1() {
		if (searCnt == 1) {
			kor[searchIndex[0]] = getIntScore("변경 국어 점수1: ");
			eng[searchIndex[0]] = getIntScore("변경 영어 점수1: ");
			mat[searchIndex[0]] = getIntScore("변경 수학 점수: ");
			calc(searchIndex[0]);
			setRank();
//			searCnt = MAX + 1;
		} else if (searCnt > 1 /*&& searCnt != MAX + 1*/) {
			print("수정 내용의 번호 입력: ");
			int mIdx = getNum();
			// 3. 입력한 idx가 search결과에 있는지 확인한다.
			boolean flag = false;
			for (int i = 0; i < searCnt; i++) {
				if (searchIndex[i] == mIdx) {
					flag = true;
				}
			}
			if (flag) {
				kor[mIdx] = getIntScore("변경 국어 점수: ");
				eng[mIdx] = getIntScore("변경 영어 점수: ");
				mat[mIdx] = getIntScore("변경 수학 점수: ");
				calc(mIdx);
				setRank();
			} else {
				println("잘못입력 다시 입력하셈");
				modify1();
			}
		}
	}

	public void delete() {
		System.out.println("::: DELETE :::");
		print("삭제할 이름 입력 : ");
		findByName();
		if (searCnt == 0) {
			char yn = checkYn("삭제할 이름 입력 : ");
			if (yn == 'y') {
				delete();
				return;
			}
		}else {
			delete1();
			return;
		}
		
		println("--- 삭제 완료 ---");

		/*
		 * print("변경할 이름 입력 : "); findByName(); char yn = checkYn("변경할 이름 입력 : "); // 2.
		 * 수정 idx를 선택한다. if(yn=='y') { modify1(); // 4. 결과가 있다면 새 정보 입력 // 5. 정보를 갱신한다.
		 * println("--- 수정 완료 ---"); }
		 */
	}

	public void delete1() {
		if (searCnt == 1) {
			for (int i = searchIndex[0]; i < top; i++) {
				name[i] = name[i + 1];
				kor[i] = kor[i + 1];
				eng[i] = eng[i + 1];
				mat[i] = mat[i + 1];
				calc(i);
			}
			top--;
			setRank();
			searCnt = MAX + 1;
		} else if (searCnt > 1 && searCnt != MAX + 1) {
			print("삭제 내용의 번호 입력: ");
			int dIdx = getNum();
			// 3. 입력한 idx가 search결과에 있는지 확인한다.
			boolean flag = false;
			for (int i = 0; i < searCnt; i++) {
				if (searchIndex[i] == dIdx) {
					flag = true;
				}
			}
			if (flag) {
				for (int i = dIdx; i < top - 1; i++) {
					kor[dIdx] = kor[dIdx + 1];
					kor[dIdx] = kor[dIdx + 1];
					kor[dIdx] = kor[dIdx + 1];
					kor[dIdx] = kor[dIdx + 1];
					calc(dIdx);
				}
				top--;
				setRank();
			} else {
				println("잘못입력 다시 입력하셈");
				delete1();
			}
		}
	}

	public boolean controller() {
		boolean isOk = true;
		int no = menu();
		switch (no) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			search();
			break;
		case 4:
			modify();
			break;
		case 5:
			delete();
			break;
		case 6:
			System.out.println("::: END :::");
			isOk=false;
			//System.exit(0);//강제종료
			break;
		default:
			System.out.println("경고: 해당 메뉴가 없다.");
		}

		return isOk;
	}

	public static void main(String[] args) {
		// 1. 시작: 생성자를 이용한 객체 생성
		new Day13Ex01Homework();
	}
}