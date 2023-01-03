package com.ryan.test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {

		// 第一題:
		// 有個一維陣列如下：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		// (提示：陣列，length屬性)
		int sum = 0;
		Double average = 0.0;
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		average = (double) sum / arr.length;
		System.out.println("平均數:" + average);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > average) {
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println();
		System.out.println("====================");

		// 第二題:
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
		String s = "Hello World";
//		String reverse = new StringBuffer(s).reverse().toString();
//		System.out.println(reverse);

		String re = reverse1(s);// 調用自訂義方法
		System.out.println(re);

		System.out.println();
		System.out.println("====================");

		// 第三題:
//		有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

		int aeiou = 0;
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		for (int i = 0; i < planet.length; i++) {
			for (int j = 0; j < planet[i].length(); j++) {
				switch (planet[i].charAt(j)) {
				case 'a': {
					aeiou++;
					break;
				}
				case 'e': {
					aeiou++;
					break;
				}
				case 'i': {
					aeiou++;
					break;
				}
				case 'o': {
					aeiou++;
					break;
				}
				case 'u': {
					aeiou++;
					break;
				}
				default:
				}
			}
		}
		System.out.println(aeiou);
		System.out.println("====================");

		// 第四題:
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入要借的金額:");
		int money = scan.nextInt();
		int sumpeople = 0;
		int k;
		String ss = "";
		int[][] employee = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		for ( k = 0; k < employee.length; k++) {
			if (money <= employee[k][1]) {
				sumpeople++;
				ss += employee[k][0] + " ";
			}
		}
		System.out.println("有錢可借的員工編號:" + ss + "共" + sumpeople + "人");
	

		// 第五題:請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
		// 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
		System.out.println("請輸入年分: ");
		int year = scan.nextInt();
		System.out.println("請輸入月份: ");
		int month = scan.nextInt();
		System.out.println("請輸入日期: ");
		int day = scan.nextInt();

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean leapYear = (year % 4 == 0);// 定義閏年
		if (leapYear) {//判斷是閏年的話 2月 要換成29天
			days[1] = 29;
		}

		int result = 0;
		for (int i = 0; i < month - 1; i++) {//以6/21來說 實際只過了5個月 + 21天
			result += days[i];
		}
		System.out.println("輸入的日期是當年的第" + (result + day) + "天");// 加上輸入的日
		
		System.out.println("====================");
		
//		Calendar cal = new GregorianCalendar(1990,(6 - 1),21);
//		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		// 第六題:
		int[][] student = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
					{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
					{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 }};
		
		int res[] = new int[6];
		int s1 = 0; //存最高分
		int s2 = 0;	
		
		// i = 考試的次數
		for(int i = 0; i < student.length; i++) {
			//j = 考試的人數
			for(int j = 0; j < student[i].length; j++) {
				if(j == 0) {// 一開始不知道誰是最高分，所以把第一位當作最高分
					s1 = student[i][j];
					s2 = j + 1;					
					continue;
				}
					if(s1 < student[i][j]) {// 當最高分小於 student[i][j]，最高分變成他
						s1= student[i][j];
						s2 = j + 1;
					}
			}
				res[i] = s2;
		}
		System.out.println(Arrays.toString(res));
		int[] arr1 = new int[8];
		for(int i = 0; i < res.length; i++) {
			arr1[res[i] -1] ++;
//			arr1[3]
		}
		System.out.println(Arrays.toString(arr1));
	}

	
	//------------------------------------------------
	public static String reverse1(String str) {
		String result1 = "";
		for(int i = str.length()-1; i >= 0; i--) {
			result1 += str.charAt(i);		
		}
		return result1;
		
	}
}
