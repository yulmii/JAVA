package org.day01;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World^^");
		if(args.length != 0) {
			System.out.println(args[0]);
		}
	}
}