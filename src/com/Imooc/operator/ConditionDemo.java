package com.Imooc.operator;

public class ConditionDemo {
	public static void main(String[] args) {
		int a = 4,b = 7;
		int max;
		
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("max = " + max);
		
		max = a > b?a:b;
		System.out.println("max = " + max);
		
		boolean b1 = a > b?(3 < 6):(true == false);
		System.out.println(b1);
	}
}