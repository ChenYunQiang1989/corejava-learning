package com.chenyq.corejava.chapter03;

import java.util.Scanner;

public class ChaptorThree {

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
		
		//字符串
		String fullName = "Li" + " Lei";
		String name = String.join(" ", "Han", "Meimei");
		System.out.println(fullName);
		System.out.println(name);
		
		System.out.println(fullName.equals(name));
		
	    StringBuilder sql = new StringBuilder();
	    sql.append("select * from t_user ");
	    sql.append("where name = 'lilei' or ");
	    sql.append("name = 'hanmeimei' ");
	    System.out.println(sql.toString());
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.printf("Can you still remember %s and %s through %d years ?", fullName, name, 15);
	    
	    int[] scores = {100, 98, 89};
	    scores = new int[] {98, 67, 99};
	}
}
