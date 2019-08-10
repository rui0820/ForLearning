package com.Imooc.method;

public class ArgsDemo1 {
	//查找
	public void search(int n,int... a) {	//可变参数必须是最后一个参数
		boolean flag = false;
		for(int a1:a) {
			if(a1 ==n) {
				flag = true;
				break; 
			}
		}
		if(flag) {
			System.out.println("找到了" + n);
		}else {
			System.out.println("没找到" + n);
		}
		
	}
	public static void main(String[] args) {
		ArgsDemo1 ad1 = new ArgsDemo1();
		ad1.search(3,1,2,3,4,5);
		int[] a = {1,2,3,4,5};
		ad1.search(3, a);	//←数组可给可变参数列表，反之不可 
	}

}
