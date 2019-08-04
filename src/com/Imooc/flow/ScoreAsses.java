package com.Imooc.flow;

import java.util.Scanner;

public class ScoreAsses {
	public static void main(String[] args) {
		/*
		 成绩大于等于90分，输出“优”
		成绩大于等于80分且小于90分，输出“良”
		成绩大于等于60分且小于80分，输出“中”
		成绩小于60分，输出“不合格”
		 */
		System.out.println("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		//方法一
		System.out.println("方法一");
		if(score >= 90)
			System.out.println("优");
		if(score >= 80 & score < 90)
			System.out.println("良");
		if(score >= 60 & score < 80)
			System.out.println("中");
		if(score < 60)
			System.out.println("差");

		//方法二
		System.out.println("方法二");
		if(score >= 90)
			System.out.println("优");
		else if(score >= 80)
			System.out.println("良");
		else if(score >= 60)
			System.out.println("中");
		else
			System.out.println("不合格");	
	}
}
