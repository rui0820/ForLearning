package com.Imooc.flow;

import java.util.Scanner;

public class IntCompare {

	public static void main(String[] args) {
		int x = 0,y = 0;
		System.out.println("输入x和y的值");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		x = sc1.nextInt();
		y = sc2.nextInt();
		
		if(x != y) {
			if(x > y) {
				System.out.println("x > y");
			}else {
				System.out.println("x < y");
			}
		}else {
			System.out.println("x = y");
		}
	}
}
