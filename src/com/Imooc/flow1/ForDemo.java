package com.Imooc.flow1;

public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;
		for(int n=1;n<=5;n++) {
			sum = sum + n;
		}
		//System.out.println(n);	//错误：局部变量只在for循环内使用（在for内定义的变量）
		System.out.println("sum = " + sum);
	}

}
