package com.ryan.test;


import java.util.HashSet;
import java.util.Set;


public class Homework10_1 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		while(set1.size() < 5) {
			int num = (int)(Math.random()*100)+1;
			set1.add(num);
		}
		for(int num : set1) {
			if(isPrime(num)) {
				System.out.println( num + "是質數");
			}else {
				System.out.println(num + "不是質數");
			}
		}

	}

//	1.請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//	為質數(提示：Math類別)
	public static boolean isPrime(int num) {
		if (num % 2 == 0 && num != 2 || num == 1) {
			return false;
		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}

	}
}