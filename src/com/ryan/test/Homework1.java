package com.ryan.test;

public class Homework1 {
	public static void main(String[] args) {
		
		//1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 16, b = 6;
		
		int sum = a + b;
		int sigma = a * b;
		System.out.println(sum + "," + sigma);
		
		System.out.println("---------------------------");
		
		//2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int sum1 = 200 ,dozen = 12;
		
		int a1 = sum1 / dozen;
		int b1 = sum1 % dozen;
		System.out.println("總共" + a1 + "打,剩" + b1 + "顆");
		
		System.out.println("---------------------------");
		
		//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sum2 = 256559, sec = 60, min = 60, hour = 24;
		int daysec = hour * min * sec;	//計算一天共多少秒	86400
		int hoursec = min * sec;// 計算一小時有多少秒 3600
		//計算 天 時 分 的秒餘數
		int dayremainder = sum2 % daysec, hourremainder = dayremainder % hoursec, minremainder = hourremainder % min, secremainder = minremainder % sec;
		System.out.println("256559秒為:" + (sum2 / daysec) + "天, " + (dayremainder / hoursec) + "時, " + (hourremainder / min) + "分, " + secremainder + "秒" );
		
		System.out.println("---------------------------");
		
		//4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double radius = 5;
		
		double circlesum = radius * radius * PI;//計算圓面積
		double circumference = radius * 2 * PI;//計算圓周長
		System.out.printf("圓面積為%.4f\n" , circlesum);
		System.out.printf("圓周長為%.4f\n" , circumference);
		
		System.out.println("---------------------------");
		
		//5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		//金加利息共有多少錢 (用複利計算,公式請自行google)  //期末 = 期初*(1+利率)的n次方
		int totlemoney = 1500000;//定義總金額
		double rate = 0.02;//定義利率
		double summoney = totlemoney * (1 +rate);//定義一年利息含本金的總金額

		for(int i = 1; i <= 10; i++) {//定義一個迴圈跑10次
				summoney = summoney * (1 + rate); //連本帶利的總額再去乘上每年利息，然後再進去回全遞增
		}
		System.out.println("10年後連本帶利共: " + (int)summoney + "元");//強轉為整數
		
		System.out.println("---------------------------");
		
		//6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		//		5 + 5
		//		5 + ‘5’
		//		5 + “5”
		//		並請用註解各別說明答案的產生原因
		System.out.println(5 + 5);//10 因為這就是正常的整數相加
		System.out.println(5 + '5');//58 因為是由整數 + char的字元，但char型的底層是由Unicode字元，故需要去找出'5'的ascii code碼為53，故相加後為58
		System.out.println(5 + "5");//55 很單純的整數 + 字符串等於相連接，等於數字5連接字符串5 故等於55
		
	}

}
