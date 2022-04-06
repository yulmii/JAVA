package org.comstudy21.day13;

import java.io.IOException;
import java.util.Scanner;

public class Day13Ex01Homework {
	// �迭 �ʵ� ����
	final int MAX = 10;
	String[] name, grade;
	int[] kor, eng, mat, total, rank;
	double[] avg;
	int top;
	Scanner scan;

	public Day13Ex01Homework() {
		// 2. Default ������ : ��� �ʵ� �ʱ�ȭ �� ����
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

		// �׽�Ʈ�� �ʱⰪ ����
		inputData("KIM", 65, 95, 100);
		inputData("LEE", 100, 100, 100);
		inputData("PARK", 85, 95, 100);
		inputData("KANG", 100, 100, 87);

		// 3. ��Ʈ�ѷ� �ݺ� ���� - ��Ʈ�ѷ����� ���Ḧ �����ϸ� false ��ȯ
		boolean isGo = true;
		while (isGo) {
			isGo = controller();
		}
		// 4. ���� �� �������� ����
		System.out.println("���α׷� ���� - Good bye!");
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
			System.out.println("�Է¿���");
		}
		return num;
	}

	public int getIntScore(String message) {
		print(message);
		int score = getNum();
		while (score < 0 || score > 100) {
			print("0~100���� �ٽ� �Է�: ");
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
		// ����, ���, ����, ��� ���
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
		// �Է��� ������ top�� �����ϰ�
		top++;
		// top ���� �� ��� ���
		setRank();
	}

	public void input() {
		println("::: INPUT :::");
		// top���� �迭�� �����͸� �Է� �޴´�.
		// ����, ����,����,���� ������ �Է� �޾Ƽ� ����,���,����,����� ���
		// top����
		// top�� MAX���� ũ�ų� ������ �� �̻� �Է� �Ұ���.
		// ���� �ϱ� �ҿ�ð� 15��
		if (top >= MAX) {
			println("��� : �� �̻� �Է� �Ұ���");
			return; // ���⼭ �Լ��� ������. (�Ʒ� �κ� ���� ����)
		}
		print("�����Է�:");
		String n = scan.next();
		int k = getIntScore("��������: ");
		int e = getIntScore("��������: ");
		int m = getIntScore("��������: ");
		// 2�� �̻� ���Ǳ� ������ �Լ��� �и��ߴ�.
		inputData(n, k, e, m);
		
	}

	public boolean hasData() {
		if (top <= 0) {
			println("��� : ������ �����ϴ�!");
			return false;
		}
		return true;
	}

	public void output() {
		System.out.println("::: OUTPUT :::");
		// ���� �迭�� ��� ���� �� �྿ ��� �Ѵ�.
		// �ҿ�ð� 10��
		// System.out.printf() Ȱ�� �Ѵ�.
		if (!hasData())
			return;
		System.out.printf("����\t����\t����\t����\t����\t���\t����\t���\n");
		for (int i = 0; i < top; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", name[i], kor[i], eng[i], mat[i], total[i], avg[i],
					grade[i], rank[i]);
		}
	}

	int[] searchIndex;
	int searCnt;

	public void search() {
		System.out.println("::: SEARCH :::");
		print("�˻� �̸� �Է� : ");
		findByName();
		if (searCnt == 0) {
			char yn = checkYn("�˻� �̸� �Է� : ");
			if (yn == 'y') {
				findByName();
			}
		}
		println("--- �˻� �Ϸ� ---");

		/*
		 * findByName(); char yn = checkYn("������ �̸� �Է� : "); // 2. ���� idx�� �����Ѵ�.
		 * if(yn=='y') { modify1(); // 4. ����� �ִٸ� �� ���� �Է� // 5. ������ �����Ѵ�.
		 * println("--- ���� �Ϸ� ---"); }
		 */
	}

	public void findByName() {
		// 1. �̸����� �˻�.
		// 2. ���� 2�� ó��?
		// 3. �˻� ���(���� output()��� Ȱ��.
		// 4. �˻� ��� index�� �����ϴ� �迭�� �����.
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
			println("�˻� ��� ����");
			return;
		}

		System.out.printf("��ȣ\t����\t����\t����\t����\t����\t���\t����\t���\n");
		for (int i = 0; i < searCnt; i++) {
			int idx = searchIndex[i];
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", idx, name[idx], kor[idx], eng[idx], mat[idx],
					total[idx], avg[idx], grade[idx], rank[idx]);
		}
	}

	public void modify() {
		System.out.println("::: MODIFY :::");
		// 1. search �Ѵ�.
		print("������ �̸� �Է� : ");
		findByName();
		if (searCnt == 0) {
			print("�ٽ� �ϰڽ��ϱ�?(y/n)>>");
			char yn = scan.next().charAt(0);
			if(yn=='y') {
				modify();
				return;
				
			} else {
				return;
			}
		}
		
		modify1();
			
		// 4. ����� �ִٸ� �� ���� �Է�
		// 5. ������ �����Ѵ�.
		println("--- ���� �Ϸ� ---");
	}

	public char checkYn(String str) {
		char yn = 'y';
		while (searCnt == 0) {
			print("�ٽ� �˻��Ͻðڽ��ϱ�? \n(�ٽ� �˻� : 'y' or 'Y' menu : �ƹ�Ű)\n >> ");
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
			kor[searchIndex[0]] = getIntScore("���� ���� ����1: ");
			eng[searchIndex[0]] = getIntScore("���� ���� ����1: ");
			mat[searchIndex[0]] = getIntScore("���� ���� ����: ");
			calc(searchIndex[0]);
			setRank();
//			searCnt = MAX + 1;
		} else if (searCnt > 1 /*&& searCnt != MAX + 1*/) {
			print("���� ������ ��ȣ �Է�: ");
			int mIdx = getNum();
			// 3. �Է��� idx�� search����� �ִ��� Ȯ���Ѵ�.
			boolean flag = false;
			for (int i = 0; i < searCnt; i++) {
				if (searchIndex[i] == mIdx) {
					flag = true;
				}
			}
			if (flag) {
				kor[mIdx] = getIntScore("���� ���� ����: ");
				eng[mIdx] = getIntScore("���� ���� ����: ");
				mat[mIdx] = getIntScore("���� ���� ����: ");
				calc(mIdx);
				setRank();
			} else {
				println("�߸��Է� �ٽ� �Է��ϼ�");
				modify1();
			}
		}
	}

	public void delete() {
		System.out.println("::: DELETE :::");
		print("������ �̸� �Է� : ");
		findByName();
		if (searCnt == 0) {
			char yn = checkYn("������ �̸� �Է� : ");
			if (yn == 'y') {
				delete();
				return;
			}
		}else {
			delete1();
			return;
		}
		
		println("--- ���� �Ϸ� ---");

		/*
		 * print("������ �̸� �Է� : "); findByName(); char yn = checkYn("������ �̸� �Է� : "); // 2.
		 * ���� idx�� �����Ѵ�. if(yn=='y') { modify1(); // 4. ����� �ִٸ� �� ���� �Է� // 5. ������ �����Ѵ�.
		 * println("--- ���� �Ϸ� ---"); }
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
			print("���� ������ ��ȣ �Է�: ");
			int dIdx = getNum();
			// 3. �Է��� idx�� search����� �ִ��� Ȯ���Ѵ�.
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
				println("�߸��Է� �ٽ� �Է��ϼ�");
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
			//System.exit(0);//��������
			break;
		default:
			System.out.println("���: �ش� �޴��� ����.");
		}

		return isOk;
	}

	public static void main(String[] args) {
		// 1. ����: �����ڸ� �̿��� ��ü ����
		new Day13Ex01Homework();
	}
}