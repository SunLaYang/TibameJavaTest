package com.ryan.test;

/*
 * 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
	• 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
	Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
	• 參考範例：CounterRunnable.java
	• 需留意主執行緒執行順序
 */


class bigEater implements Runnable {

	private String name;

	bigEater(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int counter = 1;
		while (counter <= 10) {
			System.out.println(getName() + "吃第" + counter + "碗飯!");
			counter++;
			if (counter > 10) {
				System.out.println(getName() + "吃完了!");
				break;
			}
			try {
				Thread.sleep((int) (Math.random() * 2501) + 500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Homework9_1 {
	public static void main(String[] args) {

		bigEater eater1 = new bigEater("饅頭人");
		bigEater eater2 = new bigEater("詹姆士");
		Thread t1 = new Thread(eater1);
		Thread t2 = new Thread(eater2);
		
		System.out.println("=========大胃王比賽開始!==========");
		t1.start();
		t2.start();
		
		try {
		t1.join();
		t2.join();//沒有join的話會直接跳出結束!
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("=========大胃王比賽結束!==========");

	}

}
