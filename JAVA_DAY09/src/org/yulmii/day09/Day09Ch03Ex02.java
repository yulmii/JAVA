package org.yulmii.day09;


import java.io.IOException;
import java.util.Scanner;

public class Day09Ch03Ex02 {
   
   public static int getNum() {
      int num = 0;
      
      try {
         int ch = 0;
         while((ch=System.in.read())!='\n') {
            if(ch>='0' && ch<='9') {
               num *= 10;  // 자리수 올리기
               num += ch-'0'; // 기존 num에 새 값 누적
            }
         }
      } catch(IOException e) {}
      System.out.println("num = " + num);
      return num;
   }
   
   public void test02() {
      // Scanner를 쓰지 않고 숫자 입력 받기
      try {
         System.out.print("정수 입력 : ");
         int n = System.in.read() - '0';
         System.out.println("n = " + n*10);
      } catch (IOException e) {
         e.printStackTrace();
      }
     
   }
   
   public void test() {
      Scanner scan = new Scanner(System.in);
      int age = scan.nextInt();
      System.out.println("age = " + age);
   }

   public static void main(String[] args) {
      new Day09Ch03Ex02();
   }

}