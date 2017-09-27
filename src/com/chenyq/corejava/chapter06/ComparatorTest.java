package com.chenyq.corejava.chapter06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.Timer;

public class ComparatorTest {
	
	private String name;
	
	public ComparatorTest() {
		System.out.println("Constructor Invoked!");
	}
	
	public ComparatorTest(String str) {
		System.out.println("Constructor Invoked:"+str);
		this.name = str;
	}

	public static void main(String[] args) {
		new Thread(() -> System.out.println(Thread.currentThread().getName())) .start();
		System.out.println(Thread.currentThread().getName());
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		Stream<ComparatorTest> s = list.stream().map(ComparatorTest::new);
		
		List<ComparatorTest> t = s.collect(Collectors.toList());
		System.out.println(t);
		
		Comparator<String> comp = (first, second) -> first.length()-second.length();
		System.out.println(comp.getClass().getName());
		
		// Object::instanceMethod
		Timer t1 = new Timer(1000, System.out::println);
		// 等价
		Timer t2 = new Timer(1000, event -> System.out.println(event));
		// Class::staticMethod
		BinaryOperator<Double> i = (x, y) -> Math.pow(x, y);
		// 等价
		BinaryOperator<Double> j = Math::pow;
		
		String[] words = {"aaa", "bbb"};
		// Class::instanceMethod,这种情况下第一个参数会被用作方法(此处为compareToIgnoreCase的作用对象)
		Arrays.sort(words, String::compareToIgnoreCase);
		// 等价
		Arrays.sort(words, (first, second) -> first.length() - second.length());
	}
	
	@Override
	public String toString() {
		return this.getClass().getName()+":[name="+this.name+"]";
	}
}
