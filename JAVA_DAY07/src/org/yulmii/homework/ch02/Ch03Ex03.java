package org.yulmii.homework.ch02;

public class Ch03Ex03 {

	public static void main(String[] args) {
	      // �Ǻ���ġ ����
	      // 1+1+2+3+5+8+13+21=54
	      // �ǻ��ڵ� - �ΰ��� ���� ���� �ڵ��ϱ�
	      // 1. �����װ� �������� ���ؼ� �������� �����.
	      //    1-1. �������� �������� �ǰ� �������� �������� �ȴ�. (ġȯ)
	      // 2. �������� 21�� �ɶ����� �ݺ��Ѵ�.
	      // 3. �������� �����ؼ� ����Ѵ�.
	      int prev=0, cur=1, next=0;
	      int total=0;
	      while(cur<=21) {
	         System.out.print(cur);
	         // ������ ���ϱ� ���������� ������ �����
	         // �������� ���������� �������� ���������� ����
	         total += cur;
	         next = prev+ cur;
	         prev=cur;
	         cur=next;
	         System.out.print((cur<=21)?"+":"=");
	    
	      }System.out.println(total);
	   }
	}

