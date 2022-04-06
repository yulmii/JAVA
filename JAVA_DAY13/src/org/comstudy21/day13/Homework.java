package org.comstudy21.day13;

import java.io.IOException;
import java.util.Scanner;

public class Homework {
   // �迭 �ʵ� ����
   final int MAX = 5;
   String[] name, grade;
   int[] kor, eng, mat, total, rank;
   double[] avg;
   int top;
   Scanner scan;
   
   public Homework() {
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
      // 3. ��Ʈ�ѷ� �ݺ� ���� - ��Ʈ�ѷ����� ���Ḧ �����ϸ� false ��ȯ
      boolean isGo = true;
      while(isGo) {
         isGo = controller();
      }
      // 4. ���� �� �������� ����
      System.out.println("���α׷� ���� - Good bye!");
   }
   
   public int menu() {
      int no = 0;
      System.out.println("1)INPUT 2)OUTPUT 3)SEARCH 4)MODIFY 5)DELETE 6)END");
      System.out.print("Choice : ");
      no = scan.nextInt();
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
         while((ch=System.in.read())!='\n') {
            if(ch>='0' && ch<='9') {
               num = num*10 + ch-'0';
            }
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
      return num;
   }
   
   public int getIntScore(String message) {
      print(message);
      int score = getNum();
      while(score<0 || score>100) {
         print("0~100���� �ٽ� �Է�: ");
         score = getNum();
      }
      return score;
   }
   
   public String mkGrade(double avg) {
      String grade = "F";
      if(avg >= 90) {
         grade = "A";
      } else if(avg >= 80) {
         grade = "B";
      } else if(avg >= 70) {
         grade = "B";
      } else if(avg >= 60) {
         grade = "B";
      }
      int c = (int)avg % 10;
      if(avg >= 60 && c >= 7 || avg == 100) {
         grade += "+";
      } else if(avg >= 60 && c <= 3) {
         grade += "-";
      }
      return grade;
   }
   
   public void setRank() {
      for(int i=0; i<top; i++) {
         rank[i] = 1;
         for(int j=0; j<top; j++) {
            if(avg[i] < avg[j]) {
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
   
   public void input() {
      println("::: INPUT :::");
      // top���� �迭�� �����͸� �Է� �޴´�.
      // ����, ����,����,���� ������ �Է� �޾Ƽ� ����,���,����,����� ���
      // top����
      // top�� MAX���� ũ�ų� ������ �� �̻� �Է� �Ұ���.
      // ���� �ϱ� �ҿ�ð� 15��
      if(top >= MAX) {
         println("��� : �� �̻� �Է� �Ұ���");
         return; // ���⼭ �Լ��� ������. (�Ʒ� �κ� ���� ����)
      }
      print("�����Է�:");
      name[top] = scan.next();
      kor[top] = getIntScore("��������: ");
      eng[top] = getIntScore("��������: ");
      mat[top] = getIntScore("��������: ");
      calc(top);
      top++;
      setRank();
      
   }
   
   public void output() {
      System.out.println("::: OUTPUT :::");
      //
      if(top<0) {
    	  println("��� �� ������ �����ϴ�.");
    	  return;
      }
      print("����\t����\t����\t����\t����\t���\t����\t���\n");
      for(int i =0; i<top ;i++) {
    	  System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\t",
    			  name[i],kor[i],eng[i],mat[i],total[i],avg[i],grade[i],rank[i]);
      }
   }
   
   public void search() {
      System.out.println("::: SEARCH :::");
   }
   
   public void modify() {
      System.out.println("::: MODIFY :::");
   }
   
   public void delete() {
      System.out.println("::: DELETE :::");
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
         System.out.println("::: END :::"); 
         isOk = false;
         break;
      default : System.out.println("���: �ش� �޴��� ����.");
      }
      
      return isOk;
   }
   
   public static void main(String[] args) {
      // 1. ����: �����ڸ� �̿��� ��ü ����
      new Homework();
   }
}