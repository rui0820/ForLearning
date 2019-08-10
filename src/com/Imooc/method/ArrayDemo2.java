package com.Imooc.method;

public class ArrayDemo2 {
	public void fun(int[] arr,int n) {
		for(int i = 0;i < arr.length;i++) {
			arr[i] = arr[i] * n;
		}
	}
	public static void main(String[] args) {
		ArrayDemo2 ad = new ArrayDemo2();
		int[] a = {1,2,3,4,5};
		ad.fun(a, 2);
		System.out.println(a[2]);//数组元素被改变
	}

}
