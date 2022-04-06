package org.yulmii.day16.ch04;

import java.util.Scanner;

class Address{
		int num;
		String name, phone, email; 
	 public Address(int num, String n, String p, String e) {
		this.num = num;
		this.name = n;
		this.phone = p;
		this.email = e;
	 }
 }



public class AddressManage {
	Address [] address = new Address[100];
	Scanner scan = new Scanner(System.in);
	int top=0;
	
	public void controller() {
		boolean isOk = true;
		while(isOk) {
			System.out.println("1)Input 2)Output 3)Search 4)Modify 5)Delete 6)End");
			System.out.print("Choice : ");
			int no = scan.nextInt();
		switch (no) {
		case 1:
			System.out.println("::: INPUT :::");
			input();
			break;
		case 2:
			output();
			break;
		case 3:
//			search();
			break;
		case 4:
//			modify();
			break;
		case 5:
//			delete();
			break;
		case 6:
			System.out.println("::: END :::");
			isOk=false;
			//System.exit(0);//강제종료
			break;
		default:
			System.out.println("경고: 해당 메뉴가 없다.");
		}

		}
		
		
	}
	public void input() {
		int num = top+1;
		System.out.print("이름입력 : ");
		String name = scan.next();
		System.out.print("전화번호 입력 : ");
		String phone = scan.next();
		System.out.print("이메일 입력 : ");
		String email = scan.next();
		
		address[top] = new Address(num,name,phone,email);
		System.out.printf("%d\t%s\t%s\t%s\n", address[top].num,address[top].name,address[top].phone,address[top].email);
		
		top++;
	}
	
	public void output() {
		System.out.println("번호\t이름\t전화번호\t이메일");
		for(int i = 0 ; i<top ; i++) {
			System.out.printf("%d\t%s\t%s\t%s\n", address[top].num,address[top].name,address[top].phone,address[top].email);
		}
	}
	
	public static void main(String[] args) {
		AddressManage manage = new AddressManage();
		System.out.println("::: 전화번호 관리 :::");
		manage.controller();
	}
}