package com.chenyq.corejava.chapter02;

public class Welcome {

	public static void main(String[] args) {
		String greeting = "Welcome to Core Java";
		System.out.println(greeting);
		for(int i=0, length=greeting.length(); i<length; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
