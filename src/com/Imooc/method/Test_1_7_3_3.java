package com.Imooc.method;

public class Test_1_7_3_3 {

	//编写方法，求数组元素的平均值
	//求数组元素的平均值
	public float ave(float arr[]) {
		float ave = 0f;
		float sum = 0f;
		for(int i = 0;i < arr.length;i++) {
			sum = sum + arr[i];
		}
		ave = sum / arr.length;
		return ave;
	}
	public static void main(String[] args) {
		//定义对象
		Test_1_7_3_3 test = new Test_1_7_3_3();
		float aveArr = 0f;
		//创建float类型的数组并初始化
		float[] arr = {78.5f,98.5f,65.5f,32.5f,75.5f};
		//调用方法求平均值并打印输出
		System.out.println("数组的平均值为：" + test.ave(arr));
		
	}

}
