package com.ryan.test;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {

		Homework5 h1 = new Homework5();
		h1.starSquare();
		h1.randAvg();
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		System.out.println(maxElement(intArray));
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(maxElement(doubleArray));
		h1.genAuthCode();

	}

	// 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖
	public void starSquare() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入width");
		int width = scan.nextInt();
		System.out.println("請輸入height");
		int height = scan.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
	public void randAvg() {
		int sum = 0;
		int[] rand = new int[10];
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 101);
			sum += rand[i];
			System.out.print(rand[i] + " ");
		}
		System.out.println("平均數為: " + sum / 10);
	}

	// 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double
	// x[][])，
	// 可以找出二維陣列的最大值並回傳
	public static int maxElement(int[][] arr1) {
//		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[2][3];
		for (int i = 0; i < arr1.length; i++) { // 先遍歷傳進去的數值
			for (int j = 0; j < arr1[i].length; j++) {
//				System.out.print("請輸入陣列數字:");
//				arr1[i][j] = sc.nextInt();
			}
		}
		int max = 0;// 定義一個變數裝最大值
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] > max) {// 找到比他大的就替換
					max = arr1[i][j];
				}
			}
		}
		return max;

	}

	public static double maxElement(double[][] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {

			}
		}
		double max = 0.0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (arr2[i][j] > max) {
					max = arr2[i][j];
				}
			}
		}
		return max;
	}

	public void genAuthCode() {
		String code = "";
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for (int i = 0; i <= 8; i++) {
			int r = (int)(Math.random() * 62);
			code += str.subSequence(r, r + 1) ; 
			
			//第二種方式
//			System.out.print(str.charAt((int) (Math.random() * 62)));
		}
		System.out.println(code);
	}
}
