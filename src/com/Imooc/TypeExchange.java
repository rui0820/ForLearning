package com.Imooc;

public class TypeExchange {

	public static void main(String[] args) {
		//将一个整型数值赋给字符
		char c = (char)65536;	//一部分数据丢失
		int n;
		n = c;
		c = (char)n;	//一部分数据丢失

		//类型转换
		int x = 100;
		long y = x;
		x = (int)y;
		float f = 10000000000000L;
		System.out.println("f = " + f);
		float f1 = 1242349734827L;	//部分数据丢失
		System.out.println("f1 = " + f1);
	}
}
