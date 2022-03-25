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
               num *= 10;  // �ڸ��� �ø���
               num += ch-'0'; // ���� num�� �� �� ����
            }
         }
      } catch(IOException e) {}
      System.out.println("num = " + num);
      return num;
   }
   
   public void test02() {
      // Scanner�� ���� �ʰ� ���� �Է� �ޱ�
      try {
         System.out.print("���� �Է� : ");
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