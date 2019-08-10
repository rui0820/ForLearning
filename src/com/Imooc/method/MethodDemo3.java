package com.Imooc.method;

public class MethodDemo3 {
	public void fun(int x,int y,int z) {
		z = x * x + y * y;
	}

	public static void main(String[] args) {
		MethodDemo3 d = new MethodDemo3();
		int a = 10;
		d.fun(6, 2, a);
		System.out.println(a);
		//↑方法中对z的值得修改，不会对主方法中a的值产生影响
		//因此a的值依然为10
	}

}
