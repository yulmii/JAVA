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
			//System.exit(0);//��������
			break;
		default:
			System.out.println("���: �ش� �޴��� ����.");
		}

		}
		
		
	}
	public void input() {
		int num = top+1;
		System.out.print("�̸��Է� : ");
		String name = scan.next();
		System.out.print("��ȭ��ȣ �Է� : ");
		String phone = scan.next();
		System.out.print("�̸��� �Է� : ");
		String email = scan.next();
		
		address[top] = new Address(num,name,phone,email);
		System.out.printf("%d\t%s\t%s\t%s\n", address[top].num,address[top].name,address[top].phone,address[top].email);
		
		top++;
	}
	
	public void output() {
		System.out.println("��ȣ\t�̸�\t��ȭ��ȣ\t�̸���");
		for(int i = 0 ; i<top ; i++) {
			System.out.printf("%d\t%s\t%s\t%s\n", address[top].num,address[top].name,address[top].phone,address[top].email);
		}
	}
	
	public static void main(String[] args) {
		AddressManage manage = new AddressManage();
		System.out.println("::: ��ȭ��ȣ ���� :::");
		manage.controller();
	}
}