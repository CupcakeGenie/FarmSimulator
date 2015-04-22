package logic;

public class Inventory {
	private int money;
	
	public Inventory() {
		this.money = 0;
		
	}
	
	public void receiveMoney(int payment) {
		if (payment < 0) {
			System.err.println("Negative amount of money recieved @Inventory in recieveMoney()");
		}
		else {
			money = money + payment;
		}
	}
	
	public int getBalance() {
		return money;
	}
	
}
