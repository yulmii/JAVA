package org.comstudy21.day13;

import java.io.IOException;
import java.util.Scanner;

public class Homework {
   // 배열 필드 선언
   final int MAX = 5;
   String[] name, grade;
   int[] kor, eng, mat, total, rank;
   double[] avg;
   int top;
   Scanner scan;
   
   public Homework() {
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
      // 3. 콘트롤러 반복 실행 - 콘트롤러에서 종료를 선택하면 false 반환
      boolean isGo = true;
      while(isGo) {
         isGo = controller();
      }
      // 4. 종료 후 보여지는 문장
      System.out.println("프로그램 종료 - Good bye!");
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
         print("0~100사이 다시 입력: ");
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
      // 총점, 평균, 학점, 등수 계산
      total[index] = kor[index] + eng[index] + mat[index];
      avg[index] = total[index] / 3.0;
      grade[index] = mkGrade(avg[index]);
   }
   
   public void input() {
      println("::: INPUT :::");
      // top번지 배열에 데이터를 입력 받는다.
      // 성명, 국어,영어,수학 점수를 입력 받아서 총점,평균,학점,등수를 계산
      // top증가
      // top이 MAX보다 크거나 같으면 더 이상 입력 불가능.
      // 구현 하기 소요시간 15분
      if(top >= MAX) {
         println("경고 : 더 이상 입력 불가능");
         return; // 여기서 함수를 끝낸다. (아랫 부분 실행 안함)
      }
      print("성명입력:");
      name[top] = scan.next();
      kor[top] = getIntScore("국어점수: ");
      eng[top] = getIntScore("영어점수: ");
      mat[top] = getIntScore("수학점수: ");
      calc(top);
      top++;
      setRank();
      
   }
   
   public void output() {
      System.out.println("::: OUTPUT :::");
      //
      if(top<0) {
    	  println("출력 할 내용이 없습니다.");
    	  return;
      }
      print("성명\t국어\t영어\t수학\t총점\t평균\t학점\t등수\n");
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
      default : System.out.println("경고: 해당 메뉴가 없다.");
      }
      
      return isOk;
   }
   
   public static void main(String[] args) {
      // 1. 시작: 생성자를 이용한 객체 생성
      new Homework();
   }
}