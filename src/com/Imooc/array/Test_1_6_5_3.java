package com.Imooc.array;

public class Test_1_6_5_3 {

	public static void main(String[] args) {
		//定义一个字符数组并初始化，统计字符'a'或‘A’出现的次数
		//定义一个字符数组ch并初始化
		char[] ch = {'a','b','c','d','A','B','C','D','a'};
		int count = 0;
		//循环遍历数组，统计字符’a’或’A’出现的次数
		 for(int i = 0;i < ch.length;i++) {
			 if(ch[i] == 'a'|ch[i] == 'A') {
				 count++;
			 }
		 }
		//打印输出统计数据
		 System.out.println("字符数组中字符'a'或'A'的个数为：" + count);
	}

}
