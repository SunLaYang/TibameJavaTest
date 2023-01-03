package com.ryan.test;

public class Homework4_5 {
	public static void main(String[] args) {
		int[][] student = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// 定義六個變數接次數
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		int n7 = 0;
		int n8 = 0;

		int[] arrNum = new int[8];
		for (int i = 0; i < student.length; i++) {
			int maxscore = 0;// 拿來接當下誰最高分
			int index = 0;// 表示最高分的索引直
			for (int j = 0; j < 8; j++) {
				arrNum[j] = student[i][j];
				if (arrNum[j] > maxscore) {
					maxscore = arrNum[j];
					index = j + 1;
				}
			}
			switch (index) {
			case 1:
				n1++;
				break;

			case 2:
				n2++;
				break;
			case 3:
				n3++;
				break;
			case 4:
				n4++;
				break;
			case 5:
				n5++;
				break;
			case 6:
				n6++;
				break;
			case 7:
				n7++;
				break;
			case 8:
				n8++;
				break;
			}
		}
		System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7 + " " + n8);
	}

}
