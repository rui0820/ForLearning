package com.Imooc.flow1;

public class Test_1_5_2_8 {

	public static void main(String[] args) {
		//使用while循环求1到5的平方和
		//定义整型变量n作为循环变量，并初始化
		int n = 1;
		//定义整型变量sum存放和，并初始化
		int sum = 0;
		//使用while循环求1到5的平方和
		while(n <= 5) {
			sum = sum + n * n;
			n++;
		}
		//输出平方和
		System.out.println("1到5的平方和为" + sum);
	}

}
