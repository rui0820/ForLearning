package com.Imooc;

public class Test_1_2_4_4 {

	public static void main(String[] args) {
		char c = (char)67832;
		System.out.println("c = " + c);
		
		int n = 65;
		char c1 =(char)n; 
		System.out.println("c1 = " + c1);
		
		long l = 87654321;
		int i = (int)l;
		System.out.println("i = " + i);
		
		float f = (float)l;		
		System.out.println("f = " + f);
		
		l = (long)f;
		System.out.println("l = " + l);
	}
}
