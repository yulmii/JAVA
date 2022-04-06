package org.yulmii.day16.ch04;

public class Book {
	String title;
	String author;
	
	
	public Book() {
		this("gildong");//String Ÿ���� �Ű������� �ϳ� �ִ� ������ ȣ��.
	}
	
	public Book(String title) {
		//title = title+1;//�Ű����� = �Ű�����+1
		//this.title = title;//this.�ʵ� = �Ű�����
		this(title, "���");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void info() {
		System.out.printf("%s : %s\n", title, author);
	}

	public static void main(String[] args) {
		Book book3 = new Book("�����","�����㺣��");
		book3.info();
		Book book = new Book();
		System.out.println(book.title+" : "+book.author);
		book.info();
		
		Book book2 = new Book("������");
		System.out.println(book2.title+" : "+book2.author);
		book2.info();
		
	}
}
