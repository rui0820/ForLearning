package com.Imooc.datamanage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataManage1 {
/**
 * 在主方法中定义菜单，并定义方法完成对学生成绩的管理，学生成绩存放在数组中。
 */
	
	/**
	 * 输出提示内容
	 */
	public void notice() {
		System.out.println("***********************************************");
		System.out.println("		1--初始化数学成绩");
		System.out.println("		2--求成绩的平均值");
		System.out.println("		3--统计成绩大于85的人数");
		System.out.println("		4--修改指定位置处的成绩");
		System.out.println("		5--打印输出所有成绩");
		System.out.println("		0--退出");
		System.out.println("***********************************************");
	}
	
	/**
	 * 1--初始化数学成绩
	 * 从键盘接受5名学生的成绩
	 * @param length 数组长度
	 */
	public float[] insertData() {
		Scanner sc = new Scanner(System.in);
		
		int length = 0;
		float[] a = null;
		
		//要确认
		while (true) {
			try {
				System.out.println("请输入要存储的数学成绩的数量");
				length = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("输入的数据有误，请重新输入！");
				sc.next();
			}
		}
		a = new float[length];
		
		for(int i = 0;i < a.length;i++) {
			System.out.println("请输入第" + (i + 1) + "个数据：");
			try {
			a[i] = sc.nextFloat();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据有误，请重新输入！");
				sc.next();
				i--;
			}
		}
		
		return a;
	}
	
	/**
	 * 2--求成绩的平均值
	 * @param a			数学成绩数组
	 * @param sum		总成绩
	 * @param average	平均成绩
	 */
	public float averageData(float[] a) {
		float average = 0;
		float sum = 0;
		
		for(float n:a) {
			sum+= n; 
		}
		average = sum / a.length;
		System.out.println("数学平均成绩为：" + average);
		return average;
	}
	
	/**
	 * 3--统计成绩大于85分的人数
	 */
	public void divUnder85(float[] a) {
		int count = 0;
		
		for(float n:a) {
			if(n > 85) {
				count++;
			}
		}
		if(count != 0) {
			System.out.println("成绩大于85分的人数为：" + count);
		}else{
			System.out.println("没有成绩大于85分的人！");
		}
	}
	
	/**
	 * 4--修改指定位置处的成绩
	 * @param upDateNumber	要修改数据的位置
	 * @param newData		新数据
	 */
	public void upDate(float[] a) {
		Scanner sc = new Scanner(System.in);
		DataManage1 dm = new DataManage1();
		int upDateNumber = 0;
		float newData = 0;
		
		System.out.print("修改前");
		dm.showData(a);
		//要确认
		while (true) {
			try {
				System.out.println("请输入要修改数据的位置：");
				upDateNumber = sc.nextInt();
				if(upDateNumber <= a.length & upDateNumber > 0) {
					break;
				}else  if(upDateNumber > a.length){
					System.out.println("超过现有数据个数，请重新输入！");
					continue;
				}else {
					System.out.println("不能为0，请重新输入！");
				}
			} catch (InputMismatchException e) {
				System.out.println("输入的数据有误，请重新输入！");
				sc.next();
			}
		}
		
		while (true) {
			try {
				System.out.println("请输入新数据");
				newData = sc.nextFloat();
				break;
			} catch (InputMismatchException e) {
				System.out.println("输入的数据有误，请重新输入！");
				sc.next();
			}
		}
		a[upDateNumber - 1] = newData;
		
		System.out.print("修改后");
		dm.showData(a);
	}
	
	/**
	 * 5--打印输出所有成绩
	 */
	public void showData(float[] a) {
		System.out.println("成绩为：");
		for(float n:a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DataManage1 dm = new DataManage1();
		Scanner sc = new Scanner(System.in);
		
		int input;
		float[] a = null;
		
		while(true) {
			dm.notice();
			System.out.println("请输入对应数字进行操作：");
			try {
			input = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据有误，请重新输入！");
				sc.next();
				continue;
			}
			
			if(input == 0) {
				System.out.println("退出程序");
				break;
			}
			
			if(input > 1 && input <=5 && a == null) {
				System.out.println("无数据，请先初始化数学成绩");
				continue;
			}
			
			switch(input) {
			case 1:
				//初始化数学成绩
				a = dm.insertData();
			break;
			case 2:
				//求成绩的平均值
				dm.averageData(a);
			break;
			case 3:
				//统计成绩大于85分的人数
				dm.divUnder85(a);
			break;
			case 4:
				//修改指定位置处的成绩
					dm.upDate(a);
			break;
			case 5:
				//打印输出所有成绩
				dm.showData(a);;
			break;
			default:
				System.out.println("输入内容有误，请输入0-5之间的数字");
			}
		}
	}
}
