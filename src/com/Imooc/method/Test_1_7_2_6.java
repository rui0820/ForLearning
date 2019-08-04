package com.Imooc.method;

import java.util.Scanner;

public class Test_1_7_2_6 {
	//定义一个方法，根据商品总价，计算出对应的折扣并输出。
	//折扣信息如下：
	//1)总价<100，不打折
	//2)总价在100到199之间，打9.5折
	//3)总价在200以上，打8.5折
	
	//根据商品总价输出折后总价
	public double discount(double sum) {
		double discount = 0;
		if(sum >= 200) {
			discount = sum * 0.85;
		}else if(sum >= 100){
			discount = sum * 0.95;
		}else {
			discount = sum;
		}
		return discount;
	}
	
	public static void main(String[] args) {
		//定义对象
		double sum = 0;
		double discount = 0;
		Test_1_7_2_6 test = new Test_1_7_2_6();
		//定义商品总价存放到变量中
		System.out.println("输入商品总价：");
		Scanner sc = new Scanner(System.in);
		sum = sc.nextDouble();
		//调用方法，输出折后商品总价
		discount = test.discount(sum);
		System.out.println("折后商品总价为：" + discount);
	}

}
