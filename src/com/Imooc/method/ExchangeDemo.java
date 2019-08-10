package com.Imooc.method;

public class ExchangeDemo {
	//交换方法
	public void swap(int a,int b) {
		int temp;
		System.out.println("交换前：a = " + a + ",b = " + b);
		temp = a;a = b;b = temp;
		System.out.println("交换后：a = " + a + ",b = " + b);
	}
	public void swapTest() {
		int m = 4,n = 5;
		System.out.println("交换前：m = " + m + ",n = " + n);
		swap(m, n);//普通方法调用同一个类的方法不用定义
		System.out.println("交换前：m = " + m + ",n = " + n);
		
	}
	
	public static void main(String[] args) {
		ExchangeDemo ed = new ExchangeDemo();//主方法调用方法必须定义
		ed.swapTest();
	}

}
