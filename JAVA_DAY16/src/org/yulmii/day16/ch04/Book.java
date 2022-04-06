package org.yulmii.day16.ch04;

public class Book {
	String title;
	String author;
	
	
	public Book() {
		this("gildong");//String 타입의 매개변수가 하나 있는 생성자 호출.
	}
	
	public Book(String title) {
		//title = title+1;//매개변수 = 매개변수+1
		//this.title = title;//this.필드 = 매개변수
		this(title, "허균");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void info() {
		System.out.printf("%s : %s\n", title, author);
	}

	public static void main(String[] args) {
		Book book3 = new Book("어린왕자","생택쥐베리");
		book3.info();
		Book book = new Book();
		System.out.println(book.title+" : "+book.author);
		book.info();
		
		Book book2 = new Book("춘향전");
		System.out.println(book2.title+" : "+book2.author);
		book2.info();
		
	}
}
