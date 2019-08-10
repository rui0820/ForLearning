package com.Imooc.method;

public class MaxDemo {

	//求最大值得方法
	
	public void max(float a,float b) {
		float max;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("两个数" + a + "和" + b + "的最大值为" + max);
	}
	
	public static void main(String[] args) {
		MaxDemo maxDemo = new MaxDemo();
		float a = 15,b = 10;
		maxDemo.max(a, b);
		float m = 5.6f,n = 8.9f;
		maxDemo.max(m, n);
		maxDemo.max(9.8f, 12.8f);
	}

}
