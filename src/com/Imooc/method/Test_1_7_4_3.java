package com.Imooc.method;

public class Test_1_7_4_3 {
	//定义两个重载的方法，分别求圆和长方形的面积
	//求圆的面积
	public double area(double r) {
		double area = Math.PI * r * r;
		return area;
	}
	//求长方形面积
	public float area(float m,float n) {
		float area = m * n;
		return area;
	}
	public static void main(String[] args) {
		//定义对象
		Test_1_7_4_3 area1 = new Test_1_7_4_3();
		//定义一个double类型的变量存放半径，并初始化
		double r = 4.5;
		//定义两个变量存放长和宽，并初始化
		float m = 8,n = 5;
		//调用方法，求圆的面积并打印输出
		System.out.println("圆的面积为：" + area1.area(r));
		//调用方法，求长方形面积并打印输出
		System.out.println("长方形面积为：" + area1.area(m,n));
	}

}
