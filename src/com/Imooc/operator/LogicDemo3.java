package com.Imooc.operator;
import java.util.Scanner;

public class LogicDemo3 {
	public static void main(String[] args) {
		System.out.println("请输入任意数字");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%3 != 0) {	//(!(n%3 == 0))
			System.out.println(n + "可以被3整除");
		}else {
			System.out.println(n + "不可以被3整除");
		}
	}
}
