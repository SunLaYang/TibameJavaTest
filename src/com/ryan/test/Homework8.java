package com.ryan.test;

import java.math.BigInteger;
import java.util.*;

public class Homework8 {
	public static void main(String[] args) {
		
		/*
		 * 1.• 請建立一個Collection物件並將以下資料加入：
			Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
			Object物件、“Snoopy”、BigInteger(“1000”)
			
			• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
			• 移除不是java.lang.Number相關的物件
			• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
			
		*/
		ArrayList<Object> arr1 = new ArrayList();

		arr1.add(100);
		arr1.add(3.14);
		arr1.add(21L);
		arr1.add(new Short("100"));
		arr1.add(5.1);
		arr1.add("Kitty");
		arr1.add(100);
		arr1.add(new Object());
		arr1.add("Snoopy");
		arr1.add(new BigInteger("1000"));
		
//		=======增強for========
		for (Object o1 : arr1) {
			System.out.print(o1 + " " + "");
		}

//		=======迭代器========
		System.out.println();
		Iterator<Object> objs = arr1.iterator();
		while (objs.hasNext()) {
			System.out.print(objs.next() + " ");
		}
		
//		=======傳統for========
		System.out.println();
		for (int i = 0; i < arr1.size(); i++) {
			Object objs1 = arr1.get(i);
			System.out.print(objs1 + " ");
		}
		
		System.out.println();		
		Iterator it = arr1.iterator();
		while(it.hasNext()) {
			Object oo = it.next();
			if(!(oo instanceof Number)) {
				it.remove();
			}
			
		}
		//刪除後	
		for (Object object : arr1) {
			System.out.print(object + " ");
		}
				
		/*
		 * 2. 請設計一個Train類別，並包含以下屬性：
			- 班次number，型別為int - 車種type，型別為String - 出發地start，型別為String
			- 目的地dest，型別為String - 票價price，型別為double
			• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
			需使用的集合裡
			- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
			- (1254, “區間”, “屏東”, “基隆”, 700)
			- (118, “自強”, “高雄”, “台北”, 500)
			- (1288, “區間”, “新竹”, “基隆”, 400)
			- (122, “自強”, “台中”, “花蓮”, 600)
			- (1222, “區間”, “樹林”, 七堵, 300)
			- (1254, “區間”, “屏東”, “基隆”, 700)
		 */
			Train[] allTrains = new Train[7];
			allTrains[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
			allTrains[1] = new Train(1254, "區間", "屏東", "基隆", 700);
			allTrains[2] = new Train(118, "自強", "高雄", "台北", 500);
			allTrains[3] = new Train(1288, "區間", "新竹", "基隆", 400);
			allTrains[4] = new Train(122, "自強", "台中", "花蓮", 600);
			allTrains[5] = new Train(1222, "區間", "樹林", "七堵", 300);
			allTrains[6] = new Train(1254, "區間", "屏東", "基隆", 700);
			
			//請寫一隻程式，能印出不重複的Train物件
			HashSet<Train> tHashSet = new HashSet<>();
			for(Train ht : allTrains) {
				tHashSet.add(ht);
			}
			
			System.out.println();
			
			/*  
			 *  [車號=1288, 車種=區間, 起站=新竹, 迄站=基隆, 價格=400.0]
				[車號=122, 車種=自強, 起站=台中, 迄站=花蓮, 價格=600.0]
				[車號=1222, 車種=區間, 起站=樹林, 迄站=七堵, 價格=300.0]
				[車號=202, 車種=普悠瑪, 起站=樹林, 迄站=花蓮, 價格=400.0]
				[車號=1254, 車種=區間, 起站=屏東, 迄站=基隆, 價格=700.0]
				[車號=118, 車種=自強, 起站=高雄, 迄站=台北, 價格=500.0]

			 */		
//			=======增強for========
			for(Object tr:tHashSet) {
				System.out.println(tr.toString());
			}
//			=======迭代器========
			System.out.println();
			Iterator it1 = tHashSet.iterator();
			while(it1.hasNext()) {
				System.out.println(it1.next().toString());
			}	
			
	
		
		
		 //請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		 
		ArrayList<Train> alst = new ArrayList<>();
		for(Train at : allTrains) {
			alst.add(at);
		}
		
		Collections.sort(alst);
		
//		=======增強for========
		System.out.println();
		for (Object tr2 : alst) {
			System.out.println(tr2.toString());
		}
//		=======迭代器========
		System.out.println();
		Iterator it2 = alst.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next().toString());
		}
//		=======傳統for========
		System.out.println();
		for(int i = 0 ; i < alst.size(); i++) {
			Train tt1 = alst.get(i);
			System.out.println(tt1);
		}
		
		//承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		TreeSet<Train> treTrains = new TreeSet<>();
		for(Train tret : allTrains) {
			treTrains.add(tret);
		}
		
//		=======增強for========
		System.out.println();
		for (Object tr3 : treTrains) {
			System.out.println(tr3.toString());
		}
		
//		=======迭代器========
		System.out.println();
		Iterator<Train> it3 = treTrains.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next().toString());
		}
		
	}
}
