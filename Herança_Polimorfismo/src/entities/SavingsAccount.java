package entities;

public final class SavingsAccount extends Account {  // A PALAVRA FINAL EVITA QUE A CLASSE SEJA HERDADA. tambem pode ser usada nos metodos
	
	private Double interesRate;
	
	
	public SavingsAccount () {
		super();
	}


	public SavingsAccount(Integer number, String holder, Double balance, Double interesRate) {
		super(number, holder, balance);
		this.interesRate = interesRate;
	}


	public Double getInteresRate() {
		return interesRate;
	}


	public void setInteresRate(Double interesRate) {
		this.interesRate = interesRate;
	}
	
	
	public void updateBalance() {
		balance += balance * interesRate;
	}
	
	@Override
	public  void withdraw (double amount) { 
		balance -= amount;
	}
	
	
}
