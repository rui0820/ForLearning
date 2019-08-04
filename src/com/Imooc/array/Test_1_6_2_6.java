package com.Imooc.array;

public class Test_1_6_2_6 {

	public static void main(String[] args) {
		//求数组中能被3整除的元素并打印输出
		//定义一个整型数组，并初始化
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		//循环遍历数组，找出能被3整除的元素并打印输出
		System.out.println("能被3整除的数组元素为：");
		for(int i = 0;i < a.length;i++) {
			if(a[i] % 3 == 0 ) {
				System.out.println(a[i]);
			}
		}
	}

}
