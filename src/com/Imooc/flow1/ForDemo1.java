package com.Imooc.flow1;

public class ForDemo1 {
	public static void main(String[] args) {
		//打印10以下的整数
		int i = 1;
		for (i = 1;i <= 10;i++){
			System.out.println(i + " ");
		}
		
		i = 1;
		for(;;){
			System.out.println(i + " ");
			if(i==10)break;
			i++;
		}
		
		i = 1;
		while(true){
			System.out.println(i + " ");
			if(i==10)break;
			i++;
		}
	}
}
