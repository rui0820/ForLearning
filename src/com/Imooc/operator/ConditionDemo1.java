package com.Imooc.operator;

public class ConditionDemo1 {
	public static void main(String[] args) {
		//如果两件商品总价超过100元，那么便宜20元
		double price1,price2;
		price1 = 80;
		price2 = 55;
		double sum = price1 + price2;
		System.out.println("原价: " + sum);
		if(sum >= 100) {
			sum-= 20;			
		}
		System.out.println("折后价；" + sum);
	}
}
