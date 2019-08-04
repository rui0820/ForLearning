package com.Imooc.array;
import java.util.Scanner;

public class Test_1_7_1_7 {

	public static void main(String[] args) {
		//在一个二维数组中存放了三名学生的语文和数学的成绩，从键盘中输入三名学生的成绩存储到二维数组中，分别求语文和数学的总成绩及平均分并输出
	    //定义一个三行两列的整型二维数组intArray
		int[][] intArray = new int[3][2];
	    //从键盘输入学生成绩，要求输入顺序与效果图一致
		for(int i = 0;i < 3;i++) {
			System.out.println("请输入第" + (i + 1) + "名学生的语文成绩：");
			Scanner[][] sc = new Scanner[3][2];
			sc[i][0] = new Scanner(System.in);
			intArray[i][0] = sc[i][0].nextInt();
			System.out.println("请输入第" + (i + 1) + "名学生的数学成绩：");
			sc[i][1] = new Scanner(System.in);
			intArray[i][1] = sc[i][1].nextInt();
		}
	    //求语文的总成绩和平均分
		int chineseAverage = 0;
		int chineseSum = 0;
		for(int i = 0;i < 3;i++) {
			chineseSum+= intArray[i][0];
		}
		chineseAverage = chineseSum / 3;
		System.out.println("语文的总成绩为：" + chineseSum);
		System.out.println("语文的平均分为：" + chineseAverage);

	    //求数学的总成绩和平均分
		int mathAverage = 0;
		int mathSum = 0;
		for(int i = 0;i < 3;i++) {
			mathSum+= intArray[i][1];
		}
		mathAverage = mathSum / 3;
		System.out.println("数学的总成绩为：" + mathSum);
		System.out.println("数学的平均分为：" + mathAverage);

	}

}
