package com.ryan.test;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int min = 0;
		int max = 100;
		int secret = (int) (Math.random() * 100) + 1;
		System.out.println("驗證一下是否正確:" + secret);

		while (true) {
			System.out.println("猜一個數字:");
			int guess = scan.nextInt();

			if (guess < min || guess > max) {
				System.out.println("請輸入正確數字在" + min + "到" + max + "之間");
				continue;
			}

			if (guess == secret) {
				System.out.println("猜中了 secret為:" + secret);
				break;
			} else if (guess < secret) {
				System.out.println("你的數字小於答案");
			} else if (guess > secret) {
				System.out.println("你的數字大於答案");

			}
		}

	}
}
