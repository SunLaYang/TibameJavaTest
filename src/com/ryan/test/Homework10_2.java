package com.ryan.test;

import java.text.DecimalFormat;
import java.util.Scanner;

//請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
//(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖(提示： TestFormatter.java, Java API
//文件, 判斷數字可用正規表示法)
//• 補充(依此類推)：
//輸入12345，千分位為12,345，輸入123，千分位為123
//輸入0.75，百分比為75%，輸入1，結果為100%

public class Homework10_2 {
	public static void main(String[] args) {
		Homework10_2 obj = new Homework10_2();
		System.out.println(obj.verify());
	}

	public static String verify() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字:");
		while(!scan.hasNextDouble()) {
			System.out.println("數字格式不正確，請再次輸入");
			scan.next();
		}
		double d = scan.nextDouble();
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號?");
		
		while(!scan.hasNextInt()) {
			System.out.println("數字格式不正確，請再次輸入");
			scan.next();
		}
		
		int type = scan.nextInt();
		
		scan.close();
		
		if(type == 1) {
			return new DecimalFormat(",###.#####").format(d);			
		}
		
		if(type == 2) {
			return new DecimalFormat("#.###%").format(d);			
		}

		if(type == 3) {
			return new DecimalFormat("#.##E00").format(d);			
		}else {
			System.out.println("格式錯誤重新輸入");
		}
		return "";
	}
}

