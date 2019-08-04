package com.Imooc.operator;
import java.util.Scanner;

public class ConditionDemo2 {
	public static void main(String[] args) {
		//判断一个数的奇偶性
		//int n = 10;
		System.out.println("请输入一个数字");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%2 == 0){
			System.out.println(n + "是偶数");
		}else {
		System.out.println(n + "是奇数");	
		}
	}
}
