package persistence.model;

public class Account {

	private double money;
	private int id;
	private static int lastId = 0;
	
	public Account(double money) {
		this.money = money;
		id = lastId++;
	}

	public double getMoney() {
		return money;
	}
	
	public boolean isThatOne(int id){
		return this.id==id;
	}
	
	public boolean debitMoney(double money){
		if(this.money < money)
			return false;
		this.money -= money;
		return true;
	}

	public int getId() {
		return id;
	}

	
	
}
