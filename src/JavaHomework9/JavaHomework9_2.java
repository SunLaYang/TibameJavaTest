package JavaHomework9;

class Bank {

	private int count = 0;

	synchronized public void send(int money) {
		while (count > 3000) {
			System.out.println("熊媽看到餘額3000以上,暫停匯款");
			try {
				wait();
				System.out.println("媽媽被熊大要求匯款");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		count += money;
		System.out.println("媽媽存了" + money + ",帳戶共有" + count);
		notify();
	}

	synchronized public void pick(int money) {
		while (count < money) {
			System.out.println("熊大看到帳戶沒錢,暫停匯款");
			try {
				wait();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		count -= money;
		System.out.println("熊大提款了" + money + ",帳戶共有" + count);
		notify();
		if (count <= 2000) {
			System.out.println("熊大看到餘額在2000以下,要求匯款");
		}
	}
}

class SendMoney extends Thread {
	Bank bank;

	public SendMoney(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			bank.send(2000); // 媽媽每次匯款2000
		}
	}

}

class PickMoney extends Thread {
	Bank bank;

	public PickMoney(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			bank.pick(1000); // 每次提款1000
		}
	}

}

public class JavaHomework9_2 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		SendMoney s1 = new SendMoney(bank);
		PickMoney p1 = new PickMoney(bank);
		s1.start();
		p1.start();

	}
}