package com.Imooc.flow1;

public class Test_1_5_5_3 {
    public static void main(String[] args) {
		// 输出星号组成的梯形
		int m = 1,n = 1;
		//外重循环
		while(m <= 5){
		    n = 1;
		    for(int i = m;i < 5;i++){
		        System.out.print(" ");
		    }
		    while(n <= m + 2){
		        System.out.print(" *");
		        n++;
		    }
		    System.out.println();
		    m++;
		}
	}
}
 