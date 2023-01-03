package com.ryan.test;

import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("請輸入三個整數:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if(x + y <= z || x + z <= y || y + z <= x) {
			System.out.println("不是三角形");
		}else if(x == y && x == z && y == z) {
			System.out.println("正三角形");	
		}else if(x == y || x == z || y == z) {
			System.out.println("等腰三角形");
		}else if((x * x) + (y * y) == (z * z) || (x * x) + (z * z) == (y * y) || (y * y) + (z * z) == (x * x)){
			System.out.println("直角三角形");
		}else {
			System.out.println("其他三角形");
		}	
	}
}
