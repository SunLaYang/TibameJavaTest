package com.ryan.test;

public class Homework2_2 {
	public static void main(String[] args) {

		// 1.阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int sum = 0;// 紀錄總數

		for (int i = 1; i <= 49; i++) {
			if (i % 10 == 4 || i / 10 == 4) {
				continue;
			} else {
				System.out.print(i + " ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("共" + sum + "個");
		System.out.println("========================");
		// 2.請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1	

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 11 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("============================");

		// 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF

		for (int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++) {				
				switch (i) {
				case 1:
					System.out.print("A");
					break;
				case 2:
					System.out.print("B");
					break;
				case 3:
					System.out.print("C");
					break;
				case 4:
					System.out.print("D");
					break;
				case 5:
					System.out.print("E");
					break;
				case 6:
					System.out.print("F");
					break;
				}
			}
			System.out.println();
		}
		//--------------------------------------------
		char c = 65;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				char c2 = (char) (c + i);
				System.out.print(c2);
			}
			System.out.println();
		}
	}

}
