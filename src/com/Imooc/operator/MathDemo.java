package com.Imooc.operator;

public class MathDemo {
	public static void main(String[] args) {
		int num1 = 10,num2 = 5;
		int result;
		//加法
		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		//输出计算结果
		System.out.println(num1 + num2);
		//输出单纯链接
		System.out.println("" + num1 + num2);
		//减法
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
		//乘法
		result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
		//除法
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
		//输出整数和小数
		System.out.println(13/5);
		System.out.println(13.0/5);
		//取余数
		result = 13 % num2;
		System.out.println("13 % " + num2 + " = " + result);
		System.out.println("13.5 % 5 = " + (13.5%5));
	}
}
