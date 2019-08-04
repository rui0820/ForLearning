package com.Imooc.flow1;

public class Test_1_5_4_7 {

	public static void main(String[] args) {
		//编写一个程序，求出200到300之间的数，且满足条件：它们三个数字之积为42.三个数字之和为12。
		//定义变量ge,shi,bai,用于存放个位，十位，百位上的数字
		int ge = 0,shi = 0,bai = 0;
		int sum = 0,mul = 1;
		//使用for循环
		for(int n = 200;n <= 300;n++) {
		//取出百位数
			ge = n % 10;
		//取出十位数
			shi = n % 100 / 10;
		//取出个位数
			bai = n / 100;
		//计算三个数字之积
			mul = ge * shi * bai;
		//计算三个数字之和
			sum = ge + shi + bai;
		//如果积等于42并且和为12，则将满足条件的数输出
			if(mul == 42 & sum == 12) {
				System.out.print(n + " ");
			}
		}
	}

}
