package com.chenyq.corejava.chapter03;

public class BasicDataType {

	public static void main(String[] args) {
		//整型
		int a = 32;
		short b = 32;
		long c = 32;
		byte d = 0b0010;
		long e = 100l;
		
		// 浮点型
		double s = 1.92;
		// float t = 1.92; //error
		float t = 1.92f;
		
		// char 类型
		char u = 'A';
		char v = '中';
		// char与Unicode
		char w = '\u2122';
		// char x = '\u24B30'; //error 24b30 use 4 byte space
		System.out.println(w);
		
		//运算符
		int ia = 17;
		ia += 3;
		ia -= 3;
		ia *= 3;
		ia /= 3.5;
		ia %= 3;
		System.out.println(ia);
		
		//关系运算符
		System.out.println(a==b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		System.out.println(b1 && b2);
		
		//位运算符
	}
}
