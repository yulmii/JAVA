package org.yulmii.day04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Day04Ex02 {

   public static void main(String[] args) throws FileNotFoundException {
      // Scanner 사용법 - 파일의 내용을 읽어 온다.
      InputStream is = new FileInputStream(new File("C:\\temp02\\data.txt"));
      Scanner scan = new Scanner(is);
      while(scan.hasNext()) {
         System.out.println(scan.nextLine());
         //next()는 띄어쓰기nextLine()은 한 줄씩
      }
      scan.close();
   }

}