package com.Imooc.flow1;

public class JiechengPlus {

	public static void main(String[] args) {
		int s = 1,sum = 0;
		for(int i = 1;i <= 4;i++) {
			s=1;
			for(int j = 1;j <= i;j++) {
				s = s * j;
			}
			sum = sum + s;
		}
		System.out.println("*************");
		System.out.println("*************");
		System.out.println("*************");
		System.out.println("OKOK");
		System.out.println("1!+2!+3!+4!="+sum);
	}
}
