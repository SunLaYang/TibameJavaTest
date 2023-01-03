package com.ryan.test;

public class Homework2_1 {
	public static void main(String[] args) {
		//1.請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);			
		System.out.println("---------------------------");
		
		//2.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int sum2 = 1;
		for(int i = 1; i <= 10; i++) {
			sum2 *= i;
		}
		System.out.println(sum2);
		System.out.println("---------------------------");
		
		//3.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int sum3 = 1;
		int i = 1;
		while(i <= 10) {
			sum3 *= i;
			i++;
		}
		System.out.println(sum3);
		System.out.println("---------------------------");
				
		// 4.請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		for (int j = 1; j <= 10; j++) {
			System.out.print(j * j + " ");
		}
	}

}
