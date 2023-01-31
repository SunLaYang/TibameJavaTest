package com.ryan.test;
/*
 * 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
	錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
	3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
	以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
	大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
	已經入帳戶。假設媽媽一次匯款2000 元,熊大一次提款
	1000元,寫一個Java程式模擬匯款10次與提款10次的情
	形。
	• 參考範例：TestWaitNotify.java
 */

class Bank {

	private int safemoney = 0;

	synchronized public void deposit(int money) {
		while (safemoney > 3000) {
			System.out.println("媽媽看到餘額在" + safemoney + "以上，暫停匯款");
			try {
				wait();
				System.out.println("媽媽被要求匯款");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		safemoney += money;
		System.out.println("媽媽存了2000，帳戶共有: " + safemoney);
		notify();
	}

	synchronized public void pay(int money) {

		while (safemoney < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			}
		safemoney -= money;
		System.out.println("熊大領了1000，帳戶共有: " + safemoney);
		notify();
		if (safemoney <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			
		}
	}
}

class Mom extends Thread {
	Bank bank;

	public Mom(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			bank.deposit(2000);// 每次存2000
		}
	}
}

class Son extends Thread {
	Bank bank;

	public Son(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			bank.pay(1000);// 每次領1000
		}
	}
}

public class Homework9_2 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Mom m1 = new Mom(bank);
		Son s1 = new Son(bank);
		Son s2 = new Son(bank);
		m1.start();
		s1.start();
		s2.start();

	}
}
