package com.Imooc.flow;

public class Test_1_4_3_8 {
	public static void main(String[] args) {
		char ch = 'd';
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("元音字母" + ch);
			break;
		default:
			System.out.println(ch + "不是元音字母");
			break;
		}
	}
}
