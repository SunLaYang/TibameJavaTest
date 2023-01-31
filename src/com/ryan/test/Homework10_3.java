package com.ryan.test;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)
//年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
//(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)

public class Homework10_3 {
	public static void main(String[] args) {
		formatDate();
	}
	
	public static void  formatDate() {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("請輸入日期:(年月日，例如:20110131)");
			String date1 = scan.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd");
			
			Date date2 = new Date();
			
			try {
				date2 = sdf.parse(date1);
			} catch (ParseException e) {
				System.out.println("日期格式不正確，請再輸入一次!");
				continue;
			}
			
			System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
			int num = scan.nextInt();
			
			switch (num) {
			//拉姆達表達式
			case 1 ->{
				DateFormat dFormat = new SimpleDateFormat("yyyy/mm/dd");
				System.out.println(dFormat.format(date2));
			}
			case 2 ->{
				DateFormat dFormat = new SimpleDateFormat("mm/dd/yyyy");
				System.out.println(dFormat.format(date2));
			}
			case 3 ->{
				DateFormat dFormat = new SimpleDateFormat("dd/mm/yyyy");
				System.out.println(dFormat.format(date2));
			}
	
			default -> System.out.println("輸入錯誤");
			
			}
			
			scan.close();
			break;
			
		}
		
	}
}