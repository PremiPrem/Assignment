package com.java.assignment;

import java.util.Scanner;

public class NumberConverter {
	
	//To get input
	public static void main(String[] args) {
		
	
	System.out.println("Enter a word");
	Scanner input=new Scanner(System.in);
	
	String word=input.nextLine();
	
	char[] character=new char[word.length()];
	for(int i=0;i<word.length();i++) {
		character[i]=word.charAt(i);
	}
	int number=Integer.parseInt(word);
	

	System.out.println(number);
	}
}
