package com.ryan.test;

import java.util.Scanner;

public class Homework3_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入討厭的數字");
		int num = scan.nextInt();
		int sum = 0;
		int[] array1 = new int[49];
		for (int i = 1; i <= array1.length; i++) {
			if (i / 10 == num || i % 10 == num) {
				continue;
			} else {
				array1[i - 1] = i;
				System.out.print(array1[i - 1] + "\t");
				sum++;
			}
			if (i % 10 == 0) { // 排序
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("共" + sum + "個");
		System.out.println("------------------------------");

		// 亂數打印出六個號碼
		System.out.println("隨機產生六個數字");
		int randomNum = 0;
		int[] array2 = new int[6];
		for (int i = 0; i < 6; i++) {
			randomNum = (int) (Math.random() * 49) + 1; // 產生1~49的隨機數字
			System.out.println("隨機產生的第" + (i + 1) + "數字為：" + randomNum);
			if (array1[randomNum -1] == 0) {
				i--; 
			} else {
				if (i == 0) {
					array2[i] = array1[randomNum -1];
				} else {
					for (int j = 0; j <= i - 1; j++) {
						if (array2[j] == randomNum) {
							i--;
						} else {
							array2[i] = array1[randomNum -1];
						}
					}
				}
			}
		}
		System.out.print("隨機產生的數字為：");
		for (int i = 0; i < 6; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}