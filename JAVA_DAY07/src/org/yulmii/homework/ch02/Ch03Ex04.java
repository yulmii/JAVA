package org.yulmii.homework.ch02;

public class Ch03Ex04 {
	public static void Ex04_01(String[] args) {
		String star="";
		for(int i=0;i<5;i++) {
			star += "*";
			System.out.println(star);
		}
	}
	public static void TEST02(String[] args) {
		for(int i = 0; i<5 ; i++) {
			for(int j=0; j<=i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		for(int i = 5; i>0 ; i--) {
			for(int j=0; j<i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}


