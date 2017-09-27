package com.chenyq.corejava.chapter06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TraceHandler implements InvocationHandler {
	
	public static void main(String[] args) {
		Object value = new Object();
		InvocationHandler handler = new TraceHandler(value);
		Class[] interfaces = new Class[]{Comparable.class};
		Object proxy = Proxy.newProxyInstance(null, interfaces, handler);
		proxy.toString();
	}
	
	private Object target;
	
	public TraceHandler(Object t) {
		this.target = t;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(method.getName());
		return method.invoke(target, args);
	}

}
